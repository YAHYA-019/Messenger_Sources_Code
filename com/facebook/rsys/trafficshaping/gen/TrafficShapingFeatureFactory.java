package com.facebook.rsys.trafficshaping.gen;

import X.AbstractC2326GOr;
import X.C0il;
import X.HEO;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: TrafficShapingFeatureFactory.class */
public abstract class TrafficShapingFeatureFactory {

    /* loaded from: TrafficShapingFeatureFactory$CProxy.class */
    public final class CProxy extends TrafficShapingFeatureFactory {
        static {
            if (HEO.A00) {
                return;
            }
            C0il.A0B(AbstractC2326GOr.A1U() ? "rsystrafficshapingjniStaging" : "rsystrafficshapingjniLatest");
            HEO.A00 = true;
        }

        public static native FeatureHolder create(TrafficShapingProxy trafficShapingProxy);

        public static native TrafficShapingFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
