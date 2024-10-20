package X;

/* renamed from: X.3Y2, reason: invalid class name */
/* loaded from: 3Y2.class */
public final class C3Y2 implements 1Wn {
    public int Azm(int i) {
        int i2;
        int i3 = i % 10;
        int i4 = 4;
        if (i3 == 1) {
            if (i % 100 != 11) {
                i4 = 1;
            }
        } else if (i3 >= 2 && i3 <= 4 && ((i2 = i % 100) < 12 || i2 > 14)) {
            return 3;
        }
        return i4;
    }
}
