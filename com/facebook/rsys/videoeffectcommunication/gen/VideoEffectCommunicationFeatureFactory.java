package com.facebook.rsys.videoeffectcommunication.gen;

import X.N0G;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: VideoEffectCommunicationFeatureFactory.class */
public abstract class VideoEffectCommunicationFeatureFactory {

    /* loaded from: VideoEffectCommunicationFeatureFactory$CProxy.class */
    public final class CProxy extends VideoEffectCommunicationFeatureFactory {
        static {
            N0G.A00();
        }

        public static native FeatureHolder create(boolean z, boolean z2, VideoEffectCommunicationProxy videoEffectCommunicationProxy);

        public static native VideoEffectCommunicationFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
