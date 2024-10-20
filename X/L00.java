package X;

/* loaded from: L00.class */
public final class L00 {
    public final int A00;
    public final long[] A01;
    public final Object[] A02;

    public L00(long[] jArr, Object[] objArr, int i) {
        this.A00 = i;
        this.A01 = jArr;
        this.A02 = objArr;
    }

    public static final int A00(L00 l00, long j) {
        int i = l00.A00 - 1;
        int i2 = -1;
        if (i != -1) {
            int i3 = 0;
            if (i != 0) {
                while (i3 <= i) {
                    i2 = (i3 + i) >>> 1;
                    long j2 = l00.A01[i2] - j;
                    if (j2 < 0) {
                        i3 = i2 + 1;
                    } else if (j2 > 0) {
                        i = i2 - 1;
                    }
                }
                return -(i3 + 1);
            }
            long j3 = l00.A01[0];
            if (j3 == j) {
                i2 = 0;
            } else if (j3 > j) {
                return -2;
            }
        }
        return i2;
    }
}
