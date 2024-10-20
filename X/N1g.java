package X;

/* loaded from: N1g.class */
public abstract class N1g {
    public static Object A00(int i, 1BO r302, Object obj) {
        if (((i >> 7) & 15) == 0) {
            return A01(i, r302, obj);
        }
        throw MRl.A0J();
    }

    public static Object A01(int i, 1BO r302, Object obj) {
        NBj nBi;
        int i2 = (i >> 0) & 127;
        if (i2 == 0) {
            nBi = new NBi(r302);
        } else if (i2 == 1) {
            nBi = NBy.A00(r302);
        } else if (i2 == 2) {
            nBi = NC1.A00();
        } else if (i2 == 3) {
            nBi = NBz.A00();
        } else {
            if (i2 != 5) {
                throw MRl.A0J();
            }
            nBi = new NBj(r302);
        }
        return nBi;
    }
}
