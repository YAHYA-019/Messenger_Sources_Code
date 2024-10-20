package X;

import android.os.Build;
import java.util.ArrayList;

/* renamed from: X.41t, reason: invalid class name */
/* loaded from: 41t.class */
public final class C41t {
    public C03623yk A00;
    public C03633ym A01;
    public final C41n A02;
    public final C41s A03;

    public C41t(C03623yk c03623yk, C03633ym c03633ym, C41s c41s, C41n c41n) {
        this.A02 = c41n;
        this.A03 = c41s;
        this.A00 = c03623yk;
        this.A01 = c03633ym;
    }

    private void A00(String str, String str2, boolean z) {
        C03633ym c03633ym = this.A01;
        if (c03633ym != null) {
            c03633ym.A01(null, "WifiScanner", str, str2, null, null, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
    
        if (X.C41o.A00(r0) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.net.wifi.WifiInfo A01(java.lang.String r302) {
        /*
            r301 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r303 = r0
            r0 = 29
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 < r1) goto L97
            boolean r0 = X.C0ft.A08()
            r304 = r0
        L10:
            java.lang.String r0 = "getConnectionInfo"
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L24
            r0 = 1
            r304 = r0
            r0 = r301
            r1 = r305
            r2 = r302
            r3 = r304
            r0.A00(r1, r2, r3)
        L22:
            r0 = 0
            return r0
        L24:
            r0 = 0
            r306 = r0
            r0 = r301
            r1 = r305
            r2 = r302
            r3 = 0
            r0.A00(r1, r2, r3)
            r0 = r301
            X.41s r0 = r0.A03
            r307 = r0
            boolean r0 = X.C41s.A00()
            r304 = r0
            r0 = 0
            r308 = r0
            r0 = r304
            if (r0 == 0) goto L22
            r0 = r307
            X.41o r0 = r0.A05
            r309 = r0
            java.lang.String r0 = "android.permission.ACCESS_WIFI_STATE"
            r305 = r0
            r0 = r309
            android.content.Context r0 = r0.A00
            r306 = r0
            r0 = r306
            r1 = r305
            int r0 = r0.checkCallingOrSelfPermission(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L6a
            r0 = r309
            boolean r0 = X.C41o.A00(r0)
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L6f
        L6a:
            r0 = 0
            r304 = r0
            r0 = 0
            r306 = r0
        L6f:
            r0 = r304
            if (r0 != 0) goto L7c
            java.lang.String r0 = "WifiScan"
            java.lang.String r1 = "Missing ACCESS_FINE_LOCATION permission"
            X.0fH.A0j(r0, r1)
            r0 = 0
            return r0
        L7c:
            r0 = r307
            android.content.Context r0 = r0.A01
            r305 = r0
            r0 = r305
            java.lang.String r1 = "wifi"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L22
            goto L9c
        L97:
            r0 = 1
            r304 = r0
            goto L10
        L9c:
            r0 = r306
            android.net.wifi.WifiInfo r0 = X.0NP.A00(r0)     // Catch: java.lang.Exception -> La6
            r308 = r0
        La3:
            r0 = r308
            return r0
        La6:
            goto La3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41t.A01(java.lang.String):android.net.wifi.WifiInfo");
    }

    public ArrayList A02() {
        if (!(Build.VERSION.SDK_INT >= 29 ? C0ft.A08() : true)) {
            A00("getScanResults", "WifiDiagnostics", true);
            return null;
        }
        A00("getScanResults", "WifiDiagnostics", false);
        try {
            return this.A03.A04(true);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
