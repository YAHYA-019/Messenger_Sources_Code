package X;

/* loaded from: Hv8.class */
public abstract class Hv8 {
    public static I5B A00(I5B i5b, int i, int i2) {
        float f = i5b.A00;
        float f2 = i5b.A01;
        int i3 = (int) (i * (f / f2));
        return i3 <= i2 ? I5B.A00(i, i3) : I5B.A00((int) (i2 * (f2 / f)), i2);
    }

    public static I5B A01(I5B i5b, I5B i5b2) {
        double d;
        double d2;
        I5B i5b3 = null;
        int i = i5b.A01;
        int i2 = i5b.A00;
        if (i == 0 || i2 == 0) {
            d = 0.0d;
        } else {
            d = Math.max(i, i2) / Math.min(i, i2);
        }
        int i3 = i5b2.A01;
        int i4 = i5b2.A00;
        if (i3 == 0 || i4 == 0) {
            d2 = 0.0d;
        } else {
            d2 = Math.max(i3, i4) / Math.min(i3, i4);
        }
        if (Math.abs(d - d2) > 0.019999999552965164d) {
            if ((i - i2) * (i3 - i4) < 0) {
                i5b2 = I5B.A00(i4, i3);
            }
            i5b3 = A00(i5b2, i, i2);
        }
        return i5b3;
    }
}
