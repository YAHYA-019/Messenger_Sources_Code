package com.facebook.zero.optin.activity;

import X.1BV;
import X.1Iw;
import X.1iF;
import X.7zL;
import X.AbH;
import X.AbN;
import X.C00i;
import X.C1rs;
import X.DKE;
import X.ED7;
import X.GDY;
import X.QEz;
import X.QLg;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import java.util.BitSet;

/* loaded from: AutoFlexNewResOptinActivity.class */
public class AutoFlexNewResOptinActivity extends FbFragmentActivity implements GDY {
    public C00i A00;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKE.A0Q();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A00 = 1BV.A00(98479);
        ED7 A00 = ED7.A00(this, AbH.A0S());
        1Iw A0W = 7zL.A0W(this);
        QEz qEz = new QEz(A0W, new QLg());
        QLg qLg = qEz.A01;
        qLg.A01 = A00;
        BitSet bitSet = qEz.A02;
        bitSet.set(1);
        qLg.A00 = this;
        bitSet.set(0);
        C1rs.A00(bitSet, qEz.A03);
        qEz.A0J();
        setContentView(AbN.A0I(qLg, A0W));
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }
}
