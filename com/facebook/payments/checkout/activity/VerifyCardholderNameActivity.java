package com.facebook.payments.checkout.activity;

import X.1BK;
import X.1iF;
import X.7zL;
import X.7zU;
import X.C00i;
import X.C06c;
import X.C1oi;
import X.DKC;
import X.DKG;
import X.DKH;
import X.FII;
import X.FIR;
import X.Q4g;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.payments.decorator.PaymentsDecoratorAnimation;
import com.facebook.payments.paymentmethods.cardform.CardFormParams;
import com.facebook.payments.paymentmethods.model.CreditCard;

/* loaded from: VerifyCardholderNameActivity.class */
public class VerifyCardholderNameActivity extends FbFragmentActivity {
    public CardFormParams A00;
    public CreditCard A01;
    public C00i A02;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKH.A0K();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        C1oi.A00(this, 1);
        if (getWindow() != null) {
            getWindow().addFlags(8192);
        }
        setContentView(2132543544);
        if (bundle == null && BDe().A0b("cardholder_name_form_fragment") == null) {
            C06c A0D = 7zU.A0D(this);
            CreditCard creditCard = this.A01;
            CardFormParams cardFormParams = this.A00;
            Bundle A05 = 1BK.A05();
            A05.putParcelable("extra_credit_card", creditCard);
            A05.putParcelable("extra_card_form_params", cardFormParams);
            DKG.A1H(A05, A0D, new Q4g(), "cardholder_name_form_fragment", 2131363324);
        }
        FII.A02(this, PaymentsDecoratorAnimation.A03);
        FIR.A01(this, A2c(2131361918), DKC.A0V(this.A02));
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A31(Bundle bundle) {
        super.A31(bundle);
        FII A0h = DKG.A0h(this);
        this.A02 = 7zL.A0R(this, 442);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("extra_credit_card");
        parcelableExtra.getClass();
        this.A01 = (CreditCard) parcelableExtra;
        Parcelable parcelableExtra2 = getIntent().getParcelableExtra("extra_card_form_params");
        parcelableExtra2.getClass();
        CardFormParams cardFormParams = (CardFormParams) parcelableExtra2;
        this.A00 = cardFormParams;
        FII.A00(this, A0h, cardFormParams.Abq().cardFormStyleParams.paymentsDecoratorParams);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        super.finish();
        FII.A01(this, PaymentsDecoratorAnimation.A03);
    }
}
