package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.paymentmethods.model.PayPalBillingAgreement;
import com.facebook.payments.simplescreen.model.PayPalConsentScreenExtraData;
import com.facebook.payments.simplescreen.model.SimpleScreenExtraData;
import com.facebook.widget.titlebar.TitleBarButtonSpec;
import com.google.common.base.Preconditions;

/* loaded from: Foc.class */
public final class Foc implements GKO {
    public ETu A00;
    public final Context A01;
    public final Ex2 A03;
    public final Em0 A05;
    public final C00i A02 = DKG.A0T();
    public final FIQ A04 = DKG.A0i();

    public Foc(Context context) {
        this.A01 = context;
        this.A05 = (Em0) 1Bn.A0E(context, (1BY) null, 98432);
        this.A03 = (Ex2) 1Bn.A0E(context, (1BY) null, 99326);
    }

    public void AE4() {
        DKG.A1N(this.A02);
    }

    public String BG6() {
        return this.A01.getResources().getString(2131963169);
    }

    public TitleBarButtonSpec BGA() {
        return null;
    }

    public /* bridge */ /* synthetic */ void BOd(ViewStub viewStub, PaymentsLoggingSessionData paymentsLoggingSessionData, PaymentItemType paymentItemType, SimpleScreenExtraData simpleScreenExtraData) {
        PayPalConsentScreenExtraData payPalConsentScreenExtraData = (PayPalConsentScreenExtraData) simpleScreenExtraData;
        View A0C = DKF.A0C(viewStub, 2132543087);
        PayPalBillingAgreement payPalBillingAgreement = payPalConsentScreenExtraData.A00;
        Preconditions.checkArgument(AnonymousClass001.A1Q(payPalBillingAgreement.isCibConversionNeeded ? 1 : 0, 1));
        DKF.A0E(A0C, 2131363284).setText(payPalBillingAgreement.cibConsentText);
        TextView A0E = DKF.A0E(A0C, 2131363283);
        DOG dog = new DOG(8, payPalBillingAgreement, this, A0C);
        Context context = this.A01;
        0Dc A0P = 7zP.A0P(context);
        A0P.A02(context.getResources().getString(2131963157));
        A0P.A05(dog, "[[paypal_policies]]", context.getResources().getString(2131963156), 33);
        DKC.A1P(A0E);
        A0E.setText(7zM.A0E(A0P));
        QRF A01 = C09s.A01(A0C, 2131363265);
        String str = payPalConsentScreenExtraData.A01;
        if (str == null) {
            str = DKD.A0q(A01, 2131963154);
        }
        A01.A0X(str);
        A01.A0V();
        A01.A0W();
        A01.setEnabled(true);
        A01.setOnClickListener(new FXh(2, 4YV.A0D(context), paymentsLoggingSessionData, paymentItemType, payPalBillingAgreement, this, A01));
    }

    public void CQj() {
        throw AnonymousClass001.A0p();
    }

    public void CsR(ETu eTu) {
        this.A00 = eTu;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }
}
