package X;

import com.facebook.notifications.constants.push.NotificationType;

/* renamed from: X.7le, reason: invalid class name */
/* loaded from: 7le.class */
public abstract class C7le {
    public static final NotificationType A00(String str) {
        NotificationType notificationType;
        NotificationType[] values = NotificationType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                notificationType = null;
                break;
            }
            notificationType = values[i2];
            if (notificationType.A00(str)) {
                break;
            }
            i = i2 + 1;
        }
        return notificationType;
    }
}
