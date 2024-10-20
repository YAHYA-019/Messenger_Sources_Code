package X;

import android.os.Bundle;
import com.facebookpay.logging.FBPayLoggerData;

/* loaded from: F49.class */
public final class F49 {
    public Bundle A00;

    public static Ezf A00() {
        return new Ezf(1BK.A05());
    }

    public static FBPayLoggerData A01(F49 f49, EvO evO) {
        evO.A01 = f49.A00.getString("BUNDLE_KEY_PAYMENT_TYPE");
        evO.A00(AbstractC11504wo.A01());
        return new FBPayLoggerData(evO);
    }
}
