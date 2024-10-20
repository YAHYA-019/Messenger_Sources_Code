package X;

import com.facebook.common.perftest.PerfTestConfig;
import com.facebook.endtoend.EndToEnd;

/* renamed from: X.4ed, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ed.class */
public final class C05624ed {
    public final C00i A00 = new 1BQ(16385);
    public final PerfTestConfig A01 = (PerfTestConfig) 1Bi.A03(16592);

    public static boolean A00() {
        boolean A05;
        synchronized (EndToEnd.class) {
            A05 = EndToEnd.A05("battery_metrics");
        }
        return A05;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (com.facebook.endtoend.EndToEnd.A03() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01() {
        /*
            boolean r0 = A00()
            r301 = r0
            r0 = r301
            if (r0 != 0) goto L2a
            boolean r0 = X.1MM.A01
            r301 = r0
            r0 = r301
            if (r0 != 0) goto L2a
            boolean r0 = com.facebook.endtoend.EndToEnd.A04()
            r301 = r0
            r0 = r301
            if (r0 != 0) goto L2a
            boolean r0 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()
            r301 = r0
            r0 = r301
            if (r0 != 0) goto L2a
            boolean r0 = com.facebook.endtoend.EndToEnd.A03()
            r302 = r0
            r0 = 0
            r301 = r0
            r0 = r302
            if (r0 == 0) goto L2c
        L2a:
            r0 = 1
            r301 = r0
        L2c:
            r0 = r301
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05624ed.A01():boolean");
    }
}
