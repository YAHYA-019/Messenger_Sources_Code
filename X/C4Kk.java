package X;

/* renamed from: X.4Kk, reason: invalid class name */
/* loaded from: 4Kk.class */
public abstract class C4Kk {
    public static final long A00(Integer num, int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2) {
        long j7;
        if (j6 == Long.MAX_VALUE || !z2) {
            if (z) {
                long scalb = num == 0S2.A01 ? i * j : Math.scalb((float) j, i - 1);
                if (scalb > 18000000) {
                    scalb = 18000000;
                }
                return j2 + scalb;
            }
            if (!z2) {
                if (j2 != -1) {
                    return j2 + j3;
                }
                return Long.MAX_VALUE;
            }
            j7 = i2 == 0 ? j2 + j3 : j2 + j5;
            if (j4 != j5 && i2 == 0) {
                j7 += j5 - j4;
            }
        } else {
            if (i2 == 0) {
                return j6;
            }
            long j8 = 900000 + j2;
            j7 = j6;
            if (j6 < j8) {
                return j8;
            }
        }
        return j7;
    }
}
