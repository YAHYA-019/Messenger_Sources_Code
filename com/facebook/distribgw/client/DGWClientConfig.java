package com.facebook.distribgw.client;

import X.1BL;
import X.3FF;
import X.3Iz;
import X.AnonymousClass001;

/* loaded from: DGWClientConfig.class */
public class DGWClientConfig {
    public static final String FB_GATEWAY_DOMAIN = "gateway.facebook.com";
    public static final String WP_GATEWAY_DOMAIN = "gateway.workplace.com";
    public final String appId;
    public final String appVersion;
    public final boolean bufferRequestWhileConnectivityNotStarted;
    public final boolean closeNetworkConnectionOnTimeout;
    public final ConnectivityManagerOptions connectivityManagerOptions;
    public final boolean debugCallbackCrashes2;
    public final String deviceId;
    public final String deviceOS;
    public final boolean eagerStreamGroupEnabled;
    public final boolean enableBufferRequestsWhenSuspended;
    public final boolean enableFetchRegionHintFromWww;
    public final boolean enableFlushPrioritization;
    public final boolean enableHTTP3;
    public final boolean enableInFlightStreamWrites;
    public final boolean enableMCLLogging;
    public final boolean enableStreamGroupLoadShedding;
    public String gatewayDomain;
    public final boolean isWorkBuild;
    public final boolean keepStreamGroupAliveAfterLastStream;
    public final long loadSheddingExponentialBackoffRate;
    public final double loadSheddingInitialBackoffTimeS;
    public final double loadSheddingMaxBackoffTimeS;
    public final boolean logDebugConnectionInfo;
    public final DGWPersonalizationConfig personalizationConfig;
    public final long regionHintCacheTtlHours;
    public final String responseCompression;
    public final long streamGroupBgTeardownDelaySeconds;
    public final long streamGroupConnectTimeoutSeconds;
    public final long streamGroupMaxConnectRetries;
    public final long streamGroupPingPeriod;
    public final long streamGroupPingTimeout;
    public final long streamGroupStopBgPingDelay;
    public final int streamGroupTrafficTracingSamplingRate;
    public final long streamIdleTimeoutMs;
    public final boolean triggerHighSignalSyncInFgOnly;
    public final boolean useCachedStreamGroupsStatus;
    public final boolean useStreamGroupRegistryV2;
    public final boolean useStreamGroupsForConnectivity;
    public final boolean zeroRatingEnabled;

    public DGWClientConfig(int i, String str, String str2, ConnectivityManagerOptions connectivityManagerOptions, boolean z, String str3, String str4, long j, String str5, boolean z2, boolean z3, String str6, long j2, long j3, long j4, boolean z4, double d, double d2, long j5, DGWPersonalizationConfig dGWPersonalizationConfig, boolean z5, boolean z6, long j6, boolean z7, boolean z8, boolean z9, long j7, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, long j8, boolean z17, long j9, boolean z18, boolean z19) {
        this.streamGroupTrafficTracingSamplingRate = i;
        this.deviceOS = str2;
        this.deviceId = str;
        this.connectivityManagerOptions = connectivityManagerOptions;
        this.isWorkBuild = z;
        this.appId = str3;
        this.appVersion = str4;
        this.streamIdleTimeoutMs = j;
        this.responseCompression = str5;
        this.enableHTTP3 = z2;
        this.zeroRatingEnabled = z3;
        this.gatewayDomain = str6;
        this.streamGroupPingPeriod = j2;
        this.streamGroupPingTimeout = j3;
        this.streamGroupStopBgPingDelay = j4;
        this.enableStreamGroupLoadShedding = z4;
        this.loadSheddingInitialBackoffTimeS = d;
        this.loadSheddingMaxBackoffTimeS = d2;
        this.loadSheddingExponentialBackoffRate = j5;
        this.personalizationConfig = dGWPersonalizationConfig;
        this.debugCallbackCrashes2 = z5;
        this.useStreamGroupsForConnectivity = z6;
        this.streamGroupConnectTimeoutSeconds = j6;
        this.useCachedStreamGroupsStatus = z7;
        this.closeNetworkConnectionOnTimeout = z8;
        this.enableFlushPrioritization = z9;
        this.streamGroupMaxConnectRetries = j7;
        this.enableMCLLogging = z10;
        this.logDebugConnectionInfo = z11;
        this.enableInFlightStreamWrites = z12;
        this.eagerStreamGroupEnabled = z13;
        this.bufferRequestWhileConnectivityNotStarted = z14;
        this.triggerHighSignalSyncInFgOnly = z15;
        this.keepStreamGroupAliveAfterLastStream = z16;
        this.streamGroupBgTeardownDelaySeconds = j8;
        this.enableFetchRegionHintFromWww = z17;
        this.regionHintCacheTtlHours = j9;
        this.useStreamGroupRegistryV2 = z18;
        this.enableBufferRequestsWhenSuspended = z19;
    }

