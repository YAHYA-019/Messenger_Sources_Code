package X;

import android.os.BaseBundle;

/* loaded from: L2q.class */
public final class L2q {
    public final 1Rf A00;

    public L2q(1Rf r302) {
        this.A00 = r302;
    }

    public static void A00(BaseBundle baseBundle, L2q l2q, String str) {
        l2q.A02(str, baseBundle.getString(str));
        l2q.A01();
    }

    public void A01() {
        1Rf r0 = this.A00;
        r0.A08("pigeon_reserved_keyword_module", "ccu_module");
        r0.A0B();
    }

    public void A02(String str, String str2) {
        this.A00.A08(str, str2);
    }
}
