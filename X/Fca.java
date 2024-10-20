package X;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.payments.auth.pin.params.CreateFingerprintNonceParams;

/* loaded from: Fca.class */
public final class Fca implements CallerContextable {
    public static final String __redex_internal_original_name = "PaymentPinProtocolUtil";
    public final C00i A00 = 1BV.A00(33031);

    public static 1IB A00(Bundle bundle, Fca fca, String str) {
        return AbK.A0H(bundle, AbH.A0B(fca), 4YU.A0L(fca.A00), str);
    }

    public 2FT A01() {
        return 2FP.A01(new FvR(1), A00(1BK.A05(), this, "fetch_payment_pin"));
    }

    public 2FT A02(String str) {
        Bundle A05 = 1BK.A05();
        A05.putParcelable("createFingerprintNonceParams", new CreateFingerprintNonceParams(str));
        return Fvf.A00(A00(A05, this, 1BJ.A00(394)), this, 8);
    }
}
