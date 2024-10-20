package X;

/* renamed from: X.9mj, reason: invalid class name */
/* loaded from: 9mj.class */
public abstract class C9mj {
    public static final C8qt A00(1Iw r301, C1J8 c1j8, int i, int i2, boolean z) {
        return new C8qt(r301, c1j8, (-1) << (-1), i, i2, z);
    }

    public static final C8qs A01(1Iw r301, C1J8 c1j8, int i, boolean z) {
        return A05(r301, c1j8, null, 0S2.A00, 0, (-1) << (-1), i, false, z);
    }

    public static final C8qs A02(1Iw r301, C1J8 c1j8, int i, boolean z) {
        return A05(r301, c1j8, null, 0S2.A00, 1, (-1) << (-1), i, false, z);
    }

    public static final C8qs A03(1Iw r301, C1J8 c1j8, int i, boolean z) {
        return A05(r301, c1j8, null, 0S2.A00, 1, (-1) << (-1), i, true, z);
    }

    public static final C8qs A04(1Iw r301, C1J8 c1j8, int i, boolean z) {
        return A05(r301, c1j8, null, 0S2.A01, 0, (-1) << (-1), i, false, z);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.8qs] */
    public static final C8qs A05(final 1Iw r301, final C1J8 c1j8, final Float f, Integer num, final int i, final int i2, final int i3, final boolean z, final boolean z2) {
        boolean z3;
        int intValue = num.intValue();
        switch (intValue) {
            case 2:
                z3 = true;
                break;
            default:
                z3 = false;
                break;
        }
        final boolean z4 = z3;
        final boolean z5 = intValue != 0;
        return new 9QL(r301, c1j8, f, i, z, z2, z4, z5) { // from class: X.8qs
        };
    }
}
