package com.facebook.messaging.neue.nux.messenger;

import X.0FI;
import X.1BK;
import X.1BL;
import X.1Bi;
import X.1Br;
import X.1G2;
import X.1Ql;
import X.1iF;
import X.2W0;
import X.4YU;
import X.5II;
import X.7zO;
import X.AbF;
import X.AbG;
import X.AbI;
import X.AbK;
import X.AbL;
import X.AbstractC00603o4;
import X.BMG;
import X.Bue;
import X.C00i;
import X.C15h;
import X.C1f0;
import X.C1sx;
import X.CZF;
import X.CxA;
import X.DBe;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.litho.LithoView;
import com.facebook.messaging.neue.nux.NuxFragment;
import com.facebook.messaging.neue.nux.annotations.INeueNuxMilestoneFragment;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: NuxAccountSwitchCompleteFragment.class */
public final class NuxAccountSwitchCompleteFragment extends NuxFragment implements CallerContextable, INeueNuxMilestoneFragment {
    public static final CallerContext A07 = CallerContext.A06(NuxAccountSwitchCompleteFragment.class);
    public LithoView A00;
    public Bue A01;
    public C15h A02;
    public final 5II A06 = (5II) 1Bi.A03(68025);
    public final C00i A04 = AbF.A0S(this, 17037);
    public final C00i A05 = AbI.A0N();
    public final View.OnClickListener A03 = CZF.A00(this, 20);

    @Override // com.facebook.base.fragment.AbstractNavigableFragment
    public 1iF A1R() {
        return AbL.A0A();
    }

    @Override // com.facebook.messaging.neue.nux.NuxFragment
    public String A1b() {
        return "account_switch_complete";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.neue.nux.NuxFragment
    public void A1c(Bundle bundle) {
        this.A01 = (Bue) 7zO.A0l(this, 85286);
        this.A02 = DBe.A00(this, 84);
        C00i c00i = this.A04;
        if (!((FbSharedPreferences) AbG.A0f(c00i).A04.get()).A3a(2W0.A04, "").equals("")) {
            A1e(null, null);
            AbF.A0V(this.A05).A09(BMG.A0M);
        } else if (AbG.A0f(c00i).A0B()) {
            A1e(null, null);
            AbG.A0f(c00i).A07(BMG.A1B);
        }
        Bue bue = this.A01;
        CallerContext callerContext = A07;
        C00i c00i2 = bue.A02;
        FbSharedPreferences A0R = 1BK.A0R(c00i2);
        1G2 r0 = C1f0.A03;
        if (1BK.A1T(A0R, r0)) {
            AbI.A1H(1BK.A05(), callerContext, 4YU.A0L(bue.A01), "get_dbl_nonce");
        }
        1Ql A0V = 1BL.A0V(c00i2);
        A0V.Cdj(r0);
        A0V.commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityCreated(Bundle bundle) {
        int A02 = 0FI.A02(-1085789470);
        super/*androidx.fragment.app.Fragment*/.onActivityCreated(bundle);
        if (bundle == null) {
            5II r0 = this.A06;
            if (5II.A02(r0)) {
                1Br.A0C(r0.A05);
                r0.A08(AbstractC00603o4.A00(35));
            }
        }
        0FI.A08(1556112133, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-815343821);
        this.A00 = AbK.A0O(this);
        CxA.A00(this, (C1sx) 1Bi.A03(16837), 9);
        LithoView lithoView = this.A00;
        0FI.A08(1791937965, A02);
        return lithoView;
    }
}
