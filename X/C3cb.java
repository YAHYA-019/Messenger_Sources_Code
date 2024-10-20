package X;

import java.lang.reflect.Method;

/* renamed from: X.3cb, reason: invalid class name */
/* loaded from: 3cb.class */
public final class C3cb implements 2Al {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C3cb(Object obj, Method method, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A02 = method;
            this.A01 = obj;
        } else {
            this.A01 = method;
            this.A02 = obj;
        }
    }
}
