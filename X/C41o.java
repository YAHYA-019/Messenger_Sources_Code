package X;

import android.content.Context;

/* renamed from: X.41o, reason: invalid class name */
/* loaded from: 41o.class */
public final class C41o {
    public final Context A00;

    public C41o(Context context) {
        this.A00 = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        if (r0.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(X.C41o r301) {
        /*
            r0 = r301
            android.content.Context r0 = r0.A00
            r301 = r0
            r0 = r301
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            r302 = r0
            r0 = r302
            int r0 = r0.targetSdkVersion
            r303 = r0
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            r304 = r0
            r0 = 26
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 >= r1) goto L31
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            r302 = r0
            r0 = r301
            r1 = r302
            int r0 = r0.checkCallingOrSelfPermission(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L31
        L2b:
            r0 = 1
            r306 = r0
        L2e:
            r0 = r306
            return r0
        L31:
            r0 = r301
            r1 = r304
            int r0 = r0.checkCallingOrSelfPermission(r1)
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = 0
            r304 = r0
            r0 = r305
            if (r0 != 0) goto L2e
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41o.A00(X.41o):boolean");
    }
}
