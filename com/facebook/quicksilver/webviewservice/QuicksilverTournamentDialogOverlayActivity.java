package com.facebook.quicksilver.webviewservice;

import X.C00i;
import X.DKD;
import X.DKF;

/* loaded from: QuicksilverTournamentDialogOverlayActivity.class */
public class QuicksilverTournamentDialogOverlayActivity extends QuicksilverOverlayBaseActivity {
    @Override // com.facebook.quicksilver.webviewservice.QuicksilverOverlayBaseActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        C00i c00i = this.A01;
        DKF.A0f(c00i).A0B = DKD.A11();
        DKF.A0f(c00i).A0H = false;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        QuicksilverOverlayBaseActivity.A12(this).A09();
    }
}
