package com.facebook.quicksilver.webviewservice;

import X.0FI;
import X.C00i;
import X.C09s;
import X.DKD;
import X.DKG;
import X.FI3;
import android.view.ViewGroup;

/* loaded from: QuicksilverMatchOverlayActivity.class */
public class QuicksilverMatchOverlayActivity extends QuicksilverOverlayBaseActivity {
    @Override // com.facebook.quicksilver.webviewservice.QuicksilverOverlayBaseActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        QuicksilverOverlayBaseActivity.A12(this).A05 = DKD.A11();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C00i c00i = this.A01;
        if (FI3.A00(c00i) != null) {
            QuicksilverWebviewService A00 = FI3.A00(c00i);
            FI3.A03(DKG.A0r(A00).A05);
            String str = A00.A0l;
            if (str != null) {
                A00.Ccf(str, "The player dismissed the dialog", "USER_INPUT");
                A00.A0l = null;
            }
        }
        super.onBackPressed();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        int A00 = 0FI.A00(-1121801503);
        super.onStart();
        C00i c00i = this.A01;
        if (FI3.A00(c00i) != null) {
            FI3.A00(c00i).A04 = (ViewGroup) C09s.A00(this, 2131366797);
        }
        0FI.A07(-270549768, A00);
    }
}
