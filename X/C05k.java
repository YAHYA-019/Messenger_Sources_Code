package X;

import java.io.File;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.05k, reason: invalid class name */
/* loaded from: 05k.class */
public final class C05k implements C0iO {
    public final long A00;
    public final 0gK A01;
    public final 0iP A02;
    public final 0jH A03;
    public final ScheduledExecutorService A04;

    public C05k(0gK r302, 0iP r303, 0jH r304, ScheduledExecutorService scheduledExecutorService, long j) {
        this.A02 = r303;
        this.A03 = r304;
        this.A01 = r302;
        this.A04 = scheduledExecutorService;
        this.A00 = j;
    }

    public void A00() {
        synchronized (this.A02) {
            0gK r0 = this.A01;
            File file = r0.A02.A05;
            0RZ.A03(file, "Did you call SessionManager.init()?");
            if (!file.exists()) {
                this.A04.shutdown();
            }
            if (C0ft.A09()) {
                0fH.A0j("lacrima", "PeriodicDetector onDetect...");
                C0pu c0pu = this.A03.A03;
                0RZ.A03(c0pu, "Did you call SessionManager.init()?");
                c0pu.A08(System.currentTimeMillis());
                C0qh c0qh = new C0qh(null);
                r0.A0A(c0qh, C0gq.CRITICAL_REPORT, this);
                r0.A0A(c0qh, C0gq.LARGE_REPORT, this);
            }
        }
    }

    @Override // X.C0iO
    public int getHealthEventSamplingRate() {
        return 50000000;
    }

    @Override // X.C0iO
    public /* synthetic */ C0l0 getLimiter() {
        return null;
    }

    @Override // X.C0iO
    public 0iP getName() {
        return this.A02;
    }

    @Override // X.C0iO
    public void start() {
        long j = this.A00;
        if (j > 0) {
            this.A04.scheduleWithFixedDelay(new Runnable() { // from class: X.05m
                public static final String __redex_internal_original_name = "PeriodicDetector$1";

                @Override // java.lang.Runnable
                public void run() {
                    C05k.this.A00();
                }
            }, j, j, TimeUnit.SECONDS);
        }
    }
}
