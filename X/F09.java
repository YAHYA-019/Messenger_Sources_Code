package X;

/* loaded from: F09.class */
public abstract class F09 {
    public static float A00(DLQ dlq, float f, int i) {
        return A01(dlq.getString(i), 0.0f, f);
    }

    public static final float A01(String str, float f, float f2) {
        if (str != null) {
            if (!DKC.A1Z(str)) {
                return FIy.A01(str);
            }
            f = FIy.A00(str) * 0.01f * f2;
        }
        return f;
    }
}
