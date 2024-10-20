package X;

/* renamed from: X.3Xr, reason: invalid class name */
/* loaded from: 3Xr.class */
public final class C3Xr implements 1Wn {
    public int Azm(int i) {
        int i2 = i % 10;
        if (i2 == 0) {
            return 0;
        }
        int i3 = i % 100;
        if (i3 < 11 || i3 > 19) {
            return (i2 != 1 || i3 == 11) ? 5 : 1;
        }
        return 0;
    }
}
