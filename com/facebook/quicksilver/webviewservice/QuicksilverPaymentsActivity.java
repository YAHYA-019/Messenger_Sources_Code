package com.facebook.quicksilver.webviewservice;

import X.1BQ;
import X.1iF;
import X.7zL;
import X.C00i;
import X.DKD;
import X.DKF;
import X.DKG;
import X.ENf;
import X.FFy;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import java.lang.ref.WeakReference;

/* loaded from: QuicksilverPaymentsActivity.class */
public class QuicksilverPaymentsActivity extends FbFragmentActivity {
    public String A00;
    public String A01;
    public String A02;
    public FFy A03;
    public final C00i A04 = 1BQ.A02(98346);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKG.A0H();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        DKF.A0f(this.A04).A07 = DKD.A11();
        super.A2l();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        String str;
        super.A2y(bundle);
        C00i c00i = this.A04;
        DKF.A0f(c00i).A07 = 7zL.A14(this);
        if (bundle == null) {
            this.A00 = getIntent().getStringExtra("productID");
            this.A01 = getIntent().getStringExtra("promiseID");
            this.A02 = getIntent().getStringExtra("developerPayload");
            WeakReference weakReference = DKF.A0f(c00i).A0D;
            FFy fFy = (weakReference == null || weakReference.get() == null) ? null : (FFy) DKF.A0g(weakReference).A0N.get();
            this.A03 = fFy;
            String str2 = this.A01;
            if (str2 == null || (str = this.A00) == null || fFy == null) {
                finish();
            } else {
                fFy.A02(this, str2, str, this.A02);
            }
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == ENf.A0G.code) {
            finish();
        }
    }
}
