package X;

import com.facebook.notifications.constants.push.NotificationType;
import com.facebook.proxygen.TraceEventType;
import com.facebook.push.constants.PushProperty;

/* renamed from: X.316, reason: invalid class name */
/* loaded from: 316.class */
public final class AnonymousClass316 implements C1gk {
    public final int A00;
    public final Object A01;

    public AnonymousClass316(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C1gk
    public void C9f(PushProperty pushProperty, String str) {
        C1gy c1gy;
        int i;
        C2y7 c2y7;
        switch (this.A00) {
            case 0:
                NotificationType notificationType = NotificationType.A4y;
                String str2 = pushProperty.A0B;
                if (notificationType.A00(str2)) {
                    c1gy = (C1gy) this.A01;
                    i = 1;
                    c2y7 = new C2y7(c1gy, c1gy.A01, pushProperty.A04.toString(), str2, str, 1, 3);
                } else {
                    if (!NotificationType.A4O.A00(str2)) {
                        return;
                    }
                    c1gy = (C1gy) this.A01;
                    i = 2;
                    c2y7 = new C2y7(c1gy, c1gy.A00, pushProperty.A04.toString(), str2, null, 2, 3);
                }
                C1gy.A04(c1gy, c2y7, i);
                return;
            case 1:
                if (NotificationType.A4y.A00(pushProperty.A0B)) {
                    C1gi c1gi = (C1gi) this.A01;
                    if (c1gi.A08) {
                        C1gi.A00(c1gi);
                        return;
                    }
                    return;
                }
                return;
            default:
                synchronized (this) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("onNotificationArrived enabled=");
                    C1gn c1gn = (C1gn) this.A01;
                    A0k.append(c1gn.A04);
                    A0k.append(" isActive=");
                    A0k.append(c1gn.A05);
                    A0k.append(" source=");
                    A0k.append(pushProperty);
                    A0k.append(".source type=");
                    A0k.append(pushProperty);
                    0fH.A0j("MPLDataFreshnessTracker", AnonymousClass001.A0d(".notifType", A0k));
                    NotificationType notificationType2 = NotificationType.A4y;
                    String str3 = pushProperty.A0B;
                    if (notificationType2.A00(str3)) {
                        C1gn.A03(c1gn, TraceEventType.Push);
                        C1gn.A00(c1gn).markerAnnotate(729359638, "push_source", pushProperty.A04.toString());
                        C1gn.A00(c1gn).markerAnnotate(729359638, "push_type", str3);
                    }
                }
                return;
        }
    }
}
