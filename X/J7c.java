package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: J7c.class */
public final class J7c extends ThreadPoolExecutor {
    public J7c(BlockingQueue blockingQueue, TimeUnit timeUnit) {
        super(1, 1, 0L, timeUnit, blockingQueue);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void finalize() {
        int A03 = 0FI.A03(494881383);
        super.finalize();
        shutdown();
        0FI.A09(1243706552, A03);
    }
}
