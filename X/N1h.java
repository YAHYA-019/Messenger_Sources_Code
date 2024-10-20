package X;

/* loaded from: N1h.class */
public abstract class N1h {
    public static GKQ A00(int i, 1BO r302, Object obj) {
        if (((i >> 7) & 15) == 0) {
            return A01(i, r302, obj);
        }
        throw MRl.A0J();
    }

    public static GKQ A01(int i, 1BO r302, Object obj) {
        Pcl A01;
        int i2 = (i >> 0) & 127;
        if (i2 == 0) {
            A01 = PS8.A01();
        } else {
            if (i2 != 1) {
                throw MRl.A0J();
            }
            A01 = PS8.A00();
        }
        return (GKQ) A01;
    }
}
