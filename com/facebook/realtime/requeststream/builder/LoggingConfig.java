package com.facebook.realtime.requeststream.builder;

import X.HDi;
import com.facebook.realtime.common.appstate.AppStateSyncer;
import com.facebook.realtime.common.network.NetworkDetailedStateGetter;
import com.facebook.xanalytics.XAnalyticsHolder;

/* loaded from: LoggingConfig.class */
public class LoggingConfig {
    public AppStateSyncer appStateSyncer;
    public final String methodToSamplingMultiplier;
    public final NetworkDetailedStateGetter networkDetailedStateGetter;
    public final double sampleRate;
    public final XAnalyticsHolder xAnalyticsHolder;

    public LoggingConfig(XAnalyticsHolder xAnalyticsHolder, double d, String str, AppStateSyncer appStateSyncer, NetworkDetailedStateGetter networkDetailedStateGetter) {
        this.xAnalyticsHolder = xAnalyticsHolder;
        this.sampleRate = d;
        this.methodToSamplingMultiplier = str;
        this.appStateSyncer = appStateSyncer;
        this.networkDetailedStateGetter = networkDetailedStateGetter;
    }

    public /* synthetic */ LoggingConfig(XAnalyticsHolder xAnalyticsHolder, double d, String str, AppStateSyncer appStateSyncer, NetworkDetailedStateGetter networkDetailedStateGetter, HDi hDi) {
        this(xAnalyticsHolder, d, str, appStateSyncer, networkDetailedStateGetter);
    }
}
