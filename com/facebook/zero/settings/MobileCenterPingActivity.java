package com.facebook.zero.settings;

import X.0FI;
import X.1BQ;
import X.1Kd;
import X.1iF;
import X.4YU;
import X.7zL;
import X.AbF;
import X.AbL;
import X.AbM;
import X.C00i;
import X.DKE;
import X.ETV;
import X.F8b;
import X.FJ7;
import X.Fw5;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: MobileCenterPingActivity.class */
public class MobileCenterPingActivity extends FbFragmentActivity {
    public FbUserSession A00;
    public final C00i A01 = AbF.A0Q(this, 98596);
    public final C00i A03 = 1BQ.A02(16964);
    public final C00i A02 = 7zL.A0R(this, 98502);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKE.A0Q();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A00 = AbL.A08(this);
        if (4YU.A0d(this.A03).A04("carrier_page_upsell")) {
            F8b f8b = (F8b) this.A02.get();
            FbUserSession fbUserSession = this.A00;
            boolean A0S = f8b.A01.A0S();
            ETV A08 = AbM.A0n(f8b.A03).A08(fbUserSession, "upsell_carrier_page");
            String str = A08 != null ? A08.A02 : "";
            if (!str.isEmpty()) {
                1Kd.A0D(f8b.A02, new Fw5(1, this, null, f8b, false), F8b.A00(f8b, Boolean.valueOf(A0S), true, str, "unknown", "", false));
            }
            finish();
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(1184614705);
        super.onPause();
        ((FJ7) this.A01.get()).A06.A01();
        0FI.A07(-933008748, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(308184147);
        super.onResume();
        FJ7 fj7 = (FJ7) this.A01.get();
        fj7.A06.A00();
        FJ7.A06(fj7);
        0FI.A07(699161024, A00);
    }
}
