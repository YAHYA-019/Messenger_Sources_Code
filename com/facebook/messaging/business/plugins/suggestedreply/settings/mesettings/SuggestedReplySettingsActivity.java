package com.facebook.messaging.business.plugins.suggestedreply.settings.mesettings;

import X.1BK;
import X.1pK;
import X.B8z;
import android.os.Bundle;
import com.facebook.messaging.settings.surface.MessengerSettingActivity;
import java.io.Serializable;

/* loaded from: SuggestedReplySettingsActivity.class */
public class SuggestedReplySettingsActivity extends MessengerSettingActivity {
    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        1pK b8z = new B8z();
        Bundle A05 = 1BK.A05();
        Serializable serializableExtra = getIntent().getSerializableExtra("settings_entrypoint");
        Serializable serializableExtra2 = getIntent().getSerializableExtra("feature");
        A05.putSerializable("settings_entrypoint", serializableExtra);
        A05.putSerializable("feature", serializableExtra2);
        b8z.setArguments(A05);
        setTitle(2131966565);
        A3B();
        A3C(b8z);
    }
}
