package com.facebook.messaging.professionalservices.booking.activities;

import X.1Bi;
import X.2S0;
import X.2Z9;
import X.AbJ;
import X.BgX;
import X.C0et;
import X.C1544Akx;
import X.CCU;
import X.CPc;
import X.Fsb;
import X.GGc;
import X.GJL;
import X.RQ7;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: AppointmentActivity.class */
public class AppointmentActivity extends FbFragmentActivity implements GGc, 2Z9 {
    public CCU A00;
    public GJL A01;
    public C0et A02;
    public RQ7 A03;
    public Fsb A04;
    public CPc A05;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        super.A2b(fragment);
        if (fragment instanceof C1544Akx) {
            ((C1544Akx) fragment).A04 = new BgX(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0212, code lost:
    
        if (r304 == null) goto L65;
     */
    @Override // com.facebook.base.activity.FbFragmentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A2y(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.professionalservices.booking.activities.AppointmentActivity.A2y(android.os.Bundle):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        super.A2z(bundle);
        this.A02 = AbJ.A0E();
        this.A05 = (CPc) 1Bi.A03(84955);
        this.A01 = (GJL) 1Bi.A03(84011);
        this.A00 = (CCU) 1Bi.A03(85230);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        2S0 A0Y = BDe().A0Y(2131366690);
        if ((A0Y instanceof 2S0) && A0Y.Bkd()) {
            return;
        }
        super.onBackPressed();
    }

    public void setCustomTitle(View view) {
    }
}
