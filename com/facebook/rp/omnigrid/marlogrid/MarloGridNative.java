package com.facebook.rp.omnigrid.marlogrid;

import X.C0il;
import X.HJx;
import com.facebook.rp.omnigrid.builder.GridLayoutOutputBuilder;
import com.facebook.rtc.views.omnigrid.GridLayoutInput;

/* loaded from: MarloGridNative.class */
public final class MarloGridNative {
    public static final HJx Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.HJx] */
    static {
        C0il.A0B("omnigridjni");
    }

    public static final native void jni_computeMarloGridLayout(GridLayoutInput gridLayoutInput, GridLayoutOutputBuilder gridLayoutOutputBuilder);
}
