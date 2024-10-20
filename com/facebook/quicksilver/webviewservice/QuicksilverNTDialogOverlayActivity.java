package com.facebook.quicksilver.webviewservice;

import X.0FI;
import X.7zP;
import X.DKD;
import X.DKF;
import X.EtR;
import X.F9N;
import X.G5G;
import java.lang.ref.WeakReference;

/* loaded from: QuicksilverNTDialogOverlayActivity.class */
public class QuicksilverNTDialogOverlayActivity extends QuicksilverOverlayBaseActivity {
    @Override // com.facebook.quicksilver.webviewservice.QuicksilverOverlayBaseActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        QuicksilverOverlayBaseActivity.A12(this).A06 = DKD.A11();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        WeakReference weakReference = QuicksilverOverlayBaseActivity.A12(this).A0D;
        if (weakReference == null || weakReference.get() == null || DKF.A0g(weakReference).A0f == null) {
            return;
        }
        F9N f9n = DKF.A0g(weakReference).A0f;
        if (f9n.A09.getVisibility() == 0) {
            String str = f9n.A00;
            if (str != null && str.length() != 0) {
                EtR etR = (EtR) f9n.A0A.get();
                7zP.A0N(etR.A01).Ciz(new G5G(etR, f9n.A00, "The player dismissed the dialog", "USER_INPUT"));
                f9n.A00 = null;
            }
            f9n.A01();
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        int A00 = 0FI.A00(1589198585);
        super.onStart();
        0FI.A07(-414949491, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        int A00 = 0FI.A00(1701559796);
        super.onStop();
        0FI.A07(1670360484, A00);
    }
}
