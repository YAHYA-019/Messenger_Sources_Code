package X;

/* loaded from: Dvb.class */
public final class Dvb extends 1LH {
    public final ERA A00;
    public final ERA A01;
    public final ERB A02;
    public final ERD A03;
    public final MfW A04;
    public final 2lO A05;

    public Dvb(ERA era, ERA era2, ERB erb, ERD erd, MfW mfW, 2lO r307) {
        7zT.A1T(era, erd, mfW);
        this.A00 = era;
        this.A03 = erd;
        this.A02 = erb;
        this.A04 = mfW;
        this.A01 = era2;
        this.A05 = r307;
    }

    public 1LI A0s(C2k5 c2k5) {
        ERA era = this.A00;
        ERD erd = this.A03;
        Fy3 fy3 = new Fy3(era, this.A01, this.A02, erd, this.A04);
        2lQ r309 = this.A05;
        if (r309 == null) {
            r309 = 2lO.A02;
        }
        return new Dv2(r309, fy3);
    }
}
