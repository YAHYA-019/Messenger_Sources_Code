package X;

import android.content.Intent;
import com.facebook.payments.auth.pin.newpinv2.PaymentPinV2Activity;

/* loaded from: Es4.class */
public final class Es4 {
    public final /* synthetic */ PaymentPinV2Activity A00;

    public Es4(PaymentPinV2Activity paymentPinV2Activity) {
        this.A00 = paymentPinV2Activity;
    }

    public void A00(int i, Intent intent) {
        PaymentPinV2Activity paymentPinV2Activity = this.A00;
        if (intent != null && intent.hasExtra("user_back_press") && paymentPinV2Activity.A02) {
            intent.putExtra("EXTRA_PIN_FLOW_EXIT_PIN_LOCKED", true);
        }
        boolean z = paymentPinV2Activity.A01;
        if (intent != null) {
            intent.putExtra("EXTRA_DID_ASK_FOR_BIO_FLOW", z);
        }
        paymentPinV2Activity.setResult(i, intent);
        paymentPinV2Activity.finish();
    }
}
