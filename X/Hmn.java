package X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: Hmn.class */
public final class Hmn {
    public final AtomicReference A00 = GOn.A1L(new CountDownLatch(0));

    public void A00(int i) {
        CountDownLatch countDownLatch = (CountDownLatch) this.A00.getAndSet(new CountDownLatch(i));
        if (countDownLatch != null) {
            while (countDownLatch.getCount() > 0) {
                countDownLatch.countDown();
            }
        }
    }
}
