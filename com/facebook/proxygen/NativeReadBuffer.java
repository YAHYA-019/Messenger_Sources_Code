package com.facebook.proxygen;

import X.AnonymousClass001;
import com.facebook.jni.Countable;
import java.io.IOException;

/* loaded from: NativeReadBuffer.class */
public class NativeReadBuffer extends Countable implements ReadBuffer {
    public boolean mClosed;
    public boolean mError;
    public boolean mInitialized;

    private void checkBufferInUsableState() {
        if (!this.mInitialized) {
            throw AnonymousClass001.A0N("Buffer not initialized");
        }
        if (this.mClosed) {
            throw AnonymousClass001.A0N("Buffer already closed");
        }
        if (this.mError) {
            throw AnonymousClass001.A0N("Trying to read after error");
        }
    }

    private native void nativeInit();

    private native int nativeRead(byte[] bArr, int i, int i2);

    private native int nativeSize();

    @Override // com.facebook.proxygen.ReadBuffer
    public void close() {
        try {
            dispose();
        } finally {
            this.mClosed = true;
        }
    }

    public void init() {
        if (this.mInitialized) {
            throw AnonymousClass001.A0N("Already initalized");
        }
        nativeInit();
        this.mInitialized = true;
    }

    @Override // com.facebook.proxygen.ReadBuffer
    public int read(byte[] bArr, int i, int i2) {
        checkBufferInUsableState();
        if (i < 0 || i2 < 0) {
            throw AnonymousClass001.A0L("Negative length or offset is not allowed");
        }
        if (bArr == null || bArr.length - i < i2) {
            throw AnonymousClass001.A0L("Array null, or not large enough");
        }
        if (i2 == 0) {
            return 0;
        }
        try {
            return nativeRead(bArr, i, i2);
        } catch (IOException e) {
            this.mError = true;
            throw e;
        }
    }

    @Override // com.facebook.proxygen.ReadBuffer
    public int size() {
        checkBufferInUsableState();
        return nativeSize();
    }
}
