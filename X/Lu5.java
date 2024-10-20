package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Lu5.class */
public final class Lu5 implements ThreadFactory {
    public static final AtomicInteger A03 = GOn.A1K(1);
    public final String A00;
    public final ThreadGroup A01;
    public final AtomicInteger A02 = GOn.A1K(1);

    public Lu5() {
        SecurityManager securityManager = System.getSecurityManager();
        this.A01 = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.A00 = 0Pz.A0d("lottie-", "-thread-", A03.getAndIncrement());
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.A01, runnable, 0Pz.A0T(this.A00, this.A02.getAndIncrement()), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
