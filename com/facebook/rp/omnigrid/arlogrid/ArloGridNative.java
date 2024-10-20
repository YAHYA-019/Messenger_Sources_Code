package com.facebook.rp.omnigrid.arlogrid;

import X.C0il;
import X.HJw;
import com.facebook.rp.omnigrid.builder.GridLayoutOutputBuilder;
import com.facebook.rtc.views.omnigrid.GridLayoutInput;

/* loaded from: ArloGridNative.class */
public final class ArloGridNative {
    public static final HJw Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.HJw, java.lang.Object] */
    static {
        C0il.A0B("omnigridjni");
    }

    public static final native void jni_computeArloGridLayout(GridLayoutInput gridLayoutInput, GridLayoutOutputBuilder gridLayoutOutputBuilder);
}
