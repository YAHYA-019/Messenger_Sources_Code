package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: X.50f, reason: invalid class name */
/* loaded from: 50f.class */
public final class C50f {
    public final C00i A00;

    public C50f() {
        this.A00 = new 1BQ(16385);
    }

    public C50f(int i) {
    }

    public static boolean A00(C50o c50o) {
        return ((2yD) ((C50f) c50o.A02.A00.get()).A00.get()).AZk(36314755943571630L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003d, code lost:
    
        if (((X.2yD) r0.get()).AZk(36314755941671071L) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A01() {
        /*
            r301 = this;
            r0 = r301
            X.00i r0 = r0.A00
            r302 = r0
            r0 = r302
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r303 = r0
            r0 = 36314755941802144(0x810414000420a0, double:3.0289361131562394E-306)
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.AZk(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L40
            r0 = r302
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r303 = r0
            r0 = 36314755941671071(0x8104140002209f, double:3.028936113073348E-306)
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.AZk(r1)
            r307 = r0
            r0 = 1
            r306 = r0
            r0 = r307
            if (r0 == 0) goto L43
        L40:
            r0 = 0
            r306 = r0
        L43:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50f.A01():boolean");
    }

    public boolean A02(Context context) {
        if (!((2yD) this.A00.get()).AZk(36314755943375020L) || context.getPackageName().equals("com.facebook.wakizashi")) {
            return false;
        }
        try {
            if (context.getPackageManager() != null) {
                return !"com.android.vending".equals(Build.VERSION.SDK_INT >= 30 ? r0.getInstallSourceInfo(context.getPackageName()).getInstallingPackageName() : r0.getInstallerPackageName(context.getPackageName()));
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
