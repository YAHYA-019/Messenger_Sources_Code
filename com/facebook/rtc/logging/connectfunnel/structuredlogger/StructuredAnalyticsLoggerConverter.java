package com.facebook.rtc.logging.connectfunnel.structuredlogger;

import X.11T;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.jni.HybridData;
import com.facebook.xanalytics.XAnalyticsHolder;

/* loaded from: StructuredAnalyticsLoggerConverter.class */
public final class StructuredAnalyticsLoggerConverter {
    public final HybridData mHybridData;

    public StructuredAnalyticsLoggerConverter(XAnalyticsHolder xAnalyticsHolder) {
        11T.A0F(xAnalyticsHolder, 1);
        this.mHybridData = initHybrid(xAnalyticsHolder);
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public final native McfReference convertToMcfReference();

    public final native HybridData initHybrid(XAnalyticsHolder xAnalyticsHolder);
}
