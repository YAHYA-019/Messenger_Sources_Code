package com.facebook.quicksilver.webviewservice;

import X.1BQ;
import X.1iF;
import X.7zL;
import X.C00i;
import X.C67J;
import X.DKD;
import X.DKF;
import X.DKG;
import X.FI3;
import X.FIT;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: QuicksilverZeroRatedInterstitialActivity.class */
public class QuicksilverZeroRatedInterstitialActivity extends FbFragmentActivity {
    public C67J A00;
    public FIT A01;
    public final C00i A02 = 1BQ.A02(98346);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKG.A0H();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        DKF.A0f(this.A02).A0C = DKD.A11();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        C00i c00i = this.A02;
        DKF.A0f(c00i).A0C = 7zL.A14(this);
        setContentView(2132543198);
        QuicksilverWebviewService A00 = FI3.A00(c00i);
        if (A00 == null) {
            finish();
            return;
        }
        this.A00 = (C67J) A00.A0W.get();
        this.A01 = DKG.A0q(A00);
        this.A00.A04(A00.A1F, "instant_games_interstitial", getResources().getString(2131964067));
        this.A00.A03(BDe(), "instant_games_interstitial");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        FIT fit = this.A01;
        if (fit != null) {
            fit.A0C("data_usage_dialog_cancel");
        }
        C67J c67j = this.A00;
        if (c67j != null) {
            c67j.A00.remove("instant_games_interstitial");
        }
        super.onBackPressed();
    }
}
