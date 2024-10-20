package X;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3j4, reason: invalid class name */
/* loaded from: 3j4.class */
public final class C3j4 implements RunnableFuture, ScheduledFuture {
    public final Handler A00;
    public final FutureTask A01;

    public C3j4(Handler handler, Object obj, Runnable runnable) {
        this.A00 = handler;
        this.A01 = new FutureTask(runnable, obj);
    }

    public C3j4(Handler handler, Callable callable) {
        this.A00 = handler;
        this.A01 = new FutureTask(callable);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.A01.cancel(z);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.A01.get();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return this.A01.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.A01.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.A01.isDone();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.A01.run();
    }
}
