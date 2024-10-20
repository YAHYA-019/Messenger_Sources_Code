package com.facebook.rsys.networkinfo.gen;

import X.AbstractC2326GOr;
import X.C0il;
import X.HEK;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: NetworkInfoFeatureFactory.class */
public abstract class NetworkInfoFeatureFactory {

    /* loaded from: NetworkInfoFeatureFactory$CProxy.class */
    public final class CProxy extends NetworkInfoFeatureFactory {
        static {
            if (HEK.A00) {
                return;
            }
            C0il.A0B(AbstractC2326GOr.A1U() ? "rsysnetworkinfojniStaging" : "rsysnetworkinfojniLatest");
            HEK.A00 = true;
        }

        public static native FeatureHolder create(NetworkInfoProxy networkInfoProxy);

        public static native NetworkInfoFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
