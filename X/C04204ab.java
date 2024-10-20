package X;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.facebook.inject.FbInjector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.4ab, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ab.class */
public final class C04204ab {
    public final 1Br A00;
    public final 1Br A01;
    public final java.util.Map A02;
    public final java.util.Map A03;
    public final 1BP A04 = FbInjector.A00;

    public C04204ab() {
        Context context = FbInjector.A03;
        11T.A0A(context);
        this.A01 = 1HG.A00(context, 100188);
        this.A00 = 1Bq.A00(16616);
        java.util.Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        11T.A0A(synchronizedMap);
        this.A02 = synchronizedMap;
        java.util.Map synchronizedMap2 = Collections.synchronizedMap(new HashMap());
        11T.A0A(synchronizedMap2);
        this.A03 = synchronizedMap2;
        try {
            StatusBarNotification[] activeNotifications = ((NotificationManager) this.A01.A00.get()).getActiveNotifications();
            11T.A0A(activeNotifications);
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                java.util.Map map = this.A02;
                C82e c82e = new C82e(statusBarNotification.getId(), statusBarNotification.getTag());
                int id = statusBarNotification.getId();
                String tag = statusBarNotification.getTag();
                Notification notification = statusBarNotification.getNotification();
                11T.A0A(notification);
                map.put(c82e, new 5QL(tag, id, notification));
            }
            this.A03.putAll(this.A02);
        } catch (RuntimeException e) {
            0fH.A0r("ActiveNotificationsTracker", "getActiveNotifications failed", e);
        }
    }

    public static final ArrayList A00(java.util.Map map) {
        ArrayList arrayList = new ArrayList();
        synchronized (map) {
            if (map.values().size() > 0) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0032, code lost:
    
        if (((X.1Od) r0.get()).A0A() == com.facebook.common.util.TriState.YES) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A01(X.C04204ab r301) {
        /*
            r0 = r301
            X.1Br r0 = r0.A00
            X.00i r0 = r0.A00
            r302 = r0
            r0 = r302
            java.lang.Object r0 = r0.get()
            X.1Od r0 = (X.1Od) r0
            r303 = r0
            r0 = r303
            boolean r0 = r0.A0E()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L35
            r0 = r302
            java.lang.Object r0 = r0.get()
            X.1Od r0 = (X.1Od) r0
            com.facebook.common.util.TriState r0 = r0.A0A()
            r301 = r0
            com.facebook.common.util.TriState r0 = com.facebook.common.util.TriState.YES
            r302 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r301
            r1 = r302
            if (r0 != r1) goto L37
        L35:
            r0 = 1
            r304 = r0
        L37:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04204ab.A01(X.4ab):boolean");
    }
}
