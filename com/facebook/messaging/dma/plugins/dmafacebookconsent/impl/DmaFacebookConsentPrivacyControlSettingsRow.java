package com.facebook.messaging.dma.plugins.dmafacebookconsent.impl;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.1X9;
import X.7zM;
import X.DFp;
import android.content.Context;
import com.facebook.msys.mca.MailboxCallback;

/* loaded from: DmaFacebookConsentPrivacyControlSettingsRow.class */
public final class DmaFacebookConsentPrivacyControlSettingsRow {
    public MailboxCallback A00;
    public 1X9 A01;
    public boolean A02;
    public final Context A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final DFp A07;

    public DmaFacebookConsentPrivacyControlSettingsRow(Context context, DFp dFp) {
        1BL.A1F(context, dFp);
        this.A03 = context;
        this.A07 = dFp;
        this.A05 = 1Bu.A00(83042);
        this.A06 = 7zM.A0e(context);
        this.A04 = 7zM.A0Q();
    }

    public static final void A00(DmaFacebookConsentPrivacyControlSettingsRow dmaFacebookConsentPrivacyControlSettingsRow) {
        MailboxCallback mailboxCallback = dmaFacebookConsentPrivacyControlSettingsRow.A00;
        if (mailboxCallback != null) {
            1X9 r0 = dmaFacebookConsentPrivacyControlSettingsRow.A01;
            if (r0 != null) {
                r0.removeResultCallback(mailboxCallback);
            }
            dmaFacebookConsentPrivacyControlSettingsRow.A00 = null;
        }
        1X9 r02 = dmaFacebookConsentPrivacyControlSettingsRow.A01;
        if (r02 != null) {
            r02.removeAllResultCallbacks();
        }
        1X9 r03 = dmaFacebookConsentPrivacyControlSettingsRow.A01;
        if (r03 != null) {
            r03.cancel();
        }
        dmaFacebookConsentPrivacyControlSettingsRow.A01 = null;
    }
}
