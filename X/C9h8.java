package X;

import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9h8, reason: invalid class name */
/* loaded from: 9h8.class */
public final class C9h8 {
    public Future A00;
    public final C00i A02 = 1BQ.A02(16461);
    public final Set A01 = AnonymousClass001.A0v();

    public static void A00(C9h8 c9h8) {
        synchronized (c9h8) {
            c9h8.A00 = ((ScheduledExecutorService) c9h8.A02.get()).schedule((Runnable) new S90(c9h8), 1L, TimeUnit.SECONDS);
        }
    }

    public void A01(AX6 ax6) {
        synchronized (this) {
            Set set = this.A01;
            set.remove(ax6);
            if (set.isEmpty()) {
                if (4DQ.A03(this.A00)) {
                    Future future = this.A00;
                    if (future != null) {
                        future.cancel(true);
                    }
                }
            }
        }
    }
}
