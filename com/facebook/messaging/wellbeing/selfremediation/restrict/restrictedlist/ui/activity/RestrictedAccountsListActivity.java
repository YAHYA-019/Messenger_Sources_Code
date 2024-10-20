package com.facebook.messaging.wellbeing.selfremediation.restrict.restrictedlist.ui.activity;

import X.11T;
import X.1pH;
import X.1pK;
import X.7zM;
import X.AbL;
import X.C1532Akl;
import android.os.Bundle;
import com.facebook.messaging.settings.surface.MessengerSettingActivity;

/* loaded from: RestrictedAccountsListActivity.class */
public final class RestrictedAccountsListActivity extends MessengerSettingActivity {
    public 1pH A00;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        1pH r0 = this.A00;
        if (r0 != null) {
            r0.A06();
        }
    }

    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        1pH r303 = this.A00;
        if (r303 == null) {
            r303 = AbL.A0B(this, 7zM.A0F(this));
        }
        this.A00 = r303;
        A3B();
        A3C(new C1532Akl());
    }

    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity
    public void A3C(1pK r302) {
        11T.A0F(r302, 0);
        super.A3C(r302);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        1pH r0 = this.A00;
        if (r0 == null || !r0.A07()) {
            super.onBackPressed();
        }
    }
}
