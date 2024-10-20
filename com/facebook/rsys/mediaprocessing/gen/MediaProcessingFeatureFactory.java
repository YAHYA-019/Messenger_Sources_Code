package com.facebook.rsys.mediaprocessing.gen;

import X.HN6;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: MediaProcessingFeatureFactory.class */
public abstract class MediaProcessingFeatureFactory {

    /* loaded from: MediaProcessingFeatureFactory$CProxy.class */
    public final class CProxy extends MediaProcessingFeatureFactory {
        static {
            HN6.A00();
        }

        public static native FeatureHolder create();

        public static native MediaProcessingFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
