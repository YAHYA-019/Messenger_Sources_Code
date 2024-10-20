package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.acra.constants.ActionId;
import java.io.BufferedReader;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.3Te, reason: invalid class name */
/* loaded from: 3Te.class */
public final class C3Te {
    public java.util.Map A00 = AnonymousClass001.A0u();
    public long A01 = System.currentTimeMillis() - 200;

    public C3Te() {
        A03();
    }

    public static int A00(java.util.Map map, String[] strArr) {
        int length = strArr.length;
        int i = (-1) << (-1);
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= length) {
                return i;
            }
            String str = strArr[i3];
            if (map.containsKey(str)) {
                i = Math.max(i, AnonymousClass001.A03(map.get(str)));
            }
            i2 = i3 + 1;
        }
    }

    public static String A01(File file) {
        BufferedReader A0A = AnonymousClass001.A0A(file);
        try {
            return A0A.readLine();
        } finally {
            A0A.close();
        }
    }

    public static java.util.Map A02(C3Te c3Te) {
        java.util.Map map;
        synchronized (c3Te) {
            c3Te.A03();
            map = c3Te.A00;
        }
        return map;
    }

    private void A03() {
        File A0E;
        StringBuilder A0k;
        int i;
        synchronized (this) {
            if (System.currentTimeMillis() >= this.A01 + 100) {
                HashMap A0u = AnonymousClass001.A0u();
                A04("/sys/class/thermal/", A0u);
                if (A0u.size() == 0) {
                    A04("/sys/devices/virtual/thermal/", A0u);
                }
                if (A0u.size() == 0) {
                    File A0E2 = AnonymousClass001.A0E("/sys/class/hwmon/");
                    if (A0E2.exists()) {
                        File[] listFiles = A0E2.listFiles();
                        if (listFiles != null) {
                            int length = listFiles.length;
                            if (length != 0) {
                                int i2 = 0;
                                do {
                                    File file = listFiles[i2];
                                    try {
                                        File A0E3 = AnonymousClass001.A0E(0Pz.A0W(file.getCanonicalPath(), "/device"));
                                        if (A0E3.exists() && A0E3.isDirectory()) {
                                            A0E = AnonymousClass001.A0E(0Pz.A0W(A0E3.getCanonicalPath(), "/name"));
                                            A0k = AnonymousClass001.A0k();
                                            A0k.append(A0E3.getCanonicalPath());
                                            A0k.append("/temperature");
                                        } else {
                                            A0E = AnonymousClass001.A0E(0Pz.A0W(file.getCanonicalPath(), "/name"));
                                            A0k = AnonymousClass001.A0k();
                                            A0k.append(file.getCanonicalPath());
                                            A0k.append("/temp1_input");
                                        }
                                        File A0E4 = AnonymousClass001.A0E(A0k.toString());
                                        if (A0E.canRead() && A0E4.canRead()) {
                                            String A01 = A01(A0E);
                                            String A012 = A01(A0E4);
                                            if (A012 != null && A012.length() != 0) {
                                                try {
                                                    i = Integer.parseInt(A012);
                                                } catch (Exception unused) {
                                                }
                                                AnonymousClass001.A1A(A01, A0u, i);
                                            }
                                            i = (-1) << (-1);
                                            AnonymousClass001.A1A(A01, A0u, i);
                                        }
                                    } catch (Exception e) {
                                        0fH.A14("ThermalManager", "can't read %s, err=%s", new Object[]{file.getName(), e.getMessage()});
                                    }
                                    i2++;
                                } while (i2 < length);
                            }
                        }
                    }
                }
                this.A00 = A0u;
                this.A01 = System.currentTimeMillis();
            }
        }
    }

    public static void A04(String str, java.util.Map map) {
        File[] listFiles;
        int length;
        int i;
        File A0E = AnonymousClass001.A0E(str);
        if (!A0E.exists() || (listFiles = A0E.listFiles()) == null || (length = listFiles.length) == 0) {
            return;
        }
        int i2 = 0;
        do {
            File file = listFiles[i2];
            try {
                String A0W = 0Pz.A0W(file.getCanonicalPath(), "/type");
                String A0W2 = 0Pz.A0W(file.getCanonicalPath(), "/temp");
                File A0E2 = AnonymousClass001.A0E(A0W);
                File A0E3 = AnonymousClass001.A0E(A0W2);
                if (A0E2.canRead() && A0E3.canRead()) {
                    String A01 = A01(A0E2);
                    String A012 = A01(A0E3);
                    if (A012 != null && A012.length() != 0) {
                        try {
                            i = Integer.parseInt(A012);
                        } catch (Exception unused) {
                        }
                        1BK.A1P(A01, map, i);
                    }
                    i = (-1) << (-1);
                    1BK.A1P(A01, map, i);
                }
            } catch (Exception e) {
                0fH.A14("ThermalManager", "can't read %s, err=%s", new Object[]{file.getName(), e.getMessage()});
            }
            i2++;
        } while (i2 < length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cd, code lost:
    
        if (r307 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005a, code lost:
    
        if (r307 == r0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A05() {
        /*
            Method dump skipped, instructions count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3Te.A05():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (r307 == r0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A06() {
        /*
            r301 = this;
            r0 = r301
            java.util.Map r0 = A02(r0)
            r302 = r0
            java.lang.String r0 = "gpu"
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = r0.containsKey(r1)
            r304 = r0
            r0 = -1
            r1 = -1
            int r0 = r0 << r1
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L31
            r0 = r302
            r1 = r303
            java.lang.Object r0 = r0.get(r1)
            r306 = r0
            r0 = r306
            int r0 = X.AnonymousClass001.A03(r0)
            r307 = r0
            r0 = r307
            r1 = r305
            if (r0 != r1) goto L70
        L31:
            java.lang.String r0 = "gpu0-usr"
            r303 = r0
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            r3 = r303
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "gpu1-usr"
            r1[r2] = r3
            r306 = r0
            r0 = r302
            r1 = r306
            int r0 = A00(r0, r1)
            r307 = r0
            r0 = r307
            r1 = r305
            if (r0 != r1) goto L70
            java.lang.String r0 = "gpuss-0-usr"
            r303 = r0
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            r3 = r303
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "gpuss-1-usr"
            r1[r2] = r3
            r306 = r0
            r0 = r302
            r1 = r306
            int r0 = A00(r0, r1)
            r307 = r0
        L70:
            r0 = r307
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "ThermalManager"
            java.lang.String r2 = "gpu temp=%s"
            X.0fH.A0g(r0, r1, r2)
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3Te.A06():int");
    }

    public int A07(Context context) {
        int A03;
        java.util.Map A02 = A02(this);
        int i = 0;
        String[] strArr = {4YT.A00(ActionId.NEW_START_FOUND), "mtktsbattery", "Battery"};
        while (true) {
            String str = strArr[i];
            if (A02.containsKey(str)) {
                A03 = AnonymousClass001.A03(A02.get(str));
                break;
            }
            i++;
            if (i >= 3) {
                A03 = (-1) << (-1);
                break;
            }
        }
        0fH.A0g(Integer.valueOf(A03), "ThermalManager", "battery zone temp=%s");
        int i2 = (-1) << (-1);
        if (A03 == i2 && context != null) {
            IntentFilter intentFilter = new IntentFilter(AnonymousClass000.A00(42));
            11T.A0F(intentFilter, 2);
            Intent registerReceiver = context.registerReceiver(null, intentFilter);
            if (registerReceiver != null) {
                A03 = registerReceiver.getIntExtra(DKB.A00(59), i2);
            }
        }
        0fH.A0g(Integer.valueOf(A03), "ThermalManager", "battery temp=%d");
        return A03;
    }
}
