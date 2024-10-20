package com.facebook.messaging.chatheads.interstitialnux;

import X.06Z;
import X.1BJ;
import X.1BY;
import X.1Bi;
import X.1Fv;
import X.1Lo;
import X.1iF;
import X.2Ov;
import X.C91v;
import X.DKy;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: ChatHeadsInterstitialNuxLauncherActivity.class */
public class ChatHeadsInterstitialNuxLauncherActivity extends FbFragmentActivity {
    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        if (fragment instanceof ChatHeadsInterstitialNuxFragment) {
            ((2Ov) fragment).A18(new C91v(this, 1));
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return new 1iF(3719985438017145L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        ((DKy) 1Lo.A04(this, ((1Fv) 1Bi.A03(66351)).A05(this), (1BY) null, 99445)).A01(this);
        06Z BDe = BDe();
        String A00 = 1BJ.A00(1117);
        if (BDe.A0b(A00) == null) {
            new ChatHeadsInterstitialNuxFragment().A0m(BDe, A00);
        }
    }
}
