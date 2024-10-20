package X;

/* renamed from: X.3x8, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3x8.class */
public final class C03143x8 implements 1Wn {
    public int Azm(int i) {
        int i2 = 3;
        if (i == 0) {
            i2 = 0;
        } else {
            if (i == 1) {
                return 1;
            }
            if (i == 2) {
                return 2;
            }
            int i3 = i % 100;
            if (i3 < 3) {
                return 5;
            }
            if (i3 > 10) {
                i2 = 4;
                if (i3 > 99) {
                    return 5;
                }
            }
        }
        return i2;
    }
}
