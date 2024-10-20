package com.facebook.payments.selector;

import X.1BK;
import X.1iF;
import X.7zO;
import X.7zU;
import X.C06c;
import X.DKG;
import X.DKI;
import X.FII;
import X.Q4v;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.selector.model.PaymentsSelectorScreenParams;

/* loaded from: PaymentsSelectorScreenActivity.class */
public class PaymentsSelectorScreenActivity extends FbFragmentActivity {
    public FII A00;
    public PaymentsSelectorScreenParams A01;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKG.A0I();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132541946);
        this.A00.getClass();
        PaymentsDecoratorParams paymentsDecoratorParams = this.A01.A00;
        FII.A03(this, paymentsDecoratorParams.paymentsTitleBarStyle, paymentsDecoratorParams.isFullScreenModal);
        if (bundle == null) {
            C06c A0D = 7zU.A0D(this);
            PaymentsSelectorScreenParams paymentsSelectorScreenParams = this.A01;
            Bundle A05 = 1BK.A05();
            A05.putParcelable("selector_params", paymentsSelectorScreenParams);
            Q4v q4v = new Q4v();
            q4v.setArguments(A05);
            A0D.A0Q(q4v, "selector_screen_fragment_tag", 2131364228);
            A0D.A04();
        }
        FII.A02(this, this.A01.A00.paymentsDecoratorAnimation);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A31(Bundle bundle) {
        super.A31(bundle);
        this.A00 = DKG.A0h(this);
        this.A01 = (PaymentsSelectorScreenParams) 7zO.A0H(this).getParcelable("selector_params");
        FII fii = this.A00;
        fii.getClass();
        PaymentsDecoratorParams paymentsDecoratorParams = this.A01.A00;
        fii.A05(this, paymentsDecoratorParams.paymentsTitleBarStyle, paymentsDecoratorParams.isFullScreenModal);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        super.finish();
        FII.A01(this, this.A01.A00.paymentsDecoratorAnimation);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        DKI.A0T(BDe(), "selector_screen_fragment_tag");
        super.onBackPressed();
    }
}
