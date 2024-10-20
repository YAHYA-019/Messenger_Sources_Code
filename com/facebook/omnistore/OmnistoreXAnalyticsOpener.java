package com.facebook.omnistore;

import X.C0il;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonServiceHolder;
import com.facebook.xanalytics.XAnalyticsHolder;

/* loaded from: OmnistoreXAnalyticsOpener.class */
public class OmnistoreXAnalyticsOpener {
    public final HybridData mHybridData = initHybrid();

    static {
        C0il.A0B("omnistoreopener");
    }

    public static native HybridData initHybrid();

    public static native Omnistore open(OmnistoreDatabaseCreator omnistoreDatabaseCreator, String str, MqttProtocolProvider mqttProtocolProvider, OmnistoreErrorReporter omnistoreErrorReporter, XAnalyticsHolder xAnalyticsHolder, OmnistoreSettings omnistoreSettings, TigonServiceHolder tigonServiceHolder, String str2, AndroidAsyncExecutorFactory androidAsyncExecutorFactory, String str3, OmnistoreCollectionFrontendHolder omnistoreCollectionFrontendHolder, OmnistoreCustomLogger omnistoreCustomLogger);
}
