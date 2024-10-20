package com.facebook.imagepipeline.memory;

import X.0FI;
import X.0Pz;
import X.0Q8;
import X.1BK;
import X.2Gw;
import X.4dP;
import X.AnonymousClass001;
import X.C0By;
import X.C0gh;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: NativeMemoryChunk.class */
public class NativeMemoryChunk implements Closeable, 2Gw {
    public boolean mIsClosed;
    public final long mNativePtr;
    public final int mSize;

    static {
        C0gh.A02("imagepipeline");
    }

    public NativeMemoryChunk() {
        this.mSize = 0;
        this.mNativePtr = 0L;
        this.mIsClosed = true;
    }

    public NativeMemoryChunk(int i) {
        C0By.A02(Boolean.valueOf(i > 0));
        this.mSize = i;
        this.mNativePtr = nativeAllocate(i);
        this.mIsClosed = false;
    }

    private void doCopy(int i, 2Gw r303, int i2, int i3) {
        if (!(r303 instanceof NativeMemoryChunk)) {
            throw AnonymousClass001.A0L("Cannot copy two incompatible MemoryChunks");
        }
        C0By.A04(!isClosed());
        C0By.A04(!r303.isClosed());
        4dP.A00(0, r303.getSize(), 0, i3, this.mSize);
        nativeMemcpy(r303.getNativePtr(), this.mNativePtr, i3);
    }

    public static native long nativeAllocate(int i);

    public static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    public static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    public static native void nativeFree(long j);

    public static native void nativeMemcpy(long j, long j2, int i);

    public static native byte nativeReadByte(long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (!this.mIsClosed) {
                this.mIsClosed = true;
                nativeFree(this.mNativePtr);
            }
        }
    }

    public void copy(int i, 2Gw r303, int i2, int i3) {
        r303.getClass();
        long uniqueId = r303.getUniqueId();
        long j = this.mNativePtr;
        if (uniqueId == j) {
            Log.w("NativeMemoryChunk", 0Pz.A10("Copying from NativeMemoryChunk ", 1BK.A12(this), " to NativeMemoryChunk ", 1BK.A12(r303), " which share the same address ", Long.toHexString(j)));
            1BK.A1S(false);
            throw 0Q8.createAndThrow();
        }
        if (uniqueId < j) {
            synchronized (r303) {
                synchronized (this) {
                    doCopy(0, r303, 0, i3);
                }
            }
        } else {
            synchronized (this) {
                synchronized (r303) {
                    doCopy(0, r303, 0, i3);
                }
            }
        }
    }

    public void finalize() {
        int i;
        int A03 = 0FI.A03(-2103824331);
        if (isClosed()) {
            i = 357646775;
        } else {
            Log.w("NativeMemoryChunk", 0Pz.A0j("finalize: Chunk ", 1BK.A12(this), " still active. "));
            try {
                close();
                i = -1572855896;
            } catch (Throwable th) {
                0FI.A09(1541628182, A03);
                throw th;
            }
        }
        0FI.A09(i, A03);
    }

    public ByteBuffer getByteBuffer() {
        return null;
    }

    public long getNativePtr() {
        return this.mNativePtr;
    }

    public int getSize() {
        return this.mSize;
    }

    public long getUniqueId() {
        return this.mNativePtr;
    }

    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.mIsClosed;
        }
        return z;
    }

    public byte read(int i) {
        byte nativeReadByte;
        synchronized (this) {
            boolean z = true;
            boolean z2 = false;
            if (!isClosed()) {
                z2 = true;
            }
            C0By.A04(z2);
            boolean z3 = false;
            if (i >= 0) {
                z3 = true;
            }
            C0By.A02(Boolean.valueOf(z3));
            if (i >= this.mSize) {
                z = false;
            }
            C0By.A02(Boolean.valueOf(z));
            nativeReadByte = nativeReadByte(this.mNativePtr + i);
        }
        return nativeReadByte;
    }

    public int read(int i, byte[] bArr, int i2, int i3) {
        int min;
        synchronized (this) {
            bArr.getClass();
            boolean z = false;
            if (!isClosed()) {
                z = true;
            }
            C0By.A04(z);
            int i4 = this.mSize;
            min = Math.min(Math.max(0, i4 - i), i3);
            4dP.A00(i, bArr.length, i2, min, i4);
            nativeCopyToByteArray(this.mNativePtr + i, bArr, i2, min);
        }
        return min;
    }

    public int write(int i, byte[] bArr, int i2, int i3) {
        int min;
        synchronized (this) {
            boolean z = false;
            if (!isClosed()) {
                z = true;
            }
            C0By.A04(z);
            int i4 = this.mSize;
            min = Math.min(Math.max(0, i4 - i), i3);
            4dP.A00(i, bArr.length, i2, min, i4);
            nativeCopyFromByteArray(this.mNativePtr + i, bArr, i2, min);
        }
        return min;
    }
}
