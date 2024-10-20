package com.facebook.tigon;

import X.C0il;
import com.facebook.jni.HybridData;

/* loaded from: TigonXplatBodyProvider.class */
public abstract class TigonXplatBodyProvider extends TigonBodyProvider {
    public static final TigonXplatBodyProvider $redex_init_class = null;

    static {
        C0il.A0B("tigonjni");
    }

    public TigonXplatBodyProvider() {
        this.mHybridData = initHybrid();
    }

    private native HybridData initHybrid();
}
