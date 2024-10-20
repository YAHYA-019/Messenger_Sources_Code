package com.facebook.rsys.livevideo.gen;

import X.HN4;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: LiveVideoFeatureFactory.class */
public abstract class LiveVideoFeatureFactory {

    /* loaded from: LiveVideoFeatureFactory$CProxy.class */
    public final class CProxy extends LiveVideoFeatureFactory {
        static {
            HN4.A00();
        }

        public static native FeatureHolder create(boolean z, LiveVideoProxy liveVideoProxy, LiveVideoStore liveVideoStore, LiveVideoLoggerProxy liveVideoLoggerProxy);

        public static native LiveVideoFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
