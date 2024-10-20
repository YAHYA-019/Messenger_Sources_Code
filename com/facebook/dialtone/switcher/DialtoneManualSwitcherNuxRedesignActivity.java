package com.facebook.dialtone.switcher;

import X.0FI;
import X.1BL;
import X.1Bn;
import X.1Iw;
import X.1iF;
import X.1vL;
import X.4YU;
import X.7zL;
import X.AbH;
import X.AbK;
import X.AbL;
import X.C00i;
import X.C1rs;
import X.DKC;
import X.DKD;
import X.Drr;
import X.Dyi;
import X.F6q;
import X.GCY;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.litho.LithoView;
import java.util.BitSet;

/* loaded from: DialtoneManualSwitcherNuxRedesignActivity.class */
public class DialtoneManualSwitcherNuxRedesignActivity extends FbFragmentActivity implements GCY {
    public C00i A00;
    public C00i A01;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbL.A0A();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A01 = AbH.A0S();
        this.A00 = DKD.A0R();
        1Iw A0W = 7zL.A0W(this);
        Drr drr = new Drr(new Dyi(), A0W);
        boolean A0L = ((1vL) 4YU.A0p(this.A00)).A0L();
        Dyi dyi = drr.A00;
        dyi.A01 = A0L;
        BitSet bitSet = drr.A02;
        bitSet.set(0);
        dyi.A00 = this;
        bitSet.set(1);
        C1rs.A00(bitSet, drr.A03);
        drr.A0J();
        setContentView(LithoView.A02(dyi, A0W));
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(2095388072);
        super.onResume();
        C00i c00i = this.A01;
        c00i.getClass();
        AbK.A1O(1BL.A0V(c00i), DKC.A0b(((F6q) 1Bn.A0A(98566)).A09));
        0FI.A07(1425777825, A00);
    }
}
