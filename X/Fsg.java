package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* loaded from: Fsg.class */
public final class Fsg implements GL1 {
    public final QuickPerformanceLogger A00;

    public Fsg(QuickPerformanceLogger quickPerformanceLogger) {
        11T.A0F(quickPerformanceLogger, 1);
        this.A00 = quickPerformanceLogger;
    }

    @Override // X.GL1
    public void BZz(boolean z, String str) {
        11T.A0F(str, 1);
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        quickPerformanceLogger.markerAnnotate(614284135, "end_reason", str);
        short s = 3;
        if (z) {
            s = 2;
        }
        quickPerformanceLogger.markerEnd(614284135, s);
    }

    @Override // X.GL1
    public void Bau(String str) {
        this.A00.markerPoint(614284135, str);
    }
}
