package X;

import com.facebook.payments.logging.PaymentsFlowStep;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.shipping.model.ShippingAddressFormInput;

/* renamed from: X.Db4, reason: case insensitive filesystem */
/* loaded from: Db4.class */
public final class C2079Db4 extends 1RM {
    public final /* synthetic */ PaymentsLoggingSessionData A00;
    public final /* synthetic */ PaymentItemType A01;
    public final /* synthetic */ FEe A02;
    public final /* synthetic */ ShippingAddressFormInput A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public C2079Db4(PaymentsLoggingSessionData paymentsLoggingSessionData, PaymentItemType paymentItemType, FEe fEe, ShippingAddressFormInput shippingAddressFormInput, String str, boolean z) {
        this.A02 = fEe;
        this.A00 = paymentsLoggingSessionData;
        this.A04 = str;
        this.A03 = shippingAddressFormInput;
        this.A05 = z;
        this.A01 = paymentItemType;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        2JX A0L;
        2JY r0 = (2JY) obj;
        if ((r0 == null || r0.A0L(-465451254, 2JX.class, 374749762) != null) && (A0L = 1BL.A0L(1BL.A0L(r0, -465451254, 374749762), -860066186, -1973844842)) != null) {
            FEe fEe = this.A02;
            fEe.A00.A09(fEe.A04.A00(A0L, this.A00, this.A01));
        } else {
            FEe fEe2 = this.A02;
            FEe.A00(PaymentsFlowStep.A0p, this.A00, fEe2, this.A03, this.A04, this.A05);
        }
    }

    public void A03(Throwable th) {
        FEe fEe = this.A02;
        PaymentsLoggingSessionData paymentsLoggingSessionData = this.A00;
        fEe.A02.getString(2131965936);
        PaymentItemType paymentItemType = this.A01;
        fEe.A05.A08(PaymentsFlowStep.A0p, paymentsLoggingSessionData, th);
        fEe.A00.A09(fEe.A04.A01(paymentsLoggingSessionData, paymentItemType, th));
    }
}
