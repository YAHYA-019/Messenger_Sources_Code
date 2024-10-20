package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Ltw.class */
public final class Ltw implements ThreadFactory {
    public final ThreadFactory A00 = Executors.defaultThreadFactory();
    public final AtomicInteger A01 = GOn.A1K(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.A01;
        Thread newThread = this.A00.newThread(runnable);
        newThread.setName(0Pz.A0T("PlayBillingLibrary-", atomicInteger.getAndIncrement()));
        return newThread;
    }
}
