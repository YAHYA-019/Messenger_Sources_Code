package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8fo, reason: invalid class name */
/* loaded from: 8fo.class */
public final class C8fo extends 1LH {
    public static final long A03 = 4YV.A06(2RH.A07);
    public final MigColorScheme A00;
    public final 9LT A01;
    public final boolean A02;

    public C8fo(MigColorScheme migColorScheme, 9LT r303, boolean z) {
        11T.A0F(r303, 2);
        this.A00 = migColorScheme;
        this.A01 = r303;
        this.A02 = z;
    }

    public 1LI A0s(C2k5 c2k5) {
        Dzk A2W;
        1LI A01;
        11T.A0F(c2k5, 0);
        C2lh A0e = 7zL.A0e(c2k5, AO2.A00);
        MigColorScheme migColorScheme = this.A00;
        2lO A0g = 7zL.A0g((2lO) null, 7zL.A0u(0S2.A00, 7zL.A0j(migColorScheme.BDl()), 1));
        C2sn A0L = 7zR.A0L(c2k5);
        long j = A03;
        2lO A0X = 7zQ.A0X(4YV.A0K(4YV.A0K((2lO) null, 0S2.A08, j), 0S2.A0B, j), 0S2.A0C, 0.0f);
        1Iw AeS = A0L.AeS();
        C2sn A0U = 7zQ.A0U(AeS);
        C1u2 A0A = 7zN.A0A();
        C83t A00 = C5z0.A00(A0U.AeS());
        A00.A2a(migColorScheme);
        7zL.A1J(A00);
        A00.A2X(48.0f);
        2MG r0 = 2MG.A02;
        A00.A2Y(A0A.A03(r0.iconName));
        A00.A2Z(migColorScheme.B4h());
        A00.A1J(r0.contentDescriptionResId);
        A00.A01.A0A = true;
        A00.A0k(0.0f);
        7zO.A1N(A00, 83T.A01(this, A0e, 8));
        7zQ.A1F(A00.A2V(), A0U, A0L, A0X);
        2lO A0T = 7zT.A0T((2lO) null, 7zM.A0q(j));
        C2sn A0U2 = 7zQ.A0U(AeS);
        boolean A1V = 7zP.A1V(A0e);
        1Iw AeS2 = A0U2.AeS();
        if (A1V) {
            Drl A002 = Dzk.A00(AeS2);
            A002.A10(50.0f);
            String A09 = 3yH.A09(A0U2, 2131962201);
            Dzk dzk = A002.A01;
            dzk.A0S = A09;
            dzk.A0G = 16;
            dzk.A0B = 1;
            dzk.A07 = 268435456;
            A002.A0E(1BJ.A00(223));
            7zM.A1O(A002, migColorScheme);
            int B4i = migColorScheme.B4i();
            Dzk dzk2 = A002.A01;
            dzk2.A0F = B4i;
            dzk2.A0W = true;
            dzk2.A0X = true;
            A002.A01.A0P = 7zL.A0a(new AVE(this, 42));
            Drl.A06(A002);
            A002.A0J();
            A2W = A002.A01;
            11T.A0A(A2W);
        } else {
            8TT A003 = 5zI.A00(AeS2);
            A003.A2Y(migColorScheme);
            A003.A2a(3yH.A09(A0U2, 2131962203));
            A003.A2Z(2KE.A08);
            A003.A2X(C1u7.A08);
            A003.A2M(true);
            A2W = A003.A2W();
        }
        A0U2.A00(A2W);
        7zM.A1Q(A0U2, A0L, A0T);
        C2sn A0U3 = 7zQ.A0U(AeS);
        if (A1V) {
            A01 = null;
        } else {
            C1u2 A0A2 = 7zN.A0A();
            int i = C5yu.A00;
            6T0 r02 = new 6T0();
            r02.A00 = A0A2.A03(C1u3.A4D);
            r02.A0A = true;
            r02.A00(migColorScheme);
            r02.A04 = new 9zQ(A0e, 35);
            r02.A07 = 3yH.A09(A0U3, 2131962201);
            A01 = new C5z1(r02).A01(A0U3.AeS(), migColorScheme.B4h(), 48);
        }
        A0U3.A00(A01);
        A0L.A00(C2so.A0F(A0U3, A0L));
        C2sn A0U4 = 7zQ.A0U(AeS);
        C9lC A004 = C9lC.A00();
        C9lC.A01(A004, A0U4, 2131962202);
        A004.A05 = this.A02;
        A004.A01 = migColorScheme;
        A004.A03(new 9zQ(this, 34));
        A004.A02 = 3yH.A09(A0U4, 2131962202);
        A0U4.A00(A004.A02().A01(A0U4.AeS(), migColorScheme.B4h(), 48));
        return 7zN.A0R(C2so.A0F(A0U4, A0L), A0L, c2k5, A0g);
    }
}
