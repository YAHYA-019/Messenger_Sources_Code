package com.facebook.messaging.accessibility.settingsurface;

import X.11T;
import X.1BJ;
import X.1BK;
import X.1Br;
import X.1Lm;
import X.1UG;
import X.4YU;
import X.7zQ;
import X.7zR;
import X.BJB;
import X.C00i;
import X.CCY;
import android.os.Bundle;
import com.facebook.messaging.settings.surface.MessengerSettingActivity;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: AccessibilitySettingActivity.class */
public final class AccessibilitySettingActivity extends MessengerSettingActivity {
    public C00i A00;

    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setTitle(1BK.A0u(this, 2131952165));
        A3B();
        A3C(new BJB());
        MigColorScheme A0c = 7zR.A0c(this);
        1Br A00 = 1Lm.A00(this, 7zQ.A0N().A05(this), 82588);
        this.A00 = A00;
        CCY ccy = (CCY) A00.get();
        11T.A0F(A0c, 0);
        1UG A08 = 1BK.A08(1Br.A02(ccy.A00), 1BJ.A00(1808));
        if (A08.isSampled()) {
            A08.A7R("msgr_setting_accessibility_session_id", ccy.A01);
            A08.A7R("msgr_setting_accessibilty_subsection_session_id", "");
            4YU.A1I(A08, "accessibility_type", 0);
            4YU.A1I(A08, "setting_value", CCY.A00(A0c));
            A08.BZL();
        }
    }
}
