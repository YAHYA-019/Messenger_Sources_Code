package X;

import androidx.core.app.NotificationCompat$MessagingStyle;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5rw, reason: invalid class name */
/* loaded from: 5rw.class */
public final class C5rw {
    public final C5rv A00(NotificationCompat$MessagingStyle notificationCompat$MessagingStyle, String str) {
        Object obj;
        List list = notificationCompat$MessagingStyle.A04;
        11T.A0A(list);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C5rv c5rv = (C5rv) obj;
            1BL.A1E(c5rv);
            if (11T.A0O(c5rv.A01.getString("msgId"), str)) {
                break;
            }
        }
        return (C5rv) obj;
    }
}
