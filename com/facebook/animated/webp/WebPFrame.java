package com.facebook.animated.webp;

import X.0FI;
import X.InterfaceC10004s7;
import android.graphics.Bitmap;

/* loaded from: WebPFrame.class */
public class WebPFrame implements InterfaceC10004s7 {
    public long mNativeContext;

    public WebPFrame(long j) {
        this.mNativeContext = j;
    }

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetWidth();

    private native int nativeGetXOffset();

    private native int nativeGetYOffset();

    private native boolean nativeIsBlendWithPreviousFrame();

    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    private native boolean nativeShouldDisposeToBackgroundColor();

    @Override // X.InterfaceC10004s7
    public void dispose() {
        nativeDispose();
    }

    public void finalize() {
        int A03 = 0FI.A03(-1672337682);
        nativeFinalize();
        0FI.A09(-249947288, A03);
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

    public boolean isBlendWithPreviousFrame() {
        return nativeIsBlendWithPreviousFrame();
    }

    @Override // X.InterfaceC10004s7
    public void renderFrame(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }

    public boolean shouldDisposeToBackgroundColor() {
        return nativeShouldDisposeToBackgroundColor();
    }
}
