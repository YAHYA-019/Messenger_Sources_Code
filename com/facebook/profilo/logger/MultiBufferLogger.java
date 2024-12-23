package com.facebook.profilo.logger;

import X.C0il;
import com.facebook.jni.HybridClassBase;
import com.facebook.profilo.mmapbuf.core.Buffer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: MultiBufferLogger.class */
public final class MultiBufferLogger extends HybridClassBase {
    public final AtomicInteger mBuffersCount = new AtomicInteger(0);
    public volatile boolean mLoaded;
    public volatile long mNativePtr;

    private void ensureLoaded() {
        if (this.mLoaded) {
            return;
        }
        synchronized (this) {
            if (!this.mLoaded) {
                C0il.A0B("profilo");
                this.mNativePtr = initHybrid();
                this.mLoaded = true;
            }
        }
    }

    private native long initHybrid();

    private native void nativeAddBuffer(Buffer buffer);

    private native void nativeRemoveBuffer(Buffer buffer);

    public static native int nativeWriteBytesEntry(long j, int i, int i2, int i3, String str);

    public static native int nativeWriteStandardEntry(long j, int i, int i2, long j2, int i3, int i4, int i5, long j3);

    public void addBuffer(Buffer buffer) {
        ensureLoaded();
        nativeAddBuffer(buffer);
        this.mBuffersCount.incrementAndGet();
    }

    public void removeBuffer(Buffer buffer) {
        ensureLoaded();
        nativeRemoveBuffer(buffer);
        this.mBuffersCount.decrementAndGet();
    }

    public int writeBytesEntry(int i, int i2, int i3, String str) {
        if (this.mBuffersCount.intValue() == 0) {
            return 0;
        }
        ensureLoaded();
        return nativeWriteBytesEntry(this.mNativePtr, i, i2, i3, str);
    }

    public int writeStandardEntry(int i, int i2, long j, int i3, int i4, int i5, long j2) {
        if (this.mBuffersCount.intValue() == 0) {
            return 0;
        }
        ensureLoaded();
        return nativeWriteStandardEntry(this.mNativePtr, i, i2, j, i3, i4, i5, j2);
    }
}
