package com.facebook.messaging.advancedcrypto.plugins.core.privacysettings.securityalerts;

import X.11T;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.20U;
import X.AbG;
import X.C3o5;
import X.C5ww;
import X.C7j;
import X.CG8;
import android.content.Context;
import com.facebook.messaging.messengerprefs.advancedcrypto.securityalerts.SecurityAlertsActivity;

/* loaded from: PrivacySettingsSecurityAlertsRow.class */
public final class PrivacySettingsSecurityAlertsRow {
    public final 1Br A00;
    public final 1Br A01;
    public final Context A02;

    public PrivacySettingsSecurityAlertsRow(Context context) {
        11T.A0F(context, 1);
        this.A02 = context;
        this.A01 = 1Bu.A00(66576);
        this.A00 = 1Bu.A00(83042);
    }

    public final C7j A00() {
        boolean A03 = ((20U) 1Br.A0B(this.A01)).A03();
        Context context = this.A02;
        int i = 2131963505;
        if (A03) {
            i = 2131963503;
        }
        return ((CG8) 1Br.A0B(this.A00)).A01(C3o5.A0D(context, SecurityAlertsActivity.class), (C5ww) null, 1BK.A0u(context, 2131963506), AbG.A16(context, i), "security_alerts");
    }
}
