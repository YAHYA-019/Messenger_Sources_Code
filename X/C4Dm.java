package X;

import android.app.Notification;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.4Dm, reason: invalid class name */
/* loaded from: 4Dm.class */
public final class C4Dm {
    public final C4Dn A00;

    public C4Dm(C4Dn c4Dn) {
        this.A00 = c4Dn;
    }

    public static C4Dm A00() {
        return new C4Dm((C4Dn) C1Y6.A00(null, "com_facebook_messaging_notify_plugins_interfaces_notificationeventlistener_NotificationEventListenerInterfaceSpec", "All", new Object[0]));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.0Oa A01(android.app.Notification r302, java.lang.String r303, int r304) {
        /*
            Method dump skipped, instructions count: 1555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Dm.A01(android.app.Notification, java.lang.String, int):X.0Oa");
    }

    public void A02(String str, int i) {
        int andIncrement;
        String str2;
        C4Do c4Do = this.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = c4Do.A05;
        r0.A08("com.facebook.messaging.notify.plugins.interfaces.notificationeventlistener.NotificationEventListenerInterfaceSpec", "messaging.notify.notificationeventlistener.NotificationEventListenerInterfaceSpec", "onNotificationCancelled", andIncrement2);
        Exception e = null;
        try {
            if (C4Do.A01(c4Do)) {
                andIncrement = atomicInteger.getAndIncrement();
                str2 = "messaging.notify.notificationeventlistener.debug.DebugNotificationEventListener";
                r0.A0A("com.facebook.messaging.notify.plugins.notificationeventlistener.debug.DebugNotificationEventListener", str2, "com.facebook.messaging.notify.plugins.interfaces.notificationeventlistener.NotificationEventListenerInterfaceSpec", andIncrement, "messaging.notify.notificationeventlistener.NotificationEventListenerInterfaceSpec", "com.facebook.messaging.notify.plugins.notificationeventlistener.NotifyNotificationeventlistenerKillSwitch", "onNotificationCancelled");
                try {
                    try {
                        0fH.A0j("DebugNotificationEventListener", 0Pz.A0F(i, "Notification cancelled - tag: ", str, " id: "));
                        r0.A04((Exception) null, str2, "messaging.notify.notificationeventlistener.NotificationEventListenerInterfaceSpec", "onNotificationCancelled", andIncrement);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, str2, "messaging.notify.notificationeventlistener.NotificationEventListenerInterfaceSpec", "onNotificationCancelled", andIncrement);
                    throw th;
                }
            }
            if (C4Do.A00(c4Do)) {
                andIncrement = atomicInteger.getAndIncrement();
                str2 = "messaging.notify.notificationeventlistener.activenotificationstracker.ActiveNotificationsTrackerNotificationEventListener";
                r0.A0A("com.facebook.messaging.notify.plugins.notificationeventlistener.activenotificationstracker.ActiveNotificationsTrackerNotificationEventListener", str2, "com.facebook.messaging.notify.plugins.interfaces.notificationeventlistener.NotificationEventListenerInterfaceSpec", andIncrement, "messaging.notify.notificationeventlistener.NotificationEventListenerInterfaceSpec", "com.facebook.messaging.notify.plugins.notificationeventlistener.NotifyNotificationeventlistenerKillSwitch", "onNotificationCancelled");
                C04204ab c04204ab = (C04204ab) c4Do.A00.A00.A00.get();
                c04204ab.A02.remove(new C82e(i, str));
                if (C04204ab.A01(c04204ab)) {
                    c04204ab.A03.remove(new C82e(i, str));
                }
                r0.A04((Exception) null, str2, "messaging.notify.notificationeventlistener.NotificationEventListenerInterfaceSpec", "onNotificationCancelled", andIncrement);
            }
            r0.A02((Exception) null, "messaging.notify.notificationeventlistener.NotificationEventListenerInterfaceSpec", "onNotificationCancelled", andIncrement2);
        } catch (Throwable th2) {
            r0.A02(e, "messaging.notify.notificationeventlistener.NotificationEventListenerInterfaceSpec", "onNotificationCancelled", andIncrement2);
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x019b, code lost:
    
        if (r0.contentIntent != null) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03(java.lang.String r302, int r303) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Dm.A03(java.lang.String, int):void");
    }

    public void A04(String str, int i, Notification notification) {
        int andIncrement;
        String str2;
        C4Do c4Do = this.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = c4Do.A05;
        r0.A08("com.facebook.messaging.notify.plugins.interfaces.notificationeventlistener.NotificationEventListenerInterfaceSpec", "messaging.notify.notificationeventlistener.NotificationEventListenerInterfaceSpec", "onNotificationPosted", andIncrement2);
        Exception e = null;
        try {
            if (C4Do.A01(c4Do)) {
                andIncrement = atomicInteger.getAndIncrement();
                str2 = "messaging.notify.notificationeventlistener.debug.DebugNotificationEventListener";
                r0.A0A("com.facebook.messaging.notify.plugins.notificationeventlistener.debug.DebugNotificationEventListener", str2, "com.facebook.messaging.notify.plugins.interfaces.notificationeventlistener.NotificationEventListenerInterfaceSpec", andIncrement, "messaging.notify.notificationeventlistener.NotificationEventListenerInterfaceSpec", "com.facebook.messaging.notify.plugins.notificationeventlistener.NotifyNotificationeventlistenerKillSwitch", "onNotificationPosted");
                try {
                    try {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Notification posted - tag: ");
                        sb.append(str);
                        sb.append(" id: ");
                        sb.append(i);
                        sb.append(" notification: ");
                        sb.append(notification);
                        0fH.A0j("DebugNotificationEventListener", sb.toString());
                        r0.A04((Exception) null, str2, "messaging.notify.notificationeventlistener.NotificationEventListenerInterfaceSpec", "onNotificationPosted", andIncrement);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, str2, "messaging.notify.notificationeventlistener.NotificationEventListenerInterfaceSpec", "onNotificationPosted", andIncrement);
                    throw th;
                }
            }
            if (C4Do.A00(c4Do)) {
                andIncrement = atomicInteger.getAndIncrement();
                str2 = "messaging.notify.notificationeventlistener.activenotificationstracker.ActiveNotificationsTrackerNotificationEventListener";
                r0.A0A("com.facebook.messaging.notify.plugins.notificationeventlistener.activenotificationstracker.ActiveNotificationsTrackerNotificationEventListener", str2, "com.facebook.messaging.notify.plugins.interfaces.notificationeventlistener.NotificationEventListenerInterfaceSpec", andIncrement, "messaging.notify.notificationeventlistener.NotificationEventListenerInterfaceSpec", "com.facebook.messaging.notify.plugins.notificationeventlistener.NotifyNotificationeventlistenerKillSwitch", "onNotificationPosted");
                C04204ab c04204ab = (C04204ab) c4Do.A00.A00.A00.get();
                c04204ab.A02.put(new C82e(i, str), new 5QL(str, i, notification));
                if (C04204ab.A01(c04204ab)) {
                    c04204ab.A03.put(new C82e(i, str), new 5QL(str, i, notification));
                }
                r0.A04((Exception) null, str2, "messaging.notify.notificationeventlistener.NotificationEventListenerInterfaceSpec", "onNotificationPosted", andIncrement);
            }
            r0.A02((Exception) null, "messaging.notify.notificationeventlistener.NotificationEventListenerInterfaceSpec", "onNotificationPosted", andIncrement2);
        } catch (Throwable th2) {
            r0.A02(e, "messaging.notify.notificationeventlistener.NotificationEventListenerInterfaceSpec", "onNotificationPosted", andIncrement2);
            throw th2;
        }
    }
}
