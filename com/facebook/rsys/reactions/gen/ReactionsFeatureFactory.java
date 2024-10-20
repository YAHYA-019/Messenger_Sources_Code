package com.facebook.rsys.reactions.gen;

import X.HNC;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: ReactionsFeatureFactory.class */
public abstract class ReactionsFeatureFactory {

    /* loaded from: ReactionsFeatureFactory$CProxy.class */
    public final class CProxy extends ReactionsFeatureFactory {
        static {
            HNC.A00();
        }

        public static native FeatureHolder create(ReactionsProxy reactionsProxy);

        public static native ReactionsFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
