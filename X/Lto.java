package X;

import java.util.concurrent.Executor;

/* loaded from: Lto.class */
public final class Lto implements Executor {
    public final int A00;

    public Lto(int i) {
        this.A00 = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
