package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;

/* loaded from: J4e.class */
public final class J4e implements InvocationHandler {
    public final Function1 A00;
    public final 0BZ A01;

    public J4e(Function1 function1, 0BZ r303) {
        this.A01 = r303;
        this.A00 = function1;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        boolean A1X = 1BL.A1X(obj, method);
        boolean z = true;
        if (!11T.A0O(method.getName(), "accept") || objArr == null || objArr.length != A1X) {
            z = false;
        }
        Object obj2 = null;
        boolean z2 = false;
        if (z) {
            0BZ r0 = this.A01;
            if (objArr != null) {
                obj2 = objArr[0];
            }
            C10c.A00(obj2, r0);
            11T.A0F(obj2, 0);
            this.A00.invoke(obj2);
            return 04S.A00;
        }
        if (11T.A0O(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == A1X) {
            if (obj == objArr[0]) {
                z2 = true;
            }
            return Boolean.valueOf(z2);
        }
        if (11T.A0O(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return 1BK.A0j(this.A00);
        }
        if (11T.A0O(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
            return this.A00.toString();
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Unexpected method call object:");
        A0k.append(obj);
        A0k.append(", method: ");
        A0k.append(method);
        throw AnonymousClass001.A0q(AnonymousClass001.A0Z(objArr, ", args: ", A0k));
    }
}
