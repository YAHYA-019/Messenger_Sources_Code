package com.facebook.messaging.interstitial;

import X.06Z;
import X.1BK;
import X.1pK;
import X.7zL;
import X.C06c;
import X.C1540Akt;
import X.CZE;
import X.GL6;
import android.os.Bundle;
import android.view.View;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: InstallFb4aInterstitialActivity.class */
public class InstallFb4aInterstitialActivity extends FbFragmentActivity {
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132542360);
        String stringExtra = getIntent().getStringExtra("extra_user_id");
        View findViewById = findViewById(2131368093);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        GL6 gl6 = (GL6) findViewById(2131368089);
        06Z BDe = BDe();
        gl6.Cm8(new CZE(this, BDe, 34));
        C06c A0G = 7zL.A0G(BDe);
        1pK c1540Akt = new C1540Akt();
        Bundle A05 = 1BK.A05();
        A05.putString("extra_user_id", stringExtra);
        c1540Akt.setArguments(A05);
        A0G.A0M(c1540Akt, 2131364228);
        C06c.A00(A0G, false);
    }
}
