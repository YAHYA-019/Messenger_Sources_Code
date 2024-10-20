package com.facebook.messaging.accountswitch;

import X.0FI;
import X.1BL;
import X.1BV;
import X.1Bi;
import X.1QQ;
import X.AbF;
import X.AbJ;
import X.BMG;
import X.C00i;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.accountswitch.model.MessengerAccountInfo;
import com.facebook.widget.text.BetterTextView;

/* loaded from: SwitchSavedAccountDialogFragment.class */
public class SwitchSavedAccountDialogFragment extends BaseLoadingActionDialogFragment {
    public CheckBox A00;
    public EditText A01;
    public FbUserSession A02;
    public MessengerAccountInfo A03;
    public BetterTextView A04;
    public boolean A05;
    public boolean A06;
    public final C00i A0B = 1BV.A00(68334);
    public final C00i A0A = AbF.A0S(this, 84009);
    public final C00i A08 = 1BV.A00(147859);
    public final C00i A09 = 1BV.A00(84008);
    public final C00i A07 = 1BV.A00(83726);
    public final 1QQ A0C = (1QQ) 1Bi.A03(66420);

    @Override // com.facebook.messaging.accountswitch.BaseLoadingActionDialogFragment
    public void A1D() {
        super.A1D();
        C00i c00i = this.A0G;
        AbF.A0V(c00i).A0H(BMG.A3O, this.A03.A0A);
        int length = this.A01.getText().length();
        AbF.A0V(c00i).A0H(length == 0 ? BMG.A3R : BMG.A3S, this.A03.A0A);
    }

    public String AWg() {
        return "mswitch_accounts_saved";
    }

    public Long Am7() {
        return AbJ.A0v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.accountswitch.BaseLoadingActionDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(266801819);
        super.onCreate(bundle);
        this.A02 = 1BL.A0G(this);
        0FI.A08(-1830679293, A02);
    }
}
