package com.facebook.messaging.authapplock.setting;

import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1SD;
import X.1vE;
import X.C00i;
import X.Grc;
import X.HtF;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.messaging.settings.surface.MessengerSettingActivity;

/* loaded from: AuthAppLockPreferenceActivity.class */
public final class AuthAppLockPreferenceActivity extends MessengerSettingActivity {
    public final 1Br A02 = 1Bq.A00(66345);
    public final 1Br A01 = 1Bq.A00(66354);
    public final 1Br A00 = 1Bu.A00(116338);

    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        A3B();
        A3C(new Grc());
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 211 && i2 == -1) {
            ((1SD) this.A01.A00.get()).A01(true);
            C00i c00i = this.A02.A00;
            ((1vE) c00i.get()).A07.set(true);
            ((HtF) 1Br.A0B(this.A00)).A00(-1, ((1SD) r0.get()).A00());
            ((1vE) c00i.get()).A01();
            ((1vE) c00i.get()).A04(this);
        }
    }
}
