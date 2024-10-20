package X;

/* loaded from: Dvu.class */
public final class Dvu extends 1LH {
    public final ERD A00;
    public final F9j A01;
    public final EL7 A02;
    public final ESB A03;
    public final CharSequence A04;
    public final Integer A05;
    public final Integer A06;
    public final C00m A07;
    public final boolean A08;

    public Dvu(ERD erd, F9j f9j, EL7 el7, ESB esb, CharSequence charSequence, Integer num, Integer num2, C00m c00m, boolean z) {
        this.A04 = charSequence;
        this.A02 = el7;
        this.A05 = num;
        this.A06 = num2;
        this.A00 = erd;
        this.A03 = esb;
        this.A08 = z;
        this.A07 = c00m;
        this.A01 = f9j;
    }

    public 1LI A0s(C2k5 c2k5) {
        EIu eIu = this.A03;
        boolean z = eIu instanceof EIu;
        CharSequence charSequence = z ? eIu.A00 : this.A04;
        return new C8gw(2lO.A02, new Fy5(this.A00, this.A01, this.A02, this.A05, this.A06), this.A04, charSequence, this.A07, this.A08, z);
    }
}
