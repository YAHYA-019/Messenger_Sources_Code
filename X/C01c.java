package X;

import android.os.SystemClock;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.01c, reason: invalid class name */
/* loaded from: 01c.class */
public final class C01c implements InvocationHandler {
    public final Object A00;
    public final Object A01;
    public final String A02;

    public C01c(Class cls, Object obj, String str, boolean z) {
        this.A02 = str;
        this.A01 = obj;
        this.A00 = Proxy.newProxyInstance(C01c.class.getClassLoader(), new Class[]{cls}, this);
        if (z) {
            01Q.A02.add(str);
        }
    }

    public AnonymousClass028 A00(Method method, Object[] objArr) {
        Object obj;
        try {
            return new AnonymousClass028(A01(method, objArr));
        } catch (Throwable unused) {
            int i = 0;
            if (method.getReturnType() == Boolean.TYPE) {
                obj = false;
            } else {
                if (method.getReturnType() == Integer.TYPE) {
                    i = -1;
                } else if (method.getReturnType() != Long.TYPE) {
                    obj = null;
                }
                obj = Integer.valueOf(i);
            }
            return new AnonymousClass028(obj);
        }
    }

    public Object A01(Method method, Object[] objArr) {
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Object invoke = method.invoke(this.A01, objArr);
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            List list = 01Q.A00;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((01H) it.next()).Bwx(invoke, this.A02, method, objArr, elapsedRealtime2 - elapsedRealtime);
                }
            }
            return invoke;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause() != null ? e.getCause() : e.getTargetException();
            if (cause != null) {
                throw cause;
            }
            throw e;
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        List list = 01Q.A00;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass028 Aal = ((01H) it.next()).Aal(this, this.A02, method, objArr);
                if (Aal != null) {
                    return Aal.A00;
                }
            }
        }
        return A01(method, objArr);
    }
}
