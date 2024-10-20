package X;

import java.lang.Thread;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: J7b.class */
public final class J7b extends ScheduledThreadPoolExecutor {
    public final Thread.UncaughtExceptionHandler A00;

    public J7b(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        super(1);
        this.A00 = uncaughtExceptionHandler;
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        super.execute(new IzB(runnable, this.A00));
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return super.schedule((Runnable) new IzB(runnable, this.A00), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return super.scheduleAtFixedRate(new IzB(runnable, this.A00), j, j2, timeUnit);
    }
}
