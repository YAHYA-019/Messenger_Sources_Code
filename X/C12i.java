package X;

/* renamed from: X.12i, reason: invalid class name */
/* loaded from: 12i.class */
public final class C12i extends C0yr {
    public static final long[] A01;
    public long A00 = -1;

    static {
        long[] jArr = new long[256];
        A01 = jArr;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 256) {
                return;
            }
            long j = i2;
            int i3 = 0;
            do {
                long j2 = j & 1;
                j >>>= 1;
                if (j2 == 1) {
                    j ^= -3932672073523589310L;
                }
                i3++;
            } while (i3 < 8);
            jArr[i2] = j;
            i = i2 + 1;
        }
    }

    public C12i() {
        super.A00 = 8;
    }
}
