package X;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Method;

/* renamed from: X.53m, reason: invalid class name */
/* loaded from: 53m.class */
public abstract class C53m {
    public static Method A00;
    public static boolean A01;

    public static void A00(Rect rect, Rect rect2, View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            KTk.A00(rect, rect2, view);
            return;
        }
        if (!A01) {
            A01 = true;
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                A00 = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    A00.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
                android.util.Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
        Method method = A00;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e) {
                android.util.Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }
}
