package X;

/* renamed from: X.3Y0, reason: invalid class name */
/* loaded from: 3Y0.class */
public final class C3Y0 implements 1Wn {
    public int Azm(int i) {
        int i2 = i % 10;
        if (i2 == 1) {
            int i3 = i % 100;
            return (i3 < 11 || i3 > 19) ? 1 : 5;
        }
        if (i2 < 2 || i2 > 9) {
            return 5;
        }
        int i4 = i % 100;
        return (i4 < 11 || i4 > 19) ? 3 : 5;
    }
}
