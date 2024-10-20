package com.facebook.rsys.networktraffic.gen;

import X.Kaf;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: NetworkTrafficFeatureFactory.class */
public abstract class NetworkTrafficFeatureFactory {

    /* loaded from: NetworkTrafficFeatureFactory$CProxy.class */
    public final class CProxy extends NetworkTrafficFeatureFactory {
        static {
            Kaf.A00();
        }

        public static native FeatureHolder create(NetworkTrafficProxy networkTrafficProxy);

        public static native NetworkTrafficFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
