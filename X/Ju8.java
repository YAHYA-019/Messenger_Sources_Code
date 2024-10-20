package X;

import android.os.Handler;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: Ju8.class */
public final class Ju8 extends LDH {
    public KmL A00;
    public 28M A01;
    public boolean A02;
    public final Handler A03;
    public final LcG A04;
    public final Koi A05;
    public final ExecutorService A06;

    public Ju8(Handler handler, C0dp c0dp, C0dr c0dr, C02333uu c02333uu, C03653yo c03653yo, C03623yk c03623yk, C03633ym c03633ym, C41p c41p, KWX kwx, C5ez c5ez, Koi koi, C5ey c5ey, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        super(c0dp, c0dr, c02333uu, c03653yo, c03623yk, c03633ym, c41p, kwx, c5ez, c5ey, lightweightQuickPerformanceLogger, executorService, scheduledExecutorService);
        this.A04 = new LcG(this);
        this.A03 = handler;
        this.A05 = koi;
        this.A06 = scheduledExecutorService;
    }

    public static void A00(Ju8 ju8, boolean z) {
        ju8.A02 = false;
        ju8.A00 = null;
        28M r0 = ju8.A01;
        if (r0 != null) {
            LcG lcG = ju8.A04;
            r0.A0B(lcG);
            ju8.A01.A0C(lcG);
            if (z) {
                ju8.A01.A09();
            }
            ju8.A01 = null;
        }
    }
}
