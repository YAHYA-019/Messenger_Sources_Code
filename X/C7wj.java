package X;

import java.util.concurrent.Executor;

/* renamed from: X.7wj, reason: invalid class name */
/* loaded from: 7wj.class */
public final class C7wj implements Executor {
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
