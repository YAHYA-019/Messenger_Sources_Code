package com.facebook.realtime.requeststream;

import X.C0il;
import com.facebook.jni.HybridData;
import com.facebook.xanalytics.XAnalyticsHolder;

/* loaded from: E2ELogging.class */
public class E2ELogging {
    public HybridData mHybridData;

    static {
        C0il.A0B("requeststream-jni");
    }

    public static native HybridData initHybrid(XAnalyticsHolder xAnalyticsHolder, boolean z, boolean z2, double d, String str);
}
