package com.facebook.payments.auth.dynamicdescriptor;

import X.1BV;
import X.1FV;
import X.1Kd;
import X.1Vd;
import X.1iF;
import X.4YU;
import X.7zL;
import X.7zM;
import X.AbF;
import X.AbK;
import X.AbR;
import X.AbstractC00603o4;
import X.C00i;
import X.C30G;
import X.C3sa;
import X.CfG;
import X.DKG;
import X.EX6;
import X.F6A;
import X.Fkx;
import X.InV;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: DDExternalIntentActivity.class */
public class DDExternalIntentActivity extends FbFragmentActivity {
    public C00i A00;
    public C00i A01;
    public C00i A02;
    public String A03;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbF.A0C(412873616736935L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setContentView(linearLayout);
        Window window = getWindow();
        View decorView = window.getDecorView();
        window.setStatusBarColor(getColor(2132213994));
        decorView.setSystemUiVisibility(8192);
        String stringExtra = getIntent().getStringExtra(AbstractC00603o4.A00(404));
        if (TextUtils.isEmpty(stringExtra)) {
            finish();
        }
        this.A03 = getIntent().getStringExtra(AbstractC00603o4.A00(485));
        CfG A05 = ((AbR) 4YU.A0p(this.A00)).A05(this, getString(2131963917));
        A05.ABm();
        DKG.A1D(this);
        F6A f6a = (F6A) 4YU.A0p(this.A02);
        String str = this.A03;
        Fkx fkx = new Fkx(A05, this);
        C30G A0H = AbF.A0H(96);
        A0H.A03("legacy_account_id", stringExtra);
        A0H.A03("entrypoint", EX6.A00(str));
        C3sa A0L = AbK.A0L(A0H);
        A0L.A0B = false;
        1Vd A0K = 7zM.A0K(f6a.A03);
        4YU.A1J(A0L, 412873616736935L);
        1FV A09 = A0K.A09(A0L);
        1Kd.A0D(f6a.A04, new InV(fkx, f6a, stringExtra, str, 3), A09);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        super.A2z(bundle);
        this.A00 = 1BV.A00(333);
        this.A01 = 7zL.A0R(this, 99425);
        this.A02 = AbF.A0Q(this, 99424);
    }
}
