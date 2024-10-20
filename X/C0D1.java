package X;

import java.lang.reflect.Field;

/* renamed from: X.0D1, reason: invalid class name */
/* loaded from: 0D1.class */
public abstract class C0D1 {
    public static boolean A00(06Z r301) {
        if (!(r301 instanceof 06Y)) {
            return false;
        }
        try {
            Field declaredField = 06Z.class.getDeclaredField("mExecutingActions");
            declaredField.setAccessible(true);
            return ((Boolean) declaredField.get(r301)).booleanValue();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return false;
        }
    }

    public static boolean A01(06Z r301) {
        boolean z = false;
        if ((r301 instanceof 06Y) && !r301.A1U() && !r301.A0B) {
            z = true;
        }
        return z;
    }
}
