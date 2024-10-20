package com.facebook.forker;

import java.io.ByteArrayOutputStream;

/* loaded from: UnsafeByteArrayOutputStream.class */
public final class UnsafeByteArrayOutputStream extends ByteArrayOutputStream {
    public UnsafeByteArrayOutputStream() {
    }

    public UnsafeByteArrayOutputStream(int i) {
        super(i);
    }

    public byte[] getRawBuffer() {
        int i = ((ByteArrayOutputStream) this).count;
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        if (i != bArr.length) {
            bArr = toByteArray();
        }
        return bArr;
    }
}
