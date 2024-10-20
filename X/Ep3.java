package X;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Ep3.class */
public final class Ep3 {
    public final long A00;
    public final Runnable A01;
    public final ScheduledExecutorService A02;
    public final AtomicBoolean A03;
    public final AtomicInteger A04;

    public Ep3(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        11T.A0F(runnable, 2);
        this.A02 = scheduledExecutorService;
        this.A01 = runnable;
        this.A00 = Math.max(100, 2000L);
        this.A03 = new AtomicBoolean();
        this.A04 = new AtomicInteger();
    }
}
