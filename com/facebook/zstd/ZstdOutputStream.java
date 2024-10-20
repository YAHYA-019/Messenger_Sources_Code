package com.facebook.zstd;

import X.11T;
import X.19A;
import X.AnonymousClass002;
import X.AnonymousClass190;
import X.C0gh;
import com.facebook.jni.HybridData;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;

/* loaded from: ZstdOutputStream.class */
public final class ZstdOutputStream extends 19A {
    public static final AnonymousClass190 Companion = new Object();
    public final int bufferSize;
    public final byte[] inBuf;
    public final HybridData mHybridData;
    public final byte[] outBuf;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.190] */
    static {
        C0gh.A03("zstdencoder");
    }

    public ZstdOutputStream(OutputStream outputStream) {
        this(outputStream, RequestDefragmentingOutputStream.BODY_BUFFER_SIZE, 13);
    }

    public ZstdOutputStream(OutputStream outputStream, int i, int i2) {
        super(outputStream);
        this.bufferSize = i;
        this.outBuf = new byte[i];
        this.inBuf = new byte[i];
        this.mHybridData = initHybrid(i, i2);
    }

    private final native boolean canWrite();

    public static final native HybridData initHybrid(int i, int i2);

    private final native int nativeRead(byte[] bArr, int i, boolean z);

    private final native void nativeWrite(byte[] bArr, int i);

    /* JADX WARN: Multi-variable type inference failed */
    public void close() {
        while (true) {
            int nativeRead = nativeRead(this.outBuf, this.bufferSize, true);
            if (nativeRead > 0) {
                ((FilterOutputStream) this).out.write(this.outBuf, 0, nativeRead);
            } else if (nativeRead == -1) {
                super/*java.io.FilterOutputStream*/.close();
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void write(int i) {
        AnonymousClass002.A0T(this, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void write(byte[] bArr, int i, int i2) {
        int i3;
        11T.A0F(bArr, 0);
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || bArr.length - i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return;
        }
        while (i < i3) {
            int min = (int) Math.min(this.bufferSize, i3 - i);
            System.arraycopy(bArr, i, this.inBuf, 0, min);
            byte[] bArr2 = this.inBuf;
            while (!canWrite()) {
                int nativeRead = nativeRead(this.outBuf, this.bufferSize, false);
                if (nativeRead > 0) {
                    ((FilterOutputStream) this).out.write(this.outBuf, 0, nativeRead);
                }
            }
            nativeWrite(bArr2, min);
            i += this.bufferSize;
        }
    }
}
