package com.facebook.superpack;

import X.0FI;
import X.C0il;
import java.io.Closeable;
import java.io.InputStream;

/* loaded from: SuperpackFile.class */
public final class SuperpackFile implements Closeable {
    public int mFd;
    public int mLength;
    public boolean mOwnsFilePtr;
    public long mPtr;

    static {
        C0il.A0B("superpack-jni");
    }

    public SuperpackFile(long j, int i) {
        if (j == 0) {
            throw null;
        }
        this.mPtr = j;
        this.mOwnsFilePtr = true;
        this.mLength = getLengthNative(j);
        this.mFd = -1;
    }

    public static native void closeMemfdNative(long j);

    public static native void closeNative(long j);

    public static native long createSuperpackFileNative(String str, InputStream inputStream);

    public static native long createSuperpackFileNative(String str, byte[] bArr);

    public static native int getLengthNative(long j);

    public static native String getNameNative(long j);

    public static native void readBytesNative(long j, int i, int i2, byte[] bArr, int i3);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            long j = this.mPtr;
            if (j == 0) {
                throw new IllegalStateException();
            }
            if (this.mFd >= 0) {
                closeMemfdNative(j);
            } else if (this.mOwnsFilePtr) {
                closeNative(j);
            }
            this.mPtr = 0L;
        }
    }

    public void finalize() {
        int A03 = 0FI.A03(-2000321027);
        long j = this.mPtr;
        if (j == 0) {
            0FI.A09(-158776507, A03);
            return;
        }
        if (this.mOwnsFilePtr) {
            closeNative(j);
        }
        this.mPtr = 0L;
        IllegalStateException illegalStateException = new IllegalStateException();
        0FI.A09(1774343014, A03);
        throw illegalStateException;
    }
}
