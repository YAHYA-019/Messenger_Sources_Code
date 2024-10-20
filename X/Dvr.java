package X;

/* loaded from: Dvr.class */
public final class Dvr extends 1LH {
    public final ERA A00;
    public final ERA A01;
    public final ERD A02;
    public final 2lO A03;
    public final Integer A04;
    public final String A05;
    public final C00m A06;
    public final boolean A07;

    public Dvr(ERA era, ERA era2, ERD erd, 2lO r305, Integer num, String str, C00m c00m) {
        7zS.A16(1, era, erd, num);
        this.A00 = era;
        this.A02 = erd;
        this.A04 = num;
        this.A01 = era2;
        this.A07 = true;
        this.A05 = str;
        this.A06 = c00m;
        this.A03 = r305;
    }

    public 1LI A0s(C2k5 c2k5) {
        2lQ r309;
        2lQ r310;
        2lO A0g;
        MfW mfW;
        2lO r304 = this.A03;
        long A09 = 7zP.A09();
        if (r304 != null) {
            r309 = 2lO.A02;
            r310 = r309;
            A0g = 7zL.A0g((2lO) null, new C6na(0S2.A1G, A09));
        } else {
            r304 = new 2lO((2lO) null, (2lU) null);
            r309 = 2lO.A02;
            r310 = r309;
            A0g = 7zL.A0g((2lO) null, new C6na(0S2.A1G, A09));
        }
        2lO A00 = r304.A00(A0g);
        boolean z = this.A07;
        2lO A002 = A00.A00(4YV.A0L((2lO) null, 0S2.A0F, Boolean.valueOf(z), 1));
        String str = this.A05;
        if (str != null) {
            r309 = 7zS.A0d((2lO) null, str);
        }
        2lO A003 = A002.A00(r309);
        Integer num = 0S2.A01;
        2lO A004 = A003.A00(7zR.A0Q((2lO) null, num, "android.widget.Button"));
        float f = 1.0f;
        if (!z) {
            f = 0.3f;
        }
        2lO A005 = new 2lO((2lO) null, (2lU) null).A00(32E.A00(r310, f));
        C00m c00m = this.A06;
        if (c00m == null || !z) {
            A005 = A004.A00(A005);
        }
        ERA era = this.A00;
        ERD erd = this.A02;
        ERB erb = ERB.A02;
        int intValue = this.A04.intValue();
        if (intValue == 0) {
            mfW = MfW.A1o;
        } else if (intValue == 1) {
            mfW = MfW.A2A;
        } else if (intValue == 2) {
            mfW = MfW.A1W;
        } else if (intValue == 3) {
            mfW = MfW.A0u;
        } else {
            if (intValue != 4) {
                throw 1BK.A1F();
            }
            mfW = MfW.A1p;
        }
        Dvb dvb = new Dvb(era, this.A01, erb, erd, mfW, A005);
        return (c00m == null || !z) ? dvb : new Dvc(dvb, A004, 0S2.A00, 0S2.A0C, num, c00m);
    }
}
