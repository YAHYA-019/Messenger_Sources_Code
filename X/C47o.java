package X;

import android.os.MessageQueue;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.47o, reason: invalid class name */
/* loaded from: 47o.class */
public final class C47o {
    public long A00;
    public long A01;
    public final C00i A04 = new 1BQ(84488);
    public final C00i A07 = new 1BQ(16520);
    public final C00i A05 = new 1BQ(32848);
    public final C00i A03 = new 1BQ(16458);
    public final Set A06 = new HashSet();
    public final MessageQueue.IdleHandler A02 = new 4OX(this, 0);

    public C47o() {
        long j = -1;
        this.A00 = j;
        this.A01 = j;
    }

    public static void A00(C47o c47o) {
        Set set = c47o.A06;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            A01(c47o, (int) (longValue >> 32), (int) longValue);
        }
        set.clear();
    }

    public static boolean A01(C47o c47o, int i, int i2) {
        QuickPerformanceLogger quickPerformanceLogger = (QuickPerformanceLogger) c47o.A07.get();
        long j = c47o.A00;
        long j2 = -1;
        if (j == j2) {
            j = c47o.A01;
            if (j == j2) {
                return false;
            }
        }
        quickPerformanceLogger.markerPoint(i, i2, "TTRC_TTST", j, TimeUnit.MILLISECONDS);
        return true;
    }
}
