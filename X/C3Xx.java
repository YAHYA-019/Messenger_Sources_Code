package X;

/* renamed from: X.3Xx, reason: invalid class name */
/* loaded from: 3Xx.class */
public final class C3Xx implements 1Wn {
    public int Azm(int i) {
        int i2 = 2;
        if (i == 1) {
            i2 = 1;
        } else if (i != 2) {
            if (i >= 0 && i <= 10) {
                return 5;
            }
            i2 = 4;
            if (i % 10 != 0) {
                return 5;
            }
        }
        return i2;
    }
}
