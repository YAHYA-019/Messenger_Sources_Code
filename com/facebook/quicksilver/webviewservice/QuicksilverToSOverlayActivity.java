package com.facebook.quicksilver.webviewservice;

import X.C00i;
import X.DKD;
import X.DKF;
import X.FI3;

/* loaded from: QuicksilverToSOverlayActivity.class */
public class QuicksilverToSOverlayActivity extends QuicksilverOverlayBaseActivity {
    @Override // com.facebook.quicksilver.webviewservice.QuicksilverOverlayBaseActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        C00i c00i = this.A01;
        if (FI3.A00(c00i) != null && FI3.A00(c00i).A05() != null) {
            FI3.A00(c00i).A05().A02("ToS Closed without acceptance");
        }
        super.A2l();
        DKF.A0f(c00i).A0A = DKD.A11();
    }
}
