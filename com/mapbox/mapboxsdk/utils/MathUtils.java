package com.mapbox.mapboxsdk.utils;

import X.JQx;

/* loaded from: MathUtils.class */
public class MathUtils {
    public static double clamp(double d, double d2, double d3) {
        return Math.max(d2, Math.min(d3, d));
    }

    public static float clamp(float f, float f2, float f3) {
        return JQx.A03(f3, f, f2);
    }

    public static double wrap(double d, double d2, double d3) {
        double d4 = d3 - d2;
        return ((((d - d2) % d4) + d4) % d4) + d2;
    }
}
