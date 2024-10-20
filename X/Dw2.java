package X;

import android.content.Context;
import java.util.BitSet;
import java.util.HashMap;

/* loaded from: Dw2.class */
public final class Dw2 extends 1LH {
    public final C9cu A00;
    public final boolean A01;

    public Dw2(C9cu c9cu, boolean z) {
        11T.A0F(c9cu, 1);
        this.A00 = c9cu;
        this.A01 = z;
    }

    public static final void A01(C2k6 c2k6, Dw2 dw2, F99 f99, String str) {
        Context A0L = 7zP.A0L(c2k6);
        G9N g9n = new G9N(f99, dw2, c2k6, str, 11);
        f99.A03.invoke();
        HashMap A0u = AnonymousClass001.A0u();
        HashMap A0u2 = AnonymousClass001.A0u();
        new BitSet(0);
        A0u.put("family_device_id", FHQ.A01(A0L, A0u));
        A0u.put("contact_point", str);
        A0u.put("offline_experiment_group", "caa_iteration_v6_perf_fb_2");
        A0u.put("redirect_action", "ACCOUNT_RECOVERY");
        A0u.put("waterfall_id", FGU.A02());
        C4O5.A01(new Fwv(f99, g9n, 1), "com.bloks.www.bloks.caa.login.fallback_redirect", A0u, A0u2).A00(A0L, FGU.A00(A0L));
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        1Iw r0 = c2k5.A05;
        Object A0A = r0.A0A(F99.class);
        if (A0A == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        Object A0A2 = r0.A0A(F76.class);
        if (A0A2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        2lQ r02 = 2lO.A02;
        2lO A0g = 7zS.A0g(0S2.A15, 7zQ.A08());
        C2sn A0U = 7zQ.A0U(r0);
        String A09 = 3yH.A09(A0U, 2131956983);
        boolean z = this.A01;
        EL8 el8 = EL8.A03;
        G9M g9m = new G9M(3, A0A, this, A0U, A0A2);
        A0U.A00(new Dvd(el8, FE4.A00, A09, 0S2.A00, g9m, z));
        return C2so.A06(A0U, c2k5, A0g);
    }
}
