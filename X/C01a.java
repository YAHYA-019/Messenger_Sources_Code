package X;

import android.os.Build;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.01a, reason: invalid class name */
/* loaded from: 01a.class */
public class C01a {
    public static C01a A00 = new Object();
    public static C01a A01;
    public static final boolean A02;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.01a, java.lang.Object] */
    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT <= 31) {
            z = true;
        }
        A02 = z;
    }

    public static C01a A00() {
        0Dz r301 = A01;
        if (r301 == null) {
            r301 = A00;
            A01 = r301;
            if (A02) {
                r301 = 0Dz.A05;
                if (r301 == null) {
                    r301 = new 0Dz();
                    0Dz.A05 = r301;
                }
                A01 = r301;
            }
        }
        return r301;
    }

    public Class A01(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public Constructor A02(Class cls, Class... clsArr) {
        try {
            return cls.getConstructor(clsArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public Field A03(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Method A04(Class cls, String str, Class... clsArr) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
            }
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Field[] A05(Class cls) {
        try {
            return cls.getDeclaredFields();
        } catch (Throwable unused) {
            return null;
        }
    }
}
