package com.facebook.quicksilver.webviewservice;

import X.C00i;
import X.DKD;
import X.FI3;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;

/* loaded from: QuicksilverHSShortcutActivity.class */
public class QuicksilverHSShortcutActivity extends QuicksilverOverlayBaseActivity {
    public String A00;

    @Override // com.facebook.quicksilver.webviewservice.QuicksilverOverlayBaseActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        QuicksilverOverlayBaseActivity.A12(this).A04 = DKD.A11();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        if (TextUtils.isEmpty(this.A00)) {
            return;
        }
        C00i c00i = this.A01;
        if (FI3.A00(c00i) != null) {
            FI3.A00(c00i).Ccf(this.A00, "User cancelled", "USER_INPUT");
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
        this.A00 = getIntent().getStringExtra("promiseID");
    }
}
