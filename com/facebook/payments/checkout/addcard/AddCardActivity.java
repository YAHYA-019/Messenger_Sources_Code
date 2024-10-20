package com.facebook.payments.checkout.addcard;

import X.11T;
import X.1BK;
import X.7zU;
import X.C06c;
import X.DZd;
import X.F5s;
import X.Qpz;
import X.R2w;
import X.Rue;
import X.Ruf;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.common.locale.Country;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.logging.PaymentsFlowName;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.paymentmethods.cardform.CardFormCommonParams;
import com.facebook.payments.paymentmethods.model.FbPaymentCard;
import com.facebook.payments.paymentmethods.model.FbPaymentCardType;
import com.facebook.payments.paymentmethods.model.NewCreditCardOption;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

/* loaded from: AddCardActivity.class */
public final class AddCardActivity extends FbFragmentActivity {
    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        11T.A0F(fragment, 0);
        super.A2b(fragment);
        if (fragment instanceof DZd) {
            DZd dZd = (DZd) fragment;
            dZd.A0D = new Ruf(this);
            dZd.A0C = Rue.A00;
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132542987);
        String string = getString(2131954156);
        ImmutableSet A02 = ImmutableSet.A02(Qpz.A01, Qpz.A02);
        11T.A0A(A02);
        ImmutableList of = ImmutableList.of((Object) FbPaymentCardType.A04, (Object) FbPaymentCardType.A03, (Object) FbPaymentCardType.A07);
        11T.A0A(of);
        NewCreditCardOption newCreditCardOption = new NewCreditCardOption(null, null, null, of, A02, null, null, string);
        PaymentsLoggingSessionData A00 = F5s.A00(PaymentsFlowName.CHECKOUT);
        PaymentItemType paymentItemType = PaymentItemType.A0R;
        CardFormCommonParams A002 = R2w.A00(Country.A00(null, "THA"), PaymentsDecoratorParams.A01(), A00, paymentItemType, (FbPaymentCard) null, newCreditCardOption, true, true, true, false, false, true);
        Fragment dZd = new DZd();
        Bundle A05 = 1BK.A05();
        A05.putParcelable("card_form_params", A002);
        dZd.setArguments(A05);
        C06c A0D = 7zU.A0D(this);
        A0D.A0Q(dZd, "checkout_fragment", 2131362887);
        A0D.A04();
    }
}
