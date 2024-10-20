package X;

import com.google.common.base.Function;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: D4r.class */
public final class D4r implements ListenableFuture {
    public final /* synthetic */ Function A00;
    public final /* synthetic */ ListenableFuture A01;

    public D4r(Function function, ListenableFuture listenableFuture) {
        this.A01 = listenableFuture;
        this.A00 = function;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        this.A01.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.A01.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        try {
            return this.A00.apply(this.A01.get());
        } catch (Throwable th) {
            throw new ExecutionException(th);
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        try {
            return this.A00.apply(this.A01.get(j, timeUnit));
        } catch (Throwable th) {
            throw new ExecutionException(th);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.A01.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.A01.isDone();
    }
}
