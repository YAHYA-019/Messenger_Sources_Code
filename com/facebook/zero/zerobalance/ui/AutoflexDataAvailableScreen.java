package com.facebook.zero.zerobalance.ui;

import X.1BQ;
import X.1Iw;
import X.1iF;
import X.7zL;
import X.AbN;
import X.C00i;
import X.C1rs;
import X.DKE;
import X.DuF;
import X.Dyh;
import X.F8d;
import X.GDZ;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import java.util.BitSet;

/* loaded from: AutoflexDataAvailableScreen.class */
public class AutoflexDataAvailableScreen extends FbFragmentActivity implements GDZ {
    public final C00i A00 = 1BQ.A02(98462);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKE.A0Q();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        F8d.A00(this.A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        1Iw A0W = 7zL.A0W(this);
        DuF duF = new DuF(A0W, new Dyh());
        Dyh dyh = duF.A01;
        dyh.A00 = this;
        BitSet bitSet = duF.A02;
        bitSet.set(0);
        C1rs.A05(bitSet, duF.A03, 1);
        duF.A0J();
        setContentView(AbN.A0I(dyh, A0W));
        ((F8d) this.A00.get()).A0F.set(true);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }
}
