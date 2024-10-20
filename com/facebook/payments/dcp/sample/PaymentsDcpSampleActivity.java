package com.facebook.payments.dcp.sample;

import X.1BY;
import X.1Bn;
import X.1CO;
import X.AbJ;
import X.C50u;
import X.C50x;
import X.DKG;
import X.Dq0;
import X.ELS;
import X.Ef2;
import X.Elj;
import X.FII;
import X.FYT;
import X.FmK;
import X.Fsa;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.payments.ui.titlebar.PaymentsTitleBarViewStub;
import com.facebook.payments.ui.titlebar.model.PaymentsTitleBarStyle;
import com.facebook.resources.ui.FbButton;
import com.facebook.resources.ui.FbEditText;
import com.facebook.resources.ui.FbSwitch;

/* loaded from: PaymentsDcpSampleActivity.class */
public class PaymentsDcpSampleActivity extends FbFragmentActivity implements View.OnClickListener {
    public Elj A00;
    public FbEditText A01;
    public FbSwitch A02;
    public FII A03;
    public FbButton A04;
    public FbButton A05;
    public FbButton A06;
    public FbEditText A07;
    public FbSwitch A08;
    public final 1CO A09 = AbJ.A0e();

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        ((C50u) this.A00.A02.get()).onDestroy();
        super.A2l();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        if (this.A09.AZk(36314584142848065L)) {
            setContentView(2132543064);
            this.A06 = (FbButton) findViewById(2131366760);
            this.A04 = (FbButton) findViewById(2131366755);
            this.A05 = (FbButton) findViewById(2131366778);
            this.A07 = (FbEditText) findViewById(2131363972);
            this.A01 = (FbEditText) findViewById(2131366682);
            this.A08 = (FbSwitch) findViewById(2131365068);
            this.A02 = (FbSwitch) findViewById(2131365064);
            this.A06.setOnClickListener(this);
            this.A04.setOnClickListener(this);
            this.A05.setOnClickListener(this);
            PaymentsTitleBarViewStub A0n = DKG.A0n(this);
            ViewGroup viewGroup = (ViewGroup) findViewById(2131363324);
            Fsa fsa = new Fsa(this, 8);
            A0n.A01(viewGroup, ELS.A02, PaymentsTitleBarStyle.A03, fsa);
            A0n.A06.CvV("Sample Payments DCP Flow");
            FYT.A00(this.A02, this, 9);
            Elj elj = this.A00;
            Ef2 ef2 = new Ef2(this);
            ((C50x) elj.A02.get()).A00(null, new FmK(ef2, 0), new Dq0("FAN_FUNDING"), false);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A31(Bundle bundle) {
        super.A31(bundle);
        this.A00 = (Elj) 1Bn.A0E(this, (1BY) null, 98553);
        FII A0h = DKG.A0h(this);
        this.A03 = A0h;
        A0h.A05(this, PaymentsTitleBarStyle.A03, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0074  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClick(android.view.View r302) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.sample.PaymentsDcpSampleActivity.onClick(android.view.View):void");
    }
}
