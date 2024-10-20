package X;

/* loaded from: Dvd.class */
public final class Dvd extends 1LH {
    public final EL8 A00;
    public final FE4 A01;
    public final CharSequence A02;
    public final Integer A03;
    public final C00m A04;
    public final boolean A05;

    public Dvd(EL8 el8, FE4 fe4, CharSequence charSequence, Integer num, C00m c00m, boolean z) {
        C3o5.A0k(el8, 2, fe4);
        this.A02 = charSequence;
        this.A00 = el8;
        this.A03 = num;
        this.A04 = c00m;
        this.A01 = fe4;
        this.A05 = z;
    }

    public 1LI A0s(C2k5 c2k5) {
        CharSequence charSequence = this.A02;
        return new C8gw(2lO.A02, new Fy4(this.A00, this.A03), charSequence, charSequence, this.A04, this.A05, false);
    }
}
