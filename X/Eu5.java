package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.payments.auth.pin.newpin.PaymentPinParams;
import com.facebook.payments.auth.pin.newpinv2.PaymentPinV2Activity;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;

/* loaded from: Eu5.class */
public final class Eu5 {
    public 1BY A00;
    public final EX8 A02 = (EX8) 1Bi.A03(99003);
    public final F8y A01 = (F8y) 1Bn.A0B(99313);

    public Eu5(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public Intent A00(Context context, PaymentsLoggingSessionData paymentsLoggingSessionData, PaymentItemType paymentItemType, boolean z, boolean z2) {
        String str;
        FbUserSession A0D = 4YV.A0D(context);
        if (z || this.A01.A01(A0D)) {
            return null;
        }
        Bundle A05 = 1BK.A05();
        if (paymentItemType != null && (str = paymentItemType.mValue) != null) {
            A05.putString("payment_type", str);
        }
        return PaymentPinV2Activity.A12(context, new PaymentPinParams(null, A05, null, null, null, EO0.A06, null, PaymentsDecoratorParams.A02(), paymentsLoggingSessionData, paymentItemType, "CREATE_PIN_FROM_PAYMENT", "PIN", null, null, -1.0f, z2, true));
    }
}
