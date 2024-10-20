package X;

import android.os.DVFSHelper;
import java.lang.reflect.Method;

/* renamed from: X.3vx, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3vx.class */
public final class C02703vx {
    public static 2LZ A00;
    public static 2Lb A01;
    public static 2Lb A02;

    static {
        2LZ r0 = new 2LZ("android.os.DVFSHelper");
        A00 = r0;
        Class cls = Boolean.TYPE;
        A01 = r0.A02("onScrollEvent", new Class[]{cls});
        A02 = A00.A03("onSmoothScrollEvent", new Class[]{cls});
    }

    public static void A00(boolean z) {
        if (A00.A03) {
            DVFSHelper.onScrollEvent(z);
            return;
        }
        2Lb r0 = A01;
        Object[] objArr = {Boolean.valueOf(z)};
        Method method = r0.A00;
        if (method != null) {
            try {
                method.invoke(null, objArr);
            } catch (Exception unused) {
            }
        }
    }

    public static void A01(boolean z) {
        if (A00.A03) {
            DVFSHelper.onSmoothScrollEvent(z);
            return;
        }
        2Lb r0 = A02;
        Object[] objArr = {Boolean.valueOf(z)};
        Method method = r0.A00;
        if (method != null) {
            try {
                method.invoke(null, objArr);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean A02() {
        return AnonymousClass001.A1T(A02.A00);
    }

    public static boolean A03() {
        return A00.A05((ClassLoader) null);
    }
}
