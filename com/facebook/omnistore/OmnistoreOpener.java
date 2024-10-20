package com.facebook.omnistore;

import X.C0il;
import com.facebook.jni.HybridData;

/* loaded from: OmnistoreOpener.class */
public class OmnistoreOpener {
    public final HybridData mHybridData = initHybrid();

    static {
        C0il.A0B("omnistore");
    }

    public static native HybridData initHybrid();

    public static native Omnistore open(OmnistoreDatabaseCreator omnistoreDatabaseCreator, String str, MqttProtocolProvider mqttProtocolProvider, OmnistoreCustomLogger omnistoreCustomLogger, OmnistoreSettings omnistoreSettings, OmnistoreCollectionFrontendHolder omnistoreCollectionFrontendHolder);
}
