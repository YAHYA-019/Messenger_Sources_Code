package X;

import android.content.res.Resources;
import android.text.SpannableString;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8W3, reason: invalid class name */
/* loaded from: 8W3.class */
public final class C8W3 extends 1LH {
    public final C9c6 A00;
    public final MigColorScheme A01;

    public C8W3(C9c6 c9c6, MigColorScheme migColorScheme) {
        this.A01 = migColorScheme;
        this.A00 = c9c6;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        MigColorScheme migColorScheme = this.A01;
        2lO A0T = 7zT.A0T((2lO) null, 7zL.A0u(0S2.A00, 7zL.A0j(migColorScheme.BDl()), 1));
        long A0E = 7zP.A0E();
        2lO A0K = 4YV.A0K(4YV.A0K(A0T, 0S2.A0u, A0E), 0S2.A1G, A0E);
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw AeS = A0L.AeS();
        2KD A01 = 2K3.A01(AeS, A1W ? 1 : 0);
        7zM.A1O(A01, migColorScheme);
        A01.A2x(migColorScheme);
        A01.A2X();
        A01.A2g();
        A01.A2d();
        7zM.A1X(A01, A0L, 2131967007);
        7zN.A1E(A01, A0L, 2131967007);
        7zN.A1Q(A0L, A01);
        Resources A0J = 7zQ.A0J(AeS);
        String A09 = 3yH.A09(A0L, 2131967009);
        String A092 = 3yH.A09(A0L, 2131967008);
        C1360Af2 c1360Af2 = new C1360Af2(new DCz(this, 14), migColorScheme.Atv(), 1);
        0Dc r0 = new 0Dc(A0J);
        r0.A02(A09);
        SpannableString A0B = 7zS.A0B(r0, c1360Af2, "[[thread-manager-page-try-again]]", A092);
        2KD A012 = 2K3.A01(AeS, A1W ? 1 : 0);
        7zM.A1O(A012, migColorScheme);
        A012.A2x(migColorScheme);
        A012.A2X();
        7zN.A1X(A012);
        A012.A2z(A0B);
        7zN.A1E(A012, A0L, 2131967008);
        7zN.A1Q(A0L, A012);
        return C2so.A06(A0L, c2k5, A0K);
    }
}
