package X;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4gl, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4gl.class */
public class ScheduledExecutorServiceC06364gl extends AbstractExecutorService implements ScheduledExecutorService {
    public final Handler A00;

    public ScheduledExecutorServiceC06364gl(Handler handler) {
        this.A00 = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.A00.post(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public /* bridge */ /* synthetic */ RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new C3j4(this.A00, obj, runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public /* bridge */ /* synthetic */ RunnableFuture newTaskFor(Callable callable) {
        return new C3j4(this.A00, callable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        Handler handler = this.A00;
        C3j4 c3j4 = new C3j4(handler, null, runnable);
        handler.postDelayed(c3j4, timeUnit.toMillis(j));
        return c3j4;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        Handler handler = this.A00;
        C3j4 c3j4 = new C3j4(handler, callable);
        handler.postDelayed(c3j4, timeUnit.toMillis(j));
        return c3j4;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
        runnable.getClass();
        C3j4 c3j4 = new C3j4(this.A00, null, runnable);
        execute(c3j4);
        return c3j4;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj) {
        runnable.getClass();
        C3j4 c3j4 = new C3j4(this.A00, obj, runnable);
        execute(c3j4);
        return c3j4;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ Future submit(Callable callable) {
        callable.getClass();
        C3j4 c3j4 = new C3j4(this.A00, callable);
        execute(c3j4);
        return c3j4;
    }
}
