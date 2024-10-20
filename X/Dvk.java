package X;

/* loaded from: Dvk.class */
public final class Dvk extends 1LH {
    public final int A00;
    public final ELv A01;
    public final EL4 A02;
    public final ESF A03;
    public final 2lO A04;
    public final GOg A05;
    public final CharSequence A06;

    public Dvk(2lO r302, ELv eLv, EL4 el4, GOg gOg, ESF esf, CharSequence charSequence, int i) {
        C3o5.A0k(charSequence, 1, eLv);
        this.A06 = charSequence;
        this.A05 = gOg;
        this.A03 = esf;
        this.A00 = i;
        this.A01 = eLv;
        this.A02 = el4;
        this.A04 = r302;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        Object A01 = F2c.A01(c2k5, this.A05);
        return new QIH(this.A04, (Fz5) 2rO.A00(c2k5, new G9J(15, A01, c2k5, this), new Object[]{Integer.valueOf(this.A00), this.A01, this.A03, this.A02, A01}), this.A06);
    }
}
