package X;

import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5q1, reason: invalid class name */
/* loaded from: 5q1.class */
public final class C5q1 {
    public long A00;
    public final Queue A01;
    public final long A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05 = new 1BQ(16464);

    public C5q1() {
        1BQ r0 = new 1BQ(16385);
        this.A04 = r0;
        this.A03 = new 1BQ(99390);
        this.A01 = new LinkedList();
        this.A00 = 0L;
        long Auy = ((2yD) r0.get()).Auy(36592339678790331L);
        this.A02 = Auy <= 0 ? 3000L : Auy;
    }

    public void A00(C5q0 c5q0) {
        final long now = ((C0dp) this.A03.get()).now();
        synchronized (this) {
            this.A01.add(new C5q2(c5q0, now));
            if (now > this.A00 + 1000) {
                ((ScheduledExecutorService) this.A05.get()).schedule(new Runnable() { // from class: X.5q3
                    public static final String __redex_internal_original_name = "BitmapCallbackTimeoutScheduler$1";

                    @Override // java.lang.Runnable
                    public void run() {
                        String str;
                        C5q1 c5q1 = C5q1.this;
                        long j = now;
                        ArrayList arrayList = new ArrayList();
                        synchronized (c5q1) {
                            while (true) {
                                Queue queue = c5q1.A01;
                                if (!queue.isEmpty()) {
                                    C5q2 c5q2 = (C5q2) queue.peek();
                                    if (c5q2.A00 > 1000 + j) {
                                        break;
                                    }
                                    arrayList.add(c5q2.A01);
                                    queue.remove();
                                } else {
                                    break;
                                }
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C5q0 c5q02 = (C5q0) it.next();
                            synchronized (c5q02) {
                                if (!c5q02.A00) {
                                    c5q02.A00 = true;
                                    0fH.A0m("BitmapCallbackWithTimeout", "onTimeout()");
                                    c5q02.A03.Blg();
                                    C45d c45d = c5q02.A01;
                                    MessagingNotification messagingNotification = c5q02.A02;
                                    String str2 = null;
                                    c45d.A0O(messagingNotification, "bitmap_callback_timeout", null);
                                    PushProperty pushProperty = messagingNotification.A02;
                                    if (pushProperty != null) {
                                        str = pushProperty.A08;
                                        str2 = pushProperty.A0A;
                                    } else {
                                        str = null;
                                    }
                                    c5q02.A04.BZR("notif_processing", 0Pz.A0v("Notification error (Fetching profile image bitmap time out), messageId:", str, ", notificationId:", str2));
                                }
                            }
                        }
                    }
                }, this.A02, TimeUnit.MILLISECONDS);
                this.A00 = now;
            }
        }
    }
}
