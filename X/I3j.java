package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: I3j.class */
public final class I3j {
    public static final AwakeTimeSinceBootClock A05;
    public Runnable A00;
    public ScheduledFuture A01;
    public final Hmh A02;
    public final HF6 A03;
    public final ScheduledExecutorService A04 = (ScheduledExecutorService) 1Bi.A03(16461);

    static {
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        11T.A0A(awakeTimeSinceBootClock);
        A05 = awakeTimeSinceBootClock;
    }

    public I3j(Hmh hmh, HF6 hf6) {
        this.A02 = hmh;
        this.A03 = hf6;
    }

    public final void A00() {
        ScheduledFuture scheduledFuture = this.A01;
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            long j = this.A03.A00;
            ItA itA = this.A00;
            if (itA == null) {
                itA = new ItA(this);
                this.A00 = itA;
            }
            this.A01 = this.A04.schedule((Runnable) itA, j, TimeUnit.MILLISECONDS);
        }
    }

    public final void A01() {
        ScheduledFuture scheduledFuture = this.A01;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.A01 = null;
            this.A02.A00();
        }
    }
}
