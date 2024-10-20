package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: Ju6.class */
public final class Ju6 extends LDH {
    public long A00;
    public ScheduledFuture A01;
    public final C0dp A02;
    public final ScheduledExecutorService A03;
    public final AtomicBoolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.KWX, java.lang.Object] */
    public Ju6(C0dp c0dp, C0dr c0dr, C02333uu c02333uu, C03653yo c03653yo, C03623yk c03623yk, C03633ym c03633ym, C5ez c5ez, C5ey c5ey, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        super(c0dp, c0dr, c02333uu, c03653yo, c03623yk, c03633ym, (C41p) null, (KWX) new Object(), c5ez, c5ey, lightweightQuickPerformanceLogger, executorService, scheduledExecutorService);
        7zT.A1W(c02333uu, c0dp, c0dr, scheduledExecutorService);
        1BL.A1G(executorService, c5ez);
        this.A02 = c0dp;
        this.A03 = scheduledExecutorService;
        this.A04 = new AtomicBoolean();
    }
}
