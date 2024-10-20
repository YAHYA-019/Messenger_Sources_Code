package com.facebook.rsys.breakout.gen;

import X.HMi;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: BreakoutFeatureFactory.class */
public abstract class BreakoutFeatureFactory {

    /* loaded from: BreakoutFeatureFactory$CProxy.class */
    public final class CProxy extends BreakoutFeatureFactory {
        static {
            HMi.A00();
        }

        public static native FeatureHolder create(BreakoutAdminProxy breakoutAdminProxy, BreakoutCallProxy breakoutCallProxy, BreakoutStore breakoutStore, int i, int i2, int i3);

        public static native BreakoutFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
