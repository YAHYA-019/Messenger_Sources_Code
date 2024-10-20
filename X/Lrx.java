package X;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: Lrx.class */
public final class Lrx implements PrivilegedExceptionAction {
    @Override // java.security.PrivilegedExceptionAction
    public /* bridge */ /* synthetic */ Object run() {
        Object obj;
        Field[] declaredFields = Unsafe.class.getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            int i2 = i;
            obj = null;
            if (i2 >= length) {
                break;
            }
            Field field = declaredFields[i2];
            field.setAccessible(true);
            Object obj2 = field.get(null);
            if (Unsafe.class.isInstance(obj2)) {
                obj = Unsafe.class.cast(obj2);
                break;
            }
            i = i2 + 1;
        }
        return obj;
    }
}
