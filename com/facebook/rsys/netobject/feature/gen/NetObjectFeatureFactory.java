package com.facebook.rsys.netobject.feature.gen;

import X.AbstractC2326GOr;
import X.C0il;
import X.HEJ;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: NetObjectFeatureFactory.class */
public abstract class NetObjectFeatureFactory {

    /* loaded from: NetObjectFeatureFactory$CProxy.class */
    public final class CProxy extends NetObjectFeatureFactory {
        static {
            if (HEJ.A00) {
                return;
            }
            C0il.A0B(AbstractC2326GOr.A1U() ? "rsysfeaturenetobjectjniStaging" : "rsysfeaturenetobjectjniLatest");
            HEJ.A00 = true;
        }

        public static native FeatureHolder create();

        public static native NetObjectFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
