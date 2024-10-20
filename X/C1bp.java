package X;

import com.mapbox.mapboxsdk.location.LocationComponentOptions;

/* renamed from: X.1bp, reason: invalid class name */
/* loaded from: 1bp.class */
public final class C1bp implements 1bH {
    public final long A00;
    public final 1bH A01 = new Object();

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.1bH] */
    public C1bp(long j) {
        this.A00 = j;
    }

    public long BIh(C03b c03b) {
        long BIh = this.A01.BIh(c03b);
        if (BIh > LocationComponentOptions.STALE_STATE_DELAY_MS) {
            BIh = 30000;
        }
        if (BIh >= this.A00) {
            return BIh;
        }
        return 0L;
    }

    public String getName() {
        return 0Pz.A0h("durations_more_than_", "_capped", this.A00);
    }
}
