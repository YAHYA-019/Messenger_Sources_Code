package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Lu3.class */
public final class Lu3 implements ThreadFactory {
    public static final AtomicInteger A00 = new AtomicInteger();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, AnonymousClass001.A0e("measurement-", AnonymousClass001.A0l(23), A00.incrementAndGet()));
    }
}
