package com.facebook.superpack;

import X.0FI;
import X.AnonymousClass001;
import X.C0il;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: SuperpackArchive.class */
public class SuperpackArchive implements Iterator, Closeable {
    public static final String TAG;
    public int mDecompressedFiles = 0;
    public long mPtr;

    static {
        C0il.A0B("superpack-jni");
        TAG = "SuperpackArchive";
    }

    public SuperpackArchive(long j, String[] strArr) {
        if (j == 0) {
            throw new IllegalArgumentException();
        }
        this.mPtr = j;
    }

    public static native void appendAnonNative(long j, long j2);

    public static native void appendNative(long j, long j2);

    public static native void closeNative(long j);

    public static native long createNative();

    public static native long extractNextNative(long j, String[] strArr);

    public static native long getThreadNumOption(int i);

    public static native boolean isEmptyNative(long j);

    public static native long[] nextMemfdNative(long j, String str);

    public static native long nextNative(long j);

    public static native long readNative(InputStream inputStream, String str, long j);

    public static native long readNative(String str, String str2, long j);

    public static native void setPackingOptionsNative(long j, boolean z, boolean z2);

    public static native void setStorageNative(long j, String str, int i);

    public static native void writeNative(long j, OutputStream outputStream);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            long j = this.mPtr;
            if (j == 0) {
                throw new IllegalStateException();
            }
            closeNative(j);
            this.mPtr = 0L;
        }
    }

    public void finalize() {
        int A03 = 0FI.A03(1818645622);
        long j = this.mPtr;
        if (j == 0) {
            0FI.A09(-1684098993, A03);
            return;
        }
        closeNative(j);
        this.mPtr = 0L;
        IllegalStateException illegalStateException = new IllegalStateException();
        0FI.A09(1146585758, A03);
        throw illegalStateException;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean isEmptyNative;
        synchronized (this) {
            long j = this.mPtr;
            if (j == 0) {
                throw new IllegalStateException();
            }
            isEmptyNative = isEmptyNative(j);
        }
        return !isEmptyNative;
    }

    @Override // java.util.Iterator
    public SuperpackFile next() {
        NoSuchElementException noSuchElementException;
        SuperpackFile superpackFile;
        synchronized (this) {
            long j = this.mPtr;
            if (j != 0) {
                long nextNative = nextNative(j);
                if (nextNative != 0) {
                    this.mDecompressedFiles++;
                    superpackFile = new SuperpackFile(nextNative, -1);
                } else {
                    noSuchElementException = AnonymousClass001.A10();
                }
            } else {
                new IllegalStateException();
            }
            throw noSuchElementException;
        }
        return superpackFile;
    }
}
