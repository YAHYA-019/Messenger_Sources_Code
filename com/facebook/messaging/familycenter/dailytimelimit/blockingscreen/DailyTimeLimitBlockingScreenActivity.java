package com.facebook.messaging.familycenter.dailytimelimit.blockingscreen;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1Bn;
import X.1pH;
import X.7zM;
import X.CfA;
import X.Erg;
import X.InterfaceC03743yx;
import X.Q4U;
import android.os.Bundle;
import android.view.ViewGroup;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: DailyTimeLimitBlockingScreenActivity.class */
public final class DailyTimeLimitBlockingScreenActivity extends FbFragmentActivity implements InterfaceC03743yx {
    public 1pH A00;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        1pH r0 = this.A00;
        if (r0 != null) {
            r0.A06();
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A00 = 1pH.A02((ViewGroup) 7zM.A0F(this), BDe(), new CfA(this, 3), false);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        1pH r0 = this.A00;
        if (r0 == null) {
            11T.A0L("contentViewManager");
            throw 0Q8.createAndThrow();
        }
        r0.CeH("DailyTimeLimitBlockingScreenFragment");
        ((Erg) 1Bn.A0A(99364)).A00(this);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        int A00 = 0FI.A00(598820083);
        super.onStart();
        if (this.A00 != null) {
            Q4U q4u = new Q4U();
            1pH r0 = this.A00;
            if (r0 == null) {
                11T.A0L("contentViewManager");
                throw 0Q8.createAndThrow();
            }
            r0.Czy(q4u, "DailyTimeLimitBlockingScreenFragment");
        }
        0FI.A07(378050641, A00);
    }
}
