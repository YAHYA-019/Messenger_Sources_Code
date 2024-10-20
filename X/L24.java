package X;

import android.content.Context;
import android.os.Handler;

/* loaded from: L24.class */
public final class L24 {
    public static Boolean A02;
    public final Context A00;
    public final Handler A01 = new Handler();

    public L24(Context context) {
        this.A00 = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (((android.content.pm.ComponentInfo) r0).enabled == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(android.content.Context r301) {
        /*
            r0 = r301
            X.AbstractC00481b7.A02(r0)
            java.lang.Boolean r0 = X.L24.A02
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L11
            r0 = r302
            boolean r0 = r0.booleanValue()
            return r0
        L11:
            java.lang.String r0 = "com.google.android.gms.analytics.AnalyticsService"
            r303 = r0
            r0 = r301
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            r304 = r0
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            r302 = r0
            r0 = r302
            r1 = r301
            r2 = r303
            r0.<init>(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            r0 = r304
            r1 = r302
            r2 = 0
            android.content.pm.ServiceInfo r0 = r0.getServiceInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L3c
            r0 = r302
            boolean r0 = r0.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r305
            if (r0 != 0) goto L41
        L3c:
            r0 = 0
            r306 = r0
            r0 = 0
            r304 = r0
        L41:
            r0 = r306
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.L24.A02 = r0
            r0 = r306
            return r0
        L4c:
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L24.A00(android.content.Context):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x014f, code lost:
    
        if (r0.A00 == 1) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A01(android.content.Intent r302, final int r303) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L24.A01(android.content.Intent, int):int");
    }
}
