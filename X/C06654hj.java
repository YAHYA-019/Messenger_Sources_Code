package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4hj, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4hj.class */
public final class C06654hj {
    public final QuickPerformanceLogger A00;

    public C06654hj(QuickPerformanceLogger quickPerformanceLogger) {
        this.A00 = quickPerformanceLogger;
    }

    public 5CV A00(int i, int i2) {
        return new 5CV(this.A00.withMarker(i, i2));
    }

    public void A01(int i, int i2, String str, long j, TimeUnit timeUnit) {
        11T.A0F(str, 2);
        this.A00.markerPoint(i, i2, str, j, timeUnit);
    }

    public void A02(int i, int i2, short s, long j, TimeUnit timeUnit) {
        this.A00.markerEnd(i, i2, s, j, timeUnit);
    }
}
