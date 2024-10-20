package com.facebook.flexlayout;

import X.C0il;
import com.facebook.flexlayout.layoutoutput.LayoutOutput;

/* loaded from: FlexLayoutNative.class */
public class FlexLayoutNative {
    static {
        C0il.A0B("flexlayout");
    }

    public static native void jni_calculateLayout(float[] fArr, float[][] fArr2, float f, float f2, float f3, float f4, float f5, float f6, LayoutOutput layoutOutput, FlexLayoutNativeMeasureCallback flexLayoutNativeMeasureCallback);
}
