package X;

import android.app.NotificationManager;

/* renamed from: X.3ub, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3ub.class */
public abstract class AbstractC02173ub {
    public static final int A00(NotificationManager notificationManager) {
        try {
            Object invoke = AbstractC02183uc.A01.invoke(notificationManager, new Object[0]);
            11T.A0I(invoke, "null cannot be cast to non-null type kotlin.Int");
            return ((Number) invoke).intValue();
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    public static final boolean A01(NotificationManager notificationManager) {
        try {
            Object invoke = AbstractC02183uc.A00.invoke(notificationManager, new Object[0]);
            11T.A0I(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            return ((Boolean) invoke).booleanValue();
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }
}
