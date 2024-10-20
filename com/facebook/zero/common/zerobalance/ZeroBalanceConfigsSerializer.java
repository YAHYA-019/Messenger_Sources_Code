package com.facebook.zero.common.zerobalance;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: ZeroBalanceConfigsSerializer.class */
public class ZeroBalanceConfigsSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), ZeroBalanceConfigs.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        ZeroBalanceConfigs zeroBalanceConfigs = (ZeroBalanceConfigs) obj;
        if (zeroBalanceConfigs == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, "title", zeroBalanceConfigs.mTitle);
        AbstractC11224vw.A0D(r302, "dialog_message", zeroBalanceConfigs.mDialogMessage);
        AbstractC11224vw.A0D(r302, "confirm_button", zeroBalanceConfigs.mConfirmButton);
        AbstractC11224vw.A0D(r302, "reject_button", zeroBalanceConfigs.mRejectButton);
        AbstractC11224vw.A0D(r302, "zb_ping_url", zeroBalanceConfigs.mZbPingURL);
        AbstractC11224vw.A0D(r302, "success_message", zeroBalanceConfigs.mSuccessMessage);
        AbstractC11224vw.A0D(r302, "failure_message", zeroBalanceConfigs.mFailureMessage);
        AbstractC11224vw.A0D(r302, "notification_title", zeroBalanceConfigs.mNotificationTitle);
        AbstractC11224vw.A0D(r302, "notification_content", zeroBalanceConfigs.mNotificationContent);
        AbstractC11224vw.A0D(r302, "zb_ping_free_pixel", zeroBalanceConfigs.mZbPingFreePixel);
        AbstractC11224vw.A0D(r302, "encrypted_uid", zeroBalanceConfigs.mEncryptedUid);
        AbstractC11224vw.A0D(r302, "carrier_signal_ping", zeroBalanceConfigs.mCarrierSignalPing);
        AbstractC11224vw.A0D(r302, "portal_url", zeroBalanceConfigs.mPortalUrl);
        AbstractC11224vw.A0D(r302, "portal_landing_url", zeroBalanceConfigs.mPortalLandingUrl);
        AbstractC11224vw.A0D(r302, "portal_host", zeroBalanceConfigs.mPortalHost);
        int i = zeroBalanceConfigs.mZbDialogInterval;
        r302.A0o("zb_dialog_interval");
        r302.A0f(i);
        int i2 = zeroBalanceConfigs.mZbOptoutInterval;
        r302.A0o("zb_optout_interval");
        r302.A0f(i2);
        int i3 = zeroBalanceConfigs.mZbTimedFreeFBInterval;
        r302.A0o("zb_timed_freefb_interval");
        r302.A0f(i3);
        int i4 = zeroBalanceConfigs.mZbDisableInterval;
        r302.A0o("zb_disable_interval");
        r302.A0f(i4);
        boolean z = zeroBalanceConfigs.mUseLogo;
        r302.A0o("use_logo");
        r302.A0v(z);
        boolean z2 = zeroBalanceConfigs.mShowNotification;
        r302.A0o("show_notification");
        r302.A0v(z2);
        AbstractC11224vw.A0D(r302, "zb_timeout_external_url", zeroBalanceConfigs.mZbTimeoutExternalUrl);
        AbstractC11224vw.A0D(r302, "zb_redirect_external_url", zeroBalanceConfigs.mZbRedirectExternalUrl);
        r302.A0Y();
    }
}
