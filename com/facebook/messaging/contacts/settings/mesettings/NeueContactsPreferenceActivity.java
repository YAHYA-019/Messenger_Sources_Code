package com.facebook.messaging.contacts.settings.mesettings;

import X.1BY;
import X.1Lo;
import X.AbL;
import X.B92;
import X.C6x;
import android.os.Bundle;
import com.facebook.messaging.settings.surface.MessengerSettingActivity;

/* loaded from: NeueContactsPreferenceActivity.class */
public class NeueContactsPreferenceActivity extends MessengerSettingActivity {
    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setTitle(2131965802);
        A3B();
        A3C(new B92());
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        ((C6x) 1Lo.A04(this, AbL.A08(this), (1BY) null, 82347)).A00();
        super.finish();
    }
}
