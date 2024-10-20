package X;

import kotlin.jvm.functions.Function2;

/* renamed from: X.4G4, reason: invalid class name */
/* loaded from: 4G4.class */
public abstract class C4G4 {
    public static final Object A00(Object obj, Function2 function2, C44j c44j) {
        Object c2s6;
        Object A0C;
        try {
            if (function2 instanceof 0DQ) {
                C0B7.A04(function2, 2);
                c2s6 = function2.invoke(obj, c44j);
            } else {
                c2s6 = 0DT.A00(obj, c44j, function2);
            }
        } catch (Throwable th) {
            c2s6 = new C2s6(th, false);
        }
        Object obj2 = 0Ds.A02;
        if (c2s6 != obj2 && (A0C = c44j.A0C(c2s6)) != C2a4.A04) {
            if (A0C instanceof C2s6) {
                throw ((C2s6) A0C).A00;
            }
            obj2 = C2a4.A00(A0C);
        }
        return obj2;
    }
}
