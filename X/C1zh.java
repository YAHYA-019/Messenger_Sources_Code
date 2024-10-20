package X;

import com.facebook.messaging.model.threads.NotificationSetting;

/* renamed from: X.1zh, reason: invalid class name */
/* loaded from: 1zh.class */
public abstract class C1zh {
    public static final NotificationSetting A00(long j) {
        return j == ((long) (-1)) ? NotificationSetting.A05 : j == ((long) (-2)) ? NotificationSetting.A04 : j == 0 ? NotificationSetting.A06 : j < 0 ? new NotificationSetting(-j, true, true, false) : new NotificationSetting(j, true, false, false);
    }
}
