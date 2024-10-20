package X;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;

/* renamed from: X.7ki, reason: invalid class name */
/* loaded from: 7ki.class */
public abstract class C7ki {
    public static final boolean A00(Notification notification, NotificationChannel notificationChannel, NotificationManager notificationManager) {
        int A00 = AbstractC02173ub.A00(notificationManager);
        if (A00 == 0) {
            return false;
        }
        if (A00 == 1) {
            return C7st.A00(notification, notificationChannel);
        }
        if (A00 == 2) {
            return C7st.A01(notification, notificationChannel);
        }
        throw 0Pz.A04("Unexpected bubble preference value: ", A00);
    }
}
