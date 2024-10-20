package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.8ci, reason: invalid class name */
/* loaded from: 8ci.class */
public final class C8ci extends 1LH {
    public final AaJ A00;
    public final 2ZG A01;
    public final MigColorScheme A02;
    public final ImmutableList A03;
    public final C00m A04;
    public final boolean A05;
    public final boolean A06;

    public C8ci(AaJ aaJ, 2ZG r303, MigColorScheme migColorScheme, ImmutableList immutableList, C00m c00m, boolean z, boolean z2) {
        this.A03 = immutableList;
        this.A02 = migColorScheme;
        this.A01 = r303;
        this.A00 = aaJ;
        this.A06 = z;
        this.A04 = c00m;
        this.A05 = z2;
    }

    public 1LI A0s(C2k5 c2k5) {
        1LI c8ej;
        boolean A1W = 7zL.A1W(c2k5);
        MigColorScheme migColorScheme = this.A02;
        2lO A0g = 7zL.A0g((2lO) null, 7zL.A0u(0S2.A00, 7zL.A0j(migColorScheme.BDl()), 1));
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw AeS = A0L.AeS();
        C5yw A00 = C5yv.A00(AeS);
        A00.A2b(migColorScheme);
        A00.A2a(2131963184);
        A00.A2Y();
        C9zj.A04(A00, this, 69);
        A00.A2i(A1W);
        7zN.A1R(A0L, A00);
        if (this.A06) {
            c8ej = 8Tj.A06(7zL.A0q(A0L), migColorScheme);
        } else {
            long A08 = 7zP.A08();
            2NI r0 = C8nc.A0O;
            C02A c02a = AeS.A03.A01;
            C1J8 c1j8 = c02a.A02;
            boolean z = c02a.A0X;
            C9sn A002 = C9sn.A00(AeS);
            1Du it = this.A03.iterator();
            while (it.hasNext()) {
                85T r02 = (85T) it.next();
                9vP r03 = new 9vP(A002, this, A1W ? 1 : 0);
                C9sn.A01(new C8ht(this.A00, r02, this.A01, r03, migColorScheme, 0S2.A0C, -1), A002, r02.A06);
            }
            c8ej = new C8ej(r0, null, null, null, null, C9mj.A02(AeS, c1j8, 7zN.A03(A0L, A08), z), A002.A01, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true);
        }
        return 7zM.A0l(c8ej, A0L, c2k5, A0g);
    }
}
