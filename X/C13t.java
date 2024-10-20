package X;

/* renamed from: X.13t, reason: invalid class name */
/* loaded from: 13t.class */
public abstract class C13t {
    public static final double A00(int i) {
        return (((-1) >>> 1) & i) + (((i >>> 31) << 30) * 2.0d);
    }

    public static final String A01(long j, int i) {
        if (j >= 0) {
            String l = Long.toString(j, i);
            11T.A0A(l);
            return l;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        String l2 = Long.toString(j3, i);
        11T.A0A(l2);
        String l3 = Long.toString(j4, i);
        11T.A0A(l3);
        return 0Pz.A0W(l2, l3);
    }
}
