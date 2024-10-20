package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;

/* loaded from: Hr9.class */
public final class Hr9 {
    public final C1ko A00 = AbstractC2327GOs.A0M();

    public void A00(String str) {
        synchronized (this) {
            Future future = (Future) this.A00.Apt(str);
            if (future != null && future.isCancelled()) {
                throw new CancellationException();
            }
        }
    }

    public void A01(String str, Future future) {
        synchronized (this) {
            A00(str);
            this.A00.CZv(str, future);
        }
    }
}
