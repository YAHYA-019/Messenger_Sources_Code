package com.facebook.fos.headers.transparency;

import X.1BQ;
import X.1BV;
import X.1Iw;
import X.1iF;
import X.7zL;
import X.AbH;
import X.AbL;
import X.AbM;
import X.BOe;
import X.Bjp;
import X.C00i;
import X.C1io;
import X.C1rs;
import X.C2Q;
import X.CIb;
import X.QBD;
import X.QLc;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.litho.LithoView;
import java.util.BitSet;

/* loaded from: HeaderTransparencyInterstitialActivity.class */
public class HeaderTransparencyInterstitialActivity extends FbFragmentActivity implements C1io {
    public FbUserSession A00;
    public final C00i A01 = AbH.A0S();
    public final C00i A02 = 1BV.A00(85267);
    public final C00i A05 = 1BQ.A02(32813);
    public final C00i A03 = 1BQ.A02(85265);
    public final C00i A04 = 1BQ.A02(83604);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbL.A0A();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A00 = AbL.A08(this);
        1Iw A0W = 7zL.A0W(this);
        LithoView lithoView = new LithoView(A0W);
        QBD qbd = new QBD(new QLc(), lithoView.A09);
        Bjp bjp = new Bjp(this, A0W);
        QLc qLc = qbd.A00;
        qLc.A00 = bjp;
        BitSet bitSet = qbd.A02;
        bitSet.set(0);
        C1rs.A05(bitSet, qbd.A03, 1);
        qbd.A0J();
        lithoView.A0x(qLc);
        setContentView(lithoView);
        C2Q c2q = (C2Q) this.A02.get();
        C00i c00i = this.A05;
        boolean A1X = AbM.A1X(c00i);
        c2q.A00(BOe.A04, "", (String) null, AbM.A02(c00i), ((CIb) this.A03.get()).A01(), true, A1X);
    }
}
