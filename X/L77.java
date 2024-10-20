package X;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: L77.class */
public abstract class L77 {
    public static Method A00;
    public static Method A01;
    public static Method A02;
    public static boolean A03;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v29 */
    static {
        ?? r0 = "positionSelector";
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            A00 = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            A02 = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            A01 = declaredMethod3;
            declaredMethod3.setAccessible(true);
            r0 = 1;
            A03 = true;
        } catch (NoSuchMethodException unused) {
            r0.printStackTrace();
        }
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Throwable, java.lang.Object] */
    public static void A00(View view, JZO jzo, int i) {
        ?? invoke;
        try {
            Method method = A00;
            Integer valueOf = Integer.valueOf(i);
            Integer A0h = 7zN.A0h();
            method.invoke(jzo, valueOf, view, false, A0h, A0h);
            A02.invoke(jzo, valueOf);
            invoke = A01.invoke(jzo, valueOf);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            invoke.printStackTrace();
        }
    }

    public static boolean A01() {
        return A03;
    }
}
