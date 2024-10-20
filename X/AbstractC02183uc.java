package X;

import android.app.NotificationManager;
import java.lang.reflect.Method;

/* renamed from: X.3uc, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3uc.class */
public abstract class AbstractC02183uc {
    public static Method A00;
    public static Method A01;

    static {
        try {
            Method method = NotificationManager.class.getMethod("getBubblePreference", new Class[0]);
            11T.A0A(method);
            A01 = method;
            Method method2 = NotificationManager.class.getMethod("areBubblesEnabled", new Class[0]);
            11T.A0A(method2);
            A00 = method2;
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }
}
