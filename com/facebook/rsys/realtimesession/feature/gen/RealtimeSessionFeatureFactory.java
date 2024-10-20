package com.facebook.rsys.realtimesession.feature.gen;

import X.AbstractC2326GOr;
import X.C0il;
import X.HEN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: RealtimeSessionFeatureFactory.class */
public abstract class RealtimeSessionFeatureFactory {

    /* loaded from: RealtimeSessionFeatureFactory$CProxy.class */
    public final class CProxy extends RealtimeSessionFeatureFactory {
        static {
            if (HEN.A00) {
                return;
            }
            C0il.A0B(AbstractC2326GOr.A1U() ? "rsysfeaturerealtimesessionjniStaging" : "rsysfeaturerealtimesessionjniLatest");
            HEN.A00 = true;
        }

        public static native FeatureHolder create();

        public static native RealtimeSessionFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
