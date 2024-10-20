package X;

import com.facebook.common.network.FbNetworkManager;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.MarkerEditor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.41l, reason: invalid class name */
/* loaded from: 41l.class */
public final class C41l {
    public static C41m A03;
    public static String A04;
    public static final AtomicInteger A05 = new AtomicInteger();
    public final int A00;
    public final FbNetworkManager A01;
    public final LightweightQuickPerformanceLogger A02;

    public C41l(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, Boolean bool, String str, String str2, String str3) {
        FbNetworkManager fbNetworkManager = (FbNetworkManager) 1Bi.A03(16687);
        this.A01 = fbNetworkManager;
        this.A02 = lightweightQuickPerformanceLogger;
        int incrementAndGet = A05.incrementAndGet();
        this.A00 = incrementAndGet;
        A03 = new C41m();
        String A0D = fbNetworkManager.A0D();
        A0D = 2Go.A00(A0D, "WIFI/") ? null : A0D;
        lightweightQuickPerformanceLogger.markerStart(238949517, incrementAndGet);
        MarkerEditor withMarker = lightweightQuickPerformanceLogger.withMarker(238949517, incrementAndGet);
        withMarker.annotate("reason", str);
        withMarker.annotate("carrier_id_before", str2);
        withMarker.annotate("eligibility_hash_before", str3);
        withMarker.annotate("dialtone_state_before", bool.booleanValue());
        withMarker.annotate("prev_network_details", A04);
        withMarker.annotate("start_network_details", A0D);
        withMarker.markerEditingCompleted();
        A04 = A0D;
    }

    public void A00() {
        if (A03.A00(32)) {
            this.A02.withMarker(238949517, this.A00).pointEditor("fetch_zero_token_zero_rating_disabled").pointEditingCompleted().markerEditingCompleted();
        }
    }

    public void A01() {
        if (A03.A00(16)) {
            this.A02.withMarker(238949517, this.A00).pointEditor("no_network").markerEditingCompleted();
        }
    }

    public void A02(String str, boolean z) {
        this.A02.withMarker(238949517, this.A00).pointEditor("fetch_zero_token").addPointData("reason", str).addPointData("fromUnknownState", z).pointEditingCompleted().markerEditingCompleted();
    }
}
