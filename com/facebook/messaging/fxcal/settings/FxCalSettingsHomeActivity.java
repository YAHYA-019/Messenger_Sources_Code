package com.facebook.messaging.fxcal.settings;

import X.11T;
import X.1BK;
import X.E1M;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.settings.surface.MessengerSettingActivity;

/* loaded from: FxCalSettingsHomeActivity.class */
public final class FxCalSettingsHomeActivity extends MessengerSettingActivity {
    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        11T.A0F(fragment, 0);
        super.A2b(fragment);
    }

    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        A3B();
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("redirect_service");
        String stringExtra2 = intent.getStringExtra("product_type");
        String stringExtra3 = intent.getStringExtra("session_id");
        Bundle A05 = 1BK.A05();
        A05.putString("redirect_service", stringExtra);
        A05.putString("fb_pay_product_type", stringExtra2);
        A05.putString("fb_pay_session_id", stringExtra3);
        E1M e1m = new E1M();
        e1m.setArguments(A05);
        A3C(e1m);
        overridePendingTransition(2130772011, 2130772069);
    }
}
