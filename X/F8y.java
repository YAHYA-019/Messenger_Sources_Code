package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: F8y.class */
public final class F8y {
    public static final 1G2 A03;
    public static final 1G2 A04;
    public static final 1G2 A05;
    public static final 1G2 A06;
    public 1BY A00;
    public final C00i A01 = AbH.A0S();
    public final Ex8 A02 = (Ex8) 1Bn.A0B(99351);

    static {
        1G2 A01 = 1G3.A01(1G0.A05, "payment-pin/");
        A05 = A01;
        A06 = 1G3.A01(A01, "fingerprint_authentication_enabled");
        A03 = 1G3.A01(A01, "fingerprint_authentication_enabled/");
        A04 = 1G3.A01(A01, "is_auth_token_migrated_to_ptt/");
    }

    public F8y(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public void A00(FbUserSession fbUserSession, boolean z) {
        1Ql.A01(1BL.A0V(this.A01), 1G3.A01(A03, ((1G1) fbUserSession).A02), z);
    }

    public boolean A01(FbUserSession fbUserSession) {
        C00i c00i = this.A01;
        FbSharedPreferences A0R = 1BK.A0R(c00i);
        String str = ((1G1) fbUserSession).A02;
        1G2 r0 = A03;
        boolean z = false;
        if (!A0R.BNM(1G3.A01(r0, str))) {
            FbSharedPreferences A0R2 = 1BK.A0R(c00i);
            1G2 r02 = A06;
            A00(fbUserSession, A0R2.AZn(r02, false));
            1Ql A0V = 1BL.A0V(c00i);
            A0V.Cdj(r02);
            A0V.commit();
        }
        if (this.A02.A01() && 1BK.A0R(c00i).AZn(1G3.A01(r0, str), false)) {
            z = true;
        }
        return z;
    }
}
