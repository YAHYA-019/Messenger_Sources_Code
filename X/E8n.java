package X;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* loaded from: E8n.class */
public final class E8n extends EuF {
    public final long A00;
    public volatile F63 A01;

    public E8n(F63 f63, Callable callable, long j) {
        super("RenderResultFuture", callable);
        this.A01 = f63;
        this.A00 = j;
    }

    public final F63 A01() {
        RunnableFuture runnableFuture;
        synchronized (this) {
            runnableFuture = ((EuF) this).A00;
        }
        return (runnableFuture == null || runnableFuture.isDone()) ? (F63) A00() : this.A01;
    }
}
