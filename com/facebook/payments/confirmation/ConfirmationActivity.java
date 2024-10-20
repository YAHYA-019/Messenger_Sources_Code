package com.facebook.payments.confirmation;

import X.06Z;
import X.1BK;
import X.1iF;
import X.7zL;
import X.C06c;
import X.DKG;
import X.DKI;
import X.DZa;
import X.FII;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.payments.decorator.PaymentsDecoratorAnimation;
import com.facebook.payments.decorator.PaymentsDecoratorParams;

/* loaded from: ConfirmationActivity.class */
public class ConfirmationActivity extends FbFragmentActivity {
    public ConfirmationCommonParams A00;
    public FII A01;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKG.A0I();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132541946);
        ConfirmationCommonParams confirmationCommonParams = this.A00;
        this.A01.getClass();
        PaymentsDecoratorParams paymentsDecoratorParams = confirmationCommonParams.A02.A04;
        FII.A03(this, paymentsDecoratorParams.paymentsTitleBarStyle, paymentsDecoratorParams.isFullScreenModal);
        06Z BDe = BDe();
        if (bundle == null && BDe.A0b("confirmation_fragment_tag") == null) {
            C06c A0G = 7zL.A0G(BDe);
            ConfirmationCommonParams confirmationCommonParams2 = this.A00;
            DZa dZa = new DZa();
            Bundle A05 = 1BK.A05();
            A05.putParcelable("confirmation_params", confirmationCommonParams2);
            DKG.A1H(A05, A0G, dZa, "confirmation_fragment_tag", 2131364228);
        }
        FII.A02(this, paymentsDecoratorParams.paymentsDecoratorAnimation);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A31(Bundle bundle) {
        super.A31(bundle);
        this.A01 = DKG.A0h(this);
        ConfirmationCommonParams confirmationCommonParams = (ConfirmationCommonParams) getIntent().getParcelableExtra("confirmation_params");
        this.A00 = confirmationCommonParams;
        FII fii = this.A01;
        fii.getClass();
        PaymentsDecoratorParams paymentsDecoratorParams = confirmationCommonParams.A02.A04;
        fii.A05(this, paymentsDecoratorParams.paymentsTitleBarStyle, paymentsDecoratorParams.isFullScreenModal);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        super.finish();
        FII.A01(this, PaymentsDecoratorAnimation.A01);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 || i == 2 || i == 3) {
            BDe().A0b("confirmation_fragment_tag").onActivityResult(i, i2, intent);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        DKI.A0T(BDe(), "confirmation_fragment_tag");
        super.onBackPressed();
    }
}
