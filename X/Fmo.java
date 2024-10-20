package X;

import com.facebook.payments.p2p.awareness.PaymentAwarenessActivity;

/* loaded from: Fmo.class */
public final class Fmo implements GIC {
    public final /* synthetic */ PaymentAwarenessActivity A00;

    public Fmo(PaymentAwarenessActivity paymentAwarenessActivity) {
        this.A00 = paymentAwarenessActivity;
    }

    public void C5U() {
        PaymentAwarenessActivity paymentAwarenessActivity = this.A00;
        DKI.A0Y(paymentAwarenessActivity, EKk.A01);
        if (paymentAwarenessActivity.A00 != null) {
            AbK.A0q(paymentAwarenessActivity.A09).A0A(paymentAwarenessActivity, paymentAwarenessActivity.A00);
        }
    }

    public void CJg() {
        DKI.A0Y(this.A00, EKk.A02);
    }
}
