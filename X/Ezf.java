package X;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: Ezf.class */
public final class Ezf {
    public final Bundle A00;

    public Ezf(Bundle bundle) {
        this.A00 = bundle;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, X.F49] */
    public F49 A00() {
        Bundle bundle = this.A00;
        if (TextUtils.isEmpty(bundle.getString("BUNDLE_KEY_PAYMENT_TYPE")) || TextUtils.isEmpty(bundle.getString("BUNDLE_KEY_PRIMARY_FLOW_TYPE"))) {
            throw AnonymousClass001.A0L("The payment type and the primary flow type should not be null.");
        }
        ?? obj = new Object();
        obj.A00 = bundle;
        return obj;
    }

    public void A01(String str) {
        this.A00.putString("BUNDLE_KEY_PAYMENT_TYPE", str);
    }

    public void A02(String str) {
        this.A00.putString("BUNDLE_KEY_PRIMARY_FLOW_STEP_TYPE", str);
    }

    public void A03(String str) {
        this.A00.putString("BUNDLE_KEY_PRIMARY_FLOW_TYPE", str);
    }
}
