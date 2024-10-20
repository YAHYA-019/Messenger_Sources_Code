package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: X.9dr, reason: invalid class name */
/* loaded from: 9dr.class */
public abstract class C9dr {
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.0CL] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, X.0CL] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.0Je, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.0CL] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.0CL] */
    public static final 5Vs A00(Object obj, Function1 function1, Function2 function2) {
        if (function1 != null) {
            return (5Vs) ((C0Bd) function1.invoke(AWB.A00)).invoke(function2, obj, null);
        }
        ?? obj2 = new Object();
        ((0CL) obj2).element = function2;
        ?? obj3 = new Object();
        ((0CL) obj3).element = obj;
        ?? obj4 = new Object();
        ArrayList A0s = AnonymousClass001.A0s();
        ((0CL) obj4).element = A0s;
        ?? obj5 = new Object();
        ((0CL) obj5).element = A0s;
        ?? obj6 = new Object();
        A01(C9ee.A00, obj6, obj3, obj2, obj5, obj4);
        return new AI8(obj6, obj3, obj2, obj5, obj4);
    }

    public static final void A01(Object obj, 0Je r302, 0CL r303, 0CL r304, 0CL r305, 0CL r306) {
        if (!(!(obj instanceof C00l))) {
            throw AnonymousClass001.A0L("Actions must be plain objects. Use custom middleware for async \nactions.");
        }
        try {
            r302.element = true;
            r303.element = ((Function2) r304.element).invoke(r303.element, obj);
            r302.element = false;
            Object obj2 = r305.element;
            r306.element = obj2;
            Iterator it = ((List) obj2).iterator();
            while (it.hasNext()) {
                7zL.A1R(it.next());
            }
        } catch (Throwable th) {
            r302.element = false;
            throw th;
        }
    }
}
