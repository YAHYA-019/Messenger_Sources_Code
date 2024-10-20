package com.facebook.messaging.avatar.socialstickers.ui.settings;

import X.11T;
import X.1pK;
import X.7zT;
import X.B8s;
import android.os.Bundle;
import com.facebook.messaging.settings.surface.MessengerSettingActivity;
import java.io.Serializable;

/* loaded from: AvatarUsabilitySettingActivity.class */
public final class AvatarUsabilitySettingActivity extends MessengerSettingActivity {
    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        A3B();
        Serializable serializableExtra = getIntent().getSerializableExtra("extra_entry_point");
        11T.A0I(serializableExtra, "null cannot be cast to non-null type com.facebook.messaging.avatar.socialstickers.logging.PrivacyScreenEntryPoint");
        11T.A0F(serializableExtra, 0);
        1pK b8s = new B8s();
        7zT.A1B(b8s, "arg_entry_point", serializableExtra);
        A3C(b8s);
    }
}
