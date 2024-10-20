package com.facebook.messaging.accountrecovery;

import X.1BK;
import X.1Bn;
import X.7zU;
import X.C06c;
import X.C1io;
import X.DE6;
import X.DE7;
import X.DKD;
import X.DZm;
import X.DZn;
import X.ErC;
import X.GCj;
import X.GCk;
import X.GCl;
import X.GF0;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.account.recovery.common.model.AccountCandidateModel;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: MessengerAccountRecoveryActivity.class */
public class MessengerAccountRecoveryActivity extends FbFragmentActivity implements GF0, C1io, GCj, GCk, GCl, DE6, DE7 {
    public String A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public ErC A04;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A04 = (ErC) 1Bn.A0A(85287);
        this.A00 = "";
        this.A01 = "";
        Intent intent = getIntent();
        this.A02 = intent.getBooleanExtra("extra_from_switch_account", false);
        String stringExtra = intent.getStringExtra("account_user_id");
        if (bundle == null && this.A02) {
            this.A04.getClass();
        }
        setContentView(2132542572);
        Fragment dZn = new DZn();
        Bundle A05 = 1BK.A05();
        A05.putString("user_identifier", stringExtra);
        dZn.setArguments(A05);
        ((DZn) dZn).A06 = this;
        C06c A0D = 7zU.A0D(this);
        A0D.A0L(dZn, 2131361853);
        A0D.A04();
    }

    @Override // X.GF0
    public void BhN(AccountCandidateModel accountCandidateModel) {
        DZm A0Y = BDe().A0Y(2131365692);
        if (A0Y != null) {
            A0Y.A09 = this.A03;
            A0Y.A02 = accountCandidateModel;
            accountCandidateModel.A04();
            DZm.A06(A0Y);
            return;
        }
        Fragment dZm = new DZm();
        Bundle A05 = 1BK.A05();
        A05.putParcelable("selected_account", accountCandidateModel);
        A05.putBoolean("extra_from_switch_account", this.A02);
        dZm.setArguments(A05);
        ((DZm) dZm).A06 = this;
        C06c A0D = 7zU.A0D(this);
        A0D.A0M(dZm, 2131361853);
        DKD.A1C(A0D);
    }
}
