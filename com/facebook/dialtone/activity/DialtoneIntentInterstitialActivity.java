package com.facebook.dialtone.activity;

import X.1BQ;
import X.1BV;
import X.1iF;
import X.4YV;
import X.AbH;
import X.AbL;
import X.C00i;
import X.C67J;
import X.DKD;
import X.FiI;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: DialtoneIntentInterstitialActivity.class */
public class DialtoneIntentInterstitialActivity extends FbFragmentActivity {
    public int A00;
    public Intent A01;
    public boolean A02;
    public final C00i A06 = 1BV.A00(66170);
    public final C00i A03 = DKD.A0R();
    public final C00i A05 = AbH.A0D();
    public final C00i A04 = 1BQ.A00();

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbL.A0A();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        Intent intent = getIntent();
        Intent intent2 = (Intent) intent.getParcelableExtra("destination_intent");
        this.A01 = intent2;
        intent2.setExtrasClassLoader(4YV.A0e(this));
        this.A02 = intent.getBooleanExtra("start_for_result", false);
        this.A00 = intent.getIntExtra("request_code", 0);
        C00i c00i = this.A06;
        ((C67J) c00i.get()).A05(new FiI(this), "dialtone_faceweb_interstitial", getString(2131955749), getString(2131955748));
        ((C67J) c00i.get()).A01(BDe(), null, "dialtone_faceweb_interstitial");
    }
}
