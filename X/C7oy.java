package X;

import java.lang.reflect.Constructor;

/* renamed from: X.7oy, reason: invalid class name */
/* loaded from: 7oy.class */
public final class C7oy {
    public static C7oy A01;
    public Constructor A00;

    public C7oy() {
        try {
            Constructor<?> constructor = Class.forName("android.app.RemoteServiceException").getConstructor(String.class);
            this.A00 = constructor;
            constructor.setAccessible(true);
        } catch (Throwable unused) {
            this.A00 = null;
        }
    }
}
