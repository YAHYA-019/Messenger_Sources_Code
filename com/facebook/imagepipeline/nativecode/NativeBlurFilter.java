package com.facebook.imagepipeline.nativecode;

import X.1BK;
import X.AnonymousClass001;
import X.C0gh;
import android.graphics.Bitmap;

/* loaded from: NativeBlurFilter.class */
public class NativeBlurFilter {
    static {
        C0gh.A02("native-filters");
    }

    public static void iterativeBoxBlur(Bitmap bitmap, int i, int i2) {
        bitmap.getClass();
        boolean z = true;
        1BK.A1S(AnonymousClass001.A1P(i));
        if (i2 <= 0) {
            z = false;
        }
        1BK.A1S(z);
        nativeIterativeBoxBlur(bitmap, i, i2);
    }

    public static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);
}
