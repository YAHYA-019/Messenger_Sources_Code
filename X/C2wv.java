package X;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

/* renamed from: X.2wv, reason: invalid class name */
/* loaded from: 2wv.class */
public final class C2wv implements 2EQ {
    public final Deque A00;
    public final Executor A01;

    public C2wv(Executor executor) {
        11T.A0F(executor, 1);
        this.A01 = executor;
        this.A00 = new ArrayDeque();
    }

    public void A7Z(Runnable runnable) {
        synchronized (this) {
            11T.A0F(runnable, 0);
            this.A01.execute(runnable);
        }
    }

    public void Cdn(Runnable runnable) {
        synchronized (this) {
            this.A00.remove(runnable);
        }
    }
}
