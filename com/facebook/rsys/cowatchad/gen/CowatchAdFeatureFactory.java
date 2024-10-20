package com.facebook.rsys.cowatchad.gen;

import X.HMu;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: CowatchAdFeatureFactory.class */
public abstract class CowatchAdFeatureFactory {

    /* loaded from: CowatchAdFeatureFactory$CProxy.class */
    public final class CProxy extends CowatchAdFeatureFactory {
        static {
            HMu.A00();
        }

        public static native FeatureHolder create(CowatchAdPlayerProxy cowatchAdPlayerProxy, CowatchAdMediaPlayerProxy cowatchAdMediaPlayerProxy, CowatchAdStore cowatchAdStore);

        public static native CowatchAdFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
