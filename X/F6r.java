package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: F6r.class */
public final class F6r {
    public final F97 A00;
    public final F5P A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04 = 1BK.A0C();
    public final 1Br A05;
    public final boolean A06;
    public final 1Br A07;
    public final AtomicInteger A08;
    public final AtomicInteger A09;
    public final AtomicInteger A0A;
    public final AtomicInteger A0B;
    public final AtomicInteger A0C;
    public final AtomicInteger A0D;
    public final AtomicInteger A0E;
    public volatile long A0F;

    public F6r() {
        1Br A0S = 7zM.A0S();
        this.A05 = A0S;
        this.A02 = 7zM.A0d();
        this.A07 = 1Bq.A00(17093);
        this.A01 = new F5P((LightweightQuickPerformanceLogger) 1Br.A0B(A0S));
        C0dp c0dp = (C0dp) 1Br.A0B(this.A02);
        QuickPerformanceLogger A0e = 7zP.A0e(this.A05);
        7zR.A1O(c0dp, A0e);
        F97 f97 = new F97(null, A0e);
        f97.A01 = 1012343311;
        f97.A02 = c0dp;
        java.util.Map map = f97.A05;
        Number A0o = 1BK.A0o(1012343311, map);
        int intValue = A0o != null ? 1 + A0o.intValue() : 1;
        1BK.A1P(1012343311, map, intValue);
        f97.A00 = intValue;
        this.A00 = f97;
        this.A03 = 1Bq.A00(99918);
        this.A0F = -1;
        this.A08 = new AtomicInteger();
        this.A0E = new AtomicInteger();
        this.A0D = new AtomicInteger();
        this.A0A = new AtomicInteger();
        this.A0B = new AtomicInteger();
        this.A09 = new AtomicInteger();
        this.A0C = new AtomicInteger();
        1Br.A07(this.A04).Auy(36596475731512247L);
        1Br.A07(this.A04).Auy(36596475731577784L);
        this.A06 = 1Br.A07(this.A04).AZk(36315000754938223L);
    }

    public static final void A00(F6r f6r) {
        QuickPerformanceLogger A0e = 7zP.A0e(f6r.A05);
        long j = -1;
        if (f6r.A0F != j) {
            j = 1Br.A00(f6r.A02) - f6r.A0F;
        }
        A0e.markerAnnotate(594094608, "time_since_last_tail_fetch_start", j);
    }
}
