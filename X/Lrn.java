package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: Lrn.class */
public final class Lrn implements InvocationHandler {
    public final Object A00;

    public Lrn(Object obj) {
        this.A00 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.ClassLoader] */
    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2 = this.A00;
        InvocationTargetException A0e = 4YV.A0e(obj2);
        try {
            A0e = Class.forName(method.getDeclaringClass().getName(), true, A0e).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(obj2, objArr);
            return A0e;
        } catch (InvocationTargetException unused) {
            throw A0e.getTargetException();
        } catch (ReflectiveOperationException e) {
            throw 1BK.A0s(AnonymousClass001.A0Z(method, "Reflection failed for method ", AnonymousClass001.A0k()), e);
        }
    }
}
