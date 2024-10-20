package X;

import android.app.ActivityManager;
import java.util.concurrent.Callable;

/* renamed from: X.3iw, reason: invalid class name */
/* loaded from: 3iw.class */
public final class C3iw implements Callable {
    public final long A00;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (r303 != Long.MAX_VALUE) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C3iw(android.app.ActivityManager r302) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r302
            if (r0 == 0) goto L2b
            r0 = r302
            long r0 = A00(r0)
            r303 = r0
            r0 = 0
            r305 = r0
            r0 = r303
            r1 = r305
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r307 = r0
            r0 = r307
            if (r0 <= 0) goto L2b
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r305 = r0
            r0 = r303
            r1 = r305
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L2e
        L2b:
            r0 = -1
            long r0 = (long) r0
            r303 = r0
        L2e:
            r0 = r301
            r1 = r303
            r0.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3iw.<init>(android.app.ActivityManager):void");
    }

    public static long A00(ActivityManager activityManager) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        long j = this.A00;
        Double valueOf = Double.valueOf(-1.0d);
        double d = 0.0d / 0.0d;
        if (j != -1) {
            long[] jArr = new long[8];
            C0dl.A02(AnonymousClass000.A00(68), jArr, AnonymousClass027.A00);
            long j2 = jArr[3];
            if (j2 > 0) {
                double d2 = 0.0d / 0.0d;
                if (j2 != Long.MAX_VALUE) {
                    double d3 = (j2 * 1024.0d) / j;
                    if (d3 < 1.0d) {
                        valueOf = Double.valueOf(d3);
                    }
                }
            }
        }
        return valueOf;
    }
}
