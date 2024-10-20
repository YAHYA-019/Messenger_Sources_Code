package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.3RC, reason: invalid class name */
/* loaded from: 3RC.class */
public final class C3RC {
    public int A00 = -1;
    public final int A01;
    public final QuickPerformanceLogger A02;

    public C3RC(QuickPerformanceLogger quickPerformanceLogger, int i) {
        this.A02 = quickPerformanceLogger;
        this.A01 = i;
    }

    public static void A00(C3RC c3rc, Object obj, String str) {
        QuickPerformanceLogger quickPerformanceLogger = c3rc.A02;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerAnnotate(c3rc.A01, c3rc.A00, str, AnonymousClass001.A05(obj));
        }
    }

    public void A01(int i, long j, long j2, boolean z) {
        A00(this, 1BK.A0l(i), "num_files_deleted");
        A00(this, Long.valueOf(j), "media_bank_size_before_eviction_bytes");
        A00(this, Long.valueOf(j2), "size_deleted_from_media_bank_bytes");
        QuickPerformanceLogger quickPerformanceLogger = this.A02;
        if (quickPerformanceLogger != null) {
            int i2 = this.A01;
            int i3 = this.A00;
            short s = 3;
            if (z) {
                s = 2;
            }
            quickPerformanceLogger.markerEnd(i2, i3, s);
        }
        this.A00 = -1;
    }

    public void A02(String str) {
        QuickPerformanceLogger quickPerformanceLogger = this.A02;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(this.A01, this.A00, str);
        }
    }
}
