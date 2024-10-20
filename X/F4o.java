package X;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* loaded from: F4o.class */
public final class F4o {
    public final PackageManager A01 = (PackageManager) 1Bi.A03(100169);
    public final ApplicationInfo A00 = (ApplicationInfo) 1Bn.A0A(100174);

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0079, code lost:
    
        if (r303.checkSignatures(r0, r0) == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.0CS A00(android.content.Intent r301, android.content.pm.ApplicationInfo r302, android.content.pm.PackageManager r303) {
        /*
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r304 = r0
            r0 = 64
            r305 = r0
            r0 = r303
            r1 = r301
            r2 = r305
            java.util.List r0 = r0.queryIntentActivities(r1, r2)     // Catch: java.lang.RuntimeException -> L13
            r304 = r0
            goto L26
        L13:
            r306 = move-exception
            java.lang.String r0 = "SecureContextHelperUtil"
            r307 = r0
            java.lang.String r0 = "Cannot query PackageManager."
            r308 = r0
            r0 = r307
            r1 = r308
            r2 = r306
            X.0fH.A0u(r0, r1, r2)
        L26:
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r301 = r0
            r0 = r304
            java.util.Iterator r0 = r0.iterator()
            r304 = r0
        L31:
            r0 = r304
            boolean r0 = r0.hasNext()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L8e
            r0 = r304
            java.lang.Object r0 = r0.next()
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            r306 = r0
            r0 = r302
            int r0 = r0.uid
            r309 = r0
            r0 = r306
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo
            r308 = r0
            r0 = r308
            int r0 = r0.uid
            r305 = r0
            r0 = r309
            r1 = r305
            if (r0 == r1) goto L7c
            r0 = r303
            r1 = r309
            r2 = r305
            int r0 = r0.checkSignatures(r1, r2)
            r309 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r308 = r0
            r0 = r309
            if (r0 != 0) goto L7f
        L7c:
            r0 = 1
            r305 = r0
        L7f:
            r0 = r305
            if (r0 == 0) goto L31
            r0 = r301
            r1 = r306
            boolean r0 = r0.add(r1)
            goto L31
        L8e:
            X.0CS r0 = new X.0CS
            r308 = r0
            r0 = r308
            r1 = r301
            r0.<init>(r1)
            r0 = r308
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F4o.A00(android.content.Intent, android.content.pm.ApplicationInfo, android.content.pm.PackageManager):X.0CS");
    }
}