    public /* synthetic */ DGWClientConfig(int i, String str, String str2, ConnectivityManagerOptions connectivityManagerOptions, boolean z, String str3, String str4, long j, String str5, boolean z2, boolean z3, String str6, long j2, long j3, long j4, boolean z4, double d, double d2, long j5, DGWPersonalizationConfig dGWPersonalizationConfig, boolean z5, boolean z6, long j6, boolean z7, boolean z8, boolean z9, long j7, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, long j8, boolean z17, long j9, boolean z18, boolean z19, 3FF r352) {
        this(i, str, str2, connectivityManagerOptions, z, str3, str4, j, str5, z2, z3, str6, j2, j3, j4, z4, d, d2, j5, dGWPersonalizationConfig, z5, z6, j6, z7, z8, z9, j7, z10, z11, z12, z13, z14, z15, z16, j8, z17, j9, z18, z19);
    }

    private String getGatewayDomain() {
        String str = this.gatewayDomain;
        if (str == null) {
            if (!this.isWorkBuild) {
                return FB_GATEWAY_DOMAIN;
            }
            str = WP_GATEWAY_DOMAIN;
        }
        return str;
    }

    public static 3Iz newBuilder() {
        return new 3Iz();
    }

    public String getDeviceOS(String str) {
        String str2 = this.deviceOS;
        return str2 != null ? str2 : str;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("{deviceOS:");
        A0k.append(this.deviceOS);
        A0k.append(",isWorkBuild:");
        A0k.append(this.isWorkBuild);
        A0k.append(",appVersion:");
        A0k.append(this.appVersion);
        A0k.append(",appId:");
        A0k.append(this.appId);
        A0k.append(",streamIdleTimeoutMs:");
        A0k.append(this.streamIdleTimeoutMs);
        A0k.append(",responseCompression:");
        A0k.append(this.responseCompression);
        A0k.append(",enableHTTP3:");
        A0k.append(this.enableHTTP3);
        A0k.append(",zeroRatingEnabled:");
        A0k.append(this.zeroRatingEnabled);
        A0k.append(",gatewayDomain:");
        A0k.append(this.gatewayDomain);
        A0k.append(",streamGroupPingPeriod:");
        A0k.append(this.streamGroupPingPeriod);
        A0k.append(",streamGroupPingTimeout:");
        A0k.append(this.streamGroupPingTimeout);
        A0k.append(",streamGroupStopBgPingDelay:");
        A0k.append(this.streamGroupStopBgPingDelay);
        A0k.append(",debugCallbackCrashes2:");
        A0k.append(this.debugCallbackCrashes2);
        A0k.append(",useStreamGroupsForConnectivity:");
        A0k.append(this.useStreamGroupsForConnectivity);
        A0k.append(",useCachedStreamGroupsStatus:");
        A0k.append(this.useCachedStreamGroupsStatus);
        A0k.append(",closeNetworkConnectionOnTimeout:");
        A0k.append(this.closeNetworkConnectionOnTimeout);
        A0k.append(",streamGroupMaxConnectRetries:");
        A0k.append(this.streamGroupMaxConnectRetries);
        A0k.append(",enableMCLLogging:");
        A0k.append(this.enableMCLLogging);
        A0k.append(",connectivityManagerOptions:");
        A0k.append(this.connectivityManagerOptions);
        A0k.append(",personalizationConfig:");
        A0k.append(this.personalizationConfig);
        A0k.append(",enableInFlightStreamWrites:");
        A0k.append(this.enableInFlightStreamWrites);
        A0k.append(",eagerStreamGroupEnabled:");
        A0k.append(this.eagerStreamGroupEnabled);
        A0k.append(",bufferRequestWhileConnectivityNotStarted:");
        A0k.append(this.bufferRequestWhileConnectivityNotStarted);
        A0k.append(",triggerHighSignalSyncInFgOnly:");
        A0k.append(this.triggerHighSignalSyncInFgOnly);
        A0k.append(",keepStreamGroupAliveAfterLastStream:");
        A0k.append(this.keepStreamGroupAliveAfterLastStream);
        A0k.append(",streamGroupBgTeardownDelaySeconds:");
        A0k.append(this.streamGroupBgTeardownDelaySeconds);
        A0k.append(",enableFetchRegionHintFromWww:");
        A0k.append(this.enableFetchRegionHintFromWww);
        A0k.append(",regionHintCacheTtlHours:");
        A0k.append(this.regionHintCacheTtlHours);
        A0k.append(",enableBufferRequestsWhenSuspended:");
        A0k.append(this.enableBufferRequestsWhenSuspended);
        return 1BL.A0v(A0k);
    }
}
