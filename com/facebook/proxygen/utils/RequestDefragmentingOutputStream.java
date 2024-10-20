package com.facebook.proxygen.utils;

import X.AnonymousClass001;
import X.DKD;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.HttpEntityEnclosingRequest;

/* loaded from: RequestDefragmentingOutputStream.class */
public class RequestDefragmentingOutputStream extends OutputStream {
    public static final int BODY_BUFFER_SIZE = 4096;
    public final byte[] mBuffer;
    public boolean mClosed;
    public OutputStream mFallbackOutputStream;
    public final HandlerInterface mHandlerInterface;
    public boolean mHeadersSent;
    public int mPosition;
    public final HttpEntityEnclosingRequest mRequest;
    public boolean mSkipBufferedOutputStream;
    public final int mStreamingBufferSize;

    /* loaded from: RequestDefragmentingOutputStream$FallbackOutputStream.class */
    public class FallbackOutputStream extends OutputStream {
        public FallbackOutputStream() {
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            if (!RequestDefragmentingOutputStream.this.mHandlerInterface.sendBody(new byte[]{(byte) i}, 0, 1)) {
                throw new IOException();
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            if (!RequestDefragmentingOutputStream.this.mHandlerInterface.sendBody(bArr, i, i2)) {
                throw new IOException();
            }
        }
    }

    /* loaded from: RequestDefragmentingOutputStream$HandlerInterface.class */
    public interface HandlerInterface {
        boolean sendBody(byte[] bArr, int i, int i2);

        boolean sendEOM();

        boolean sendHeaders(HttpEntityEnclosingRequest httpEntityEnclosingRequest);

        boolean sendRequestWithBodyAndEom(HttpEntityEnclosingRequest httpEntityEnclosingRequest, byte[] bArr, int i, int i2);
    }

    public RequestDefragmentingOutputStream(HandlerInterface handlerInterface, HttpEntityEnclosingRequest httpEntityEnclosingRequest, byte[] bArr, int i, boolean z) {
        this.mHandlerInterface = handlerInterface;
        this.mRequest = httpEntityEnclosingRequest;
        this.mBuffer = bArr;
        this.mStreamingBufferSize = i;
        this.mSkipBufferedOutputStream = z;
    }

    private boolean canBufferMoreBytes(int i) {
        return DKD.A1V(i, this.mBuffer.length - this.mPosition);
    }

    private void checkStreamIsNotClosed() {
        if (this.mClosed) {
            throw AnonymousClass001.A0G("writeEomIfNecessary was already called on the stream");
        }
    }

    private void fallbackToStreaming(byte[] bArr, int i, int i2) {
        if (!this.mHandlerInterface.sendHeaders(this.mRequest)) {
            throw new IOException();
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FallbackOutputStream(), this.mStreamingBufferSize);
        this.mFallbackOutputStream = bufferedOutputStream;
        bufferedOutputStream.write(this.mBuffer, 0, this.mPosition);
        this.mFallbackOutputStream.write(bArr, i, i2);
    }

    private void flushBuffer() {
        int i = this.mPosition;
        if (i > 0 && !this.mHandlerInterface.sendBody(this.mBuffer, 0, i)) {
            throw new IOException();
        }
    }

    private void flushBufferIfNeeded() {
        if (this.mPosition == 4096) {
            flushBuffer();
            this.mPosition = 0;
        }
    }

    private void sendHeadersIfNotSent() {
        if (this.mHeadersSent) {
            return;
        }
        if (!this.mHandlerInterface.sendHeaders(this.mRequest)) {
            throw new IOException();
        }
        this.mHeadersSent = true;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        synchronized (this) {
            checkStreamIsNotClosed();
            if (this.mSkipBufferedOutputStream) {
                byte[] bArr = new byte[1];
                bArr[0] = (byte) i;
                write(bArr);
            } else {
                OutputStream outputStream = this.mFallbackOutputStream;
                if (outputStream != null) {
                    outputStream.write(i);
                } else if (canBufferMoreBytes(1)) {
                    byte[] bArr2 = this.mBuffer;
                    int i2 = this.mPosition;
                    bArr2[i2] = (byte) i;
                    this.mPosition = i2 + 1;
                } else {
                    byte[] bArr3 = new byte[1];
                    bArr3[0] = (byte) i;
                    fallbackToStreaming(bArr3, 0, 1);
                }
            }
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        synchronized (this) {
            checkStreamIsNotClosed();
            write(bArr, 0, bArr.length);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        synchronized (this) {
            checkStreamIsNotClosed();
            if (this.mSkipBufferedOutputStream) {
                sendHeadersIfNotSent();
                while (i2 > 0) {
                    flushBufferIfNeeded();
                    int i3 = this.mPosition;
                    int min = Math.min(BODY_BUFFER_SIZE - i3, i2);
                    System.arraycopy(bArr, i, this.mBuffer, i3, min);
                    this.mPosition += min;
                    i += min;
                    i2 -= min;
                }
            } else {
                OutputStream outputStream = this.mFallbackOutputStream;
                if (outputStream != null) {
                    outputStream.write(bArr, i, i2);
                } else if (canBufferMoreBytes(i2)) {
                    System.arraycopy(bArr, i, this.mBuffer, this.mPosition, i2);
                    this.mPosition += i2;
                } else {
                    fallbackToStreaming(bArr, i, i2);
                }
            }
        }
    }

    public void writeEomIfNecessary() {
        Throwable th;
        synchronized (this) {
            checkStreamIsNotClosed();
            this.mClosed = true;
            if (this.mSkipBufferedOutputStream) {
                flushBuffer();
                if (!this.mHandlerInterface.sendEOM()) {
                    new IOException();
                    throw th;
                }
            } else {
                OutputStream outputStream = this.mFallbackOutputStream;
                if (outputStream != null) {
                    outputStream.flush();
                    if (!this.mHandlerInterface.sendEOM()) {
                        new IOException();
                        throw th;
                    }
                } else if (!this.mHandlerInterface.sendRequestWithBodyAndEom(this.mRequest, this.mBuffer, 0, this.mPosition)) {
                    new IOException();
                    throw th;
                }
            }
        }
    }
}
