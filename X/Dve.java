package X;

/* loaded from: Dve.class */
public final class Dve extends 1LH {
    public final C9cu A00;
    public final GOi A01;
    public final CharSequence A02;
    public final Integer A03;
    public final C00m A04;
    public final boolean A05;

    public Dve(C9cu c9cu, GOi gOi, CharSequence charSequence, Integer num, C00m c00m, boolean z) {
        11T.A0F(c9cu, 2);
        this.A02 = charSequence;
        this.A00 = c9cu;
        this.A03 = num;
        this.A05 = z;
        this.A01 = gOi;
        this.A04 = c00m;
    }

    public 1LI A0s(C2k5 c2k5) {
        EM7 em7;
        11T.A0F(c2k5, 0);
        GOi gOi = this.A01;
        if (gOi instanceof Fy0) {
            Fy0 fy0 = (Fy0) gOi;
            if (fy0.A01 == null) {
                gOi = new Fy0(fy0.A00, 3yH.A0A(c2k5, this.A02, 2131966799), fy0.A02);
            }
        }
        boolean z = this.A05;
        GAW gaw = !z ? null : new GAW(this, 44);
        CharSequence charSequence = this.A02;
        int intValue = this.A03.intValue();
        if (intValue == 0) {
            em7 = EM7.A07;
        } else if (intValue == 1) {
            em7 = EM7.A0A;
        } else {
            if (intValue != 2) {
                throw 1BK.A1F();
            }
            em7 = EM7.A0C;
        }
        return new Dvx(null, 2lO.A02, this.A00, null, new Fy9(gOi), em7, charSequence, "", null, this.A04, gaw, z);
    }
}
