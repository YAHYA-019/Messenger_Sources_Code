package com.facebook.rsys.lowbandwidthoptimizer.gen;

import X.AbstractC2326GOr;
import X.C0il;
import X.HEH;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: LowBandwidthOptimizerFeatureFactory.class */
public abstract class LowBandwidthOptimizerFeatureFactory {

    /* loaded from: LowBandwidthOptimizerFeatureFactory$CProxy.class */
    public final class CProxy extends LowBandwidthOptimizerFeatureFactory {
        static {
            if (HEH.A00) {
                return;
            }
            C0il.A0B(AbstractC2326GOr.A1U() ? "rsyslowbandwidthoptimizerjniStaging" : "rsyslowbandwidthoptimizerjniLatest");
            HEH.A00 = true;
        }

        public static native FeatureHolder create(FbAnalyticsProxy fbAnalyticsProxy);

        public static native LowBandwidthOptimizerFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
