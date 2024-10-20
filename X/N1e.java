package X;

/* loaded from: N1e.class */
public abstract class N1e {
    public static Object A00(int i, 1BO r302, Object obj) {
        if (((i >> 7) & 15) == 0) {
            return A01(i, r302, obj);
        }
        throw MRl.A0J();
    }

    public static Object A01(int i, 1BO r302, Object obj) {
        int i2 = (i >> 0) & 127;
        if (i2 == 0 || i2 == 1) {
            return Szt.A00();
        }
        throw MRl.A0J();
    }
}
