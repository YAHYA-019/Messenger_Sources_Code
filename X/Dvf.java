package X;

/* loaded from: Dvf.class */
public final class Dvf extends 1LH {
    public final Eyw A00;
    public final C00m A01;
    public final C00m A02;
    public final ENz A03;
    public final boolean A04;
    public final boolean A05;

    public Dvf(ENz eNz, Eyw eyw, C00m c00m, C00m c00m2, boolean z, boolean z2) {
        11T.A0F(eyw, 1);
        1BL.A1G(c00m, c00m2);
        this.A00 = eyw;
        this.A03 = eNz;
        this.A05 = z;
        this.A04 = z2;
        this.A02 = c00m;
        this.A01 = c00m2;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        2lQ r0 = 2lO.A02;
        ENz eNz = this.A03;
        2lO A0K = 4YV.A0K((2lO) null, 0S2.A08, eNz.loginButtonTopMargin);
        C1ro c1ro = C1ro.STRETCH;
        C2sn A0L = 7zR.A0L(c2k5);
        String A09 = 3yH.A09(A0L, 2131958814);
        EL7 el7 = eNz.loginButtonSize;
        if (el7 == null) {
            el7 = EL7.A02;
        }
        Integer num = 0S2.A00;
        boolean z = this.A05;
        A0L.A00(new Dvu(ERD.A01, null, el7, this.A04 ? new EIu(3yH.A09(A0L, 2131953678)) : EIv.A00, A09, num, num, new G9G(this, A0L, 18), z));
        return C2so.A09(A0L, c2k5, A0K, c1ro);
    }
}
