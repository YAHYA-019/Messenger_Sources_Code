package X;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: C7l.class */
public final class C7l {
    public Future A00;
    public final 1Br A01 = 7zM.A0d();
    public final 1Br A02 = 1Bq.A00(67984);
    public final 1Br A03 = 1Bq.A00(16461);

    public final void A00() {
        synchronized (this) {
            Future future = this.A00;
            if (future != null) {
                future.cancel(true);
            }
            this.A00 = null;
        }
    }

    public final void A01(long j) {
        synchronized (this) {
            A00();
            this.A00 = ((ScheduledExecutorService) 1Br.A0B(this.A03)).schedule(new D64(this), j - 1Br.A00(this.A01), TimeUnit.MILLISECONDS);
        }
    }
}
