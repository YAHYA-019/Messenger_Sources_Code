package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.8i1, reason: invalid class name */
/* loaded from: 8i1.class */
public final class C8i1 extends 1LH {
    public final int A00;
    public final C4Rf A01;
    public final AaJ A02;
    public final C9Iy A03;
    public final 9Ny A04;
    public final 2ZG A05;
    public final 2QA A06;
    public final MigColorScheme A07;
    public final ImmutableList A08;
    public final ImmutableList A09;
    public final boolean A0A;
    public final boolean A0B;

    public C8i1(C4Rf c4Rf, AaJ aaJ, C9Iy c9Iy, 9Ny r305, 2ZG r306, 2QA r307, MigColorScheme migColorScheme, ImmutableList immutableList, ImmutableList immutableList2, int i, boolean z, boolean z2) {
        7zP.A1O(immutableList2, 2, c9Iy);
        11T.A0F(c4Rf, 12);
        this.A08 = immutableList;
        this.A09 = immutableList2;
        this.A07 = migColorScheme;
        this.A05 = r306;
        this.A02 = aaJ;
        this.A04 = r305;
        this.A06 = r307;
        this.A00 = i;
        this.A0B = z;
        this.A0A = z2;
        this.A03 = c9Iy;
        this.A01 = c4Rf;
    }

    public static final void A01(3yM r301, C4Ll c4Ll, C8i1 c8i1) {
        3yU r0 = 3yU.A02;
        c4Ll.A05(null, c8i1.A01, r0, 3yV.A0H, 3yQ.A0A, r301, null, null, "requests", null, null);
    }

    public static final void A0L(3yM r301, C4Ll c4Ll, C8i1 c8i1) {
        3yU r0 = 3yU.A03;
        c4Ll.A05(null, c8i1.A01, r0, 3yV.A0H, 3yQ.A0A, r301, null, null, "suggestions", "pymk_messenger_friend_requests_left_nav", 7zO.A0r(c8i1.A05));
    }

