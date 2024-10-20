package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: F41.class */
public abstract class F41 {
    public static final Field A00;
    public static final Field A01;
    public static final Field A02;
    public static final Field A03;
    public static final Method A04;
    public static final boolean A05;

    static {
        try {
            Class<?> cls = Class.forName("android.graphics.Insets");
            Method method = Drawable.class.getMethod("getOpticalInsets", new Class[0]);
            Field field = cls.getField("left");
            Field field2 = cls.getField("top");
            Field field3 = cls.getField("right");
            Field field4 = cls.getField("bottom");
            A04 = method;
            A01 = field;
            A03 = field2;
            A02 = field3;
            A00 = field4;
            A05 = true;
        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
        }
    }

    public static Rect A00(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29 && A05) {
            try {
                Object invoke = A04.invoke(drawable, AnonymousClass001.A1Z());
                if (invoke != null) {
                    return new Rect(A01.getInt(invoke), A03.getInt(invoke), A02.getInt(invoke), A00.getInt(invoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return C53d.A00;
    }
}
