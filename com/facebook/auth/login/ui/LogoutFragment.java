package com.facebook.auth.login.ui;

import X.0FI;
import X.1BK;
import X.1BQ;
import X.1lN;
import X.AbE;
import X.AbG;
import X.AbI;
import X.C00i;
import X.DKC;
import X.DKD;
import X.DKG;
import X.DeF;
import X.EwB;
import X.JgM;
import X.MIN;
import X.RKb;
import android.os.Bundle;

/* loaded from: LogoutFragment.class */
public final class LogoutFragment extends AuthFragmentBase implements 1lN {
    public EwB A01;
    public JgM A02;
    public MIN A03;
    public C00i A04;
    public final C00i A05 = 1BQ.A02(16705);
    public long A00 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.auth.login.ui.AuthFragmentBase
    public void A1S(Bundle bundle) {
        Bundle bundle2;
        super.A1S(bundle);
        this.A01 = DKD.A0G();
        this.A04 = DKC.A0W(this, 99435);
        this.A00 = 0L;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("logout_extras")) != null) {
            this.A00 = bundle2.getLong(AbE.A00(30), 0L);
        }
        if (this.A00 == 0) {
            C00i c00i = this.A05;
            this.A00 = AbG.A0r(c00i).generateNewFlowId(9699359);
            AbI.A1U(AbG.A0r(c00i), "logout_initiated_unexpected_trigger", this.A00, false);
        }
        JgM A0L = DKG.A0L(this, "authLogout");
        this.A02 = A0L;
        DeF.A00(A0L, this, 2);
    }

    public String AWg() {
        return "logout";
    }

    public Long Am7() {
        return 338399944209237L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityCreated(Bundle bundle) {
        int A02 = 0FI.A02(-816361286);
        super/*androidx.fragment.app.Fragment*/.onActivityCreated(bundle);
        RKb rKb = ((AuthFragmentBase) this).A00;
        if (rKb == null) {
            rKb = ((AuthNavigationController) requireParentFragment()).A00;
            ((AuthFragmentBase) this).A00 = rKb;
        }
        this.A03 = rKb.A00.A00;
        if (!this.A02.A1S()) {
            Bundle A05 = 1BK.A05();
            this.A02.A1Q(this.A03);
            this.A02.A1R("auth_logout", A05);
        }
        0FI.A08(-1281287378, A02);
    }
}
