package X;

import androidx.work.Worker;

/* loaded from: Lk0.class */
public final class Lk0 implements Runnable {
    public static final String __redex_internal_original_name = "Worker$1";
    public final /* synthetic */ Worker A00;

    public Lk0(Worker worker) {
        this.A00 = worker;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Worker worker = this.A00;
            worker.mFuture.A06(worker.doWork());
        } catch (Throwable th) {
            this.A00.mFuture.A07(th);
        }
    }
}
