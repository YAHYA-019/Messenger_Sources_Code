package com.facebook.messaging.quickpromotion.interstitial.ui;

import X.7zO;
import X.7zU;
import X.AlY;
import X.C06c;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: MessengerQPInterstitialActivity.class */
public final class MessengerQPInterstitialActivity extends FbFragmentActivity {
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132541559);
        Bundle A0H = 7zO.A0H(this);
        if (A0H != null) {
            int i = A0H.getInt("qp_template");
            if (Integer.valueOf(i) != null && i == 9) {
                Fragment alY = new AlY(0);
                alY.setArguments(A0H);
                alY.setRetainInstance(true);
                C06c A0D = 7zU.A0D(this);
                A0D.A0Q(alY, "MessengerInterstitialBaseFragment", 2131363332);
                C06c.A00(A0D, false);
                return;
            }
        }
        finish();
    }
}
