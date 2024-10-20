package com.facebook.tigon.tigonliger;

import com.facebook.tigon.iface.TigonSamplingPolicy;

/* loaded from: TigonLigerConfig.class */
public final class TigonLigerConfig {
    public final boolean authHeaderValidationEnabled;
    public final String[] authTokenAllowlistedDomains;
    public final boolean bidirectionalStreamingEnabled;
    public final String[] combinableResponseHeaders;
    public final boolean disableBackgroundRetry;
    public final boolean disablePrioritizationForVideo;
    public final boolean enableCrashReporter;
    public final boolean enableE2eTracingForMhrSampledRequests;
    public final boolean enableHttpPriorityTrackingService;
    public final boolean enableLoggingBackgroundRetry;
    public final boolean enableOrchestrationHttp3PriorityUpdate;
    public final boolean enablePluginObservers;
    public final boolean enableRtcQueue;
    public final boolean enableShadowModeOnInitialPriority;
    public final String[] forwardableHeaders;
    public final boolean headerValidationEnabled;
    public final boolean headerValidationRejectRequestWithInvalidHeadersEnabled;
    public final int headerValidationSampleWeight;
    public final int headerValidationSeverity;
    public final boolean httpPriorityIncrementalEnabled;
    public final boolean isHttpPriorityEnabled;
    public final boolean logAdditionalQueueInfo;
    public final int maxNumRedirectCount;
    public final long maxStreamingCachedBufferSize;
    public final boolean mobileHttpRequestTriggerEnabled;
    public final int nonTransientErrorRetryLimit;
    public final boolean qplEnabled;
    public final boolean quicRetryTransient;
    public final int[] redirectErrorCodes;
    public final boolean removeAuthTokenIfNotAllowlisted;
    public final boolean reprioritizationEnabled;
    public final int retryDelayMaxMs;
    public final int retryDelayMinMs;
    public final boolean retryErrorDNSgetaddrinfo;
    public final double retryGrowthFactor;
    public final boolean retryOnTimeout;
    public final boolean retryOnTransient;
    public final String retryStatusCodesStr;
    public final int serverErrorRetryLimit;
    public final long streamingBufferSize;
    public final boolean thirdPartyRequestSanitizationInterceptorEnabled;
    public final TigonSamplingPolicy tigonSamplingPolicy;
    public final boolean trafficShapingEnableEventsLogging;
    public final int transientErrorRetryLimit;
    public final String triggeredLoggingAllowList;
    public final boolean urlValidationEnabled;
    public final int urlValidationSoftErrorSamplingFrequency;
    public final boolean useNewOrchestrationService;
    public final boolean useOnBodyExperimental;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0395, code lost:
    
        if (r0.A9W != false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TigonLigerConfig() {
        /*
            Method dump skipped, instructions count: 1279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.tigon.tigonliger.TigonLigerConfig.<init>():void");
    }
}
