package X;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: Lu4.class */
public final class Lu4 implements ThreadFactory {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Lu4(LTR ltr) {
        this.A00 = 0;
        this.A02 = ltr;
        this.A01 = GOn.A1K(1);
    }

    public Lu4(ThreadFactory threadFactory, AtomicLong atomicLong) {
        this.A00 = 1;
        this.A01 = threadFactory;
        this.A02 = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        if (this.A00 == 0) {
            return new Thread(runnable, 0Pz.A0T("GCD-Thread #", ((AtomicInteger) this.A01).getAndIncrement()));
        }
        Thread newThread = ((ThreadFactory) this.A01).newThread(runnable);
        newThread.getClass();
        AtomicLong atomicLong = (AtomicLong) this.A02;
        atomicLong.getClass();
        newThread.setName(String.format(Locale.ROOT, "ListenableFutureAdapter-thread-%d", 1BK.A1Z(atomicLong.getAndIncrement())));
        newThread.setDaemon(true);
        return newThread;
    }
}
