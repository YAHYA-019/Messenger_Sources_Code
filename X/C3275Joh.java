package X;

import com.google.common.base.Preconditions;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Joh, reason: case insensitive filesystem */
/* loaded from: Joh.class */
public final class C3275Joh extends C3e6 {
    public Klk A00;
    public L5D A01;
    public ScheduledFuture A02;
    public boolean A03;
    public final C0dp A04;
    public final LDH A05;
    public final ScheduledExecutorService A06;
    public final MIR A07 = new RpM(this);
    public final C02333uu A08;
    public final C5ez A09;

    public C3275Joh(C0dp c0dp, C02333uu c02333uu, C5ez c5ez, LDH ldh, ScheduledExecutorService scheduledExecutorService) {
        this.A08 = c02333uu;
        this.A05 = ldh;
        this.A09 = c5ez;
        this.A04 = c0dp;
        this.A06 = scheduledExecutorService;
    }

    public static void A00(C3275Joh c3275Joh, Throwable th) {
        c3275Joh.A03 = false;
        c3275Joh.A05.A09();
        ScheduledFuture scheduledFuture = c3275Joh.A02;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            c3275Joh.A02 = null;
        }
        c3275Joh.A02(th);
    }

    @Override // X.C3e6
    public void A03() {
        synchronized (this) {
            A00(this, new CancellationException());
        }
    }

    public void A04(Klk klk, String str) {
        synchronized (this) {
            boolean z = false;
            Preconditions.checkState(AnonymousClass001.A1O(this.A03 ? 1 : 0), "already running");
            if (!isDone()) {
                z = true;
            }
            Preconditions.checkState(z, "already done");
            klk.getClass();
            this.A00 = klk;
            if (C02333uu.A00(this.A08, 0S2.A0C, null, null, true) != 0S2.A0N) {
                A02(new KQd(KMw.A02));
            } else {
                C5ez c5ez = this.A09;
                Klk klk2 = this.A00;
                L5D A00 = LBf.A00(c5ez, str, klk2.A00, -539621063, klk2.A01, false);
                if (A00 != null) {
                    this.A01 = A00;
                    A01(A00);
                } else {
                    this.A03 = true;
                    LDH ldh = this.A05;
                    ScheduledExecutorService scheduledExecutorService = this.A06;
                    ldh.A0E(scheduledExecutorService);
                    this.A02 = scheduledExecutorService.schedule((Runnable) new S7a(this), this.A00.A02, TimeUnit.MILLISECONDS);
                    Klk klk3 = this.A00;
                    LBf.A03(this.A07, new KmL(null, klk3.A03, klk3.A04, Long.valueOf(klk3.A02), 0.0f, 0.6666667f, 0, 500L, false, false, klk3.A05, klk3.A06), ldh, str, 2139251081);
                }
            }
        }
    }
}
