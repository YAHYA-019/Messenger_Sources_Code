package X;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* renamed from: X.3ya, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3ya.class */
public abstract class AbstractC03543ya {
    public static final void A00(AlarmManager alarmManager, PendingIntent pendingIntent, C01s c01s, int i, long j) {
        11T.A0F(alarmManager, 1);
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                alarmManager.setExact(i, j, pendingIntent);
                return;
            } catch (SecurityException e) {
                if (!A01(e)) {
                    if (c01s != null) {
                        c01s.Cfy(C0c4.LOGGING, "AlarmManagerCompat", "Error while calling setExact", e);
                        return;
                    }
                    return;
                }
            }
        }
        if (c01s != null) {
            c01s.Cfx(C0c4.LOGGING, "AlarmManagerCompat", "Exceeded retry count for setExact");
        }
    }

    public static final boolean A01(Throwable th) {
        String message;
        boolean z = false;
        if ((th instanceof SecurityException) && (message = th.getMessage()) != null && 0CU.A0T(message, "android.permission.INTERACT_ACROSS_USERS", false)) {
            z = true;
        }
        return z;
    }
}
