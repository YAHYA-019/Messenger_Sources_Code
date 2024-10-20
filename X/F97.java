package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.TimeUnit;

/* loaded from: F97.class */
public final class F97 {
    public int A00;
    public int A01;
    public C0dp A02;
    public final C7z0 A03;
    public final QuickPerformanceLogger A04;
    public final java.util.Map A05;

    public F97(C7z0 c7z0, QuickPerformanceLogger quickPerformanceLogger) {
        11T.A0F(quickPerformanceLogger, 1);
        this.A04 = quickPerformanceLogger;
        this.A03 = c7z0;
        this.A05 = DKD.A13();
    }

    public static final void A00(F97 f97, String str) {
        C7z0 c7z0 = f97.A03;
        if (c7z0 != null) {
            c7z0.Bcr(0Pz.A0W("pagination_", str));
        }
    }

    public final void A01(int i, int i2, long j, String str) {
        QuickPerformanceLogger quickPerformanceLogger = this.A04;
        quickPerformanceLogger.markerAnnotate(i, i2, "end_reason", str);
        A00(this, "cancel");
        quickPerformanceLogger.markerEnd(i, i2, (short) 4, j, TimeUnit.MILLISECONDS);
    }

    public final void A02(int i, int i2, long j, String str) {
        QuickPerformanceLogger quickPerformanceLogger = this.A04;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        quickPerformanceLogger.markerPoint(i, i2, "fetch_request_end", j, timeUnit);
        quickPerformanceLogger.markerAnnotate(i, i2, "end_reason", str);
        quickPerformanceLogger.markerEnd(i, i2, (short) 3, j, timeUnit);
        A00(this, "marker_fail");
    }
}
