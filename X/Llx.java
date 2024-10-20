package X;

import android.database.sqlite.SQLiteException;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.internal.gtm.zzcj;

/* loaded from: Llx.class */
public final class Llx implements Runnable {
    public static final String __redex_internal_original_name = "zzbt";
    public final /* synthetic */ L2H A00;

    public Llx(L2H l2h) {
        this.A00 = l2h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper myLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        L2H l2h = this.A00;
        if (myLooper == mainLooper) {
            L0g l0g = l2h.A00.A03;
            AbstractC00481b7.A02(l0g);
            l0g.A02.submit(this);
            return;
        }
        boolean A1N = AnonymousClass001.A1N((l2h.A02 > 0L ? 1 : (l2h.A02 == 0L ? 0 : -1)));
        l2h.A02 = 0L;
        if (A1N) {
            if (l2h instanceof K6q) {
                K6k k6k = ((K6q) l2h).A00;
                try {
                    K6m k6m = k6k.A04;
                    L0g.A00();
                    k6m.A0I();
                    L22 l22 = k6m.A00;
                    if (l22.A00(86400000L)) {
                        l22.A00 = SystemClock.elapsedRealtime();
                        LCw.A0A(k6m, "Deleting stale hits (if any)", 2);
                        k6m.A0D("Deleted stale hits, count", Integer.valueOf(k6m.A0J().delete("hits2", "hit_time < ?", new String[]{Long.toString(System.currentTimeMillis() - 2592000000L)})));
                    }
                    k6k.A0K();
                } catch (SQLiteException e) {
                    k6k.A0F("Failed to delete stale hits", e);
                }
                k6k.A05.A01(86400000L);
                return;
            }
            if (!(l2h instanceof K6p)) {
                K6i k6i = ((K6o) l2h).A00;
                L0g.A00();
                L0g.A00();
                k6i.A0I();
                if (k6i.A00 != null) {
                    LCw.A0A(k6i, "Inactivity, disconnecting from device AnalyticsService", 2);
                    k6i.A0J();
                    return;
                }
                return;
            }
            K6k k6k2 = ((K6p) l2h).A00;
            long j = k6k2.A00;
            L0g.A00();
            k6k2.A0I();
            K6h k6h = ((LCw) k6k2).A00.A0D;
            L9t.A02(k6h);
            long A0K = k6h.A0K();
            k6k2.A0E("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(A0K != 0 ? Math.abs(System.currentTimeMillis() - A0K) : -1));
            K6k.A03(k6k2);
            try {
                K6k.A04(k6k2);
                L9t.A02(k6h);
                k6h.A0L();
                k6k2.A0K();
                k6k2.A0K();
                if (k6k2.A00 != j) {
                    zzcj.A00(k6k2);
                }
            } catch (Exception e2) {
                k6k2.A0G("Local dispatch failed", e2);
                L9t.A02(k6h);
                k6h.A0L();
                k6k2.A0K();
                k6k2.A0K();
            }
        }
    }
}
