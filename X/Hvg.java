package X;

/* loaded from: Hvg.class */
public abstract class Hvg {
    public static double A00(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0.0d;
        }
        return Math.max(i, i2) / Math.min(i, i2);
    }

    public static IBB A01(IBB ibb, IBB ibb2) {
        IBB ibb3 = null;
        int i = ibb.A02;
        int i2 = ibb.A01;
        double A00 = A00(i, i2);
        int i3 = ibb2.A02;
        int i4 = ibb2.A01;
        if (Math.abs(A00 - A00(i3, i4)) > 0.019999999552965164d) {
            if ((i - i2) * (i3 - i4) < 0) {
                ibb2 = new IBB(i4, i3);
            }
            float f = i;
            float f2 = ibb2.A01;
            float f3 = ibb2.A02;
            int i5 = (int) (f * (f2 / f3));
            if (i5 > i2) {
                return new IBB((int) (i2 * (f3 / f2)), i2);
            }
            ibb3 = new IBB(i, i5);
        }
        return ibb3;
    }
}
