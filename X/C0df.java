package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0df, reason: invalid class name */
/* loaded from: 0df.class */
public final class C0df implements ThreadFactory {
    public final String A00;
    public final ThreadGroup A01;
    public final AtomicInteger A02 = new AtomicInteger(1);

    public C0df(String str) {
        SecurityManager securityManager = System.getSecurityManager();
        this.A01 = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        this.A00 = 0Pz.A0W(str, "-");
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.A01, runnable, 0Pz.A0T(this.A00, this.A02.getAndIncrement()), 0L);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        return thread;
    }
}
