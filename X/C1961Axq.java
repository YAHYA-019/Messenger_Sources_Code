package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Axq, reason: case insensitive filesystem */
/* loaded from: Axq.class */
public final class C1961Axq extends 1LH {
    public final Aab A00;
    public final MigColorScheme A01;
    public final C5xv A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C1961Axq(Aab aab, MigColorScheme migColorScheme, C5xv c5xv, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        11T.A0F(migColorScheme, 1);
        this.A01 = migColorScheme;
        this.A02 = c5xv;
        this.A04 = str;
        this.A06 = z;
        this.A08 = z2;
        this.A07 = z3;
        this.A03 = str2;
        this.A05 = z4;
        this.A00 = aab;
    }

    public 1LI A0s(C2k5 c2k5) {
        int i;
        11T.A0F(c2k5, 0);
        C4Mu c4Mu = (C4Mu) 1Bi.A03(68133);
        boolean z = this.A08;
        if (!z) {
            i = 2131964003;
            if (this.A06) {
                i = 2131963834;
            }
        } else if (C4Mu.A00(c4Mu).AZk(36321834049487697L)) {
            i = 2131966207;
            if (this.A06) {
                i = 2131966208;
            }
        } else {
            i = 2131963854;
        }
        2lQ r0 = 2lO.A02;
        MigColorScheme migColorScheme = this.A01;
        2lO A0L = 4YV.A0L(7zS.A0h(0S2.A00, 7zL.A0j(migColorScheme.BDl()), 1), 0S2.A1G, DDL.A00, 1);
        C2sn A0L2 = 7zR.A0L(c2k5);
        C5yw A0b = 7zN.A0b(A0L2.A00, false);
        A0b.A2a(2131954517);
        A0b.A2Y();
        AbM.A1N(migColorScheme, A0b, this.A02, false);
        7zN.A1R(A0L2, A0b);
        return 7zM.A0l(new 8hO(this.A00, migColorScheme, this.A04, 3yH.A09(A0L2, i), this.A03, true, false, this.A07, z, this.A05), A0L2, c2k5, A0L);
    }
}
