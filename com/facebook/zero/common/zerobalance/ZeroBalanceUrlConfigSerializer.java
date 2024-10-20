package com.facebook.zero.common.zerobalance;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: ZeroBalanceUrlConfigSerializer.class */
public class ZeroBalanceUrlConfigSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), ZeroBalanceUrlConfig.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        ZeroBalanceUrlConfig zeroBalanceUrlConfig = (ZeroBalanceUrlConfig) obj;
        if (zeroBalanceUrlConfig == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, "timeout_free_url", zeroBalanceUrlConfig.mTimeoutFreeUrl);
        AbstractC11224vw.A0D(r302, "redirect_free_url", zeroBalanceUrlConfig.mRedirectedFreeUrl);
        AbstractC11224vw.A0D(r302, "timeout_paid_url", zeroBalanceUrlConfig.mTimeoutPaidUrl);
        AbstractC11224vw.A0D(r302, "redirect_paid_url", zeroBalanceUrlConfig.mRedirectedPaidUrl);
        AbstractC11224vw.A0D(r302, "timeout_external_url", zeroBalanceUrlConfig.mTimeoutExternalUrl);
        AbstractC11224vw.A0D(r302, "redirect_external_url", zeroBalanceUrlConfig.mRedirectedExternalUrl);
        int i = zeroBalanceUrlConfig.mPingTimeoutSeconds;
        r302.A0o("ping_timeout_seconds");
        r302.A0f(i);
        int i2 = zeroBalanceUrlConfig.mTimeoutTotalFreePingsRetries;
        r302.A0o("timeout_total_free_pings_retries");
        r302.A0f(i2);
        int i3 = zeroBalanceUrlConfig.mTimeoutTotalPaidPingsRetries;
        r302.A0o("timeout_total_paid_pings_retries");
        r302.A0f(i3);
        int i4 = zeroBalanceUrlConfig.mTimeoutTotalExternalPingsRetries;
        r302.A0o("timeout_total_external_pings_retries");
        r302.A0f(i4);
        int i5 = zeroBalanceUrlConfig.mRedirectTotalPingRetries;
        r302.A0o("redirect_total_ping_retries");
        r302.A0f(i5);
        int i6 = zeroBalanceUrlConfig.mZbDisableInterval;
        r302.A0o("zb_disable_interval");
        r302.A0f(i6);
        r302.A0Y();
    }
}
