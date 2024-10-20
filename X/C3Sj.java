package X;

import android.content.res.Resources;
import java.lang.reflect.Method;

/* renamed from: X.3Sj, reason: invalid class name */
/* loaded from: 3Sj.class */
public final class C3Sj {
    public static Method A00;
    public static boolean A01;
    public static final C3Sj A02 = new Object();

    public static final void A00(Resources resources) {
        if (!A01) {
            try {
                Method declaredMethod = Class.forName("androidx.appcompat.app.ResourcesFlusher").getDeclaredMethod("flushNougats", Resources.class);
                declaredMethod.setAccessible(true);
                A00 = declaredMethod;
            } catch (Throwable unused) {
            }
            A01 = true;
        }
        Method method = A00;
        if (method != null) {
            try {
                method.invoke(null, resources);
            } catch (Throwable unused2) {
            }
        }
    }
}
