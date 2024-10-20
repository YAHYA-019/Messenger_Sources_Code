package com.facebook.common.dextricks;

import X.0Ug;
import X.0cV;
import X.AnonymousClass001;
import android.content.Context;
import android.text.TextUtils;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.DexOptRunner;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.OdexScheme;
import com.facebook.common.dextricks.OdexSchemeTurbo;
import com.facebook.common.dextricks.Prio;
import com.facebook.common.dextricks.ReentrantLockFile;
import com.facebook.forker.Fd;
import com.facebook.forker.Process;
import com.facebook.forker.ProcessBuilder;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.Iterator;

/* loaded from: OdexSchemeXdex.class */
public final class OdexSchemeXdex extends OdexSchemeTurbo {
    public final DexManifest.Dex[] mDexes;

    /* loaded from: OdexSchemeXdex$DexToOptimize.class */
    public final class DexToOptimize implements Closeable {
        public final int dexNr;
        public final ReentrantLockFile.Lock signalLock;

        public DexToOptimize(int i, ReentrantLockFile.Lock lock) {
            this.dexNr = i;
            this.signalLock = lock;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.signalLock.close();
        }

        public String toString() {
            return String.format("DexToOptimize(dexNr=%d)", AnonymousClass001.A1a(this.dexNr));
        }
    }

    /* loaded from: OdexSchemeXdex$PoliteDexOptRunner.class */
    public final class PoliteDexOptRunner extends DexOptRunner {
        public final byte[] mBuffer;
        public final DexStore.OptimizationSession mOptimizationSession;

        public PoliteDexOptRunner(DexStore.OptimizationSession optimizationSession, File file) {
            super(file);
            this.mBuffer = new byte[Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED];
            this.mOptimizationSession = optimizationSession;
        }

        @Override // com.facebook.common.dextricks.DexOptRunner
        public void addDexOptOptions(ProcessBuilder processBuilder) {
            processBuilder.addArgument("-n");
            OdexSchemeTurbo.addConfiguredDexOptOptions(this.mOptimizationSession.dexStoreConfig, processBuilder);
        }

        @Override // com.facebook.common.dextricks.DexOptRunner
        public int copyDexToOdex(InputStream inputStream, int i, RandomAccessFile randomAccessFile) {
            int fileno = Fd.fileno(randomAccessFile.getFD());
            Prio.With with = new Prio.With();
            int i2 = 0;
            while (true) {
                try {
                    byte[] bArr = this.mBuffer;
                    int A06 = 0cV.A06(inputStream, bArr, bArr.length);
                    if (A06 == -1) {
                        with.close();
                        return i2;
                    }
                    randomAccessFile.write(this.mBuffer, 0, A06);
                    i2 += A06;
                    this.mOptimizationSession.checkShouldStop();
                    DalvikInternals.fdatasync(fileno, -1);
                    Fs.tryDiscardPageCache(fileno);
                } catch (Throwable th) {
                    try {
                        with.close();
                        throw th;
                    } catch (Throwable th2) {
                        0Ug.A00(th, th2);
                        throw th;
                    }
                }
            }
        }

        @Override // com.facebook.common.dextricks.DexOptRunner
        public Process startSubprocess(ProcessBuilder processBuilder) {
            Prio.With with = new Prio.With();
            try {
                Process create = processBuilder.create();
                with.close();
                return create;
            } catch (Throwable th) {
                try {
                    with.close();
                    throw th;
                } catch (Throwable th2) {
                    0Ug.A00(th, th2);
                    throw th;
                }
            }
        }

        @Override // com.facebook.common.dextricks.DexOptRunner
        public void waitForDexOpt(Process process, int i) {
            this.mOptimizationSession.waitForAndManageProcess(process, null);
        }
    }

    public OdexSchemeXdex(DexManifest.Dex[] dexArr) {
        super(1, dexArr);
        this.mDexes = dexArr;
    }

