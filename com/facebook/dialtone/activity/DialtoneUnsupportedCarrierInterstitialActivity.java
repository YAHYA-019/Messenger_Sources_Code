package com.facebook.dialtone.activity;

import X.0FI;
import X.1BK;
import X.1QE;
import X.1iF;
import X.1lN;
import X.2Jy;
import X.4YU;
import X.7zO;
import X.AbH;
import X.AbL;
import X.AbstractC00603o4;
import X.C00i;
import X.C1kw;
import X.C2J3;
import X.DKC;
import X.DKD;
import X.DKF;
import X.DTk;
import X.FXr;
import X.GCX;
import android.os.Bundle;
import android.widget.TextView;
import com.facebook.acra.constants.ActionId;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: DialtoneUnsupportedCarrierInterstitialActivity.class */
public class DialtoneUnsupportedCarrierInterstitialActivity extends FbFragmentActivity implements 1lN, GCX {
    public final C00i A00 = DKD.A0R();
    public final C00i A01 = AbH.A0P();
    public final C00i A03 = DKD.A0T();
    public final C00i A02 = DKF.A0M();

    public static void A12(DialtoneUnsupportedCarrierInterstitialActivity dialtoneUnsupportedCarrierInterstitialActivity, String str) {
        2Jy A0H = 4YU.A0H(str);
        A0H.A0D("pigeon_reserved_keyword_module", "dialtone");
        A0H.A0D("carrier_id", DKC.A0i(dialtoneUnsupportedCarrierInterstitialActivity.A03).A08(1QE.A02));
        C1kw A06 = 1BK.A06(dialtoneUnsupportedCarrierInterstitialActivity.A01);
        if (DTk.A00 == null) {
            synchronized (DTk.class) {
                if (DTk.A00 == null) {
                    DTk.A00 = new C2J3(A06);
                }
            }
        }
        DTk.A00.A03(A0H);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbL.A0A();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2131558404);
        TextView A0J = DKC.A0J(this, 2131368085);
        String A0v = 7zO.A0H(this).getBoolean(AbstractC00603o4.A00(480)) ? 1BK.A0v(this, DKC.A0i(this.A03).A0C(1QE.A01, getString(2131955747)), 2131955757) : 7zO.A0H(this).getBoolean(AbstractC00603o4.A00(479)) ? getString(2131955753) : DKF.A0i(this.A02).A04("not_eligible_to_use_facebook_free", getString(2131955750));
        A0J.setText(A0v);
        A0J.setContentDescription(A0v);
        TextView A0J2 = DKC.A0J(this, 2131363605);
        String string = getString(2131955756);
        A0J2.setText(string);
        A0J2.setContentDescription(string);
        FXr.A03(A2c(2131366086), this, 27);
    }

    public String AWg() {
        return "dialtone_ineligible_interstitial";
    }

    public Long Am7() {
        return null;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        4YU.A0K(this.A00).A0I("dialtone_ineligible_interstitial_back_pressed");
        super.onBackPressed();
        A12(this, "dialtone_ineligible_interstitial_back_pressed");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(-1703865846);
        super.onPause();
        A12(this, AbstractC00603o4.A00(ActionId.CONNECTIVITY_CHANGED));
        0FI.A07(1782939466, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(-559565053);
        super.onResume();
        A12(this, AbstractC00603o4.A00(ActionId.VIDEO_DISPLAYED));
        0FI.A07(419633355, A00);
    }
}
