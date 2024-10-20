package com.facebook.messaging.invites;

import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1CQ;
import X.1Kd;
import X.4iI;
import X.AbI;
import X.AbJ;
import X.AbM;
import X.C15h;
import X.C8E;
import X.D4p;
import X.DBe;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import java.util.concurrent.Executor;

/* loaded from: InviteLinkActivity.class */
public class InviteLinkActivity extends FbFragmentActivity {
    public 1CQ A00;
    public C8E A01;
    public 4iI A02;
    public Executor A03;
    public C15h A04;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132542370);
        this.A04 = DBe.A00(this, 65);
        this.A01 = (C8E) 1Bn.A0E(this, (1BY) null, 82727);
        this.A02 = AbI.A0Z(this);
        this.A03 = AbJ.A1D();
        this.A00 = (1CQ) 1Bi.A03(131252);
        String stringExtra = getIntent().getStringExtra("invite_token");
        AbM.A1T(stringExtra);
        Intent intent = getIntent();
        1Kd.A0F(D4p.A00(intent, this, 32), this.A01.A00(stringExtra), this.A03);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        overridePendingTransition(0, 0);
        super.finish();
    }
}
