package com.facebook.rsys.starrating.gen;

import X.HNF;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: StarRatingFeatureFactory.class */
public abstract class StarRatingFeatureFactory {

    /* loaded from: StarRatingFeatureFactory$CProxy.class */
    public final class CProxy extends StarRatingFeatureFactory {
        static {
            HNF.A00();
        }

        public static native FeatureHolder create(StarRatingProxy starRatingProxy, int i);

        public static native StarRatingFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
