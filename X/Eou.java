package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: Eou.class */
public final class Eou {
    public final EfL A00;
    public final EfL A01;
    public final EfL A02;
    public final QuickPerformanceLogger A03;
    public final AtomicBoolean A04 = 7zO.A15();

    public Eou(QuickPerformanceLogger quickPerformanceLogger) {
        this.A03 = quickPerformanceLogger;
        this.A02 = new QR2(quickPerformanceLogger);
        this.A01 = new QR1(quickPerformanceLogger);
        this.A00 = new QR0(quickPerformanceLogger);
    }
}
