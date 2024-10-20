package com.facebook.distribgw.client.mns;

import X.3GE;
import X.AnonymousClass001;
import X.C1by;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: MNSDGWNetworkStackConfig.class */
public final class MNSDGWNetworkStackConfig {
    public static final C1by Companion = new Object();
    public final String dnsCacheDir;
    public final boolean enableFallbackSessions;
    public final boolean enableHttpVersionCache;
    public final boolean enableQuicEarlyData;
    public final long fallbackRttThresholdMs;
    public final boolean highPriorityEvLoopThread;
    public final long http2PingIntervalSec;
    public final long maxConsecutivePTO;
    public final boolean quicEnabled;
    public final long quicHandshakeTimeoutSec;
    public final long quicIdleTimeoutSec;
    public final long quicKeepAliveTimeoutSec;
    public final String quicKnobs;
    public final long tcpConnectTimeoutSec;
    public final long tcpHappyEyeballsDelayMs;
    public final long tcpProbeDelayMs;
    public final String tlsCacheDir;
    public final boolean trustSandboxCertificates;
    public final String userAgent;

    public MNSDGWNetworkStackConfig(String str, String str2, boolean z, long j, long j2, long j3, long j4, String str3, boolean z2, long j5, long j6, long j7, boolean z3, boolean z4, String str4, long j8, boolean z5, boolean z6, long j9) {
        this.dnsCacheDir = str;
        this.tlsCacheDir = str2;
        this.quicEnabled = z;
        this.quicIdleTimeoutSec = j;
        this.quicKeepAliveTimeoutSec = j2;
        this.quicHandshakeTimeoutSec = j3;
        this.http2PingIntervalSec = j4;
        this.userAgent = str3;
        this.enableQuicEarlyData = z2;
        this.tcpProbeDelayMs = j5;
        this.tcpHappyEyeballsDelayMs = j6;
        this.tcpConnectTimeoutSec = j7;
        this.highPriorityEvLoopThread = z3;
        this.enableHttpVersionCache = z4;
        this.quicKnobs = str4;
        this.maxConsecutivePTO = j8;
        this.trustSandboxCertificates = z5;
        this.enableFallbackSessions = z6;
        this.fallbackRttThresholdMs = j9;
    }

    public /* synthetic */ MNSDGWNetworkStackConfig(String str, String str2, boolean z, long j, long j2, long j3, long j4, String str3, boolean z2, long j5, long j6, long j7, boolean z3, boolean z4, String str4, long j8, boolean z5, boolean z6, long j9, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, j, j2, j3, j4, str3, z2, j5, j6, j7, z3, z4, str4, j8, z5, z6, j9);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3GE, java.lang.Object] */
    public static final 3GE newBuilder() {
        return new Object();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MNSDGWNetworkStackConfig: dnsCacheDir:");
        A0k.append(this.dnsCacheDir);
        A0k.append(", tlsCacheDir:");
        A0k.append(this.tlsCacheDir);
        A0k.append(", quicEnabled:");
        A0k.append(this.quicEnabled);
        A0k.append(", quicIdleTimeoutSec:");
        A0k.append(this.quicIdleTimeoutSec);
        A0k.append(", quicKeepAliveTimeoutSec:");
        A0k.append(this.quicKeepAliveTimeoutSec);
        A0k.append(", quicHandshakeTimeoutSec:");
        A0k.append(this.quicHandshakeTimeoutSec);
        A0k.append(", http2PingIntervalSec:");
        A0k.append(this.http2PingIntervalSec);
        A0k.append(", userAgent:");
        A0k.append(this.userAgent);
        A0k.append(", enableQuicEarlyData:");
        A0k.append(this.enableQuicEarlyData);
        A0k.append(", tcpProbeDelayMs:");
        A0k.append(this.tcpProbeDelayMs);
        A0k.append(", tcpHappyEyeballsDelayMs:");
        A0k.append(this.tcpHappyEyeballsDelayMs);
        A0k.append(", tcpConnectTimeoutSec:");
        A0k.append(this.tcpConnectTimeoutSec);
        A0k.append(", highPriorityEvLoopThread:");
        A0k.append(this.highPriorityEvLoopThread);
        A0k.append(", enableHttpVersionCache:");
        A0k.append(this.enableHttpVersionCache);
        A0k.append(", quicKnobs:");
        A0k.append(this.quicKnobs);
        A0k.append(", maxConsecutivePTO:");
        A0k.append(this.maxConsecutivePTO);
        A0k.append(", trustSandboxCertificates:");
        A0k.append(this.trustSandboxCertificates);
        A0k.append(" enableFallbackSessions:");
        A0k.append(this.enableFallbackSessions);
        A0k.append(", fallbackRttThresholdMs:");
        A0k.append(this.fallbackRttThresholdMs);
        return A0k.toString();
    }
}
