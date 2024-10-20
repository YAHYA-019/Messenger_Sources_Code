package X;

import android.location.LocationManager;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.google.common.collect.EvictingQueue;

/* renamed from: X.5ez, reason: invalid class name */
/* loaded from: 5ez.class */
public final class C5ez {
    public static final String[] A08 = {"gps", "network"};
    public L5D A00;
    public final LocationManager A01;
    public final C02333uu A02;
    public final C5ex A03;
    public final C03633ym A04;
    public final C5ey A05;
    public final LightweightQuickPerformanceLogger A06;
    public final EvictingQueue A07;

    public C5ez(LocationManager locationManager, C02333uu c02333uu, C5ex c5ex, C03633ym c03633ym, C5ey c5ey, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        this.A02 = c02333uu;
        this.A01 = locationManager;
        this.A03 = c5ex;
        this.A05 = c5ey;
        this.A04 = c03633ym;
        this.A06 = lightweightQuickPerformanceLogger;
        this.A07 = new EvictingQueue(c5ey != null ? (int) c5ey.A00.Auy(36592189357490681L) : 10);
    }

    private void A00(String str, boolean z) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A06;
        if (lightweightQuickPerformanceLogger != null) {
            lightweightQuickPerformanceLogger.markerAnnotate(794441906, str, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0372  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.L5D A01(java.lang.String r302, float r303, long r304, boolean r306) {
        /*
            Method dump skipped, instructions count: 1360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5ez.A01(java.lang.String, float, long, boolean):X.L5D");
    }

    public void A02(L5D l5d) {
        String str;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A06;
        if (lightweightQuickPerformanceLogger != null) {
            lightweightQuickPerformanceLogger.markerStart(794430333);
        }
        short s = 3;
        if (l5d == null) {
            str = "new location is null";
        } else {
            L5D l5d2 = this.A00;
            if (l5d2 == null || l5d2.A05() == null || (l5d.A05() != null && l5d.A05().longValue() > l5d2.A05().longValue())) {
                this.A00 = l5d;
                s = 2;
                if (lightweightQuickPerformanceLogger == null) {
                    return;
                }
                lightweightQuickPerformanceLogger.markerEnd(794430333, s);
            }
            str = "saved location is newer";
        }
        if (lightweightQuickPerformanceLogger != null) {
            lightweightQuickPerformanceLogger.markerAnnotate(794430333, "end_reason", str);
            lightweightQuickPerformanceLogger.markerEnd(794430333, s);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r0.A00.AZk(36310714379535339L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A03() {
        /*
            r301 = this;
            r0 = r301
            X.5ey r0 = r0.A05
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L23
            r0 = r302
            X.1CO r0 = r0.A00
            r303 = r0
            r0 = 36310714379535339(0x810067002203eb, double:3.026380212904647E-306)
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.AZk(r1)
            r306 = r0
            r0 = 1
            r307 = r0
            r0 = r306
            if (r0 != 0) goto L28
        L23:
            r0 = 0
            r307 = r0
            r0 = 0
            r302 = r0
        L28:
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5ez.A03():boolean");
    }
}
