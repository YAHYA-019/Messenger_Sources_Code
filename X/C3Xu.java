package X;

/* renamed from: X.3Xu, reason: invalid class name */
/* loaded from: 3Xu.class */
public final class C3Xu implements 1Wn {
    public int Azm(int i) {
        int i2 = i % 10;
        if (i2 == 1) {
            return i % 100 != 11 ? 1 : 5;
        }
        if (i2 < 2 || i2 > 4) {
            return 5;
        }
        int i3 = i % 100;
        return (i3 < 12 || i3 > 14) ? 3 : 5;
    }
}
