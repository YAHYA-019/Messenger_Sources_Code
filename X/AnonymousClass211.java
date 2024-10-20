package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.211, reason: invalid class name */
/* loaded from: 211.class */
public final class AnonymousClass211 implements 1Uc {
    public final C20w A00;

    public AnonymousClass211(C20w c20w) {
        this.A00 = c20w;
    }

    public void onNewNotification(String str, 1Xv r303, java.util.Map map) {
        C20w c20w = this.A00;
        if (map != null) {
            Long l = (Number) (map.containsKey("totalCount") ? map.get("totalCount") : 0L);
            Long l2 = (Number) (map.containsKey("messageCount") ? map.get("messageCount") : 0L);
            Long l3 = (Number) (map.containsKey("receiptCount") ? map.get("receiptCount") : 0L);
            Long l4 = (Number) (map.containsKey("notificationCount") ? map.get("notificationCount") : 0L);
            long longValue = l.longValue();
            long longValue2 = l2.longValue();
            long longValue3 = l3.longValue();
            long longValue4 = l4.longValue();
            C20p c20p = c20w.A00;
            C29y c29y = (C29y) c20p.A08.A00.get();
            if (C29y.A00(c29y)) {
                Iterator it = c29y.A02.iterator();
                while (it.hasNext()) {
                    it.next();
                    0fH.A0j("MessengerColdStartThreadViewTTRCTracker", "onArmadilloACTPreviewNotification");
                }
            }
            List list = ((C29u) c20p.A05.A00.get()).A00;
            synchronized (list) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((C1gp) it2.next()).BhA(longValue, longValue2, longValue3, longValue4);
                }
            }
        }
    }
}
