package X;

import java.lang.reflect.Method;

/* renamed from: X.0Bx, reason: invalid class name */
/* loaded from: 0Bx.class */
public abstract class C0Bx {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        if (r304 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String A00(java.lang.Class r301) {
        /*
            r0 = r301
            boolean r0 = r0.isAnonymousClass()
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r302
            if (r0 != 0) goto L56
            r0 = r301
            boolean r0 = r0.isLocalClass()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L56
            r0 = r301
            boolean r0 = r0.isArray()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L58
            r0 = r301
            java.lang.Class r0 = r0.getComponentType()
            r301 = r0
            r0 = r301
            boolean r0 = r0.isPrimitive()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L53
            java.util.HashMap r0 = X.0BY.A01
            r305 = r0
            r0 = r301
            java.lang.String r0 = r0.getName()
            r304 = r0
            r0 = r305
            r1 = r304
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L53
            r0 = r305
            java.lang.String r1 = "Array"
            java.lang.String r0 = X.0Pz.A0W(r0, r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L56
        L53:
            java.lang.String r0 = "kotlin.Array"
            r304 = r0
        L56:
            r0 = r304
            return r0
        L58:
            java.util.HashMap r0 = X.0BY.A01
            r305 = r0
            r0 = r301
            java.lang.String r0 = r0.getName()
            r304 = r0
            r0 = r305
            r1 = r304
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L56
            r0 = r301
            java.lang.String r0 = r0.getCanonicalName()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Bx.A00(java.lang.Class):java.lang.String");
    }

    public static final String A01(Class cls) {
        String str = "Array";
        String str2 = null;
        if (!cls.isAnonymousClass()) {
            if (cls.isLocalClass()) {
                str2 = cls.getSimpleName();
                Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod == null) {
                    enclosingMethod = cls.getEnclosingConstructor();
                    if (enclosingMethod == null) {
                        11T.A0D(str2);
                        11T.A0F(str2, 0);
                        int A00 = 0CU.A00(str2, '$', 0);
                        if (A00 != -1) {
                            str2 = str2.substring(A00 + 1, str2.length());
                            11T.A0A(str2);
                        }
                    }
                }
                11T.A0D(str2);
                return 0CU.A0G(str2, 0Pz.A0J(enclosingMethod.getName(), '$'), str2);
            }
            if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive()) {
                    String A0b = AnonymousClass001.A0b(componentType.getName(), 0BY.A03);
                    if (A0b != null) {
                        str2 = 0Pz.A0W(A0b, str);
                        if (str2 == null) {
                            return str;
                        }
                    }
                }
            } else {
                str = (String) 0BY.A03.get(cls.getName());
                if (str == null) {
                    return cls.getSimpleName();
                }
            }
            return str;
        }
        return str2;
    }
}
