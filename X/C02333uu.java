package X;

import android.content.Context;
import android.location.LocationManager;
import android.location.LocationProvider;
import java.util.Set;

/* renamed from: X.3uu, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3uu.class */
public final class C02333uu {
    public static final String[] A03 = {"gps", "network"};
    public final Context A00;
    public final LocationManager A01;
    public final boolean A02;

    public C02333uu(Context context, LocationManager locationManager, boolean z) {
        this.A00 = context;
        this.A01 = locationManager;
        this.A02 = z;
    }

    public static Integer A00(C02333uu c02333uu, Integer num, Set set, Set set2, boolean z) {
        Integer num2;
        LocationProvider locationProvider;
        String[] strArr = A03;
        Integer num3 = null;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 2) {
                break;
            }
            String str = strArr[i2];
            try {
                str.getClass();
                try {
                    locationProvider = c02333uu.A01.getProvider(str);
                } catch (IllegalArgumentException | IllegalStateException | NullPointerException e) {
                    0fH.A0M(C02333uu.class, "Error when getting provider %s", e, new Object[]{str});
                    locationProvider = null;
                }
                if (locationProvider == null) {
                    num2 = 0S2.A01;
                } else if (locationProvider.getPowerRequirement() == 3 && num != 0S2.A0C) {
                    num2 = 0S2.A01;
                } else if (locationProvider.hasMonetaryCost() && !c02333uu.A02) {
                    num2 = 0S2.A01;
                } else if (!c02333uu.A01.isProviderEnabled(str)) {
                    num2 = 0S2.A0C;
                } else if (z) {
                    boolean z2 = false;
                    try {
                        if (c02333uu.A00.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                            z2 = true;
                        }
                    } catch (Throwable unused) {
                    }
                    num2 = z2 ? 0S2.A0N : 0S2.A00;
                } else {
                    boolean z3 = false;
                    try {
                        if (c02333uu.A00.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
                            z3 = true;
                        }
                    } catch (Throwable unused2) {
                    }
                    num2 = z3 ? 0S2.A0N : 0S2.A00;
                }
            } catch (SecurityException unused3) {
                num2 = 0S2.A00;
            }
            if (num2 == 0S2.A0N) {
                if (set != null) {
                    set.add(str);
                }
            } else if (num2 == 0S2.A0C && set2 != null) {
                set2.add(str);
            }
            if (num3 == null || num3.compareTo(num2) < 0) {
                num3 = num2;
            }
            i = i2 + 1;
        }
        if (num3 == null) {
            num3 = 0S2.A01;
        }
        return num3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r305.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        r0 = new java.util.HashSet();
        r0 = new java.util.HashSet();
        r0 = A00(r301, r302, r0, r0, r303);
        r310 = X.0S2.A0N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r0 == r310) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        r310 = X.0S2.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 29) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
    
        if (r305.checkCallingOrSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
    
        r310 = X.0S2.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r305.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.5DP A01(java.lang.Integer r302, boolean r303) {
        /*
            r301 = this;
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            r304 = r0
            r0 = r301
            android.content.Context r0 = r0.A00     // Catch: java.lang.Throwable -> L19
            r305 = r0
            r0 = r305
            r1 = r304
            int r0 = r0.checkCallingOrSelfPermission(r1)     // Catch: java.lang.Throwable -> L19
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L1a
            goto L30
        L19:
        L1a:
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            r304 = r0
            r0 = r301
            android.content.Context r0 = r0.A00     // Catch: java.lang.Throwable -> Laa
            r305 = r0
            r0 = r305
            r1 = r304
            int r0 = r0.checkCallingOrSelfPermission(r1)     // Catch: java.lang.Throwable -> Laa
            r306 = r0
            r0 = r306
            if (r0 != 0) goto Lab
        L30:
            java.util.HashSet r0 = new java.util.HashSet
            r307 = r0
            r0 = r307
            r0.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r308 = r0
            r0 = r308
            r0.<init>()
            r0 = r301
            r1 = r302
            r2 = r307
            r3 = r308
            r4 = r303
            java.lang.Integer r0 = A00(r0, r1, r2, r3, r4)
            r309 = r0
            java.lang.Integer r0 = X.0S2.A0N
            r310 = r0
            r0 = r309
            r1 = r310
            if (r0 == r1) goto L76
            java.lang.Integer r0 = X.0S2.A00
            r310 = r0
        L61:
            X.5DP r0 = new X.5DP
            r305 = r0
            r0 = r305
            r1 = r309
            r2 = r310
            r3 = r307
            r4 = r308
            r0.<init>(r1, r2, r3, r4)
            r0 = r305
            return r0
        L76:
            int r0 = android.os.Build.VERSION.SDK_INT
            r311 = r0
            r0 = 29
            r306 = r0
            r0 = r311
            r1 = r306
            if (r0 < r1) goto La2
            java.lang.String r0 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            r304 = r0
            r0 = r305
            r1 = r304
            int r0 = r0.checkCallingOrSelfPermission(r1)     // Catch: java.lang.Throwable -> L99
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L9a
            goto L61
        L99:
        L9a:
            java.lang.Integer r0 = X.0S2.A0C
            r310 = r0
            goto L61
        La2:
            java.lang.Integer r0 = X.0S2.A01
            r310 = r0
            goto L61
        Laa:
        Lab:
            java.lang.Integer r0 = X.0S2.A00
            r310 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r312 = r0
            r0 = r312
            r0.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r304 = r0
            r0 = r304
            r0.<init>()
            X.5DP r0 = new X.5DP
            r305 = r0
            r0 = r305
            r1 = r310
            r2 = r310
            r3 = r312
            r4 = r304
            r0.<init>(r1, r2, r3, r4)
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02333uu.A01(java.lang.Integer, boolean):X.5DP");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r301.A00.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r301.A00.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x004f, code lost:
    
        r303 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Integer A02() {
        /*
            r301 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r302 = r0
            r0 = 29
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = r302
            r1 = r303
            if (r0 < r1) goto L13
            r0 = 1
            r304 = r0
        L13:
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            r306 = r0
            r0 = r301
            android.content.Context r0 = r0.A00     // Catch: java.lang.Throwable -> L2c
            r307 = r0
            r0 = r307
            r1 = r306
            int r0 = r0.checkCallingOrSelfPermission(r1)     // Catch: java.lang.Throwable -> L2c
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L2d
            goto L4f
        L2c:
        L2d:
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            r306 = r0
            r0 = r301
            android.content.Context r0 = r0.A00     // Catch: java.lang.Throwable -> L46
            r307 = r0
            r0 = r307
            r1 = r306
            int r0 = r0.checkCallingOrSelfPermission(r1)     // Catch: java.lang.Throwable -> L46
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L47
            goto L4f
        L46:
        L47:
            r0 = 0
            r303 = r0
            r0 = 0
            r307 = r0
            goto L51
        L4f:
            r0 = 1
            r303 = r0
        L51:
            r0 = r303
            if (r0 != 0) goto L59
            java.lang.Integer r0 = X.0S2.A00
            return r0
        L59:
            r0 = r304
            if (r0 != 0) goto L61
            java.lang.Integer r0 = X.0S2.A01
            return r0
        L61:
            java.lang.String r0 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            r305 = r0
            r0 = 0
            r302 = r0
            r0 = 0
            r306 = r0
            r0 = r301
            android.content.Context r0 = r0.A00     // Catch: java.lang.Throwable -> L8a
            r307 = r0
            r0 = r307
            r1 = r305
            int r0 = r0.checkCallingOrSelfPermission(r1)     // Catch: java.lang.Throwable -> L8a
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L7e
            r0 = 1
            r302 = r0
        L7e:
            r0 = r302
            if (r0 == 0) goto L86
            java.lang.Integer r0 = X.0S2.A0N
            return r0
        L86:
            java.lang.Integer r0 = X.0S2.A0C
            return r0
        L8a:
            goto L7e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02333uu.A02():java.lang.Integer");
    }

    public Integer A03() {
        return A00(this, 0S2.A0C, null, null, false);
    }

    public boolean A04() {
        5DP A01 = A01(0S2.A0C, false);
        Integer num = A01.A01;
        Integer num2 = 0S2.A0N;
        if (num != num2) {
            return false;
        }
        Integer num3 = A01.A00;
        return num3 == 0S2.A01 || num3 == num2;
    }
}
