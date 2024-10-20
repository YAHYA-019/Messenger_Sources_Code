package X;

import java.util.concurrent.CountDownLatch;

/* loaded from: Iuh.class */
public final class Iuh implements Runnable {
    public static final String __redex_internal_original_name = "RawVideoFrameDistributor$removeSurfaceOutput$1";
    public final /* synthetic */ CountDownLatch A00;

    public Iuh(CountDownLatch countDownLatch) {
        this.A00 = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.countDown();
    }
}
