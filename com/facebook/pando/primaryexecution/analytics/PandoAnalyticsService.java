package com.facebook.pando.primaryexecution.analytics;

import X.C0il;
import X.HJg;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPrimaryExecution;

/* loaded from: PandoAnalyticsService.class */
public final class PandoAnalyticsService extends PandoPrimaryExecution {
    public static final HJg Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.HJg, java.lang.Object] */
    static {
        C0il.A0B("pando-client-analytics-jni");
    }

    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution, int i);
}
