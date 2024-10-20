package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: L2x.class */
public final class L2x {
    public final QuickPerformanceLogger A00;
    public final AtomicInteger A01 = DKD.A14();

    public L2x(QuickPerformanceLogger quickPerformanceLogger) {
        this.A00 = quickPerformanceLogger;
    }

    public static final int A00(L2x l2x, KNt kNt, int i) {
        int andIncrement = l2x.A01.getAndIncrement();
        QuickPerformanceLogger quickPerformanceLogger = l2x.A00;
        quickPerformanceLogger.markerStartWithCancelPolicy(i, false, andIncrement, -1, TimeUnit.NANOSECONDS);
        quickPerformanceLogger.markerAnnotate(i, andIncrement, "clientType", kNt.value.intValue());
        return andIncrement;
    }

    public final void A01(int i, boolean z) {
        this.A00.markerAnnotate(178991798, i, "vdid_is_present", z);
    }

    public final void A02(Integer num, Integer num2, Long l, int i) {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        int i2 = -1;
        quickPerformanceLogger.markerAnnotate(178991798, i, "errorCode", num != null ? num.intValue() : -1);
        if (num2 != null) {
            i2 = num2.intValue();
        }
        quickPerformanceLogger.markerAnnotate(178991798, i, "attemptsRemaining", i2);
        quickPerformanceLogger.markerAnnotate(178991798, i, "backOffInSeconds", l != null ? l.longValue() : -1);
        if (GOo.A1U(num != null ? num.intValue() : -1, C0s8.A14(KOL.A07.value, KOL.A04.value, KOL.A03.value))) {
            quickPerformanceLogger.markerEnd(178991798, i, (short) 2);
        } else {
            quickPerformanceLogger.markerEnd(178991798, i, (short) 3);
        }
    }
}
