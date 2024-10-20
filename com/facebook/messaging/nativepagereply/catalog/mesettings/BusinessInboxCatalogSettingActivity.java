package com.facebook.messaging.nativepagereply.catalog.mesettings;

import X.1BY;
import X.1Bn;
import X.2M8;
import X.B97;
import android.os.Bundle;
import com.facebook.messaging.settings.surface.MessengerSettingActivity;

/* loaded from: BusinessInboxCatalogSettingActivity.class */
public class BusinessInboxCatalogSettingActivity extends MessengerSettingActivity {
    public String A00;

    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A00 = getIntent().getStringExtra("catalog_setting_entry_point");
        setTitle(2131953233);
        A3B();
        A3C(new B97());
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        if ("nux".equals(this.A00)) {
            overridePendingTransition(0, 2130772070);
            ((2M8) 1Bn.A0E(this, (1BY) null, 65929)).CWE(this);
        }
    }
}
