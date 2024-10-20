package com.facebook.xanalytics;

import X.C0il;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonServiceHolder;
import java.util.concurrent.Executor;

/* loaded from: XAnalyticsNative.class */
public class XAnalyticsNative extends XAnalyticsHolder {
    public static String host_endpoint;

    /* loaded from: XAnalyticsNative$XAnalyticsPropertiesProvider.class */
    public interface XAnalyticsPropertiesProvider {
        String[] get();
    }

    /* loaded from: XAnalyticsNative$XAnalyticsResponseListener.class */
    public interface XAnalyticsResponseListener {
        void onResponse(String str);
    }

    static {
        C0il.A0B("xanalyticsnative-jni");
        host_endpoint = "graph.facebook.com";
    }

    public XAnalyticsNative() {
        super(initHybrid());
    }

    public static native HybridData initHybrid();

    @Override // com.facebook.xanalytics.XAnalyticsHolder
    public native void cleanup();

    public native void cleanupNetworkRequest();

    public native int countFlushed();

    @Override // com.facebook.xanalytics.XAnalyticsHolder
    public native void flush();

    public native String[] getFlushed();

    public native long init(String[] strArr, XAnalyticsPropertiesProvider xAnalyticsPropertiesProvider, TigonServiceHolder tigonServiceHolder, Executor executor, int i, int i2, int i3);

    public native boolean isInitialized();

    public native void kickOffUpload();

    @Override // com.facebook.xanalytics.XAnalyticsHolder
    public native void logCounter(String str, long j);

    @Override // com.facebook.xanalytics.XAnalyticsHolder
    public native void logCounter(String str, long j, String str2);

    @Override // com.facebook.xanalytics.XAnalyticsHolder
    public void logEvent(String str, String str2) {
        logEvent(str, str2, "");
    }

    @Override // com.facebook.xanalytics.XAnalyticsHolder
    public native void logEvent(String str, String str2, String str3);

    @Override // com.facebook.xanalytics.XAnalyticsHolder
    public void logRealtimeEvent(String str, String str2) {
        logRealtimeEvent(str, str2, "");
    }

    @Override // com.facebook.xanalytics.XAnalyticsHolder
    public native void logRealtimeEvent(String str, String str2, String str3);

    public native void onSwitchUserId();

    public native void resumeUploading(String str);

    public native void saveCounters();

    public native void setResponseListener(XAnalyticsResponseListener xAnalyticsResponseListener);

    public native void updateMultibatchSize(int i);

    public native long updateTigonInstance(String str, String str2, TigonServiceHolder tigonServiceHolder);
}
