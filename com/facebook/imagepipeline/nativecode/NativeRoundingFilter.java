package com.facebook.imagepipeline.nativecode;

import X.C0gh;
import android.graphics.Bitmap;

/* loaded from: NativeRoundingFilter.class */
public class NativeRoundingFilter {
    static {
        C0gh.A02("native-filters");
    }

    public static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i, int i2, int i3, int i4);

    public static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z);

    public static native void nativeToCircleFilter(Bitmap bitmap, boolean z);

    public static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i, int i2, boolean z);

    public static void toCircle(Bitmap bitmap, boolean z) {
        bitmap.getClass();
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFilter(bitmap, z);
    }

    public static void toCircleFast(Bitmap bitmap, boolean z) {
        bitmap.getClass();
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFastFilter(bitmap, z);
    }
}
