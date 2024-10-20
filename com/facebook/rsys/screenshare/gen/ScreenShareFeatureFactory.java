package com.facebook.rsys.screenshare.gen;

import X.HNE;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: ScreenShareFeatureFactory.class */
public abstract class ScreenShareFeatureFactory {

    /* loaded from: ScreenShareFeatureFactory$CProxy.class */
    public final class CProxy extends ScreenShareFeatureFactory {
        static {
            HNE.A00();
        }

        public static native FeatureHolder create(int i, ScreenShareProxy screenShareProxy, ScreenShareAudioProxy screenShareAudioProxy);

        public static native ScreenShareFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
