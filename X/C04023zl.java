package X;

import java.util.LinkedHashMap;

/* renamed from: X.3zl, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3zl.class */
public final class C04023zl {
    public final java.util.Map A00 = new LinkedHashMap();

    public static final String A00(C04023zl c04023zl, String str, boolean z, boolean z2) {
        String A0M;
        synchronized (c04023zl) {
            11T.A0F(str, 0);
            String A0W = z ? 0Pz.A0W(str, "_start") : z2 ? 0Pz.A0W(str, "_end") : str;
            int i = 0;
            11T.A0F(A0W, 0);
            java.util.Map map = c04023zl.A00;
            Integer num = (Integer) map.get(A0W);
            A0M = 0Pz.A0M(str, '_', num != null ? num.intValue() : 0);
            Integer num2 = (Integer) map.get(A0W);
            if (num2 != null) {
                i = num2.intValue();
            }
            map.put(A0W, Integer.valueOf(i + 1));
            if (z) {
                A0M = 0Pz.A0W(A0M, "_start");
            } else if (z2) {
                A0M = 0Pz.A0W(A0M, "_end");
            }
        }
        return A0M;
    }
}
