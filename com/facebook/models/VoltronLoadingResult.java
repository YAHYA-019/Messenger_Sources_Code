package com.facebook.models;

import X.C0il;
import com.facebook.jni.HybridData;

/* loaded from: VoltronLoadingResult.class */
public class VoltronLoadingResult {
    public final HybridData mHybridData;

    static {
        C0il.A0B("models-common");
    }

    public VoltronLoadingResult(boolean z, boolean z2) {
        this.mHybridData = initHybrid(z, true);
    }

    private native HybridData initHybrid(boolean z, boolean z2);
}
