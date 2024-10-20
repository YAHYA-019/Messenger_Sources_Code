package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* loaded from: Kwo.class */
public final class Kwo {
    public static Object A00(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(Kwo.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
