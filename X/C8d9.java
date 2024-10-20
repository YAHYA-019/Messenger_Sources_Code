package X;

import java.util.List;

/* renamed from: X.8d9, reason: invalid class name */
/* loaded from: 8d9.class */
public final class C8d9 extends 1LH {
    public final C1qb A00;
    public final 1Va A01;
    public final 5vH A02;
    public final C2on A03;
    public final C5n8 A04;
    public final 7Kx A05;
    public final List A06;

    public C8d9(C1qb c1qb, 1Va r303, 5vH r304, C2on c2on, C5n8 c5n8, 7Kx r307, List list) {
        4YV.A1M(list, 5, r304);
        this.A00 = c1qb;
        this.A04 = c5n8;
        this.A05 = r307;
        this.A01 = r303;
        this.A06 = list;
        this.A03 = c2on;
        this.A02 = r304;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        AWC awc = new AWC(this, 6);
        C2lh A00 = C2lc.A00(c2k5, new DKb(awc, 19));
        4FL.A00(c2k5, new JR6(A00, awc, 42), new Object[]{awc});
        Object obj = A00.A02;
        Object A002 = 2rO.A00(c2k5, new AQU(c2k5, 22), new Object[0]);
        Object A01 = AQs.A01(c2k5, this, new Object[]{this.A04}, 25);
        Integer num = 0S2.A0C;
        8Dm A012 = C9d1.A01(c2k5, null, 7zL.A0w(3yH.A05(c2k5)), 7zL.A0w(7zP.A0G()), 7zL.A0w(3yH.A05(c2k5)));
        2lQ r0 = 2lO.A02;
        2lO A0K = 4YV.A0K((2lO) null, 0S2.A08, 3yH.A03(c2k5));
        long A08 = 7zP.A08();
        2NI r02 = C8nc.A0O;
        1Iw r03 = c2k5.A05;
        C02A c02a = r03.A03.A01;
        C1J8 c1j8 = c02a.A02;
        boolean z = c02a.A0X;
        C9sn A003 = C9sn.A00(r03);
        C9sn.A04(A003, 0QD.A0i(this.A06), AUb.A00, new AVZ(8, A002, obj, A01, this));
        return new C8ej(r02, A012, null, A0K, null, C9mj.A05(r03, c1j8, null, num, 0, (-1) << (-1), 7zN.A03(c2k5, A08), false, z), A003.A01, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true);
    }
}
