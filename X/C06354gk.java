package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.4gk, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4gk.class */
public final class C06354gk extends ScheduledExecutorServiceC06364gl {
    public static C06354gk A00;

    public C06354gk() {
        super(new Handler(Looper.getMainLooper()));
    }

    public static C06354gk A00() {
        C06354gk c06354gk = A00;
        if (c06354gk == null) {
            c06354gk = new C06354gk();
            A00 = c06354gk;
        }
        return c06354gk;
    }

    @Override // X.ScheduledExecutorServiceC06364gl, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (Thread.currentThread() == this.A00.getLooper().getThread()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