    /* JADX WARN: Type inference failed for: r0v151, types: [X.9J4] */
    public 1LI A0s(C2k5 c2k5) {
        2cL c8ej;
        final boolean A1W = 7zL.A1W(c2k5);
        final MigColorScheme migColorScheme = this.A07;
        2lO A0g = 7zL.A0g((2lO) null, 7zL.A0u(0S2.A00, 7zL.A0j(migColorScheme.BDl()), 1));
        C2sn A0L = 7zR.A0L(c2k5);
        C4Ll c4Ll = new C4Ll();
        1Iw AeS = A0L.AeS();
        C5yw A00 = C5yv.A00(AeS);
        A00.A2b(migColorScheme);
        A00.A2a(2131963179);
        A00.A2c(2MG.A05);
        C9zj.A04(A00, this, 67);
        C9zj c9zj = new C9zj(this, 68);
        C5yv c5yv = A00.A01;
        c5yv.A08 = c9zj;
        2QA r0 = this.A06;
        c5yv.A04 = r0 != null ? ((2QB) r0).A00 : null;
        A00.A2i(A1W);
        7zN.A1R(A0L, A00);
        8TK A002 = 3wK.A00(AeS);
        A002.A2Z(C9dX.A01(3yH.A09(A0L, 2131963200), 3yH.A09(A0L, 2131963202)));
        A002.A01.A03 = AnonymousClass955.EVEN_WIDTH;
        A002.A2X(migColorScheme);
        A002.A2Y(new C9zf(this, c4Ll, 2));
        A0L.A00(A002.A2W());
        int i = this.A00;
        4FL.A00(c2k5, AQg.A00(this, c4Ll, 13), AnonymousClass001.A1a(i));
        if (i == 0) {
            if (!this.A0A) {
                ImmutableList immutableList = this.A08;
                if (immutableList.isEmpty()) {
                    2lO A0M = 7zT.A0M(C82m.A04(null, 0S2.A01, 80.0f, A1W ? 1 : 0), 7zL.A00(2RH.A06));
                    C2sn A0U = 7zQ.A0U(AeS);
                    1Iw r02 = A0U.A00;
                    2KD A0X = 7zN.A0X(r02, migColorScheme, A1W ? 1 : 0);
                    7zM.A1X(A0X, A0U, 2131957038);
                    A0X.A2h();
                    A0X.A2d();
                    A0X.A2a();
                    7zO.A1F(A0X, 2RH.A05);
                    2KD A0d = 7zR.A0d(r02, A0U, A0X, A1W ? 1 : 0);
                    A0d.A2x(migColorScheme);
                    7zQ.A1T(A0d, 3yH.A09(A0U, 2131957037));
                    A0d.A2a();
                    7zN.A1Q(A0U, A0d);
                    c8ej = C2so.A04(A0U, A0L, A0M);
                } else {
                    ?? r03 = new Object() { // from class: X.9J4
                    };
                    long A08 = 7zP.A08();
                    2NI r04 = C8nc.A0O;
                    C02A c02a = AeS.A03.A01;
                    C1J8 c1j8 = c02a.A02;
                    boolean z = c02a.A0X;
                    C9bp c9bp = new C9bp();
                    1Du it = immutableList.iterator();
                    while (it.hasNext()) {
                        8Ka r05 = (8Ka) it.next();
                        c9bp.A00(new 8Z8(this.A04, r05, (C9J4) r03, migColorScheme), r05.A04, A1W);
                    }
                    c8ej = new C8ej(r04, null, null, null, null, C9mj.A02(AeS, c1j8, 7zN.A03(A0L, A08), z), c9bp, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true);
                }
                A0L.A00(c8ej);
            }
            c8ej = 8Tj.A06(7zL.A0q(A0L), migColorScheme);
            A0L.A00(c8ej);
        } else if (i == 1) {
            final AKJ akj = new AKJ(this, 22);
            final AM8 am8 = AM8.A00;
            final AM9 am9 = AM9.A00;
            final 9Nz r1 = null;
            A0L.A00(new 1LH(r1, migColorScheme, am8, akj, am9, A1W, A1W) { // from class: X.8ch
                public final 9Nz A00;
                public final C00m A01;
                public final C00m A02;
                public final C00m A03;
                public final MigColorScheme A04;
                public final boolean A05;
                public final boolean A06;

                {
                    11T.A0F(migColorScheme, 1);
                    this.A04 = migColorScheme;
                    this.A06 = A1W;
                    this.A05 = A1W;
                    this.A00 = r1;
                    this.A02 = am8;
                    this.A01 = akj;
                    this.A03 = am9;
                }

                public 1LI A0s(C2k5 c2k52) {
                    C2sn A0U2;
                    boolean A1W2 = 7zL.A1W(c2k52);
                    2lO A0K = 4YV.A0K(4YV.A0K((2lO) null, 0S2.A0Y, 3yH.A06(c2k52, 2132279303)), 0S2.A15, 3yH.A06(c2k52, 2132279305));
                    Integer num = 0S2.A00;
                    2lO A0Z = 7zQ.A0Z(C82m.A04(A0K, num, 100.0f, A1W2 ? 1 : 0), num, AVJ.A01(this, 45));
                    1Iw r06 = c2k52.A05;
                    C83g A003 = C02413v4.A00(r06);
                    A003.A2Z(2MQ.A1g);
                    A003.A2X();
                    MigColorScheme migColorScheme2 = this.A04;
                    A003.A2e(migColorScheme2);
                    C83o c83o = C83o.A04;
                    A003.A2c(c83o);
                    A003.A2b(7zL.A0a(AVJ.A01(this, 44)));
                    C1ro c1ro = C1ro.CENTER;
                    C2sn A0U3 = 7zQ.A0U(r06);
                    2lO A0R = 7zS.A0R((2lO) null, 1.0f);
                    1Iw r07 = A0U3.A00;
                    C2sn A0U4 = 7zQ.A0U(r07);
                    2RH r08 = 2RH.A03;
                    2lO A0K2 = 4YV.A0K((2lO) null, 0S2.A02, 4YV.A06(r08));
                    C2sn A0K3 = 7zS.A0K(A0U4);
                    2KD A0X2 = 7zN.A0X(A0K3.A00, migColorScheme2, A1W2 ? 1 : 0);
                    A0X2.A2k();
                    A0X2.A2c();
                    A0X2.A2a();
                    A0X2.A1y(c1ro);
                    7zM.A1X(A0X2, A0K3, 2131963184);
                    7zN.A1Q(A0K3, A0X2);
                    7zQ.A1E(7zM.A0o(A003.A2V(), A0K3, A0U4, A0K2), A0U4, A0U3, A0R);
                    if (this.A06) {
                        boolean z2 = this.A05;
                        2lO A0g2 = 7zL.A0g((2lO) null, 7zL.A0k(0S2.A0C, 0.0f));
                        if (z2) {
                            A0g2 = 4YV.A0K(A0g2, 0S2.A03, 4YV.A06(r08));
                            A0U2 = 7zQ.A0U(r07);
                            C83g A004 = C02413v4.A00(A0U2.A00);
                            A004.A2Z(2MQ.A1C);
                            A004.A2X();
                            A004.A2e(migColorScheme2);
                            A004.A2c(c83o);
                            C83g.A06(A0U2, A004, AVJ.A01(this, 42));
                        } else {
                            A0U2 = 7zQ.A0U(r07);
                            2KD A0X3 = 7zN.A0X(A0U2.A00, migColorScheme2, A1W2 ? 1 : 0);
                            7zN.A1X(A0X3);
                            A0X3.A2a();
                            A0X3.A1y(c1ro);
                            7zM.A1X(A0X3, A0U2, 2131963183);
                            7zO.A1N(A0X3, AVJ.A01(this, 43));
                            4YU.A1L(A0X3, r08);
                            7zN.A1Q(A0U2, A0X3);
                        }
                        7zN.A1I(A0U2, A0U3, A0g2);
                    }
                    return C2so.A0P(A0U3, c2k52, A0Z);
                }
            });
            if (!this.A0B) {
                long A082 = 7zP.A08();
                2NI r06 = C8nc.A0O;
                C02A c02a2 = AeS.A03.A01;
                C1J8 c1j82 = c02a2.A02;
                boolean z2 = c02a2.A0X;
                C9bp c9bp2 = new C9bp();
                1Du it2 = this.A09.iterator();
                while (it2.hasNext()) {
                    85T r07 = (85T) it2.next();
                    c9bp2.A00(new C8ht(this.A02, r07, this.A05, new 9vO(this, 1), migColorScheme, 0S2.A0N, -1), r07.A06, A1W);
                }
                c8ej = new C8ej(r06, null, null, null, null, C9mj.A02(AeS, c1j82, 7zN.A03(A0L, A082), z2), c9bp2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true);
                A0L.A00(c8ej);
            }
            c8ej = 8Tj.A06(7zL.A0q(A0L), migColorScheme);
            A0L.A00(c8ej);
        }
        return C2so.A02(A0L, c2k5, A0g);
    }
}
