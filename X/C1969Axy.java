package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;

/* renamed from: X.Axy, reason: case insensitive filesystem */
/* loaded from: Axy.class */
public final class C1969Axy extends 1LH {
    public final MigColorScheme A00;

    public C1969Axy() {
        this(LightColorScheme.A00());
    }

    public C1969Axy(MigColorScheme migColorScheme) {
        11T.A0F(migColorScheme, 1);
        this.A00 = migColorScheme;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        2lO A04 = C82m.A04(7zL.A0g((2lO) null, new C82m(0S2.A00, 100.0f, A1W ? 1 : 0)), 0S2.A01, 100.0f, A1W ? 1 : 0);
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw r0 = A0L.A00;
        C53p A01 = C53o.A01(r0, A1W ? 1 : 0);
        A01.A1W(2132279321);
        A01.A1M(2132279321);
        A01.A0J();
        A0L.A00(A01.A01);
        3yF A0L2 = 2KZ.A0L(r0, A1W ? 1 : 0);
        A0L2.A3C(A1W);
        A0L2.A22(C26z.START);
        A0L2.A30(2131954897);
        A0L2.A32(2132279352);
        A0L2.A2x(this.A00.B4i());
        A0L.A00(A0L2.A2W());
        return C2so.A0M(A0L, c2k5, A04);
    }
}
