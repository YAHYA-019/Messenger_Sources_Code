package X;

/* loaded from: Dv6.class */
public final class Dv6 extends 1LH {
    public final Integer A00;
    public final C00m A01;

    public Dv6(Integer num, C00m c00m) {
        this.A00 = num;
        this.A01 = c00m;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean z;
        11T.A0F(c2k5, 0);
        int intValue = this.A00.intValue();
        if (intValue == 0) {
            z = true;
        } else if (intValue == 1) {
            z = false;
        } else {
            if (intValue != 2) {
                throw 1BK.A1F();
            }
            z = 6tN.A00(3vP.A00(c2k5));
        }
        return new 7J5((1LI) this.A01.invoke(), new 03Y[]{1BK.A1G(C6tP.class, 2rO.A00(c2k5, new AKV(17, c2k5, z), 4YU.A1b(z)))}, (03Y[]) null);
    }
}
