package com.facebook.messaging.accountswitch;

import X.1Bi;
import X.1QQ;
import X.AbH;
import X.AbJ;
import X.BMG;
import X.Fck;
import com.facebook.dbllite.data.DblLiteCredentials;

/* loaded from: DblDialogFragment.class */
public class DblDialogFragment extends BaseLoadingActionDialogFragment {
    public DblLiteCredentials A00;
    public String A01;
    public boolean A02 = false;
    public final Fck A03 = (Fck) 1Bi.A03(100221);
    public final 1QQ A04 = (1QQ) 1Bi.A03(66420);

    @Override // com.facebook.messaging.accountswitch.BaseLoadingActionDialogFragment
    public void A1D() {
        super.A1D();
        AbH.A0g(this).A0H(BMG.A3C, this.A01);
    }

    public String AWg() {
        return "mswitch_accounts_dbl";
    }

    public Long Am7() {
        return AbJ.A0v();
    }
}
