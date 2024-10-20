package X;

/* loaded from: Dvj.class */
public final class Dvj extends 1LH {
    public final long A00;
    public final long A01;
    public final MfW A02;
    public final 2lO A03;
    public final ELv A04;
    public final EM5 A05;
    public final CharSequence A06;

    public Dvj(MfW mfW, 2lO r303, ELv eLv, EM5 em5, CharSequence charSequence, long j, long j2) {
        11T.A0F(em5, 2);
        this.A06 = charSequence;
        this.A05 = em5;
        this.A02 = mfW;
        this.A04 = eLv;
        this.A01 = j;
        this.A00 = j2;
        this.A03 = r303;
    }

    public 1LI A0s(C2k5 c2k5) {
        CharSequence charSequence = this.A06;
        Fy6 fy6 = new Fy6(this.A02, this.A05);
        ELv eLv = this.A04;
        EJ0 ej0 = new EJ0(this.A01, this.A00);
        2lQ r313 = this.A03;
        if (r313 == null) {
            r313 = 2lO.A02;
        }
        return new Dvk(r313, eLv, EL4.A03, fy6, ej0, charSequence, 0);
    }
}
