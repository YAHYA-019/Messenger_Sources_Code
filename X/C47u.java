package X;

/* renamed from: X.47u, reason: invalid class name */
/* loaded from: 47u.class */
public abstract class C47u {
    public static final long A00(int i, int i2) {
        return (i2 & 4294967295L) | ((i << 32) & (-4294967296L));
    }

    public static final long A01(long j, long j2, long j3) {
        if (j2 > 0) {
            long j4 = j - j2;
            if (0 <= j4 && j4 < 2001) {
                return j2;
            }
        }
        if (j3 > 0) {
            long j5 = j - j3;
            if (0 <= j5 && j5 < 2001) {
                return j3;
            }
        }
        return -1;
    }
}
