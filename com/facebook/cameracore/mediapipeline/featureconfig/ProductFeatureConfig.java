package com.facebook.cameracore.mediapipeline.featureconfig;

import X.C0il;
import com.facebook.jni.HybridData;

/* loaded from: ProductFeatureConfig.class */
public final class ProductFeatureConfig {
    public final HybridData mHybridData;

    static {
        C0il.A0B("featureconfig");
    }

    public ProductFeatureConfig() {
        this(0, false, false, false, false, true);
    }

    public ProductFeatureConfig(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.mHybridData = initHybrid(z5, false, i, z, z4, false, z3, z2);
    }

    public ProductFeatureConfig(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public static native HybridData initHybrid(boolean z, boolean z2, int i, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7);
}
