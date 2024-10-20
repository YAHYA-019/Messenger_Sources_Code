package com.facebook.imagepipeline.nativecode;

import X.C0By;
import X.C0gh;
import android.graphics.Bitmap;

/* loaded from: Bitmaps.class */
public class Bitmaps {
    static {
        C0gh.A02("imagepipeline");
    }

    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        boolean z = true;
        boolean z2 = false;
        if (bitmap2.getConfig() == bitmap.getConfig()) {
            z2 = true;
        }
        C0By.A02(Boolean.valueOf(z2));
        C0By.A02(Boolean.valueOf(bitmap.isMutable()));
        boolean z3 = false;
        if (bitmap.getWidth() == bitmap2.getWidth()) {
            z3 = true;
        }
        C0By.A02(Boolean.valueOf(z3));
        if (bitmap.getHeight() != bitmap2.getHeight()) {
            z = false;
        }
        C0By.A02(Boolean.valueOf(z));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    public static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);
}
