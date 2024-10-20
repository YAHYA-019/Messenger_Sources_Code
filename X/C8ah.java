package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;
import java.util.Locale;

/* renamed from: X.8ah, reason: invalid class name */
/* loaded from: 8ah.class */
public final class C8ah extends 1LH {
    public final 9IM A00;
    public final MigColorScheme A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C8ah(9IM r302, MigColorScheme migColorScheme, boolean z, boolean z2, boolean z3) {
        11T.A0F(r302, 2);
        this.A01 = migColorScheme;
        this.A00 = r302;
        this.A04 = z;
        this.A02 = z2;
        this.A03 = z3;
    }

    public 1LI A0s(C2k5 c2k5) {
        8Lf A02;
        boolean A1W = 7zL.A1W(c2k5);
        MigColorScheme migColorScheme = this.A01;
        2lO A0g = 7zL.A0g((2lO) null, 7zV.A0U(migColorScheme));
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw AeS = A0L.AeS();
        C5yw A0l = 7zS.A0l(AeS, migColorScheme, A1W);
        C9zj.A04(A0l, this, 29);
        A0l.A2c(this.A02 ? 2MG.A02 : 2MG.A03);
        7zM.A1W(migColorScheme, A0l);
        7zN.A1R(A0L, A0l);
        C8xf A00 = C8xf.A00(C9ll.A02(migColorScheme));
        String A09 = 3yH.A09(A0L, 2131957211);
        String A092 = 3yH.A09(A0L, 2131957210);
        String A093 = 3yH.A09(A0L, 2131957208);
        if (this.A03) {
            String A094 = 3yH.A09(A0L, 2131957204);
            C9py A03 = C9py.A03(this, 73);
            String upperCase = 3yH.A09(A0L, 2131957209).toUpperCase(Locale.ROOT);
            11T.A0A(upperCase);
            A02 = C9py.A01(A03, A094, upperCase, this, 74);
        } else {
            A02 = C9py.A02(3yH.A09(A0L, 2131957204), this, 75);
        }
        8Tn A08 = 8Tn.A08(AeS, new 8NJ(A02, A00, A092, A093, A09, (List) null, A1W), migColorScheme);
        A08.A01.A04 = this.A04;
        return 8Tn.A06(A0L, c2k5, A0g, A08);
    }
}
