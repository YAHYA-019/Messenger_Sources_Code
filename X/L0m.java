package X;

/* loaded from: L0m.class */
public final class L0m {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public long A06 = Long.MIN_VALUE;
    public long A07 = -1;
    public long A05 = 0;

    public static float A00(L0m l0m, long j) {
        long j2 = l0m.A06;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = l0m.A07;
        if (j3 < 0 || j < j3) {
            float f = ((float) (j - j2)) / l0m.A04;
            int i = LKd.A0G;
            if (f > 1.0f) {
                f = 1.0f;
            } else if (f < 0.0f) {
                f = 0.0f;
            }
            return f * 0.5f;
        }
        long j4 = j - j3;
        float f2 = l0m.A00;
        float f3 = 1.0f - f2;
        float f4 = ((float) j4) / l0m.A02;
        int i2 = LKd.A0G;
        if (f4 > 1.0f) {
            f4 = 1.0f;
        } else if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        return f3 + (f2 * f4);
    }
}
