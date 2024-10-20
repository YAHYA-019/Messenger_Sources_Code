package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3yu, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3yu.class */
public final class C03713yu implements ListenableFuture {
    public final C3sa A00;
    public final ListenableFuture A01;

    public C03713yu(C3sa c3sa, ListenableFuture listenableFuture) {
        this.A01 = listenableFuture;
        this.A00 = c3sa;
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
        return this.A01.get();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return this.A01.get(j, timeUnit);
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
