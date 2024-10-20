package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.TimeUnit;

/* loaded from: Lp0.class */
public final class Lp0 implements Runnable {
    public static final String __redex_internal_original_name = "FrameBasedTRLogger$createEndOfFrameCallback$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ Kqw A01;

    public Lp0(Kqw kqw, int i) {
        this.A01 = kqw;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Kqw kqw = this.A01;
        QuickPerformanceLogger quickPerformanceLogger = kqw.A0B;
        long currentMonotonicTimestampNanos = quickPerformanceLogger.currentMonotonicTimestampNanos();
        InterfaceC03913za interfaceC03913za = kqw.A0C;
        if (interfaceC03913za != null) {
            interfaceC03913za.C5d(kqw.A07, this.A00);
        }
        quickPerformanceLogger.markerEnd(kqw.A07, this.A00, (short) 2, currentMonotonicTimestampNanos, TimeUnit.NANOSECONDS);
    }
}
