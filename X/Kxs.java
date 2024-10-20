package X;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: Kxs.class */
public abstract class Kxs {
    public static final Kxs A00;

    static {
        Kxs kDp;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            new KDr(declaredField.get(null), cls.getMethod("allocateInstance", Class.class));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                int A09 = GOn.A09(declaredMethod.invoke(null, Object.class));
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                new KDs(A09, declaredMethod2);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    new KDq(declaredMethod3);
                } catch (Exception unused3) {
                    kDp = new KDp();
                }
            }
        }
        A00 = kDp;
    }

    public static void A00(Class cls) {
        String A002 = L2z.A00(cls);
        if (A002 != null) {
            throw AnonymousClass001.A0J(0Pz.A0W("UnsafeAllocator is used for non-instantiable type: ", A002));
        }
    }
}
