package com.facebook.common.dextricks;

import X.0Pz;
import X.0Ug;
import X.AnonymousClass001;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.xzdecoder.XzInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* loaded from: SolidXzInputDexIterator.class */
public final class SolidXzInputDexIterator extends InputDexIterator {
    public boolean mConsumingStream;
    public SliceInputStream mLastPartIs;
    public final ResProvider mResProvider;
    public final XzInputStream mXzs;

    /* loaded from: SolidXzInputDexIterator$SliceInputStream.class */
    public final class SliceInputStream extends InputStream {
        public int mBytesRead = 0;
        public int mBytesToRead;

        public SliceInputStream(int i) {
            this.mBytesToRead = i;
            SolidXzInputDexIterator.this.mConsumingStream = true;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.mBytesToRead - this.mBytesRead;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            SolidXzInputDexIterator.this.mConsumingStream = false;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.mBytesRead == this.mBytesToRead) {
                return -1;
            }
            int read = SolidXzInputDexIterator.this.mXzs.read();
            if (read == -1) {
                throw AnonymousClass001.A0T("truncated xzs stream");
            }
            this.mBytesRead++;
            return read;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read;
            if (i2 <= 0 || this.mBytesRead != this.mBytesToRead) {
                read = SolidXzInputDexIterator.this.mXzs.read(bArr, i, Math.min(i2, this.mBytesToRead - this.mBytesRead));
                if (read > 0) {
                    this.mBytesRead += read;
                    return read;
                }
            } else {
                read = -1;
            }
            return read;
        }
    }

    public SolidXzInputDexIterator(DexManifest dexManifest, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, ResProvider resProvider, InputStream inputStream) {
        super(dexManifest, lightweightQuickPerformanceLogger);
        this.mResProvider = resProvider;
        this.mXzs = new XzInputStream(inputStream);
        if (lightweightQuickPerformanceLogger != null) {
            lightweightQuickPerformanceLogger.markerStart(34603012);
        }
    }

    private int getJarFileSizeFromMeta(ResProvider resProvider, String str) {
        InputStream open = resProvider.open(str);
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(open);
            try {
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                try {
                    String readLine = bufferedReader.readLine();
                    String substring = readLine.substring(0, readLine.indexOf(32));
                    int parseInt = Integer.parseInt(AnonymousClass001.A0W(substring.indexOf(58), substring));
                    bufferedReader.close();
                    inputStreamReader.close();
                    if (open != null) {
                        open.close();
                    }
                    return parseInt;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                    throw th;
                } catch (Throwable th2) {
                    0Ug.A00(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    @Override // com.facebook.common.dextricks.InputDexIterator, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            Fs.safeClose(this.mXzs);
        } finally {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.mQplCollector;
            if (lightweightQuickPerformanceLogger != null) {
                lightweightQuickPerformanceLogger.markerEnd(34603012, (short) 2);
            }
        }
    }

    @Override // com.facebook.common.dextricks.InputDexIterator
    public InputDex nextImpl(DexManifest.Dex dex) {
        if (this.mConsumingStream) {
            throw AnonymousClass001.A0T("previous InputDex not closed");
        }
        SliceInputStream sliceInputStream = this.mLastPartIs;
        if (sliceInputStream != null) {
            int i = sliceInputStream.mBytesToRead - sliceInputStream.mBytesRead;
            if (i > 0) {
                Fs.discardFromInputStream(sliceInputStream, i);
            }
            this.mLastPartIs = null;
        }
        SliceInputStream sliceInputStream2 = new SliceInputStream(getJarFileSizeFromMeta(this.mResProvider, 0Pz.A0W(dex.assetName, ".meta")));
        this.mLastPartIs = sliceInputStream2;
        return new InputDex(dex, sliceInputStream2);
    }
}
