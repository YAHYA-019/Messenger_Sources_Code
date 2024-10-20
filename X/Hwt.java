package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;

/* loaded from: Hwt.class */
public abstract class Hwt {
    public static final 1Br A00;
    public static final QuickPerformanceLogger A01;
    public static final boolean A02;

    static {
        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        if (qPLInstance == null) {
            throw AnonymousClass001.A0N("QPL instance not initialized");
        }
        A01 = qPLInstance;
        1Br A0C = 1BK.A0C();
        A00 = A0C;
        A02 = 1Br.A07(A0C).AZk(36317947102703558L);
    }

    public static final void A00(String str) {
        QuickPerformanceLogger quickPerformanceLogger = A01;
        if (quickPerformanceLogger.isMarkerOn(454302975) && A02) {
            quickPerformanceLogger.markerPoint(454302975, str);
        }
    }
}
