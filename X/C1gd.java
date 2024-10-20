package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.systrace.Systrace;

/* renamed from: X.1gd, reason: invalid class name */
/* loaded from: 1gd.class */
public final class C1gd implements 0Xt {
    public static QuickPerformanceLogger A00;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.0Xt] */
    static {
        ?? obj = new Object();
        long j = Systrace.A00;
        0YE.A01((0Xt) obj);
    }

    public void CRH() {
        if (A00 == null || !Systrace.A0E(4)) {
            return;
        }
        QuickPerformanceLogger quickPerformanceLogger = A00;
        11T.A0D(quickPerformanceLogger);
        quickPerformanceLogger.updateListenerMarkers();
    }

    public void CRI() {
        QuickPerformanceLogger quickPerformanceLogger = A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.updateListenerMarkers();
        }
    }
}
