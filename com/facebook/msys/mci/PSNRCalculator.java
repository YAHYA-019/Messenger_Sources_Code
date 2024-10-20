package com.facebook.msys.mci;

import X.1SL;
import android.graphics.Bitmap;

/* loaded from: PSNRCalculator.class */
public class PSNRCalculator {
    static {
        1SL.A00();
    }

    public static native double[] computePSNRNative(Bitmap bitmap, Bitmap bitmap2);
}
