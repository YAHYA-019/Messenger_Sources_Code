package X;

import android.location.LocationManager;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: Ju7.class */
public final class Ju7 extends LDH {
    public KmL A00;
    public String A01;
    public final LocationManager A02;
    public final C02333uu A03;
    public final LFt A04;
    public final ExecutorService A05;
    public final AtomicBoolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ju7(LocationManager locationManager, C0dp c0dp, C0dr c0dr, C02333uu c02333uu, C03653yo c03653yo, C03623yk c03623yk, C03633ym c03633ym, C41p c41p, KWX kwx, C5ez c5ez, C5ey c5ey, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        super(c0dp, c0dr, c02333uu, c03653yo, c03623yk, c03633ym, c41p, kwx, c5ez, c5ey, lightweightQuickPerformanceLogger, executorService, scheduledExecutorService);
        7zT.A1W(c02333uu, c0dp, c0dr, scheduledExecutorService);
        4YV.A1M(executorService, 5, c5ez);
        11T.A0F(kwx, 9);
        this.A03 = c02333uu;
        this.A05 = scheduledExecutorService;
        this.A02 = locationManager;
        this.A06 = new AtomicBoolean();
        this.A04 = new LFt(this);
    }
}
