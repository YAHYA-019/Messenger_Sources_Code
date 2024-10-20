package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: C8m.class */
public final class C8m {
    public final 1Br A00 = 1BK.A0E();

    public final C59c A00(FbUserSession fbUserSession, MigColorScheme migColorScheme, String str) {
        11T.A0H(fbUserSession, str);
        if (A02(fbUserSession, str)) {
            return new C59c(migColorScheme);
        }
        return null;
    }

    public final void A01(FbUserSession fbUserSession, DFS dfs, String str) {
        11T.A0F(fbUserSession, 0);
        boolean A1Z = 7zP.A1Z(str);
        String str2 = fbUserSession.BHu().mUserId;
        if (str2 != null) {
            1G2 A04 = C2bv.A04(((1G1) fbUserSession).A02, str2, str);
            11T.A0A(A04);
            1Ql.A03(A04, 1Br.A0B(this.A00), A1Z);
            dfs.D8G();
        }
    }

    public final boolean A02(FbUserSession fbUserSession, String str) {
        1BK.A1M(fbUserSession, str);
        String str2 = fbUserSession.BHu().mUserId;
        if (str2 == null) {
            return false;
        }
        11T.A0A(C2bv.A04(((1G1) fbUserSession).A02, str2, str));
        return !1Br.A09(this.A00).AZn(r0, false);
    }
}
