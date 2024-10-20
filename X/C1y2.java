package X;

import com.facebook.msys.mci.SessionedNotificationCenter;
import com.facebook.msys.util.NotificationScope;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1y2, reason: invalid class name */
/* loaded from: 1y2.class */
public final class C1y2 implements C1y3 {
    public final SessionedNotificationCenter A01;
    public final java.util.Map A02 = new ConcurrentHashMap();
    public final 1Uc A00 = new 1Uc() { // from class: X.1y4
        public void onNewNotification(String str, 1Xv r303, java.util.Map map) {
            if (r303 != null) {
                C1y2 c1y2 = C1y2.this;
                C1y5 c1y5 = (C1y5) c1y2.A02.remove(r303);
                if (c1y5 != null) {
                    c1y2.A01.removeObserver(c1y2.A00, str, r303);
                    c1y5.CHh(map);
                }
            }
        }
    };

    public C1y2(SessionedNotificationCenter sessionedNotificationCenter) {
        this.A01 = sessionedNotificationCenter;
    }

    public final NotificationScope A00(C1y5 c1y5, String str) {
        return CcE(c1y5, str, 1);
    }

    @Override // X.C1y3
    public NotificationScope CcE(C1y5 c1y5, String str, int i) {
        NotificationScope notificationScope = new NotificationScope();
        this.A01.addObserver(this.A00, str, 1, notificationScope);
        this.A02.put(notificationScope, c1y5);
        return notificationScope;
    }

    @Override // X.C1y3
    public void D5w(NotificationScope notificationScope, String str) {
        this.A02.remove(notificationScope);
        this.A01.removeObserver(this.A00, str, notificationScope);
    }
}
