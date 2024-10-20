package com.facebook.messaging.accountswitch;

import X.1lN;
import X.AbH;
import X.AbJ;
import X.B9J;
import X.C1io;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.messaging.settings.surface.MessengerSettingActivity;

/* loaded from: SwitchOneClickActivity.class */
public class SwitchOneClickActivity extends MessengerSettingActivity implements 1lN, C1io {
    public B9J A00;

    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        A3B();
        if (getIntent().getParcelableExtra("auth_identify_user") == null) {
            finish();
            return;
        }
        Parcelable parcelableExtra = getIntent().getParcelableExtra("auth_identify_user");
        B9J b9j = new B9J();
        b9j.setArguments(AbH.A05(parcelableExtra, "auth_identify_user"));
        this.A00 = b9j;
        A3C(b9j);
    }

    public String AWg() {
        return "mswitch_accounts_one_click";
    }

    public Long Am7() {
        return AbJ.A0v();
    }
}
