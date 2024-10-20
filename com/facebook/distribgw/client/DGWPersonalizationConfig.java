package com.facebook.distribgw.client;

import X.1BL;
import X.AnonymousClass001;

/* loaded from: DGWPersonalizationConfig.class */
public class DGWPersonalizationConfig {
    public final boolean personalizationEnabled;
    public final DGWPersonalizationProperty publishTimeoutInSeconds;
    public final DGWPersonalizationThreshold streamEstablishmentLatencyInMs;
    public final DGWPersonalizationProperty streamEstablishmentTimeoutInSeconds;

    public DGWPersonalizationConfig(DGWPersonalizationThreshold dGWPersonalizationThreshold, DGWPersonalizationProperty dGWPersonalizationProperty, DGWPersonalizationProperty dGWPersonalizationProperty2, boolean z) {
        this.streamEstablishmentLatencyInMs = dGWPersonalizationThreshold;
        this.streamEstablishmentTimeoutInSeconds = dGWPersonalizationProperty;
        this.publishTimeoutInSeconds = dGWPersonalizationProperty2;
        this.personalizationEnabled = z;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("{enabled:");
        A0k.append(this.personalizationEnabled);
        A0k.append(",streamEstablishmentLatencyInMs:");
        A0k.append(this.streamEstablishmentLatencyInMs);
        A0k.append(",streamEstablishmentTimeoutInSeconds:");
        A0k.append(this.streamEstablishmentTimeoutInSeconds);
        A0k.append(",publishTimeoutInSeconds:");
        A0k.append(this.publishTimeoutInSeconds);
        return 1BL.A0v(A0k);
    }
}
