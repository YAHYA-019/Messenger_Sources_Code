package com.facebook.messaging.photos.setting;

import X.0fH;
import X.1BK;
import X.1pK;
import X.B8r;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.messaging.settings.surface.MessengerSettingActivity;

/* loaded from: MessengerMediaDownloadControlActivity.class */
public final class MessengerMediaDownloadControlActivity extends MessengerSettingActivity {
    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setTitle(2131963516);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("media_download_title_extra");
        int intExtra = intent.getIntExtra("media_download_title_res_extra", 0);
        A3B();
        if (stringExtra == null) {
            0fH.A0j("MessengerMediaDownloadControlActivity", "Extra was null.");
            stringExtra = "";
        }
        Bundle A05 = 1BK.A05();
        A05.putString("media_download_title_extra", stringExtra);
        A05.putInt("media_download_title_res_extra", intExtra);
        1pK b8r = new B8r();
        b8r.setArguments(A05);
        A3C(b8r);
    }
}
