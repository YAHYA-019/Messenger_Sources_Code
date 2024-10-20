package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* renamed from: X.3k8, reason: invalid class name */
/* loaded from: 3k8.class */
public final class C3k8 extends FutureTask implements ListenableFuture {
    public final Integer A00;
    public final 1Ei A01;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1Ei, java.lang.Object] */
    public C3k8(Integer num, Runnable runnable) {
        super(runnable, null);
        this.A01 = new Object();
        this.A00 = num;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        this.A01.A02(runnable, executor);
    }

    @Override // java.util.concurrent.FutureTask
    public void done() {
        this.A01.A01();
    }
}
