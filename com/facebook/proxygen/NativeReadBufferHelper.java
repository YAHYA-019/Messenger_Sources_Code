package com.facebook.proxygen;

/* loaded from: NativeReadBufferHelper.class */
public class NativeReadBufferHelper {
    public final NativeReadBuffer mReadBuffer;

    public NativeReadBufferHelper(NativeReadBuffer nativeReadBuffer) {
        this.mReadBuffer = nativeReadBuffer;
    }

    private native void nativeEnd(NativeReadBuffer nativeReadBuffer);

    private native void nativeWrite(NativeReadBuffer nativeReadBuffer, byte[] bArr, int i, int i2);

    public void end() {
        nativeEnd(this.mReadBuffer);
    }

    public void write(byte[] bArr, int i, int i2) {
        nativeWrite(this.mReadBuffer, bArr, i, i2);
    }
}
