package com.facebook.animated.gif;

import X.0FI;
import X.0S2;
import X.2G8;
import X.2G9;
import X.3Dl;
import X.C0By;
import X.C0gh;
import X.C2r9;
import X.KlU;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* loaded from: GifImage.class */
public class GifImage implements 2G8, 2G9 {
    public static volatile boolean sInitialized;
    public Bitmap.Config mDecodeBitmapConfig = null;
    public long mNativeContext;

    public GifImage() {
    }

    public GifImage(long j) {
        this.mNativeContext = j;
    }

    public static void ensure() {
        synchronized (GifImage.class) {
            if (!sInitialized) {
                sInitialized = true;
                C0gh.A02("gifimage");
            }
        }
    }

    public static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i, boolean z);

    public static native GifImage nativeCreateFromFileDescriptor(int i, int i2, boolean z);

    public static native GifImage nativeCreateFromNativeMemory(long j, int i, int i2, boolean z);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeGetFrame, reason: merged with bridge method [inline-methods] */
    public native GifFrame getFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    private native boolean nativeIsAnimated();

    public 2G8 decodeFromByteBuffer(ByteBuffer byteBuffer, C2r9 c2r9) {
        ensure();
        byteBuffer.rewind();
        GifImage nativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer, c2r9.A00, c2r9.A09);
        nativeCreateFromDirectByteBuffer.mDecodeBitmapConfig = c2r9.A02;
        return nativeCreateFromDirectByteBuffer;
    }

    public 2G8 decodeFromNativeMemory(long j, int i, C2r9 c2r9) {
        ensure();
        boolean z = false;
        if (j != 0) {
            z = true;
        }
        C0By.A02(Boolean.valueOf(z));
        GifImage nativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j, i, c2r9.A00, c2r9.A09);
        nativeCreateFromNativeMemory.mDecodeBitmapConfig = c2r9.A02;
        return nativeCreateFromNativeMemory;
    }

    public boolean doesRenderSupportScaling() {
        return false;
    }

    public void finalize() {
        int A03 = 0FI.A03(-535249900);
        nativeFinalize();
        0FI.A09(-1983417286, A03);
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
        3Dl r311;
        GifFrame frame = getFrame(i);
        try {
            int xOffset = frame.getXOffset();
            int yOffset = frame.getYOffset();
            int width = frame.getWidth();
            int height = frame.getHeight();
            Integer num = 0S2.A00;
            int disposalMode = frame.getDisposalMode();
            if (disposalMode != 0 && disposalMode != 1) {
                if (disposalMode == 2) {
                    r311 = 3Dl.A02;
                } else if (disposalMode == 3) {
                    r311 = 3Dl.A03;
                }
                return new KlU(r311, num, xOffset, yOffset, width, height);
            }
            r311 = 3Dl.A01;
            return new KlU(r311, num, xOffset, yOffset, width, height);
        } finally {
            frame.dispose();
        }
    }

    public int getHeight() {
        return nativeGetHeight();
    }

    public int getLoopCount() {
        int nativeGetLoopCount = nativeGetLoopCount();
        int i = 1;
        if (nativeGetLoopCount != -1) {
            i = 0;
            if (nativeGetLoopCount != 0) {
                i = nativeGetLoopCount + 1;
            }
        }
        return i;
    }

    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    public int getWidth() {
        return nativeGetWidth();
    }
}
