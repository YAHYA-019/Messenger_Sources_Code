package X;

import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: K1n.class */
public final class K1n extends L7x {
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public final void A03(K1n k1n) {
        if (!TextUtils.isEmpty(this.A00)) {
            k1n.A00 = this.A00;
        }
        if (!TextUtils.isEmpty(this.A01)) {
            k1n.A01 = this.A01;
        }
        if (!TextUtils.isEmpty(this.A02)) {
            k1n.A02 = this.A02;
        }
        if (TextUtils.isEmpty(this.A03)) {
            return;
        }
        k1n.A03 = this.A03;
    }

    public final String toString() {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("appName", this.A00);
        A0u.put("appVersion", this.A01);
        A0u.put("appId", this.A02);
        return L7x.A01("appInstallerId", this.A03, A0u);
    }
}
