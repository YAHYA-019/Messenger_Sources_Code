package com.facebook.realtime.pulsar;

import X.C0il;
import com.facebook.realtime.common.network.NetworkDetailedStateGetter;
import com.facebook.realtime.requeststream.RequestStreamClientProvider;
import com.facebook.xanalytics.XAnalyticsHolder;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: Pulsar.class */
public final class Pulsar {
    public static final Pulsar INSTANCE = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.realtime.pulsar.Pulsar] */
    static {
        C0il.A0B("pulsar-jni");
    }

    public static final native void startPulsarTest(RequestStreamClientProvider requestStreamClientProvider, XAnalyticsHolder xAnalyticsHolder, ScheduledExecutorService scheduledExecutorService, NetworkDetailedStateGetter networkDetailedStateGetter, long j, int i, String str, String str2, PulsarOptions pulsarOptions, boolean z);

    public static final native void startRegularPulsarTest(RequestStreamClientProvider requestStreamClientProvider, XAnalyticsHolder xAnalyticsHolder, ScheduledExecutorService scheduledExecutorService, NetworkDetailedStateGetter networkDetailedStateGetter, long j, String str, String str2, String str3, long j2, boolean z);
}
