package X;

import java.util.HashMap;

/* renamed from: X.3Pj, reason: invalid class name */
/* loaded from: 3Pj.class */
public abstract class C3Pj {
    public static final HashMap A01 = AnonymousClass001.A0u();
    public static final HashMap A00 = AnonymousClass001.A0u();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Class] */
    public static int A00(Class cls, Class cls2) {
        ?? equals;
        if (cls.getCanonicalName() != null && (equals = cls.getCanonicalName().equals("com.facebook.auth.usersession.FbUserSession")) != 0) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader != null) {
                    classLoader.loadClass("com.facebook.auth.usersession.FbUserSession");
                    if (cls2 == null) {
                        equals = classLoader.loadClass("com.facebook.auth.usersession.manager.FbUserSessionForTest");
                    }
                }
            } catch (ClassNotFoundException unused) {
                throw AnonymousClass001.A0U(equals);
            }
        }
        C00s.A00();
        return -1;
    }
}
