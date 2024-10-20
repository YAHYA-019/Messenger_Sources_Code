package com.facebook.animated.webp;

import X.0FI;
import X.0L4;
import X.0S2;
import X.2G8;
import X.2G9;
import X.3Dl;
import X.C0By;
import X.C2r9;
import X.KlU;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* loaded from: WebPImage.class */
public class WebPImage implements 2G8, 2G9 {
    public Bitmap.Config mDecodeBitmapConfig = null;
    public long mNativeContext;

    public WebPImage() {
    }

    public WebPImage(long j) {
        this.mNativeContext = j;
    }

    public static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    public static native WebPImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeGetFrame, reason: merged with bridge method [inline-methods] */
    public native WebPFrame getFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    public 2G8 decodeFromByteBuffer(ByteBuffer byteBuffer, C2r9 c2r9) {
        0L4.A00();
        byteBuffer.rewind();
        WebPImage nativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer);
        nativeCreateFromDirectByteBuffer.mDecodeBitmapConfig = c2r9.A02;
        return nativeCreateFromDirectByteBuffer;
    }

    public 2G8 decodeFromNativeMemory(long j, int i, C2r9 c2r9) {
        0L4.A00();
        boolean z = false;
        if (j != 0) {
            z = true;
        }
        C0By.A02(Boolean.valueOf(z));
        WebPImage nativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j, i);
        nativeCreateFromNativeMemory.mDecodeBitmapConfig = c2r9.A02;
        return nativeCreateFromNativeMemory;
    }

    public boolean doesRenderSupportScaling() {
        return true;
    }

    public void finalize() {
        int A03 = 0FI.A03(-1112863209);
        nativeFinalize();
        0FI.A09(461527715, A03);
    }

    public Bitmap.Config getAnimatedBitmapConfig() {
        return this.mDecodeBitmapConfig;
    }

    public int getFrameCount() {
        return nativeGetFrameCount();
    }

    public int[] getFrameDurations() {
        return nativeGetFrameDurations();
    }

    public KlU getFrameInfo(int i) {
        WebPFrame frame = getFrame(i);
        try {
            int xOffset = frame.getXOffset();
            int yOffset = frame.getYOffset();
            int width = frame.getWidth();
            int height = frame.getHeight();
            return new KlU(frame.shouldDisposeToBackgroundColor() ? 3Dl.A02 : 3Dl.A01, frame.isBlendWithPreviousFrame() ? 0S2.A00 : 0S2.A01, xOffset, yOffset, width, height);
        } finally {
            frame.dispose();
        }
    }

    public int getHeight() {
        return nativeGetHeight();
    }

    public int getLoopCount() {
        return nativeGetLoopCount();
    }

    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    public int getWidth() {
        return nativeGetWidth();
    }
}
