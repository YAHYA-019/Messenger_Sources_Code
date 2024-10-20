package com.facebook.common.dextricks;

import X.09X;
import android.content.Context;
import android.content.Intent;

/* loaded from: DexOptimizationControl.class */
public class DexOptimizationControl {
    public static void pauseOptimization(Context context, int i) {
        Intent intent = new Intent(DexOptimizationConstants.ACTION_OPTIMIZE_PAUSE);
        intent.putExtra(DexOptimizationConstants.OPTIMIZE_UNPAUSE_TIME, System.nanoTime() + (i * DexStore.MS_IN_NS));
        09X.A00().A08().A0H(context, intent);
    }
}
