package com.facebook.rsys.grid.gen;

import X.HN1;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: GridFeatureFactory.class */
public abstract class GridFeatureFactory {

    /* loaded from: GridFeatureFactory$CProxy.class */
    public final class CProxy extends GridFeatureFactory {
        static {
            HN1.A00();
        }

        public static native FeatureHolder create(GridProxy gridProxy, GridOrderingParameters gridOrderingParameters);

        public static native GridFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
