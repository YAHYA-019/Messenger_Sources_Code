package X;

import com.facebook.fury.context.ReqContext;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3x9, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3x9.class */
public final class C03153x9 implements 1FA {
    public final 1FA A00;
    public final int A01;
    public final ReqContext A02;

    public C03153x9(1FA r302, int i) {
        this.A00 = r302;
        this.A01 = i;
        this.A02 = AnonymousClass018.A03("CombinedExecutor_enqueueFuture", i);
    }

    public void addListener(Runnable runnable, Executor executor) {
        ReqContext reqContext = this.A02;
        int i = this.A01;
        ReqContext A02 = AnonymousClass018.A02(reqContext, "CombinedExecutor_enqueueFuture", i);
        A02.close();
        this.A00.addListener(runnable, new 3xA(A02, "CombinedExecutor_enqueueFuture", executor, i));
    }

    public boolean cancel(boolean z) {
        return this.A00.cancel(z);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A00.compareTo(obj);
    }

    public Object get() {
        return this.A00.get();
    }

    public Object get(long j, TimeUnit timeUnit) {
        return this.A00.get(j, timeUnit);
    }

    public long getDelay(TimeUnit timeUnit) {
        return this.A00.getDelay(timeUnit);
    }

    public boolean isCancelled() {
        return this.A00.isCancelled();
    }

    public boolean isDone() {
        return this.A00.isDone();
    }
}
