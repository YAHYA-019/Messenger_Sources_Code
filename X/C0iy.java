package X;

import java.util.AbstractMap;

/* renamed from: X.0iy, reason: invalid class name */
/* loaded from: 0iy.class */
public abstract class C0iy {
    public static C0iu A00;

    /* JADX WARN: Type inference failed for: r301v2, types: [java.lang.Object, X.0iu] */
    public static C0iu A00() {
        C0iu c0iu = A00;
        C0iu c0iu2 = c0iu;
        if (c0iu == null) {
            ?? obj = new Object();
            A00 = obj;
            c0iu2 = obj;
        }
        return c0iu2;
    }

    public static C0iu A01(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return A00();
    }

    public static C0iu A02(String str, String str2, Throwable th) {
        0fH.A0u(str, str2, th);
        return A00();
    }
}
