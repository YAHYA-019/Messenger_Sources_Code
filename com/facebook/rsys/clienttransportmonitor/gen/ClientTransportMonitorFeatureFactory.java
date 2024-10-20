package com.facebook.rsys.clienttransportmonitor.gen;

import X.N0B;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: ClientTransportMonitorFeatureFactory.class */
public abstract class ClientTransportMonitorFeatureFactory {

    /* loaded from: ClientTransportMonitorFeatureFactory$CProxy.class */
    public final class CProxy extends ClientTransportMonitorFeatureFactory {
        static {
            N0B.A00();
        }

        public static native FeatureHolder create(ClientTransportMonitorProxy clientTransportMonitorProxy);

        public static native ClientTransportMonitorFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
