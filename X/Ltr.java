package X;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* loaded from: Ltr.class */
public final class Ltr implements Executor {
    public Runnable A00;
    public final Executor A02;
    public final Object A03 = AnonymousClass001.A0R();
    public final Queue A01 = new ArrayDeque();

    public Ltr(Executor executor) {
        this.A02 = executor;
    }

    public static void A00(Ltr ltr) {
        synchronized (ltr.A03) {
            Runnable runnable = (Runnable) ltr.A01.poll();
            ltr.A00 = runnable;
            if (runnable != null) {
                ltr.A02.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.A03) {
            this.A01.add(new LmY(this, runnable));
            if (this.A00 == null) {
                A00(this);
            }
        }
    }
}
