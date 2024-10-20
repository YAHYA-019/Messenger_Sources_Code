package X;

import android.os.Build;

/* renamed from: X.41r, reason: invalid class name */
/* loaded from: 41r.class */
public final class C41r {
    public final 04J A00;

    public C41r(04J r302) {
        this.A00 = r302;
    }

    public void A00(int i, int i2, int i3, int i4) {
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        Integer valueOf3 = Integer.valueOf(i3);
        Integer valueOf4 = Integer.valueOf(i4);
        0fH.A03(C41r.class, valueOf, valueOf2, valueOf3, valueOf4, "reportWifiCollectionStats: ageSec=%d, scanTs=%d, wifiApCount=%d, wifiApCountFiltered=%d");
        1UG A08 = 1BK.A08(this.A00, "wifi_scan_collection_stats");
        if (A08.isSampled()) {
            int i5 = Build.VERSION.SDK_INT;
            A08.A5q("age_sec", valueOf);
            A08.A5q("scan_timestamp_sec", valueOf2);
            A08.A5q("wifi_ap_count", valueOf3);
            A08.A5q("wifi_ap_count_filtered", valueOf4);
            A08.A5q("android_api_level", Integer.valueOf(i5));
            A08.BZL();
        }
    }
}
