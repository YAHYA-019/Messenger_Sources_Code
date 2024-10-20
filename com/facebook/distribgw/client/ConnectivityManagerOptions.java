package com.facebook.distribgw.client;

import X.1BL;
import X.3FE;
import X.3LY;
import X.AnonymousClass001;

/* loaded from: ConnectivityManagerOptions.class */
public class ConnectivityManagerOptions {
    public final long bgPingIntervalMs;
    public final boolean disablePingWhileNoActiveStream;
    public final boolean enableLogging;
    public final boolean enablePingInBackground;
    public final boolean ignoreOnNetworkDisconnectedSignalAndSendPing;
    public final boolean ignoreOnNetworkDisconnectedSignalForPing;
    public boolean initAppStateAsBackground;
    public final long initialUnreachableDelayBackOffMode;
    public final long initialUnreachableDelayFastMode;
    public final boolean markDisconnectedInBackground;
    public final DGWPersonalizationProperty pingIntervalInMs;
    public final DGWPersonalizationThreshold pingLatencyInMs;
    public final DGWPersonalizationProperty pingTimeoutInMs;
    public final int pingTrafficTracingSamplingRate;
    public final boolean sendPingOnAppForeground;
    public final boolean shouldSetNotStartedOnFg;
    public final boolean skipPingAfterIngressTraffic;

    public ConnectivityManagerOptions(boolean z, long j, DGWPersonalizationProperty dGWPersonalizationProperty, DGWPersonalizationProperty dGWPersonalizationProperty2, DGWPersonalizationThreshold dGWPersonalizationThreshold, boolean z2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, long j2, long j3, boolean z8, boolean z9, boolean z10) {
        this.enablePingInBackground = z;
        this.bgPingIntervalMs = j;
        this.pingIntervalInMs = dGWPersonalizationProperty;
        this.pingTimeoutInMs = dGWPersonalizationProperty2;
        this.pingLatencyInMs = dGWPersonalizationThreshold;
        this.skipPingAfterIngressTraffic = z2;
        this.enableLogging = z3;
        this.disablePingWhileNoActiveStream = z4;
        this.sendPingOnAppForeground = z5;
        this.pingTrafficTracingSamplingRate = i;
        this.initAppStateAsBackground = z6;
        this.ignoreOnNetworkDisconnectedSignalForPing = z7;
        this.initialUnreachableDelayFastMode = j2;
        this.initialUnreachableDelayBackOffMode = j3;
        this.ignoreOnNetworkDisconnectedSignalAndSendPing = z8;
        this.markDisconnectedInBackground = z9;
        this.shouldSetNotStartedOnFg = z10;
    }

    public /* synthetic */ ConnectivityManagerOptions(boolean z, long j, DGWPersonalizationProperty dGWPersonalizationProperty, DGWPersonalizationProperty dGWPersonalizationProperty2, DGWPersonalizationThreshold dGWPersonalizationThreshold, boolean z2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, long j2, long j3, boolean z8, boolean z9, boolean z10, 3FE r322) {
        this(z, j, dGWPersonalizationProperty, dGWPersonalizationProperty2, dGWPersonalizationThreshold, z2, z3, z4, z5, i, z6, z7, j2, j3, z8, z9, z10);
    }

    public static 3LY newBuilder() {
        return new 3LY();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("{");
        A0k.append("enablePingInBackground:");
        A0k.append(this.enablePingInBackground);
        A0k.append(",bgPingIntervalMs:");
        A0k.append(this.bgPingIntervalMs);
        A0k.append(",pingIntervalInMs:");
        A0k.append(this.pingIntervalInMs);
        A0k.append(",pingTimeoutInMs:");
        A0k.append(this.pingTimeoutInMs);
        A0k.append(",pingLatencyInMs:");
        A0k.append(this.pingLatencyInMs);
        A0k.append(",skipPingAfterIngressTraffic:");
        A0k.append(this.skipPingAfterIngressTraffic);
        A0k.append(",enableLogging:");
        A0k.append(this.enableLogging);
        A0k.append(",disablePingWhileNoActiveStream:");
        A0k.append(this.disablePingWhileNoActiveStream);
        A0k.append(",sendPingOnAppForeground:");
        A0k.append(this.sendPingOnAppForeground);
        A0k.append(",pingTrafficTracingSamplingRate:");
        A0k.append(this.pingTrafficTracingSamplingRate);
        A0k.append(",initAppStateAsBackground:");
        A0k.append(this.initAppStateAsBackground);
        A0k.append(",ignoreOnNetworkDisconnectedSignalForPing:");
        A0k.append(this.ignoreOnNetworkDisconnectedSignalForPing);
        A0k.append(",initialUnreachableDelayFastMode:");
        A0k.append(this.initialUnreachableDelayBackOffMode);
        A0k.append(",ignoreOnNetworkDisconnectedSignalAndSendPing:");
        A0k.append(this.ignoreOnNetworkDisconnectedSignalAndSendPing);
        A0k.append(",markDisconnectedInBackground:");
        A0k.append(this.markDisconnectedInBackground);
        A0k.append(",shouldSetNotStartedOnFg:");
        A0k.append(this.shouldSetNotStartedOnFg);
        return 1BL.A0v(A0k);
    }
}
