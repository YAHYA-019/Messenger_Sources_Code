package com.facebook.payments.form;

import X.1BK;
import X.1iF;
import X.7zO;
import X.7zU;
import X.C06c;
import X.DKG;
import X.DKI;
import X.FII;
import X.Q4i;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.payments.form.model.PaymentsFormParams;

/* loaded from: PaymentsFormActivity.class */
public class PaymentsFormActivity extends FbFragmentActivity {
    public PaymentsFormParams A00;
    public FII A01;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKG.A0I();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132541482);
        if (bundle == null && BDe().A0b("payments_form_fragment_tag") == null) {
            C06c A0D = 7zU.A0D(this);
            PaymentsFormParams paymentsFormParams = this.A00;
            Bundle A05 = 1BK.A05();
            A05.putParcelable("extra_payments_form_params", paymentsFormParams);
            DKG.A1H(A05, A0D, new Q4i(), "payments_form_fragment_tag", 2131364227);
        }
        FII.A02(this, this.A00.A00.paymentsDecoratorAnimation);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A31(Bundle bundle) {
        super.A31(bundle);
        this.A01 = DKG.A0h(this);
        PaymentsFormParams paymentsFormParams = (PaymentsFormParams) 7zO.A0H(this).getParcelable("extra_payments_form_params");
        this.A00 = paymentsFormParams;
        FII.A00(this, this.A01, paymentsFormParams.A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        super.finish();
        FII.A01(this, this.A00.A00.paymentsDecoratorAnimation);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        DKI.A0T(BDe(), "payments_form_fragment_tag");
        super.onBackPressed();
    }
}
