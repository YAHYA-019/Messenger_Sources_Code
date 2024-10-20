package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.491, reason: invalid class name */
/* loaded from: 491.class */
public final class AnonymousClass491 extends 2FR {
    public final ListenableFuture A00;

    public AnonymousClass491(ListenableFuture listenableFuture) {
        this.A00 = listenableFuture;
    }

    public void addListener(Runnable runnable, Executor executor) {
        this.A00.addListener(runnable, executor);
    }

    public boolean cancel(boolean z) {
        return this.A00.cancel(z);
    }

    public Object get() {
        return this.A00.get();
    }

    public Object get(long j, TimeUnit timeUnit) {
        return this.A00.get(j, timeUnit);
    }

    public boolean isCancelled() {
        return this.A00.isCancelled();
    }

    public boolean isDone() {
        return this.A00.isDone();
    }

    public String toString() {
        return this.A00.toString();
    }
}
