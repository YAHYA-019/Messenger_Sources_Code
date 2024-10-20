package com.facebook.rsys.videoscore.gen;

import X.AbstractC2326GOr;
import X.C0il;
import X.HEQ;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: VideoScoreFeatureFactory.class */
public abstract class VideoScoreFeatureFactory {

    /* loaded from: VideoScoreFeatureFactory$CProxy.class */
    public final class CProxy extends VideoScoreFeatureFactory {
        static {
            if (HEQ.A00) {
                return;
            }
            C0il.A0B(AbstractC2326GOr.A1U() ? "rsysvideoscorejniStaging" : "rsysvideoscorejniLatest");
            HEQ.A00 = true;
        }

        public static native FeatureHolder create(VideoScoreProxy videoScoreProxy);

        public static native VideoScoreFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
