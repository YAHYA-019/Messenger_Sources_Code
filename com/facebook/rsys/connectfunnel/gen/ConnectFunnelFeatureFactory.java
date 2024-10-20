package com.facebook.rsys.connectfunnel.gen;

import X.AbstractC2326GOr;
import X.C0il;
import X.HE3;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: ConnectFunnelFeatureFactory.class */
public abstract class ConnectFunnelFeatureFactory {

    /* loaded from: ConnectFunnelFeatureFactory$CProxy.class */
    public final class CProxy extends ConnectFunnelFeatureFactory {
        static {
            if (HE3.A00) {
                return;
            }
            C0il.A0B(AbstractC2326GOr.A1U() ? "rsysconnectfunneljniStaging" : "rsysconnectfunneljniLatest");
            HE3.A00 = true;
        }

        public static native FeatureHolder create(ConnectFunnelProxy connectFunnelProxy, boolean z);

        public static native ConnectFunnelFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
