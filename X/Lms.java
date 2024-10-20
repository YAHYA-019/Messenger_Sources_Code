package X;

import java.util.concurrent.Future;

/* loaded from: Lms.class */
public final /* synthetic */ class Lms implements Runnable {
    public static final String __redex_internal_original_name = "zzu";
    public final /* synthetic */ Runnable A00;
    public final /* synthetic */ Future A01;

    public /* synthetic */ Lms(Runnable runnable, Future future) {
        this.A01 = future;
        this.A00 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Future future = this.A01;
        if (future.isDone() || future.isCancelled()) {
            return;
        }
        Runnable runnable = this.A00;
        future.cancel(true);
        LEC.A0A("BillingClient", "Async task is taking too long, cancel it!");
        if (runnable != null) {
            runnable.run();
        }
    }
}
