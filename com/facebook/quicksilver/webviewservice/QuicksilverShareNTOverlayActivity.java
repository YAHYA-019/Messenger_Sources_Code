package com.facebook.quicksilver.webviewservice;

import X.AbL;
import X.DKD;
import X.DKF;
import X.FI3;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import java.lang.ref.WeakReference;

/* loaded from: QuicksilverShareNTOverlayActivity.class */
public class QuicksilverShareNTOverlayActivity extends QuicksilverOverlayBaseActivity {
    public FbUserSession A00;

    @Override // com.facebook.quicksilver.webviewservice.QuicksilverOverlayBaseActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        FI3 A12 = QuicksilverOverlayBaseActivity.A12(this);
        A12.A08 = DKD.A11();
        WeakReference weakReference = A12.A0D;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        weakReference.get();
    }

    @Override // com.facebook.quicksilver.webviewservice.QuicksilverOverlayBaseActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        this.A00 = AbL.A08(this);
        super.A2y(bundle);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        WeakReference weakReference = QuicksilverOverlayBaseActivity.A12(this).A0D;
        if (weakReference == null || weakReference.get() == null || DKF.A0g(weakReference).A0a == null) {
            return;
        }
        DKF.A0g(weakReference).A0a.A01();
    }
}
