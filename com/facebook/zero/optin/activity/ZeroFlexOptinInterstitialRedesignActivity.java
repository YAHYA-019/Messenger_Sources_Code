package com.facebook.zero.optin.activity;

import X.0LS;
import X.1BK;
import X.1BQ;
import X.1Iw;
import X.1iF;
import X.7zL;
import X.AbH;
import X.AbL;
import X.AbstractC00603o4;
import X.C00i;
import X.C1rs;
import X.DKE;
import X.ED6;
import X.F8r;
import X.GIm;
import X.GJL;
import X.QF0;
import X.QF1;
import X.QLh;
import X.QMr;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.litho.LithoView;
import java.util.BitSet;

/* loaded from: ZeroFlexOptinInterstitialRedesignActivity.class */
public class ZeroFlexOptinInterstitialRedesignActivity extends ZeroOptinInterstitialActivityBase implements GIm {
    public static final CallerContext A04 = CallerContext.A0B("ZeroFlexOptinInterstitialRedesignActivity");
    public static final C00i A05 = 1BQ.A00();
    public C00i A00;
    public FbUserSession A01;
    public final C00i A02 = 1BQ.A02(98468);
    public final C00i A03 = 1BQ.A02(84011);

    public static void A12(ZeroFlexOptinInterstitialRedesignActivity zeroFlexOptinInterstitialRedesignActivity) {
        ((F8r) zeroFlexOptinInterstitialRedesignActivity.A02.get()).A02("optin_reconsider_initiated");
        Intent Arj = ((GJL) zeroFlexOptinInterstitialRedesignActivity.A03.get()).Arj(zeroFlexOptinInterstitialRedesignActivity, AbstractC00603o4.A00(513));
        if (Arj != null) {
            Arj.putExtra("location", zeroFlexOptinInterstitialRedesignActivity.A3D());
            0LS.A0A(zeroFlexOptinInterstitialRedesignActivity, Arj);
            zeroFlexOptinInterstitialRedesignActivity.finish();
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKE.A0Q();
    }

    @Override // com.facebook.zero.optin.activity.ZeroOptinInterstitialActivityBase, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A01 = AbL.A08(this);
        this.A00 = AbH.A0S();
        1Iw A0W = 7zL.A0W(this);
        QF1 qf1 = new QF1(A0W, new QMr());
        ED6 A3C = A3C();
        QLh qLh = qf1.A01;
        ((QMr) qLh).A01 = A3C;
        BitSet bitSet = qf1.A02;
        bitSet.set(1);
        ((QMr) qLh).A00 = this;
        bitSet.set(0);
        C1rs.A00(bitSet, qf1.A03);
        qf1.A0J();
        if (1BK.A0N(A05).AZk(36310675729417061L)) {
            QF0 qf0 = new QF0(A0W, new QLh());
            ED6 A3C2 = A3C();
            qLh = qf0.A01;
            qLh.A01 = A3C2;
            BitSet bitSet2 = qf0.A02;
            bitSet2.set(1);
            qLh.A00 = this;
            bitSet2.set(0);
            C1rs.A00(bitSet2, qf0.A03);
            qf0.A0J();
        }
        setContentView(LithoView.A02(qLh, A0W));
        ((F8r) this.A02.get()).A02("optin_interstitial_rendered");
    }

    @Override // com.facebook.zero.optin.activity.ZeroOptinInterstitialActivityBase
    public void A3J(FbUserSession fbUserSession, String str) {
        ((F8r) this.A02.get()).A01("optin_initiated");
        super.A3J(fbUserSession, str);
    }

    @Override // X.GIm
    public void CDr() {
        FbUserSession fbUserSession = this.A01;
        fbUserSession.getClass();
        A3J(fbUserSession, A3D());
    }

    @Override // X.GIm
    public void CJj() {
        A12(this);
    }

    @Override // com.facebook.zero.optin.activity.ZeroOptinInterstitialActivityBase, com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ((F8r) this.A02.get()).A02("optin_back_pressed");
        1Iw A0W = 7zL.A0W(this);
        setContentView(LithoView.A02(QMr.A00(A0W), A0W));
        A12(this);
    }
}
