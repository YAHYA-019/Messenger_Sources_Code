package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: Kss.class */
public final class Kss {
    public final QuickPerformanceLogger A00;
    public final AtomicBoolean A01;

    public Kss(QuickPerformanceLogger quickPerformanceLogger) {
        11T.A0F(quickPerformanceLogger, 1);
        this.A00 = quickPerformanceLogger;
        this.A01 = 7zO.A15();
    }

    public final void A00(String str) {
        AtomicBoolean atomicBoolean = this.A01;
        if (!atomicBoolean.get()) {
            this.A00.markerStart(614276078);
            atomicBoolean.set(true);
        }
        this.A00.markerPoint(614276078, str);
    }

    public final void A01(String str, String str2) {
        this.A00.markerAnnotate(614276078, str, str2);
    }

    public final void A02(boolean z, String str) {
        A01("end_reason", str);
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        short s = 3;
        if (z) {
            s = 2;
        }
        quickPerformanceLogger.markerEnd(614276078, s);
        this.A01.set(false);
    }
}
