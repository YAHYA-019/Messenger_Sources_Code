package X;

import com.facebook.fury.context.ReqContext;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4Og, reason: invalid class name */
/* loaded from: 4Og.class */
public final class C4Og implements ListenableFuture {
    public final int A00;
    public final ReqContext A01;
    public final ListenableFuture A02;
    public final String A03;

    public C4Og(ListenableFuture listenableFuture, String str, int i) {
        this.A03 = str;
        this.A02 = listenableFuture;
        this.A00 = i;
        this.A01 = AnonymousClass018.A03(str, i);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        ReqContext reqContext = this.A01;
        String str = this.A03;
        int i = this.A00;
        ReqContext A02 = AnonymousClass018.A02(reqContext, str, i);
        A02.close();
        this.A02.addListener(runnable, new 3xA(A02, str, executor, i));
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.A02.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.A02.get();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return this.A02.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.A02.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.A02.isDone();
    }
}
