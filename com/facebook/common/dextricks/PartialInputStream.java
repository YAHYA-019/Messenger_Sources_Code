package com.facebook.common.dextricks;

import java.io.InputStream;

/* loaded from: PartialInputStream.class */
public final class PartialInputStream extends InputStream {
    public int mBytesRead;
    public final int mBytesToRead;
    public final InputStream mUnderlyingStream;

    public PartialInputStream(InputStream inputStream, int i) {
        this.mBytesToRead = i;
        this.mUnderlyingStream = inputStream;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.mBytesToRead - this.mBytesRead;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.mBytesRead == this.mBytesToRead) {
            return -1;
        }
        int read = this.mUnderlyingStream.read();
        if (read != -1) {
            this.mBytesRead++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int read;
        if (i2 <= 0 || this.mBytesRead != this.mBytesToRead) {
            read = this.mUnderlyingStream.read(bArr, i, Math.min(i2, this.mBytesToRead - this.mBytesRead));
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
