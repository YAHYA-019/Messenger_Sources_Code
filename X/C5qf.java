package X;

import android.os.Handler;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5qf, reason: invalid class name */
/* loaded from: 5qf.class */
public final class C5qf {
    public String A02;
    public final long A03;
    public final QuickPerformanceLogger A04;
    public final Set A05;
    public final Handler A06;
    public final C5qd A07;
    public final boolean A08;
    public int A01 = 21371299;
    public int A00 = 1;

    public C5qf(Handler handler, C5qd c5qd, QuickPerformanceLogger quickPerformanceLogger, Set set, long j, boolean z) {
        c5qd = c5qd == null ? new C5qd() : c5qd;
        this.A04 = quickPerformanceLogger;
        this.A06 = handler;
        this.A07 = c5qd;
        this.A03 = j;
        this.A05 = set;
        this.A08 = z;
    }

    public void A00() {
        synchronized (this) {
            final int i = this.A01;
            final int i2 = this.A00;
            QuickPerformanceLogger quickPerformanceLogger = this.A04;
            quickPerformanceLogger.markerAnnotate(i, i2, "surface_state_on_end", 0L);
            quickPerformanceLogger.markerPoint(i, i2, "surface_exit", null, -1, TimeUnit.NANOSECONDS, 1);
            Iterator it = this.A05.iterator();
            while (it.hasNext()) {
                ((5qW) it.next()).ARW(this.A00);
            }
            if (this.A08) {
                System.gc();
            }
            this.A06.postDelayed(new Runnable() { // from class: X.5r4
                public static final String __redex_internal_original_name = "NavigationTrackerWithMemoryInfo$2";

                @Override // java.lang.Runnable
                public void run() {
                    C5qf c5qf = C5qf.this;
                    QuickPerformanceLogger quickPerformanceLogger2 = c5qf.A04;
                    int i3 = i;
                    int i4 = i2;
                    quickPerformanceLogger2.markerAnnotate(i3, i4, "surface_state_after_end", 0L);
                    quickPerformanceLogger2.markerPoint(i3, i4, "timeout_after_exit");
                    if (0 == c5qf.A03) {
                        System.gc();
                    }
                    Iterator it2 = c5qf.A05.iterator();
                    while (it2.hasNext()) {
                        for (Map.Entry entry : ((5qW) it2.next()).AGc(i4).entrySet()) {
                            quickPerformanceLogger2.markerAnnotate(i3, i4, (String) entry.getKey(), ((Number) entry.getValue()).longValue());
                        }
                    }
                    quickPerformanceLogger2.markerEndAtPoint(i3, i4, (short) 2, "surface_exit");
                }
            }, this.A03);
        }
    }

    public void A01(String str, String str2) {
        synchronized (this) {
            this.A04.markerAnnotate(this.A01, this.A00, str, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (((X.C5qc) r0).A03 == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02(java.lang.String r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5qf.A02(java.lang.String, boolean):void");
    }
}
