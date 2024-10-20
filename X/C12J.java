package X;

import java.lang.reflect.Method;

/* renamed from: X.12J, reason: invalid class name */
/* loaded from: 12J.class */
public abstract class C12J {
    public static final Method A00;
    public static final Method A01;

    static {
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        11T.A0D(methods);
        int length = methods.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            method = null;
            if (i3 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i3];
            if (11T.A0O(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                11T.A0A(parameterTypes);
                if (11T.A0O(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    break;
                }
            }
            i2 = i3 + 1;
        }
        A00 = method2;
        while (true) {
            if (i >= length) {
                break;
            }
            Method method3 = methods[i];
            if (11T.A0O(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i++;
        }
        A01 = method;
    }
}
