package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* renamed from: X.3tq, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3tq.class */
public abstract class AbstractC02023tq extends AbstractExecutorService implements 1ED {
    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: D3B, reason: merged with bridge method [inline-methods] */
    public ListenableFuture submit(Runnable runnable) {
        return (ListenableFuture) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: D3C, reason: merged with bridge method [inline-methods] */
    public ListenableFuture submit(Callable callable) {
        return (ListenableFuture) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: D3G, reason: merged with bridge method [inline-methods] */
    public ListenableFuture submit(Object obj, Runnable runnable) {
        return (ListenableFuture) super.submit(runnable, obj);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.RunnableFuture, X.2fT, java.lang.Object] */
    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        boolean z = 1FX.GENERATE_CANCELLATION_CAUSES;
        Callable callable = Executors.callable(runnable, obj);
        ?? obj2 = new Object();
        ((2fT) obj2).A00 = new 4Zv((2fT) obj2, callable);
        return obj2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.RunnableFuture, X.2fT, java.lang.Object] */
    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        ?? obj = new Object();
        ((2fT) obj).A00 = new 4Zv((2fT) obj, callable);
        return obj;
    }
}
