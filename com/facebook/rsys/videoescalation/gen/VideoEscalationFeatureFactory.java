package com.facebook.rsys.videoescalation.gen;

import X.HNK;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: VideoEscalationFeatureFactory.class */
public abstract class VideoEscalationFeatureFactory {

    /* loaded from: VideoEscalationFeatureFactory$CProxy.class */
    public final class CProxy extends VideoEscalationFeatureFactory {
        static {
            HNK.A00();
        }

        public static native FeatureHolder create();

        public static native VideoEscalationFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
