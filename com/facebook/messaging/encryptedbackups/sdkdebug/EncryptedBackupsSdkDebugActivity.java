package com.facebook.messaging.encryptedbackups.sdkdebug;

import X.1iF;
import X.7zR;
import X.BJB;
import android.os.Bundle;
import com.facebook.messaging.settings.surface.MessengerSettingActivity;

/* loaded from: EncryptedBackupsSdkDebugActivity.class */
public final class EncryptedBackupsSdkDebugActivity extends MessengerSettingActivity {
    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity, com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return 7zR.A0F();
    }

    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        A3B();
        if (bundle == null) {
            A3C(new BJB());
        }
    }
}
