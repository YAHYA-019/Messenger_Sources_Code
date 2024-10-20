package X;

import java.util.concurrent.Executor;

/* renamed from: X.4cs, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4cs.class */
public final class ExecutorC05084cs implements Executor {
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        AnonymousClass001.A07().post(runnable);
    }
}
