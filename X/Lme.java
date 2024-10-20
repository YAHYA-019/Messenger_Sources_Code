package X;

import androidx.work.Worker;

/* loaded from: Lme.class */
public final class Lme implements Runnable {
    public static final String __redex_internal_original_name = "Worker$2";
    public final /* synthetic */ Worker A00;
    public final /* synthetic */ C4Ks A01;

    public Lme(Worker worker, C4Ks c4Ks) {
        this.A00 = worker;
        this.A01 = c4Ks;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.A00.getForegroundInfo();
            throw 0Q8.createAndThrow();
        } catch (Throwable th) {
            this.A01.A07(th);
        }
    }
}
