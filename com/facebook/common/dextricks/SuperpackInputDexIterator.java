package com.facebook.common.dextricks;

import X.0Pz;
import X.0Ug;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C0cO;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.superpack.SuperpackArchive;
import com.facebook.superpack.SuperpackFile;
import com.facebook.superpack.SuperpackFileInputStream;
import com.facebook.xzdecoder.XzInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;

/* loaded from: SuperpackInputDexIterator.class */
public final class SuperpackInputDexIterator extends InputDexIterator {
    public final C0cO mArchiveExtension;
    public final int[] mDexToArchiveMap;
    public final SynchronousQueue[] mFileQueues;
    public int mNextDexIndex;
    public boolean mShuttingDownFlag;
    public final SuperpackArchive mSuperpackArchive;
    public SuperpackFile mSuperpackFileToClose;
    public final Thread[] mThreads;

    /* loaded from: SuperpackInputDexIterator$Builder.class */
    public final class Builder {
        public C0cO archiveExtension;
        public int[] dexToArchive;
        public DexManifest manifest;
        public LightweightQuickPerformanceLogger qplCollector;
        public ArrayList rawArchives;

        public Builder(DexManifest dexManifest, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
            this.archiveExtension = C0cO.NONE;
            dexManifest.getClass();
            this.manifest = dexManifest;
            this.dexToArchive = new int[dexManifest.dexes.length];
            this.qplCollector = lightweightQuickPerformanceLogger;
            this.rawArchives = AnonymousClass001.A0s();
            this.archiveExtension = dexManifest.superpackExtension;
        }

        public Builder addRawArchive(InputStream inputStream) {
            inputStream.getClass();
            this.rawArchives.add(inputStream);
            return this;
        }

        public Builder assignDexToArchive(int i, int i2) {
            if (i2 < 0 || i2 >= this.rawArchives.size()) {
                throw new IndexOutOfBoundsException();
            }
            this.dexToArchive[i] = i2;
            return this;
        }

        public SuperpackInputDexIterator build() {
            if (this.rawArchives.size() >= 1) {
                return new SuperpackInputDexIterator(this);
            }
            throw new IllegalStateException();
        }
    }

    /* loaded from: SuperpackInputDexIterator$UnpackingRunnable.class */
    public class UnpackingRunnable implements Runnable {
        public InputStream mInput;
        public SynchronousQueue mOutput;

        public UnpackingRunnable(InputStream inputStream, SynchronousQueue synchronousQueue) {
            this.mInput = inputStream;
            this.mOutput = synchronousQueue;
        }

        /* JADX WARN: Not initialized variable reg: 0, insn: 0x006f: INVOKE (r0 I:java.lang.RuntimeException) = (r0 I:java.lang.Throwable) STATIC call: X.001.A0U(java.lang.Throwable):java.lang.RuntimeException A[MD:(java.lang.Throwable):java.lang.RuntimeException (m)], block:B:40:0x006f */
        @Override // java.lang.Runnable
        public void run() {
            RuntimeException A0U;
            try {
                SuperpackArchive superpackArchive = SuperpackInputDexIterator.this.getSuperpackArchive(this.mInput);
                try {
                    this.mInput.close();
                    while (superpackArchive.hasNext()) {
                        try {
                            this.mOutput.put(SuperpackInputDexIterator.this.getNextFileFromSpk(superpackArchive));
                        } finally {
                        }
                    }
                    superpackArchive.close();
                } catch (Throwable th) {
                    try {
                        superpackArchive.close();
                    } catch (Throwable th2) {
                        0Ug.A00(th, th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
                throw AnonymousClass001.A0U(A0U);
            } catch (InterruptedException e) {
                if (!SuperpackInputDexIterator.this.mShuttingDownFlag) {
                    throw AnonymousClass001.A0U(e);
                }
            }
        }
    }

    public SuperpackInputDexIterator(Builder builder) {
        super(builder.manifest, builder.qplCollector);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.mQplCollector;
        if (lightweightQuickPerformanceLogger != null) {
            lightweightQuickPerformanceLogger.markerStart(34603017);
        }
        this.mArchiveExtension = builder.archiveExtension;
        try {
            this.mShuttingDownFlag = false;
            this.mNextDexIndex = 0;
            this.mDexToArchiveMap = builder.dexToArchive;
            int size = builder.rawArchives.size() - 1;
            this.mThreads = new Thread[size];
            this.mFileQueues = new SynchronousQueue[size];
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= size) {
                    this.mSuperpackArchive = getSuperpackArchive((InputStream) builder.rawArchives.get(0));
                    return;
                }
                this.mFileQueues[i2] = new SynchronousQueue();
                int i3 = i2 + 1;
                this.mThreads[i2] = new Thread(new UnpackingRunnable((InputStream) builder.rawArchives.get(i3), this.mFileQueues[i2]));
                this.mThreads[i2].start();
                i = i3;
            }
        } catch (Throwable th) {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = this.mQplCollector;
            if (lightweightQuickPerformanceLogger2 != null) {
                lightweightQuickPerformanceLogger2.markerEnd(34603017, (short) 2);
            }
            throw th;
        }
    }

