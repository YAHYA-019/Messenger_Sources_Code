package X;

/* loaded from: Dvl.class */
public final class Dvl extends 1LH {
    public final C9cu A00;
    public final C9cu A01;
    public final ELZ A02;
    public final C00m A03;
    public final C00m A04;
    public final boolean A05;
    public final boolean A06;

    public Dvl(C9cu c9cu, C9cu c9cu2, ELZ elz, C00m c00m, C00m c00m2, boolean z, boolean z2) {
        7zT.A1T(c9cu, c9cu2, elz);
        this.A01 = c9cu;
        this.A00 = c9cu2;
        this.A06 = z;
        this.A02 = elz;
        this.A05 = z2;
        this.A04 = c00m;
        this.A03 = c00m2;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C2lh A00 = C2lc.A00(c2k5, GAB.A00);
        2lQ r0 = 2lO.A02;
        2lO A0K = 4YV.A0K((2lO) null, 0S2.A08, 7zQ.A08());
        C1ro c1ro = C1ro.STRETCH;
        C2sn A0L = 7zR.A0L(c2k5);
        String A09 = 3yH.A09(A0L, 2131958814);
        EL7 el7 = EL7.A02;
        Integer num = 0S2.A00;
        boolean z = this.A06;
        A0L.A00(new Dvu(ERD.A01, null, el7, this.A05 ? new EIu(3yH.A09(A0L, 2131953678)) : EIv.A00, A09, num, num, new G9J(21, A0L, A00, this), z));
        return C2so.A09(A0L, c2k5, A0K, c1ro);
    }
}
