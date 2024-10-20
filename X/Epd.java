package X;

import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;

/* loaded from: Epd.class */
public final class Epd {
    public final 1pK A00;
    public final ETm A01;
    public final Eeg A02;
    public final PaymentsLoggingSessionData A03;
    public final PaymentItemType A04;
    public final String A05;

    public Epd(1pK r302, ETm eTm, Eeg eeg, PaymentsLoggingSessionData paymentsLoggingSessionData, PaymentItemType paymentItemType, String str) {
        r302.getClass();
        this.A00 = r302;
        eTm.getClass();
        this.A01 = eTm;
        this.A05 = str;
        this.A03 = paymentsLoggingSessionData;
        this.A04 = paymentItemType;
        this.A02 = eeg;
    }
}
