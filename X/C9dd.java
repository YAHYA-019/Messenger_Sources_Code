package X;

import kotlin.jvm.functions.Function1;

/* renamed from: X.9dd, reason: invalid class name */
/* loaded from: 9dd.class */
public abstract class C9dd {
    public static final void A00(9Lf r301, Function1 function1, 0Je r303, 0CL r304, 0CL r305) {
        if (r303.element) {
            return;
        }
        7zP.A1U((C2a2) r304.element);
        C00m c00m = (C00m) r305.element;
        if (c00m != null) {
            c00m.invoke();
        }
        r303.element = true;
        function1.invoke(r301);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, X.0CL] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, X.0CL] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0Je, java.lang.Object] */
    public static final void A01(String str, Function1 function1, Function1 function12, Function1 function13, long j) {
        9Lf anonymousClass915;
        11T.A0F(str, 0);
        if (j != Long.MIN_VALUE && j <= 0) {
            throw AnonymousClass001.A0N(AnonymousClass001.A0h(AnonymousClass001.A0n("timeout must be a positive value or NEVER_TIME_OUT: "), j));
        }
        ?? obj = new Object();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        5Vt A00 = C9lt.A00(str);
        if (11T.A0O(A00, C9lt.A01)) {
            anonymousClass915 = new 9Lf() { // from class: X.917
            };
        } else {
            if (!7zR.A1a(A00.getState(), function12)) {
                ((0CL) obj2).element = A00.A00(new A30(new ARb(4, obj, function12, function13, obj2, A00, obj3), 2), new JBV(function1, 3), true);
                if (j != Long.MIN_VALUE) {
                    ((0CL) obj3).element = 2aK.A03((Integer) null, (0DE) null, new AJR(function12, (Object) obj3, A00, (Object) obj, function13, (Object) obj2, str, (0DR) null, 3, j), 2aG.A02(new C2a0(null)), 3);
                    return;
                }
                return;
            }
            anonymousClass915 = new AnonymousClass915(A00);
        }
        A00(anonymousClass915, function13, obj, obj3, obj2);
    }
}
