package com.facebook.rsys.appstate.gen;

import X.HMg;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: AppstateFeatureFactory.class */
public abstract class AppstateFeatureFactory {

    /* loaded from: AppstateFeatureFactory$CProxy.class */
    public final class CProxy extends AppstateFeatureFactory {
        static {
            HMg.A00();
        }

        public static native FeatureHolder create();

        public static native AppstateFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
