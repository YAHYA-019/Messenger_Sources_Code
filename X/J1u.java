package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: J1u.class */
public final class J1u implements Runnable {
    public static final String __redex_internal_original_name = "MediaManager$maybeEndMarkerAfterDelay$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ QuickPerformanceLogger A02;
    public final /* synthetic */ short A03;

    public J1u(QuickPerformanceLogger quickPerformanceLogger, int i, long j, short s) {
        this.A02 = quickPerformanceLogger;
        this.A00 = i;
        this.A03 = s;
        this.A01 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        QuickPerformanceLogger quickPerformanceLogger = this.A02;
        int i = this.A00;
        short s = this.A03;
        long j = this.A01;
        Long valueOf = Long.valueOf(j);
        ConcurrentHashMap concurrentHashMap = IFP.A01;
        Integer valueOf2 = Integer.valueOf(i);
        Number A15 = GOn.A15(valueOf2, concurrentHashMap);
        if ((A15 == null || A15.shortValue() != 2) && quickPerformanceLogger.isMarkerOn(1042231970, i)) {
            if (valueOf != null) {
                quickPerformanceLogger.markerEnd(1042231970, i, s, j, TimeUnit.NANOSECONDS);
            } else {
                quickPerformanceLogger.markerEnd(1042231970, i, s);
            }
            concurrentHashMap.remove(valueOf2);
        }
    }
}
