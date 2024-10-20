package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;

/* renamed from: X.24p, reason: invalid class name */
/* loaded from: 24p.class */
public class C24p extends C24n implements Serializable {
    public static final AnonymousClass251 A00;
    public static final AnonymousClass251 A01;
    public static final AnonymousClass251 A02;
    public static final AnonymousClass251 A03;
    public static final AnonymousClass251 A04 = new AnonymousClass251(C24b.A02(String.class), null, new C24q(String.class), Collections.emptyList());
    public static final long serialVersionUID = 2;

    static {
        Class cls = Boolean.TYPE;
        A00 = new AnonymousClass251(C24b.A02(cls), null, new C24q(cls), Collections.emptyList());
        Class cls2 = Integer.TYPE;
        A01 = new AnonymousClass251(C24b.A02(cls2), null, new C24q(cls2), Collections.emptyList());
        Class cls3 = Long.TYPE;
        A02 = new AnonymousClass251(C24b.A02(cls3), null, new C24q(cls3), Collections.emptyList());
        A03 = new AnonymousClass251(C24b.A02(Object.class), null, new C24q(Object.class), Collections.emptyList());
    }

    public static AnonymousClass251 A00(24S r301, AnonymousClass253 anonymousClass253) {
        if (!r301.A0Q() || r301.A0O()) {
            return null;
        }
        Class cls = r301._class;
        if (!27C.A0K(cls)) {
            return null;
        }
        if (Collection.class.isAssignableFrom(cls) || java.util.Map.class.isAssignableFrom(cls)) {
            return new AnonymousClass251(r301, anonymousClass253, C67f.A00(r301, anonymousClass253, anonymousClass253), Collections.emptyList());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ab A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.AnonymousClass251 A01(X.24S r301, X.AnonymousClass253 r302) {
        /*
            r0 = r301
            java.lang.Class r0 = r0._class
            r303 = r0
            r0 = r303
            boolean r0 = r0.isPrimitive()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L33
            java.lang.Class r0 = java.lang.Integer.TYPE
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 == r1) goto L77
            java.lang.Class r0 = java.lang.Long.TYPE
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 == r1) goto L73
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r305 = r0
        L29:
            r0 = r303
            r1 = r305
            if (r0 != r1) goto Lab
            X.251 r0 = X.C24p.A00
            return r0
        L33:
            r0 = r303
            boolean r0 = X.27C.A0K(r0)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L7b
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 != r1) goto L4a
            X.251 r0 = X.C24p.A03
            return r0
        L4a:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 != r1) goto L58
            X.251 r0 = X.C24p.A04
            return r0
        L58:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 == r1) goto L77
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 == r1) goto L73
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            r305 = r0
            goto L29
        L73:
            X.251 r0 = X.C24p.A02
            return r0
        L77:
            X.251 r0 = X.C24p.A01
            return r0
        L7b:
            java.lang.Class<X.24X> r0 = X.24X.class
            r305 = r0
            r0 = r305
            r1 = r303
            boolean r0 = r0.isAssignableFrom(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto Lab
            X.24q r0 = new X.24q
            r306 = r0
            r0 = r306
            r1 = r303
            r0.<init>(r1)
            java.util.List r0 = java.util.Collections.emptyList()
            r303 = r0
            X.251 r0 = new X.251
            r305 = r0
            r0 = r305
            r1 = r301
            r2 = r302
            r3 = r306
            r4 = r303
            r0.<init>(r1, r2, r3, r4)
            r0 = r305
            return r0
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24p.A01(X.24S, X.253):X.251");
    }

    public static C00963pY A02(24S r301, AnonymousClass253 anonymousClass253, C24z c24z, boolean z) {
        3BW c67h;
        C24q A002 = C67f.A00(r301, anonymousClass253, c24z);
        boolean A0S = r301.A0S();
        C24l c24l = anonymousClass253._base._accessorNaming;
        if (A0S) {
            c67h = new 3BW(anonymousClass253, A002);
        } else {
            C24k c24k = (C24k) c24l;
            c67h = new C67h(anonymousClass253, A002, c24k._setterPrefix, c24k._getterPrefix, c24k._isGetterPrefix);
        }
        return new C00963pY(r301, anonymousClass253, c67h, A002, z);
    }

    public AnonymousClass251 A04(C26L c26l, 24S r303, C24z c24z) {
        AnonymousClass251 A012 = A01(r303, c26l);
        if (A012 == null) {
            A012 = A00(r303, c26l);
            if (A012 == null) {
                A012 = new AnonymousClass251(A02(r303, c26l, c24z, false));
            }
        }
        return A012;
    }

    public AnonymousClass251 A05(24S r302, C25p c25p, C24z c24z) {
        AnonymousClass251 A012 = A01(r302, c25p);
        if (A012 == null) {
            A012 = A00(r302, c25p);
            if (A012 == null) {
                A012 = new AnonymousClass251(A02(r302, c25p, c24z, true));
            }
        }
        return A012;
    }

    public AnonymousClass251 A06(24S r302, AnonymousClass253 anonymousClass253, C24z c24z) {
        AnonymousClass251 A012 = A01(r302, anonymousClass253);
        if (A012 == null) {
            A012 = new AnonymousClass251(r302, anonymousClass253, (r302.A0O() && anonymousClass253.ASt(r302._class) == null) ? new C24q(r302._class) : C67f.A02(new C67f(r302, anonymousClass253, c24z)), Collections.emptyList());
        }
        return A012;
    }
}
