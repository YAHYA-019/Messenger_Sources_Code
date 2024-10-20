package X;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.41s, reason: invalid class name */
/* loaded from: 41s.class */
public final class C41s {
    public ScheduledExecutorService A00;
    public final Context A01;
    public final C0dp A02;
    public final C0dr A03;
    public final C41p A04;
    public final C41o A05;
    public final C41q A06;
    public final C41r A07;
    public final C03623yk A08;

    public C41s(Context context, C0dp c0dp, C0dr c0dr, C03623yk c03623yk, C41p c41p, C41o c41o, C41q c41q, C41r c41r, ScheduledExecutorService scheduledExecutorService) {
        this.A01 = context.getApplicationContext();
        this.A02 = c0dp;
        this.A03 = c0dr;
        this.A00 = scheduledExecutorService;
        this.A05 = c41o;
        this.A06 = c41q;
        this.A04 = c41p;
        this.A07 = c41r;
        this.A08 = c03623yk;
    }

    public static boolean A00() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C0ft.A08();
        }
        return true;
    }

    public static boolean A01(C41s c41s) {
        C41o c41o = c41s.A05;
        Context context = c41o.A00;
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_WIFI_STATE") != 0 || !C41o.A00(c41o)) {
            0fH.A0j("WifiScan", "Missing ACCESS_FINE_LOCATION permission");
            return false;
        }
        try {
            if (!context.getPackageManager().hasSystemFeature(JQw.A00(220))) {
                return false;
            }
            try {
                if (((WifiManager) context.getSystemService("wifi")).isScanAlwaysAvailable()) {
                    return true;
                }
            } catch (SecurityException unused) {
            }
            return ((WifiManager) context.getSystemService("wifi")).isWifiEnabled();
        } catch (SecurityException | Exception unused2) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0176, code lost:
    
        r317 = java.lang.Boolean.valueOf(r0.hasCapability(17));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.L7m A02() {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41s.A02():X.L7m");
    }

    public ArrayList A03(long j) {
        long j2;
        int i;
        ArrayList arrayList = null;
        try {
            ArrayList A04 = A04(true);
            C41q c41q = this.A06;
            c41q.A00(c41q.A00, A04);
            C0dr c0dr = this.A03;
            ArrayList A00 = 4SS.A00(A04, j, c0dr.now());
            C41r c41r = this.A07;
            if (c41r != null) {
                if (A04 == null || A04.isEmpty()) {
                    j2 = -1;
                } else {
                    j2 = Long.MIN_VALUE;
                    Iterator it = A04.iterator();
                    while (it.hasNext()) {
                        long j3 = ((ScanResult) it.next()).timestamp;
                        if (j3 > j2) {
                            j2 = j3;
                        }
                    }
                }
                int i2 = -1;
                if (j2 >= 0) {
                    long now = c0dr.now() - (j2 / 1000);
                    i2 = (int) (now / 1000);
                    i = (int) ((this.A02.now() - now) / 1000);
                } else {
                    i = -1;
                }
                int i3 = 0;
                int size = A04 == null ? 0 : A04.size();
                if (A00 != null) {
                    i3 = A00.size();
                }
                c41r.A00(i2, i, size, i3);
            }
            arrayList = L7m.A00(this.A02, c0dr, A00);
        } catch (SecurityException unused) {
        }
        return arrayList;
    }

    public ArrayList A04(boolean z) {
        String str;
        ArrayList arrayList = null;
        if (A00() && (z || A01(this))) {
            WifiManager wifiManager = (WifiManager) this.A01.getSystemService("wifi");
            0NP r0 = 0NP.$redex_init_class;
            0HM.A00();
            List<ScanResult> scanResults = wifiManager.getScanResults();
            if (scanResults != null) {
                arrayList = new ArrayList(scanResults.size());
                for (ScanResult scanResult : scanResults) {
                    if (scanResult != null && ((str = scanResult.SSID) == null || (!str.endsWith("_nomap") && !str.contains("_optout")))) {
                        arrayList.add(scanResult);
                    }
                }
            }
        }
        return arrayList;
    }
}
