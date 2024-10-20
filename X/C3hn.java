package X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3hn, reason: invalid class name */
/* loaded from: 3hn.class */
public final class C3hn implements Runnable {
    public static final String __redex_internal_original_name = "HomeNavigationFragmentLocator$getFragmentForceUiThread$1";
    public final /* synthetic */ CountDownLatch A00;
    public final /* synthetic */ AtomicReference A01;
    public final /* synthetic */ C00m A02;

    public C3hn(CountDownLatch countDownLatch, AtomicReference atomicReference, C00m c00m) {
        this.A01 = atomicReference;
        this.A02 = c00m;
        this.A00 = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.set(this.A02.invoke());
        this.A00.countDown();
    }
}
