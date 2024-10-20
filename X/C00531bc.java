package X;

import com.mapbox.mapboxsdk.location.LocationComponentOptions;

/* renamed from: X.1bc, reason: invalid class name and case insensitive filesystem */
/* loaded from: 1bc.class */
public final class C00531bc implements 1bH {
    public final 1bH A00;

    public C00531bc(1bH r302) {
        this.A00 = r302;
    }

    public long BIh(C03b c03b) {
        return Math.min(this.A00.BIh(c03b), LocationComponentOptions.STALE_STATE_DELAY_MS);
    }

    public String getName() {
        return 0Pz.A0g(this.A00.getName(), ".capped_", LocationComponentOptions.STALE_STATE_DELAY_MS);
    }
}
