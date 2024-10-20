package X;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.paymentmethods.model.FbPaymentCardType;
import com.facebook.payments.paymentmethods.model.PaymentMethodEligibleOffer;
import com.facebook.payments.paymentmethods.model.PaymentMethodGreyedOutOptionConfig;
import com.facebook.payments.paymentmethods.model.PaymentOption;
import com.facebook.payments.paymentmethods.model.QRCodeMethod;
import com.facebook.payments.paymentmethods.paymentmethodcomponents.model.PaymentMethodComponentData;

/* loaded from: E78.class */
public final class E78 extends EBe implements GKS {
    public RTn A00;
    public PaymentsLoggingSessionData A01;
    public PaymentItemType A02;
    public PaymentMethodComponentData A03;
    public QRW A04;
    public Integer A05;

    public String AdI() {
        return RVU.A01(this.A03.A03);
    }

    public PaymentMethodEligibleOffer AjE() {
        return this.A03.A01;
    }

    public PaymentMethodGreyedOutOptionConfig AoD() {
        return this.A03.A02;
    }

    public PaymentOption B24() {
        return this.A03.A03;
    }

    public Integer BCC() {
        return this.A05;
    }

    public void BMY(int i, Intent intent) {
    }

    public boolean BVy() {
        return this.A03.A04;
    }

    public void Bse(PaymentMethodComponentData paymentMethodComponentData) {
        this.A03 = paymentMethodComponentData;
        QRCodeMethod qRCodeMethod = paymentMethodComponentData.A03;
        QRW qrw = this.A04;
        qrw.A06.setText(qRCodeMethod.A03);
        PaymentMethodEligibleOffer paymentMethodEligibleOffer = paymentMethodComponentData.A01;
        if (paymentMethodEligibleOffer != null) {
            String str = paymentMethodEligibleOffer.A01;
            if (!TextUtils.isEmpty(str)) {
                this.A04.A0J(str);
            }
        }
        PaymentMethodGreyedOutOptionConfig paymentMethodGreyedOutOptionConfig = this.A03.A02;
        if (paymentMethodGreyedOutOptionConfig != null && !TextUtils.isEmpty(paymentMethodGreyedOutOptionConfig.A01)) {
            this.A04.A0J(this.A03.A02.A01);
        }
        this.A04.A0I((FbPaymentCardType) null, qRCodeMethod);
        this.A04.A0K(paymentMethodComponentData.A04);
        this.A04.A0F();
        PaymentMethodGreyedOutOptionConfig paymentMethodGreyedOutOptionConfig2 = this.A03.A02;
        if (paymentMethodGreyedOutOptionConfig2 == null || !paymentMethodGreyedOutOptionConfig2.A00.booleanValue()) {
            return;
        }
        this.A04.A0G();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void CDw() {
        PaymentsLoggingSessionData paymentsLoggingSessionData = this.A01;
        if (paymentsLoggingSessionData != null) {
            Rgz A00 = ((ETT) 1Hv.A02(getContext(), 99111)).A00(paymentsLoggingSessionData.sessionId);
            String obj = this.A02.toString();
            PaymentMethodEligibleOffer paymentMethodEligibleOffer = this.A03.A01;
            Long l = null;
            if (paymentMethodEligibleOffer != null) {
                l = 1BK.A0n(paymentMethodEligibleOffer.A00);
            }
            A00.A0P(obj, l);
        }
    }
}
