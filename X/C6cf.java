package X;

import android.util.SparseBooleanArray;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.6cf, reason: invalid class name */
/* loaded from: 6cf.class */
public final class C6cf {
    public final 1Br A01 = 1Bq.A00(16520);
    public final SparseBooleanArray A00 = new SparseBooleanArray();

    public static final void A00(C6cf c6cf, int i) {
        C00i c00i = c6cf.A01.A00;
        if (((QuickPerformanceLogger) c00i.get()).isMarkerOn(1900570, i)) {
            SparseBooleanArray sparseBooleanArray = c6cf.A00;
            synchronized (sparseBooleanArray) {
                if (!sparseBooleanArray.get(i)) {
                    sparseBooleanArray.put(i, true);
                    ((QuickPerformanceLogger) c00i.get()).markerPoint(1900570, i, "TIME_TO_START");
                }
            }
        }
    }

    public final void A01(int i) {
        C00i c00i = this.A01.A00;
        if (((QuickPerformanceLogger) c00i.get()).isMarkerOn(1900570, i)) {
            return;
        }
        ((QuickPerformanceLogger) c00i.get()).markerStart(1900570, i);
    }
}
