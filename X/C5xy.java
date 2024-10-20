package X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.5xy, reason: invalid class name */
/* loaded from: 5xy.class */
public final class C5xy implements 2aI {
    public String A00;
    public C2a2 A01;
    public boolean A02;
    public final 16K A03;
    public final 1Br A04;
    public final 0DE A05;

    public C5xy() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        11T.A0A(newSingleThreadExecutor);
        this.A05 = 0DK.A02(new 2Zq(newSingleThreadExecutor), new C2a0(null));
        this.A00 = "";
        this.A03 = 0KV.A00(0S2.A00, 0, 0);
        this.A04 = 1Bq.A00(16634);
    }

    public static final 04J A00(C5xy c5xy) {
        return 1Br.A02(c5xy.A04);
    }

    public static final void A01(C5xy c5xy, C00m c00m) {
        2aK.A03((Integer) null, (0DE) null, new C82s(c5xy, c00m, null, 4), c5xy, 3);
    }

    public 0DE getCoroutineContext() {
        return this.A05;
    }
}
