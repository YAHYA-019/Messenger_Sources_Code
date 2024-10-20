package X;

import java.util.concurrent.locks.Lock;

/* loaded from: Llu.class */
public final class Llu implements Runnable {
    public static final String __redex_internal_original_name = "zav";
    public final /* synthetic */ Lck A00;

    public Llu(Lck lck) {
        this.A00 = lck;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Lck lck = this.A00;
        Lock lock = lck.A0B;
        lock.lock();
        try {
            Lck.A02(lck);
        } finally {
            lock.unlock();
        }
    }
}
