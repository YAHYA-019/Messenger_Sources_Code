package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;

/* renamed from: X.8cs, reason: invalid class name */
/* loaded from: 8cs.class */
public final class C8cs extends 1LH {
    public final 9KC A00;
    public final MigColorScheme A01;
    public final C5xv A02;
    public final C2fr A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public C8cs(9KC r302, MigColorScheme migColorScheme, C5xv c5xv, C2fr c2fr, String str, String str2, boolean z) {
        4YV.A1M(str, 6, str2);
        this.A01 = migColorScheme;
        this.A02 = c5xv;
        this.A03 = c2fr;
        this.A06 = z;
        this.A00 = r302;
        this.A04 = str;
        this.A05 = str2;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        CJ4 cj4 = new CJ4();
        cj4.A00 = 3865289617L;
        cj4.A04(3yH.A09(c2k5, 2131965972));
        boolean z = this.A06;
        MigColorScheme migColorScheme = this.A01;
        cj4.A05 = new C59y(migColorScheme, "SHOW_CHANNEL_IN_INBOX_TOGGLE_ID", z, true);
        C2q1 c2q1 = C2q0.A05;
        LightColorScheme A00 = LightColorScheme.A00();
        C2fr c2fr = this.A03;
        c2fr.getClass();
        cj4.A04 = 55C.A02(c2q1, A00, c2fr);
        cj4.A01 = C9ye.A01(this, 67);
        cj4.A07 = migColorScheme;
        AnonymousClass544 A01 = cj4.A01();
        11T.A0A(A01);
        2lQ r0 = 2lO.A02;
        2lO A0Z = 7zQ.A0Z(7zS.A0h(0S2.A00, 7zL.A0j(migColorScheme.BDl()), 1), 0S2.A0Y, new AR2(this, 15));
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw r02 = A0L.A00;
        C5yw A0b = 7zN.A0b(r02, false);
        A0b.A2a(2131959676);
        A0b.A2Y();
        A0b.A2b(migColorScheme);
        A0b.A2d(this.A02);
        A0b.A2i(false);
        7zN.A1R(A0L, A0b);
        7zU.A1I(A0L, A01, 55M.A00(r02));
        2KD A012 = 2K3.A01(r02, 0);
        A012.A2i();
        A012.A2d();
        A012.A2x(migColorScheme);
        A012.A2u(2KG.A07);
        A012.A0X();
        A012.A2z(7zO.A0t(A0L, this.A04, this.A05, 2131959675));
        7zN.A1Q(A0L, A012);
        return C2so.A02(A0L, c2k5, A0Z);
    }
}
