package X;

import java.util.concurrent.CountDownLatch;

/* loaded from: GP2.class */
public final /* synthetic */ class GP2 implements Runnable {
    public static final String __redex_internal_original_name = "FbBlockForColdStartAnalyticsLock$$ExternalSyntheticLambda0";
    public final /* synthetic */ CountDownLatch A00;

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.countDown();
    }
}
