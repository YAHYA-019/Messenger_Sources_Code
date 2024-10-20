package com.facebook.rsys.cowatch.gen;

import X.HMt;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: CowatchPlayerFeatureFactory.class */
public abstract class CowatchPlayerFeatureFactory {

    /* loaded from: CowatchPlayerFeatureFactory$CProxy.class */
    public final class CProxy extends CowatchPlayerFeatureFactory {
        static {
            HMt.A00();
        }

        public static native FeatureHolder create(CowatchPlayerProxy cowatchPlayerProxy, CowatchLiveClockProxy cowatchLiveClockProxy, CowatchLoggingProxy cowatchLoggingProxy, CowatchClosedCaptionProxy cowatchClosedCaptionProxy, CowatchAudioProxy cowatchAudioProxy, CowatchMediaInfoStore cowatchMediaInfoStore, CowatchAutoplayStore cowatchAutoplayStore, CowatchSuggestedContentQueueStore cowatchSuggestedContentQueueStore, int i);

        public static native CowatchPlayerFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
