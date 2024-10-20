package X;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: F7u.class */
public final class F7u {
    public static final F7u A03 = new F7u();
    public volatile boolean A01;
    public final LinkedBlockingQueue A00 = new LinkedBlockingQueue(200);
    public volatile boolean A02 = true;

    public final void A00(String str, String str2, String str3, String str4, Throwable th, Object... objArr) {
        7zP.A1L(str, 0, objArr);
        if (this.A01) {
            return;
        }
        if ((str2.equals("player") && this.A02) || str.length() == 0 || str2.length() == 0) {
            return;
        }
        this.A00.offer(new EvV(str, str2, str3, str4, th, objArr));
        FIN fin = FIN.A09;
        if (fin.A08.get()) {
            ScheduledExecutorService scheduledExecutorService = fin.A06;
            if (scheduledExecutorService == null) {
                11T.A0L("scheduler");
                throw 0Q8.createAndThrow();
            }
            scheduledExecutorService.execute(new G15(fin));
        }
    }
}
