package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.3Ny, reason: invalid class name */
/* loaded from: 3Ny.class */
public final class C3Ny {
    public final int A00;
    public final int A01;
    public final QuickPerformanceLogger A02;

    public C3Ny(QuickPerformanceLogger quickPerformanceLogger, int i, int i2) {
        this.A02 = quickPerformanceLogger;
        this.A00 = i;
        this.A01 = i2;
    }

    public void A00(String str, String str2) {
        QuickPerformanceLogger quickPerformanceLogger = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        if (str2 == null) {
            str2 = "null";
        }
        quickPerformanceLogger.markerAnnotate(i, i2, str, str2);
    }
}
