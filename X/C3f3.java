package X;

import com.facebook.messaging.analytics.perf.MessagingPerformanceLogger;

/* renamed from: X.3f3, reason: invalid class name */
/* loaded from: 3f3.class */
public final class C3f3 implements Runnable {
    public static final String __redex_internal_original_name = "NuxPerfHandler$onNuxFlowPending$1";
    public final /* synthetic */ C3N0 A00;

    public C3f3(C3N0 c3n0) {
        this.A00 = c3n0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3N0 c3n0 = this.A00;
        C00i c00i = c3n0.A02.A00;
        boolean AZk = 1BK.A0M(c00i).AZk(36314034389130709L);
        1SG r0 = (1SG) 1Br.A0B(c3n0.A03);
        if (AZk) {
            r0.A0i("nux_flow");
        } else {
            r0.A0d("show_nux_flow", true);
        }
        boolean AZk2 = 1BK.A0M(c00i).AZk(36320914924715806L);
        1SG r02 = (1SG) 1Br.A0B(c3n0.A04);
        if (AZk2) {
            r02.A0i("nux_flow");
        } else {
            r02.A0d("show_nux_flow", true);
        }
        ((1SG) 1Br.A0B(c3n0.A06)).A0d("show_nux_flow", true);
        ((MessagingPerformanceLogger) 1Br.A0B(c3n0.A01)).A0j("show_nux_flow", "true");
        C1gn c1gn = (C1gn) 1Br.A0B(c3n0.A05);
        synchronized (c1gn) {
            0fH.A0j("MPLDataFreshnessTracker", 0Pz.A0m("markerAnnotate ", "show_nux_flow", "true", ':'));
            if (c1gn.A04 && c1gn.A05) {
                C1gn.A00(c1gn).markerAnnotate(729359638, "show_nux_flow", "true");
            }
        }
    }
}
