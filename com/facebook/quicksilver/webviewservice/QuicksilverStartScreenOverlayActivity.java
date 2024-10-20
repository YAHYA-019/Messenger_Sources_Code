package com.facebook.quicksilver.webviewservice;

import X.C00i;
import X.DKD;
import X.DKF;

/* loaded from: QuicksilverStartScreenOverlayActivity.class */
public class QuicksilverStartScreenOverlayActivity extends QuicksilverOverlayBaseActivity {
    @Override // com.facebook.quicksilver.webviewservice.QuicksilverOverlayBaseActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        C00i c00i = this.A01;
        DKF.A0f(c00i).A0E = DKD.A11();
        DKF.A0f(c00i).A0G = false;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        QuicksilverOverlayBaseActivity.A12(this).A0A();
        super.onBackPressed();
    }
}
