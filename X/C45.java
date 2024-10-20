package X;

import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.messaging.notify.type.NewMessageNotification;

/* loaded from: C45.class */
public final class C45 {
    public final C00i A01 = 1BQ.A02(83846);
    public final C00i A02 = 1BQ.A02(83868);
    public final C00i A00 = AbH.A0Y();

    public void A00(DLB dlb, NewMessageNotification newMessageNotification, String str, boolean z) {
        C1253Abv.A01((C1253Abv) this.A01.get(), ((MessagingNotification) newMessageNotification).A02, str);
        String str2 = null;
        C1233Aba c1233Aba = (C1233Aba) this.A02.get();
        String str3 = newMessageNotification.A0H.A1V;
        Long l = newMessageNotification.A04;
        if (z) {
            if (l != null) {
                str2 = l.toString();
            }
            c1233Aba.A00(dlb, str3, str2);
        } else {
            if (l != null) {
                str2 = l.toString();
            }
            c1233Aba.A01(dlb, str3, str2, false);
        }
    }
}
