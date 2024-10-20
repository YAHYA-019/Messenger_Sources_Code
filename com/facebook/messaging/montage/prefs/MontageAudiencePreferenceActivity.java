package com.facebook.messaging.montage.prefs;

import X.7zO;
import X.B9E;
import X.BJB;
import android.os.Bundle;
import com.facebook.messaging.settings.surface.MessengerSettingActivity;

/* loaded from: MontageAudiencePreferenceActivity.class */
public class MontageAudiencePreferenceActivity extends MessengerSettingActivity {
    public BJB A00;

    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        A3B();
        B9E b9e = new B9E();
        this.A00 = b9e;
        b9e.A06 = true;
        b9e.setArguments(7zO.A0H(this));
        A3C(this.A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        BJB bjb = this.A00;
        if (bjb == null || !bjb.Bkd()) {
            super.onBackPressed();
        }
    }
}
