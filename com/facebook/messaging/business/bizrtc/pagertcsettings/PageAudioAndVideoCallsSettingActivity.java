package com.facebook.messaging.business.bizrtc.pagertcsettings;

import X.1BK;
import X.B9H;
import android.os.Bundle;
import com.facebook.messaging.settings.surface.MessengerSettingActivity;

/* loaded from: PageAudioAndVideoCallsSettingActivity.class */
public class PageAudioAndVideoCallsSettingActivity extends MessengerSettingActivity {
    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        B9H b9h = new B9H();
        Bundle A05 = 1BK.A05();
        if (getIntent().getBooleanExtra("auto_turn_on", false)) {
            A05.putBoolean("auto_turn_on", true);
        }
        A05.putSerializable("rtc_settings_entrypoint", getIntent().getSerializableExtra("rtc_settings_entrypoint"));
        b9h.setArguments(A05);
        setTitle(2131963676);
        A3B();
        A3C(b9h);
    }
}
