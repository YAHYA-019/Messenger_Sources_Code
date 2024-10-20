package com.facebook.rsys.metaaivoicestate.feature.gen;

import X.AbstractC2326GOr;
import X.C0il;
import X.HEI;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiMediaStatsProxy;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy;

/* loaded from: MetaAiVoiceStateFeatureFactory.class */
public abstract class MetaAiVoiceStateFeatureFactory {

    /* loaded from: MetaAiVoiceStateFeatureFactory$CProxy.class */
    public final class CProxy extends MetaAiVoiceStateFeatureFactory {
        static {
            if (HEI.A00) {
                return;
            }
            C0il.A0B(AbstractC2326GOr.A1U() ? "rsysfeaturemetaaivoicestatejniStaging" : "rsysfeaturemetaaivoicestatejniLatest");
            HEI.A00 = true;
        }

        public static native FeatureHolder create(MetaAiVoiceStateProxy metaAiVoiceStateProxy, MetaAiMediaStatsProxy metaAiMediaStatsProxy);

        public static native MetaAiVoiceStateFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
