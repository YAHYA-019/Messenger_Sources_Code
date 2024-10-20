package X;

import kotlin.jvm.functions.Function2;

/* renamed from: X.0z8, reason: invalid class name */
/* loaded from: 0z8.class */
public abstract class C0z8 {
    public static final Object A00(Object obj, Object obj2, 0DR r303, 0DE r304, Function2 function2) {
        Object invoke;
        Object A00 = C2as.A00(obj2, r304);
        try {
            12B r0 = new 12B(r303, r304);
            if (function2 instanceof 0DQ) {
                C0B7.A04(function2, 2);
                invoke = function2.invoke(obj, r0);
            } else {
                invoke = 0DT.A00(obj, r0, function2);
            }
            C2as.A02(A00, r304);
            return invoke;
        } catch (Throwable th) {
            C2as.A02(A00, r304);
            throw th;
        }
    }
}
