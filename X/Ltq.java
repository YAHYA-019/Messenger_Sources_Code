package X;

import java.util.concurrent.Executor;

/* loaded from: Ltq.class */
public final class Ltq implements Executor {
    public static final Ltq A00 = new Object();

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
