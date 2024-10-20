package X;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4cq, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4cq.class */
public final class C05064cq {
    public static final C05064cq A03 = new C05064cq();
    public final Executor A00;
    public final ExecutorService A01;
    public final ScheduledExecutorService A02;

    public C05064cq() {
        ExecutorService newCachedThreadPool;
        String property = System.getProperty("java.runtime.name");
        if (property == null || !property.toLowerCase(Locale.US).contains("android")) {
            newCachedThreadPool = Executors.newCachedThreadPool();
        } else {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(C05074cr.A01, C05074cr.A02, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            newCachedThreadPool = threadPoolExecutor;
        }
        this.A01 = newCachedThreadPool;
        this.A02 = Executors.newSingleThreadScheduledExecutor();
        this.A00 = new Executor() { // from class: X.4ct
            public ThreadLocal A00 = new ThreadLocal();

            private void A00() {
                ThreadLocal threadLocal = this.A00;
                Number number = (Number) threadLocal.get();
                if (number == null) {
                    number = 4YU.A0k();
                }
                int intValue = number.intValue() - 1;
                if (intValue == 0) {
                    threadLocal.remove();
                } else {
                    threadLocal.set(Integer.valueOf(intValue));
                }
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                ThreadLocal threadLocal = this.A00;
                Number number = (Number) threadLocal.get();
                if (number == null) {
                    number = 0;
                }
                int intValue = number.intValue() + 1;
                threadLocal.set(Integer.valueOf(intValue));
                try {
                    if (intValue <= 15) {
                        runnable.run();
                    } else {
                        C05064cq.A03.A01.execute(runnable);
                    }
                } finally {
                    A00();
                }
            }
        };
    }
}
