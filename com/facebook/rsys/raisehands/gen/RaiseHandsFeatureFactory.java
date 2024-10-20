package com.facebook.rsys.raisehands.gen;

import X.HNB;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: RaiseHandsFeatureFactory.class */
public abstract class RaiseHandsFeatureFactory {

    /* loaded from: RaiseHandsFeatureFactory$CProxy.class */
    public final class CProxy extends RaiseHandsFeatureFactory {
        static {
            HNB.A00();
        }

        public static native FeatureHolder create(RaiseHandsProxy raiseHandsProxy);

        public static native RaiseHandsFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