    public static Builder builder(DexManifest dexManifest, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        return new Builder(dexManifest, lightweightQuickPerformanceLogger);
    }

    public static String getArchiveExtension(Builder builder) {
        C0cO c0cO = builder.manifest.superpackExtension;
        String str = SuperpackArchive.TAG;
        String str2 = ".dex.spk.xz";
        if (c0cO != C0cO.NONE) {
            if (c0cO == C0cO.OB) {
                str2 = ".dex.spo";
            } else if (c0cO != C0cO.XZ) {
                if (c0cO == C0cO.ZST) {
                    return ".dex.spk.zst";
                }
                throw AnonymousClass001.A0T(AnonymousClass001.A0Z(c0cO, "Unknown Superpack Archive Extension ", AnonymousClass001.A0k()));
            }
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SuperpackFile getNextFileFromSpk(SuperpackArchive superpackArchive) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.mQplCollector;
        if (lightweightQuickPerformanceLogger != null) {
            lightweightQuickPerformanceLogger.markerStart(34603016);
        }
        try {
            return superpackArchive.next();
        } finally {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = this.mQplCollector;
            if (lightweightQuickPerformanceLogger2 != null) {
                lightweightQuickPerformanceLogger2.markerEnd(34603016, (short) 2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SuperpackArchive getSuperpackArchive(InputStream inputStream) {
        RuntimeException th;
        SuperpackArchive A0A;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.mQplCollector;
        if (lightweightQuickPerformanceLogger != null) {
            lightweightQuickPerformanceLogger.markerStart(34603015);
        }
        try {
            C0cO c0cO = this.mArchiveExtension;
            if (c0cO == C0cO.NONE) {
                XzInputStream xzInputStream = new XzInputStream(inputStream);
                try {
                    String str = SuperpackArchive.TAG;
                    A0A = AnonymousClass002.A0A(xzInputStream, "spk");
                    xzInputStream.close();
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        xzInputStream.close();
                    } catch (Throwable th3) {
                        0Ug.A00(th, th3);
                    }
                }
            } else if (c0cO == C0cO.OB) {
                String str2 = SuperpackArchive.TAG;
                A0A = AnonymousClass002.A0A(inputStream, "spo");
            } else if (c0cO == C0cO.XZ) {
                String str3 = SuperpackArchive.TAG;
                A0A = AnonymousClass002.A0A(inputStream, "xz");
            } else {
                if (c0cO != C0cO.ZST) {
                    th = AnonymousClass001.A0T(AnonymousClass001.A0Z(c0cO, "Unknown Superpack Archive Extension ", AnonymousClass001.A0k()));
                    throw th;
                }
                String str4 = SuperpackArchive.TAG;
                A0A = AnonymousClass002.A0A(inputStream, "zst");
            }
            return A0A;
        } finally {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = this.mQplCollector;
            if (lightweightQuickPerformanceLogger2 != null) {
                lightweightQuickPerformanceLogger2.markerEnd(34603015, (short) 2);
            }
        }
    }

    private void maybeCloseLastSuperpackFile() {
        SuperpackFile superpackFile = this.mSuperpackFileToClose;
        if (superpackFile != null) {
            superpackFile.close();
            this.mSuperpackFileToClose = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v21, types: [com.facebook.superpack.SuperpackFile] */
    /* JADX WARN: Type inference failed for: r0v9 */
    private SuperpackFile nextSuperpackFile() {
        int[] iArr = this.mDexToArchiveMap;
        int i = this.mNextDexIndex;
        this.mNextDexIndex = i + 1;
        int i2 = iArr[i];
        ?? r0 = i2;
        if (r0 == 0) {
            return getNextFileFromSpk(this.mSuperpackArchive);
        }
        try {
            r0 = (SuperpackFile) this.mFileQueues[i2 - 1].take();
            return r0;
        } catch (InterruptedException unused) {
            throw AnonymousClass001.A0U(r0);
        }
    }

    private void setLastSuperpackFileToClose(SuperpackFile superpackFile) {
        if (this.mSuperpackFileToClose != null) {
            throw new IllegalStateException();
        }
        this.mSuperpackFileToClose = superpackFile;
    }

    @Override // com.facebook.common.dextricks.InputDexIterator, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IllegalStateException th;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger;
        if (this.mShuttingDownFlag) {
            th = AnonymousClass001.A0N("Iterator already closed");
        } else {
            this.mShuttingDownFlag = true;
            maybeCloseLastSuperpackFile();
            try {
                try {
                    this.mSuperpackArchive.close();
                    for (Thread thread : this.mThreads) {
                        thread.interrupt();
                        thread.join();
                    }
                    if (lightweightQuickPerformanceLogger != null) {
                        return;
                    } else {
                        return;
                    }
                } catch (InterruptedException e) {
                    throw AnonymousClass001.A0U(e);
                }
            } finally {
                th = th;
                lightweightQuickPerformanceLogger = this.mQplCollector;
                if (lightweightQuickPerformanceLogger != null) {
                    lightweightQuickPerformanceLogger.markerEnd(34603017, (short) 2);
                }
            }
        }
        throw th;
    }

    @Override // com.facebook.common.dextricks.InputDexIterator
    public InputDex nextImpl(DexManifest.Dex dex) {
        Throwable th;
        String nameNative;
        String nameNative2;
        SuperpackFileInputStream superpackFileInputStream;
        maybeCloseLastSuperpackFile();
        SuperpackFile nextSuperpackFile = nextSuperpackFile();
        String str = dex.assetName;
        synchronized (nextSuperpackFile) {
            long j = nextSuperpackFile.mPtr;
            if (j != 0) {
                nameNative = SuperpackFile.getNameNative(j);
            } else {
                new IllegalStateException();
            }
            throw th;
        }
        if (str.equals(nameNative)) {
            setLastSuperpackFileToClose(nextSuperpackFile);
            synchronized (nextSuperpackFile) {
                if (nextSuperpackFile.mPtr != 0) {
                    superpackFileInputStream = new SuperpackFileInputStream(nextSuperpackFile);
                } else {
                    new IllegalStateException();
                }
            }
            return new InputDex(dex, superpackFileInputStream);
        }
        String str2 = dex.assetName;
        synchronized (nextSuperpackFile) {
            long j2 = nextSuperpackFile.mPtr;
            if (j2 != 0) {
                nameNative2 = SuperpackFile.getNameNative(j2);
            } else {
                new IllegalStateException();
            }
        }
        throw AnonymousClass001.A0T(0Pz.A0v("Wrong dex, expected ", str2, ", got ", nameNative2));
        throw th;
    }
}
