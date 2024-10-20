package com.facebook.rsys.dcc.gen;

import X.AbstractC2326GOr;
import X.C0il;
import X.HE7;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: DccFeatureFactory.class */
public abstract class DccFeatureFactory {

    /* loaded from: DccFeatureFactory$CProxy.class */
    public final class CProxy extends DccFeatureFactory {
        static {
            if (HE7.A00) {
                return;
            }
            C0il.A0B(AbstractC2326GOr.A1U() ? "rsysdccjniStaging" : "rsysdccjniLatest");
            HE7.A00 = true;
        }

        public static native FeatureHolder create();

        public static native DccFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
