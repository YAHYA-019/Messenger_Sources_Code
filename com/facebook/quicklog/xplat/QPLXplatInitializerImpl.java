package com.facebook.quicklog.xplat;

import X.1gH;
import X.C0il;
import com.facebook.jni.HybridData;
import com.facebook.xanalytics.XAnalyticsHolder;

/* loaded from: QPLXplatInitializerImpl.class */
public final class QPLXplatInitializerImpl {
    public static final 1gH Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1gH, java.lang.Object] */
    static {
        C0il.A0B("perfloggerxplat_init");
    }

    public static final native HybridData initHybrid();

    public static final native void setupNativeQPLWithXAnalyticsHolder(XAnalyticsHolder xAnalyticsHolder);
}
