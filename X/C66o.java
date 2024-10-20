package X;

/* renamed from: X.66o, reason: invalid class name */
/* loaded from: 66o.class */
public abstract class C66o {
    public static final C5em A00(5SA r301) {
        if (r301 == null) {
            return null;
        }
        float f = r301.A00;
        if (f <= 0.0f) {
            return null;
        }
        return new C5em(f, r301.A01, r301.A02, r301.A06);
    }

    public static final 5BK A01(5SA r301) {
        5BK r302 = null;
        if (r301 != null) {
            if (r301.A05) {
                r302 = 5BK.A06;
            } else {
                float[] fArr = r301.A07;
                if (fArr != null) {
                    return 5BJ.A02(fArr, true);
                }
            }
        }
        return r302;
    }
}
