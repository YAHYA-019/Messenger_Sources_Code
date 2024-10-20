package X;

import android.os.SystemClock;

/* renamed from: X.0j6, reason: invalid class name */
/* loaded from: 0j6.class */
public final class C0j6 {
    public long A00;
    public final java.util.Map A02 = AnonymousClass001.A0u();
    public final Object A01 = AnonymousClass001.A0R();

    public boolean A00(String str) {
        java.util.Map map;
        Long l;
        Object obj = this.A01;
        synchronized (obj) {
            map = this.A02;
            l = (Long) map.get(str);
            this.A00 = 0L;
        }
        if (l == null) {
            l = 0L;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long longValue = l.longValue();
        if (longValue == 0) {
            synchronized (obj) {
                AnonymousClass001.A18(str, uptimeMillis, map);
            }
        }
        if (longValue > uptimeMillis) {
            0fH.A0g(str, "lacrima", "Trickler - Already planned: %s");
            return true;
        }
        if (uptimeMillis - longValue >= 3000) {
            return false;
        }
        long j = (longValue + 3000) - uptimeMillis;
        synchronized (obj) {
            this.A00 = j;
            AnonymousClass001.A18(str, uptimeMillis + j, map);
        }
        try {
            0fH.A0d(str, Long.valueOf(j), "lacrima", "Trickler - Waiting: %s %d");
            Thread.sleep(j);
            return false;
        } catch (InterruptedException e) {
            C0iy.A00().Bwu("ReportSenderTrickler", e, null);
            return false;
        }
    }
}
