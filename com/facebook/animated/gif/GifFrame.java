package com.facebook.animated.gif;

import X.0FI;
import X.InterfaceC10004s7;
import android.graphics.Bitmap;

/* loaded from: GifFrame.class */
public class GifFrame implements InterfaceC10004s7 {
    public long mNativeContext;

    public GifFrame(long j) {
        this.mNativeContext = j;
    }

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDisposalMode();

    private native int nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetTransparentPixelColor();

    private native int nativeGetWidth();

    private native int nativeGetXOffset();

    private native int nativeGetYOffset();

    private native boolean nativeHasTransparency();

    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    @Override // X.InterfaceC10004s7
    public void dispose() {
        nativeDispose();
    }

    public void finalize() {
        int A03 = 0FI.A03(-1588782772);
        nativeFinalize();
        0FI.A09(1416592124, A03);
    }

    public int getDisposalMode() {
        return nativeGetDisposalMode();
    }

    @Override // X.InterfaceC10004s7
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // X.InterfaceC10004s7
    public int getWidth() {
        return nativeGetWidth();
    }

    @Override // X.InterfaceC10004s7
    public int getXOffset() {
        return nativeGetXOffset();
    }

    @Override // X.InterfaceC10004s7
    public int getYOffset() {
        return nativeGetYOffset();
    }

    @Override // X.InterfaceC10004s7
    public void renderFrame(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }
}
