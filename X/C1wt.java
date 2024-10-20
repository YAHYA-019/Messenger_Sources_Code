package X;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1wt, reason: invalid class name */
/* loaded from: 1wt.class */
public final class C1wt extends 1QH {
    public final 1KK A00;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1KL, X.1KK, java.lang.Object] */
    public C1wt(Runnable runnable, Object obj) {
        super(runnable, obj);
        ?? obj2 = new Object();
        1KN.A00((1KL) obj2, this);
        this.A00 = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1KL, X.1KK, java.lang.Object] */
    public C1wt(Callable callable) {
        super(callable);
        ?? obj = new Object();
        1KN.A00((1KL) obj, this);
        this.A00 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void done() {
        super.done();
        this.A00.A01(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object get() {
        this.A00.A00();
        return super/*java.util.concurrent.FutureTask*/.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object get(long j, TimeUnit timeUnit) {
        this.A00.A00();
        return super/*java.util.concurrent.FutureTask*/.get(j, timeUnit);
    }
}
