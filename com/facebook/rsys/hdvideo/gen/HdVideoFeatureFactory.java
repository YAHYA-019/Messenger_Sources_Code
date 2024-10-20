package com.facebook.rsys.hdvideo.gen;

import X.HN2;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: HdVideoFeatureFactory.class */
public abstract class HdVideoFeatureFactory {

    /* loaded from: HdVideoFeatureFactory$CProxy.class */
    public final class CProxy extends HdVideoFeatureFactory {
        static {
            HN2.A00();
        }

        public static native FeatureHolder create(HdVideoProxy hdVideoProxy);

        public static native HdVideoFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
