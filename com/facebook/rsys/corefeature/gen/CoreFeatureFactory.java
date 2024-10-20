package com.facebook.rsys.corefeature.gen;

import X.AbstractC2326GOr;
import X.C0il;
import X.HE4;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audio.gen.AudioProxy;
import com.facebook.rsys.base.gen.FeatureHolder;
import com.facebook.rsys.camera.gen.CameraProxy;
import com.facebook.rsys.crypto.gen.CryptoProxy;
import com.facebook.rsys.groupexpansion.gen.GroupExpansionProxy;
import com.facebook.rsys.mediastats.gen.MediaStatsProxy;
import com.facebook.rsys.videorender.gen.VideoRenderProxy;
import com.facebook.rsys.videosubscriptions.gen.VideoSubscriptionsProxy;

/* loaded from: CoreFeatureFactory.class */
public abstract class CoreFeatureFactory {

    /* loaded from: CoreFeatureFactory$CProxy.class */
    public final class CProxy extends CoreFeatureFactory {
        static {
            if (HE4.A00) {
                return;
            }
            C0il.A0B(AbstractC2326GOr.A1U() ? "rsyscorefeaturejniStaging" : "rsyscorefeaturejniLatest");
            HE4.A00 = true;
        }

        public static native FeatureHolder create(AudioProxy audioProxy, CameraProxy cameraProxy, CryptoProxy cryptoProxy, GroupExpansionProxy groupExpansionProxy, VideoRenderProxy videoRenderProxy, VideoSubscriptionsProxy videoSubscriptionsProxy, MediaStatsProxy mediaStatsProxy);

        public static native CoreFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
