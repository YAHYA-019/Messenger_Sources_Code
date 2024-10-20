package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;

/* renamed from: X.3wq, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3wq.class */
public final class C02973wq implements 1K6 {
    public final 1KA A00;
    public final 1KA A01;
    public final 1KA A02;

    public C02973wq(AwakeTimeSinceBootClock awakeTimeSinceBootClock) {
        this.A01 = new 1KA(awakeTimeSinceBootClock, "pivots");
        this.A00 = new 1KA(awakeTimeSinceBootClock, "global_lock");
        this.A02 = new 1KA(awakeTimeSinceBootClock, "open_traces");
    }

    public void BLS(0El r302) {
        this.A00.A00(r302);
    }

    public void BLT(0El r302) {
        this.A00.A01(r302);
    }

    public void Cai(0El r302, 1Qb r303) {
    }

    public void Caj(0El r302, 1Qb r303) {
    }

    public void D4e(0El r302, int i) {
        this.A02.A00(r302);
    }

    public void D4f(0El r302, int i) {
        this.A02.A01(r302);
    }
}
