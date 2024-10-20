package X;

import java.lang.Thread;

/* loaded from: Lrk.class */
public final class Lrk implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ L9t A00;

    public Lrk(L9t l9t) {
        this.A00 = l9t;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        K6g k6g = this.A00.A0C;
        if (k6g != null) {
            k6g.A0G("Job execution failed", th);
        }
    }
}
