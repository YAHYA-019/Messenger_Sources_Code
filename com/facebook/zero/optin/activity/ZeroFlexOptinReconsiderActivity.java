package com.facebook.zero.optin.activity;

import X.0LS;
import X.1BQ;
import X.1Iw;
import X.1iF;
import X.2BX;
import X.4YU;
import X.7zL;
import X.AbH;
import X.AbL;
import X.C00i;
import X.C1rs;
import X.DKD;
import X.DKE;
import X.F8r;
import X.GIm;
import X.GJL;
import X.QF2;
import X.QMq;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.litho.LithoView;
import java.util.BitSet;

/* loaded from: ZeroFlexOptinReconsiderActivity.class */
public class ZeroFlexOptinReconsiderActivity extends ZeroOptinInterstitialActivityBase implements GIm {
    public static final CallerContext A05 = CallerContext.A0B("ZeroFlexOptinReconsiderActivity");
    public C00i A00;
    public FbUserSession A01;
    public C00i A02;
    public final C00i A04 = 1BQ.A02(84011);
    public final C00i A03 = 1BQ.A02(98468);

    public static void A12(ZeroFlexOptinReconsiderActivity zeroFlexOptinReconsiderActivity) {
        ((F8r) zeroFlexOptinReconsiderActivity.A03.get()).A02("optin_interstitial_initiated");
        Intent Arj = ((GJL) zeroFlexOptinReconsiderActivity.A04.get()).Arj(zeroFlexOptinReconsiderActivity, "fbinternal://zero_flex_optin_interstitial_redesign");
        if (Arj != null) {
            Arj.putExtra("location", zeroFlexOptinReconsiderActivity.A3D());
            0LS.A0A(zeroFlexOptinReconsiderActivity, Arj);
            zeroFlexOptinReconsiderActivity.finish();
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
        this.A02 = DKD.A0T();
        1Iw A0W = 7zL.A0W(this);
        QF2 qf2 = new QF2(A0W, new QMq());
        2BX r0 = (2BX) 4YU.A0p(this.A02);
        String A0C = r0.A0C(2BX.A02(r0), "");
        QMq qMq = qf2.A01;
        qMq.A01 = A0C;
        BitSet bitSet = qf2.A02;
        bitSet.set(0);
        qMq.A00 = this;
        bitSet.set(1);
        C1rs.A00(bitSet, qf2.A03);
        qf2.A0J();
        setContentView(LithoView.A02(qMq, A0W));
        ((F8r) this.A03.get()).A02("optin_reconsider_rendered");
    }

    @Override // com.facebook.zero.optin.activity.ZeroOptinInterstitialActivityBase
    public void A3K(FbUserSession fbUserSession, String str) {
        ((F8r) this.A03.get()).A01("optout_initiated");
        super.A3L(fbUserSession, "dialtone://switch_to_full_fb", A3D());
    }

    @Override // X.GIm
    public void CDr() {
        ZeroOptinInterstitialActivityBase.A16(this.A01, this);
    }

    @Override // X.GIm
    public void CJj() {
        A12(this);
    }

    @Override // com.facebook.zero.optin.activity.ZeroOptinInterstitialActivityBase, com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ((F8r) this.A03.get()).A02("optin_reconsider_back_pressed");
        1Iw A0W = 7zL.A0W(this);
        setContentView(LithoView.A02(QMq.A00(A0W), A0W));
        A12(this);
    }
}