    private DexToOptimize findDexToOptimize(DexStore dexStore, long j) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.mDexes.length) {
                return null;
            }
            if (((16 << i2) & j) == 0) {
                ReentrantLockFile open = ReentrantLockFile.open(AnonymousClass001.A0C(dexStore, this.expectedFiles[i2 * 2]));
                try {
                    ReentrantLockFile.Lock tryAcquire = open.tryAcquire(0);
                    open.close();
                    if (tryAcquire != null) {
                        try {
                            return new DexToOptimize(i2, tryAcquire);
                        } catch (Throwable th) {
                            tryAcquire.close();
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        open.close();
                        throw th2;
                    } catch (Throwable th3) {
                        0Ug.A00(th2, th3);
                        throw th2;
                    }
                }
            }
            i = i2 + 1;
        }
    }

    private boolean isFileCorruptionException(DexOptRunner.DexOptException dexOptException) {
        String str;
        int indexOf;
        boolean z = false;
        if (dexOptException.status == 1 && (str = dexOptException.errout) != null && ((indexOf = str.indexOf("E/dalvikvm: ERROR: bad checksum")) == 0 || (indexOf > 0 && str.charAt(indexOf - 1) == '\n'))) {
            z = true;
        }
        return z;
    }

    private void makeFakeCacheSymlink(File file, File file2, File file3) {
        if (!file2.exists()) {
            throw AnonymousClass001.A0N(AnonymousClass001.A0Z(file2, "expected file to exist: ", AnonymousClass001.A0k()));
        }
        if (!file3.exists()) {
            throw AnonymousClass001.A0N(AnonymousClass001.A0Z(file3, "expected file to exist: ", AnonymousClass001.A0k()));
        }
        File dexOptGenerateCacheFileName = Fs.dexOptGenerateCacheFileName(file, file2, file2.getPath().endsWith(".jar") ? "classes.dex" : null);
        Mlog.v("[opt] symlink %s -> %s", dexOptGenerateCacheFileName, file3);
        Fs.symlink(file3, dexOptGenerateCacheFileName);
    }

    private PartialInputStream openDexInsideOdex(FileInputStream fileInputStream) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        FileChannel channel = fileInputStream.getChannel();
        channel.position(8);
        allocate.order(ByteOrder.nativeOrder());
        if (channel.read(allocate) != 8) {
            throw AnonymousClass001.A0L("invalid odex file");
        }
        boolean z = false;
        allocate.position(0);
        int i = allocate.getInt();
        int i2 = allocate.getInt();
        Mlog.v("dexOffset:%s dexLength:%s", AnonymousClass001.A1b(Integer.valueOf(i), i2));
        boolean z2 = false;
        if (i <= 0) {
            z2 = true;
        }
        if (i2 <= 0) {
            z = true;
        }
        if (z || z2) {
            throw AnonymousClass001.A0L("invalid odex file");
        }
        channel.position(i);
        return new PartialInputStream(fileInputStream, i2);
    }

    private void optimize1(DexStore dexStore, File file, DexStore.OptimizationSession optimizationSession, DexStore.OptimizationSession.Job job, DexOptRunner dexOptRunner, DexToOptimize dexToOptimize, File[] fileArr, byte[] bArr) {
        job.startOptimizing();
        String[] strArr = this.expectedFiles;
        int i = dexToOptimize.dexNr * 2;
        String str = strArr[i];
        String str2 = strArr[i + 1];
        File A0D = AnonymousClass001.A0D(file, str2);
        File A0C = AnonymousClass001.A0C(dexStore, str);
        File A0C2 = AnonymousClass001.A0C(dexStore, str2);
        Mlog.i("[opt] started optimizing %s -> %s", A0C, A0C2);
        int length = fileArr.length;
        int length2 = ((length / 2) + (this.expectedFiles.length / 2)) - 1;
        String[] strArr2 = new String[length2];
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            strArr2[i3] = fileArr[i2].getPath();
            i2 += 2;
            i3++;
        }
        int i4 = 0;
        while (true) {
            String[] strArr3 = this.expectedFiles;
            if (i4 >= strArr3.length) {
                break;
            }
            if (i4 / 2 != dexToOptimize.dexNr) {
                strArr2[i3] = AnonymousClass001.A0D(dexStore.root, strArr3[i4]).getPath();
                i3++;
            }
            i4 += 2;
        }
        Mlog.assertThat(AnonymousClass001.A1Q(i3, length2), "accounted for all dex files", new Object[0]);
        FileInputStream A0F = AnonymousClass001.A0F(A0C2);
        try {
            PartialInputStream openDexInsideOdex = openDexInsideOdex(A0F);
            try {
                int i5 = openDexInsideOdex.mBytesToRead - openDexInsideOdex.mBytesRead;
                if (i5 <= 1) {
                    i5 = -1;
                }
                Mlog.v("[opt] size hint for %s: %s", A0C2, Integer.valueOf(i5));
                RandomAccessFile A0I = AnonymousClass001.A0I(A0D);
                try {
                    try {
                        dexOptRunner.run(openDexInsideOdex, i5, str, A0I, "xdex", strArr2);
                        int fileno = Fd.fileno(A0I.getFD());
                        DalvikInternals.replaceOdexDepBlock(fileno, bArr);
                        DalvikInternals.fsync(fileno, optimizationSession.config.prio.ioPriority);
                        Fs.tryDiscardPageCache(fileno);
                        A0I.close();
                        openDexInsideOdex.close();
                        A0F.close();
                        long startCommitting = job.startCommitting(0L) | (16 << dexToOptimize.dexNr);
                        Mlog.v("[opt] started commit", new Object[0]);
                        Fs.renameOrThrow(A0D, A0C2);
                        job.finishCommit(startCommitting);
                        Mlog.v("[opt] finished commit", new Object[0]);
                    } catch (Throwable th) {
                        Fs.deleteRecursive(A0D);
                        throw th;
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                A0F.close();
                throw th2;
            } finally {
                0Ug.A00(th2, th);
            }
        }
    }

    private void prepareTmpDirForXdex(File[] fileArr, DexStore dexStore, File file) {
        int i;
        File findSystemDalvikCache = Fs.findSystemDalvikCache();
        File A0D = AnonymousClass001.A0D(file, "dalvik-cache");
        Fs.mkdirOrThrow(A0D);
        TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(':');
        simpleStringSplitter.setString(System.getenv("BOOTCLASSPATH"));
        Iterator<String> it = simpleStringSplitter.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String A0i = AnonymousClass001.A0i(it);
            if (A0i.length() != 0) {
                String str = A0i.endsWith(".jar") ? "classes.dex" : null;
                File A0E = AnonymousClass001.A0E(A0i);
                File dexOptGenerateCacheFileName = Fs.dexOptGenerateCacheFileName(A0D, A0E, str);
                File dexOptGenerateCacheFileName2 = Fs.dexOptGenerateCacheFileName(findSystemDalvikCache, A0E, str);
                Mlog.v("[opt] symlink %s -> %s", dexOptGenerateCacheFileName, dexOptGenerateCacheFileName2);
                Fs.symlink(dexOptGenerateCacheFileName2, dexOptGenerateCacheFileName);
            }
        }
        for (int i2 = 0; i2 < fileArr.length; i2 += 2) {
            makeFakeCacheSymlink(A0D, fileArr[i2], fileArr[i2 + 1]);
        }
        while (true) {
            String[] strArr = this.expectedFiles;
            if (i >= strArr.length) {
                return;
            }
            makeFakeCacheSymlink(A0D, AnonymousClass001.A0D(dexStore.root, strArr[i]), AnonymousClass001.A0D(dexStore.root, this.expectedFiles[i + 1]));
            i += 2;
        }
    }

    @Override // com.facebook.common.dextricks.OdexSchemeTurbo, com.facebook.common.dextricks.OdexScheme
    public String getSchemeName() {
        return "OdexSchemeXdex";
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public OdexScheme.NeedOptimizationState needOptimization(long j, DexStore.Config config, DexStore.OptimizationHistoryLog optimizationHistoryLog) {
        boolean z = true;
        long length = (1 << this.mDexes.length) - 1;
        long j2 = j >> 4;
        Mlog.v("expectedDexBits:0x%08x actualDexBits:0x%08x", Long.valueOf(length), Long.valueOf(j2));
        if (length == j2) {
            z = false;
        }
        return OdexScheme.NeedOptimizationState.shouldOptimize(z);
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public void optimize(Context context, DexStore dexStore, DexStore.OptimizationSession optimizationSession) {
        DexOptRunner dexOptRunner;
        File[] dependencyOdexFiles = dexStore.getDependencyOdexFiles();
        byte[] readOdexDepBlock = DalvikInternals.readOdexDepBlock(dexStore.getOdexCachePath());
        DexStore.TmpDir makeTemporaryDirectory = dexStore.makeTemporaryDirectory("dexopt");
        try {
            Mlog.v("[opt] opened tmpDir %s", makeTemporaryDirectory.directory);
            if ((optimizationSession.config.flags & 1) != 0) {
                new PoliteDexOptRunner(optimizationSession, makeTemporaryDirectory.directory);
            } else {
                new OdexSchemeTurbo.TurboDexOptRunner(optimizationSession.dexStoreConfig, makeTemporaryDirectory.directory);
            }
            boolean z = false;
            while (true) {
                AnonymousClass001.A1C("[opt] starting optimization pass; creating job");
                DexStore.OptimizationSession.Job job = new DexStore.OptimizationSession.Job();
                try {
                    AnonymousClass001.A1C("[opt] opened job");
                    if (!z) {
                        prepareTmpDirForXdex(dependencyOdexFiles, dexStore, makeTemporaryDirectory.directory);
                    }
                    DexToOptimize findDexToOptimize = findDexToOptimize(dexStore, job.initialStatus);
                    Mlog.v("[opt] dto %s", findDexToOptimize);
                    if (findDexToOptimize != null) {
                        try {
                            try {
                                optimize1(dexStore, makeTemporaryDirectory.directory, optimizationSession, job, dexOptRunner, findDexToOptimize, dependencyOdexFiles, readOdexDepBlock);
                            } finally {
                            }
                        } catch (DexOptRunner.DexOptException e) {
                            if (Fs.isKernelPageCacheFlushIsBroken || !isFileCorruptionException(e)) {
                                throw e;
                            }
                            AnonymousClass001.A1B("detected odex file corruption: trying again with kernel workaround");
                            Fs.isKernelPageCacheFlushIsBroken = true;
                        }
                    }
                    job.close();
                    if (findDexToOptimize == null) {
                        dexOptRunner.cleanup();
                        Mlog.i("[opt] optimization complete", new Object[0]);
                        makeTemporaryDirectory.close();
                        return;
                    }
                    z = true;
                } finally {
                }
            }
            throw e;
        } catch (Throwable th) {
            try {
                makeTemporaryDirectory.close();
                throw th;
            } finally {
                0Ug.A00(th, th);
            }
        }
    }
}
