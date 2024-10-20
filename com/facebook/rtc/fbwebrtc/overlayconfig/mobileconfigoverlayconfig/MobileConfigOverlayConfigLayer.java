package com.facebook.rtc.fbwebrtc.overlayconfig.mobileconfigoverlayconfig;

import X.1BK;
import X.1Bq;
import X.1Br;
import X.1CO;
import X.1GD;
import X.C01s;
import X.C06w;
import X.C06z;
import X.KXL;
import X.LYD;
import X.LYE;
import X.MCS;

/* loaded from: MobileConfigOverlayConfigLayer.class */
public final class MobileConfigOverlayConfigLayer extends LYE {
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new C06w(MobileConfigOverlayConfigLayer.class, "mobileConfig", "getMobileConfig()Lcom/facebook/mobileconfig/factory/MobileConfig;", 0), new C06w(MobileConfigOverlayConfigLayer.class, "errorReporter", "getErrorReporter()Lcom/facebook/common/errorreporting/FbErrorReporter;", 0)};
    public static final KXL Companion = new Object();
    public static final String SOFTERROR_CATEGORY = "MobileConfigOverlayConfigLayer";
    public final 1Br mobileConfig$delegate = 1BK.A0C();
    public final 1Br errorReporter$delegate = 1Bq.A00(16511);
    public final MCS _reporter = new LYD(this);

    private final C01s getErrorReporter() {
        return 1Br.A04(this.errorReporter$delegate);
    }

    private final 1CO getMobileConfig() {
        return (1CO) 1Br.A0B(this.mobileConfig$delegate);
    }

    public long fetchMC(long j) {
        return getMobileConfig().Av9(1GD.A07, j);
    }

    public /* bridge */ /* synthetic */ long fetchMC(Long l) {
        return fetchMC(l.longValue());
    }

    public MCS getReporter() {
        return this._reporter;
    }

    public String getSoftErrorCategory() {
        return SOFTERROR_CATEGORY;
    }

    public void logMCExposure(long j) {
        getMobileConfig().Ba9(j);
    }

    public /* bridge */ /* synthetic */ void logMCExposure(Long l) {
        logMCExposure(l.longValue());
    }
}
