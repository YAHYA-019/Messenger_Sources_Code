package com.facebook.messaging.bubbles.inbox.activity;

import X.0Q8;
import X.11T;
import X.1Bi;
import X.1pH;
import X.1pK;
import X.5oO;
import X.7zM;
import X.C1547Al0;
import X.CfA;
import X.DEA;
import X.DER;
import android.os.Bundle;
import android.view.ViewGroup;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: BubblesInboxActivity.class */
public final class BubblesInboxActivity extends FbFragmentActivity implements DEA, DER {
    public 1pH A00;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        1pH r0 = this.A00;
        if (r0 == null) {
            11T.A0L("contentViewManager");
            throw 0Q8.createAndThrow();
        }
        r0.A06();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        ((5oO) 1Bi.A03(68467)).A09(this);
        this.A00 = 1pH.A02((ViewGroup) 7zM.A0F(this), BDe(), new CfA(this, 1), false);
        1pK c1547Al0 = new C1547Al0();
        1pH r0 = this.A00;
        if (r0 == null) {
            11T.A0L("contentViewManager");
            throw 0Q8.createAndThrow();
        }
        r0.Czy(c1547Al0, "BubblesInboxActivity");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        1pH r0 = this.A00;
        if (r0 == null) {
            11T.A0L("contentViewManager");
            throw 0Q8.createAndThrow();
        }
        if (r0.A07()) {
            return;
        }
        super.onBackPressed();
    }
}
