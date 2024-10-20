package X;

/* loaded from: L5v.class */
public abstract class L5v {
    public static float A00(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float A01(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int A02(float f, int i, int i2) {
        if (i == i2 || f <= 0.0f) {
            return i;
        }
        if (f >= 1.0f) {
            return i2;
        }
        float A00 = A00(((i >> 16) & 255) / 255.0f);
        float A002 = A00(((i >> 8) & 255) / 255.0f);
        float A003 = A00((i & 255) / 255.0f);
        float A004 = A00(((i2 >> 16) & 255) / 255.0f);
        float A005 = A00(((i2 >> 8) & 255) / 255.0f);
        float A006 = A00((i2 & 255) / 255.0f);
        float A01 = GOn.A01(((i2 >> 24) & 255) / 255.0f, ((i >> 24) & 255) / 255.0f, f);
        float A012 = GOn.A01(A004, A00, f);
        float A013 = GOn.A01(A005, A002, f);
        float A02 = JQx.A02(A006, A003, f);
        float f2 = A01 * 255.0f;
        return (Math.round(A01(A012) * 255.0f) << 16) | (Math.round(f2) << 24) | (Math.round(A01(A013) * 255.0f) << 8) | Math.round(A01(A02) * 255.0f);
    }
}
