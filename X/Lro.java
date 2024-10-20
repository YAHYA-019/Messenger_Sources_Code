package X;

import com.google.common.collect.ImmutableMap;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* loaded from: Lro.class */
public final class Lro implements InvocationHandler {
    public static final ImmutableMap A01;
    public final KtI A00;

    static {
        ImmutableMap.Builder A0c = 1BK.A0c();
        Method[] methods = KtI.class.getMethods();
        int length = methods.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                A01 = A0c.buildKeepingLast();
                return;
            }
            Method method = methods[i2];
            if (method.getDeclaringClass().equals(KtI.class)) {
                try {
                    method.setAccessible(true);
                } catch (AccessControlException unused) {
                }
                A0c.put(method.getName(), method);
            }
            i = i2 + 1;
        }
    }

    public Lro(KtI ktI) {
        this.A00 = ktI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Throwable] */
    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Method method2 = (Method) A01.get(name);
        ?? r0 = method2;
        if (r0 == 0) {
            throw AnonymousClass001.A0q(name);
        }
        try {
            r0 = method2.invoke(this.A00, objArr);
            return r0;
        } catch (InvocationTargetException unused) {
            throw r0.getCause();
        }
    }
}
