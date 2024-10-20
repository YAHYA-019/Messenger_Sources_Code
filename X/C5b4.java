package X;

import android.app.NotificationManager;
import android.service.notification.StatusBarNotification;

/* renamed from: X.5b4, reason: invalid class name */
/* loaded from: 5b4.class */
public final class C5b4 {
    public final C5b5 A02 = (C5b5) 1Bn.A0A(83410);
    public final 1Br A01 = 1Bq.A00(49835);
    public final 4aO A03 = (4aO) 1Bn.A0A(68463);
    public final 1Br A00 = 1Bu.A00(67888);

    public final void A00(String str) {
        11T.A0F(str, 0);
        StatusBarNotification[] activeNotifications = ((NotificationManager) ((5oR) 1Br.A0B(this.A01)).A01.get()).getActiveNotifications();
        int length = activeNotifications.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            StatusBarNotification statusBarNotification = activeNotifications[i2];
            if (statusBarNotification != null && statusBarNotification.getNotification() != null && statusBarNotification.getNotification().extras != null && String.valueOf(statusBarNotification.getNotification().extras.get("msgId")).equals(str)) {
                int id = statusBarNotification.getId();
                this.A03.A03(statusBarNotification.getTag(), id);
                return;
            }
            i = i2 + 1;
        }
    }
}
