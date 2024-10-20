package com.facebook.messaging.messengerprefs;

import X.1BK;
import X.1pK;
import X.Gre;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.messaging.settings.surface.MessengerSettingActivity;

/* loaded from: RingtonePreferenceActivity.class */
public class RingtonePreferenceActivity extends MessengerSettingActivity {
    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        A3B();
        Intent intent = getIntent();
        Parcelable parcelableExtra = intent.getParcelableExtra("thread_key");
        String stringExtra = intent.getStringExtra("ringtone_setting_title_extra");
        String stringExtra2 = intent.getStringExtra("ringtone_prefkey_extra");
        int intExtra = intent.getIntExtra("ringtone_preference_type_extra", 0);
        String stringExtra3 = intent.getStringExtra("messenger_tone_uri");
        Bundle A05 = 1BK.A05();
        A05.putString("RINGTONE_FRAGMENT_TITLE", stringExtra);
        A05.putString("RINGTONE_PREF_KEY", stringExtra2);
        A05.putInt("RINGTONE_TYPE", intExtra);
        A05.putString("FB_RINGTONE_URI", stringExtra3);
        A05.putParcelable("THREAD_KEY", parcelableExtra);
        1pK gre = new Gre();
        gre.setArguments(A05);
        A3C(gre);
    }
}
