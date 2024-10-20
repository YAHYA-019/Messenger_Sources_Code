package com.facebook.zstd;

import X.AnonymousClass001;
import X.C0gh;
import com.facebook.jni.HybridData;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: ZstdInputStream.class */
public class ZstdInputStream extends FilterInputStream {
    public static final ZstdInputStream $redex_init_class = null;
    public int mBufferSize;
    public final HybridData mHybridData;
    public byte[] mInBuf;
    public byte[] mOutBuf;
    public boolean sourceEOF;

    static {
        C0gh.A03("zstddecoder");
    }

    public ZstdInputStream(InputStream inputStream) {
        super(inputStream);
        this.mHybridData = initHybrid(RequestDefragmentingOutputStream.BODY_BUFFER_SIZE);
        this.mBufferSize = RequestDefragmentingOutputStream.BODY_BUFFER_SIZE;
        this.mInBuf = new byte[RequestDefragmentingOutputStream.BODY_BUFFER_SIZE];
        this.mOutBuf = new byte[RequestDefragmentingOutputStream.BODY_BUFFER_SIZE];
        this.sourceEOF = false;
    }

    private native boolean canWrite();

    public static native HybridData initHybrid(int i);

    private native int nativeRead(byte[] bArr, int i);

    private native void nativeWrite(byte[] bArr, int i);

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        byte[] bArr = new byte[1];
        if (read(bArr) != 1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || bArr.length - i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int i4 = 0;
        while (true) {
            if (canWrite()) {
                int read = ((FilterInputStream) this).in.read(this.mInBuf);
                if (read == -1) {
                    this.sourceEOF = true;
                } else {
                    nativeWrite(this.mInBuf, read);
                }
            }
            int nativeRead = nativeRead(this.mOutBuf, Math.min(this.mBufferSize, i2 - i4));
            if (this.sourceEOF) {
                if (nativeRead == 0) {
                    throw AnonymousClass001.A0G("Unexpected end of ZSTD stream");
                }
                if (nativeRead == -1) {
                    if (i4 == 0) {
                        return -1;
                    }
                }
            }
            System.arraycopy(this.mOutBuf, 0, bArr, i + i4, nativeRead);
            i4 += nativeRead;
            if (i4 >= i2) {
                break;
            }
        }
        return i4;
    }
}
