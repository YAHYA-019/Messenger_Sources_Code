package X;

/* loaded from: Dvc.class */
public final class Dvc extends 1LH {
    public final 1LI A00;
    public final 2lO A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final C00m A05;

    public Dvc(1LI r302, 2lO r303, Integer num, Integer num2, Integer num3, C00m c00m) {
        this.A00 = r302;
        this.A03 = num;
        this.A04 = num2;
        this.A02 = num3;
        this.A05 = c00m;
        this.A01 = r303;
    }

    public 1LI A0s(C2k5 c2k5) {
        1LI r0 = this.A00;
        ACE ace = new ACE(this.A03, this.A04, this.A02);
        C00m c00m = this.A05;
        2lQ r309 = this.A01;
        if (r309 == null) {
            r309 = 2lO.A02;
        }
        return new DvW(r0, r309, ace, c00m, (C00m) null);
    }
}
