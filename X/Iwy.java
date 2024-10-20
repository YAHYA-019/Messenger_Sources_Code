package X;

import com.facebook.messaging.rtc.incall.impl.notification.NotificationView;

/* loaded from: Iwy.class */
public final class Iwy implements Runnable {
    public static final String __redex_internal_original_name = "NotificationView$render$1";
    public final /* synthetic */ NotificationView A00;
    public final /* synthetic */ GjI A01;

    public Iwy(NotificationView notificationView, GjI gjI) {
        this.A00 = notificationView;
        this.A01 = gjI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NotificationView notificationView = this.A00;
        GjI gjI = this.A01;
        C2cd.A05(notificationView, gjI.A0D);
        CharSequence charSequence = gjI.A0C;
        if (charSequence != null) {
            C2cd.A05(notificationView, charSequence);
        }
    }
}
