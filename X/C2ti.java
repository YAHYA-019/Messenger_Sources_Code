package X;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: X.2ti, reason: invalid class name */
/* loaded from: 2ti.class */
public final class C2ti {
    public final Context A00;
    public final PackageManager A01;

    public C2ti(Context context, PackageManager packageManager) {
        this.A01 = packageManager;
        this.A00 = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        if (r311 == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.3Mi A00() {
        /*
            r301 = this;
            r0 = 192(0xc0, float:2.69E-43)
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = r301
            android.content.pm.PackageManager r0 = r0.A01     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc9
            r304 = r0
            java.lang.String r0 = "com.facebook.services"
            r305 = r0
            r0 = r304
            r1 = r305
            r2 = r302
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc9
            r306 = r0
            r0 = r306
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L26
            r0 = 0
            return r0
        L26:
            r0 = r306
            java.lang.Integer r0 = X.C2tl.A00(r0)
            r308 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r309 = r0
            r0 = r309
            r0.<init>()
            java.lang.String r0 = "android.permission.CHANGE_DEVICE_IDLE_TEMP_WHITELIST"
            r307 = r0
            r0 = r304
            r1 = r307
            r2 = r305
            int r0 = r0.checkPermission(r1, r2)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L55
            X.4FI r0 = X.C4FI.FACEBOOK_SERVICES_NO_PERMISSION
            r307 = r0
            r0 = r309
            r1 = r307
            boolean r0 = r0.add(r1)
        L55:
            r0 = 1
            r310 = r0
            r0 = 0
            r311 = r0
            r0 = r301
            android.content.Context r0 = r0.A00     // Catch: java.lang.Throwable -> Lc5
            r304 = r0
            java.lang.Class<android.os.PowerWhitelistManager> r0 = android.os.PowerWhitelistManager.class
            r307 = r0
            r0 = r304
            r1 = r307
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> Lc5
            r307 = r0
            r0 = r307
            android.os.PowerWhitelistManager r0 = (android.os.PowerWhitelistManager) r0     // Catch: java.lang.Throwable -> Lc5
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L88
            r0 = r307
            r1 = r305
            r2 = r310
            boolean r0 = r0.isWhitelisted(r1, r2)     // Catch: java.lang.Throwable -> Lc5
            r311 = r0
        L83:
            r0 = r311
            if (r0 != 0) goto L95
        L88:
            X.4FI r0 = X.C4FI.FACEBOOK_SERVICES_NO_DOZE_MODE_WHITELIST
            r307 = r0
            r0 = r309
            r1 = r307
            boolean r0 = r0.add(r1)
        L95:
            r0 = r306
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo
            r307 = r0
            r0 = r307
            boolean r0 = r0.enabled
            r312 = r0
            r0 = r306
            int r0 = r0.versionCode
            r313 = r0
            r0 = r309
            boolean r0 = r0.isEmpty()
            r314 = r0
            X.3Mi r0 = new X.3Mi
            r303 = r0
            r0 = r303
            r1 = r308
            r2 = r309
            r3 = r313
            r4 = r312
            r5 = r314
            r0.<init>(r1, r2, r3, r4, r5)
        Lc3:
            r0 = r303
            return r0
        Lc5:
            goto L83
        Lc9:
            goto Lc3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2ti.A00():X.3Mi");
    }
}
