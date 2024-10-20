package X;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.facebook.common.build.BuildConstants;
import com.facebook.errorreporting.lacrima.common.check.DirectReports;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.mapbox.mapboxsdk.BuildConfig;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: X.0h5, reason: invalid class name */
/* loaded from: 0h5.class */
public final class C0h5 {
    public static String A03 = "0";
    public static String A04 = "0";
    public static String A05 = "0";
    public static Application A06;
    public static C0h5 A07;
    public static File A08;
    public static Callable A09;
    public static Callable A0A;
    public static Callable A0B;
    public static boolean A0C;
    public static final Object A0D = AnonymousClass001.A0R();
    public 0Gb A00;
    public String A01;
    public Executor A02;

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v3 ??, still in use, count: 4, list:
          (r302v3 ??) from 0x0043: PHI (r302v1 ??) = (r302v0 ??), (r302v3 ??) binds: [B:6:0x000b, B:17:0x0040] A[DONT_GENERATE, DONT_INLINE]
          (r302v3 ?? I:X.0h5) from 0x0035: IPUT (r0v15 ?? I:java.lang.String), (r302v3 ?? I:X.0h5) A[Catch: all -> 0x0047] X.0h5.A01 java.lang.String
          (r302v3 ?? I:X.0h5) from 0x003c: IPUT (r1v3 ?? I:X.0Gb), (r302v3 ?? I:X.0h5) A[Catch: all -> 0x0047] X.0h5.A00 X.0Gb
          (r302v3 ?? I:X.0h5) from 0x0040: SPUT (r302v3 ?? I:X.0h5) A[Catch: all -> 0x0047] X.0h5.A07 X.0h5
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public static X.C0h5 A00() {
        /*
            java.lang.Object r0 = X.C0h5.A0D
            r301 = r0
            r0 = r301
            monitor-enter(r0)
            X.0h5 r0 = X.C0h5.A07     // Catch: java.lang.Throwable -> L47
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L43
            java.lang.String r0 = "mobile"
            r302 = r0
            java.lang.String r0 = "reliability_event_log_upload"
            r303 = r0
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L47
            r1 = r0
            r2 = 0
            r3 = r302
            r1[r2] = r3     // Catch: java.lang.Throwable -> L47
            r1 = r0
            r2 = 1
            r3 = r303
            r1[r2] = r3     // Catch: java.lang.Throwable -> L47
            r303 = r0
            r0 = r303
            android.net.Uri r0 = X.C0jF.A00(r0)     // Catch: java.lang.Throwable -> L47
            r303 = r0
            r0 = r303
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L47
            r303 = r0
            X.0h5 r0 = new X.0h5     // Catch: java.lang.Throwable -> L47
            r302 = r0
            r0 = r302
            r0.<init>()     // Catch: java.lang.Throwable -> L47
            r0 = r302
            r1 = r303
            r0.A01 = r1     // Catch: java.lang.Throwable -> L47
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = 0
            r0.A00 = r1     // Catch: java.lang.Throwable -> L47
            r0 = r302
            X.C0h5.A07 = r0     // Catch: java.lang.Throwable -> L47
        L43:
            r0 = r301
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            r0 = r302
            return r0
        L47:
            r303 = move-exception
            r0 = r301
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            r0 = r303
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0h5.A00():X.0h5");
    }

    public static void A01() {
        synchronized (A0D) {
            if (!A0C) {
                try {
                    Callable callable = A09;
                    if (callable != null) {
                        String str = (String) callable.call();
                        if (str == null) {
                            str = A04;
                        }
                        A04 = str;
                    }
                    Callable callable2 = A0B;
                    if (callable2 != null) {
                        String str2 = (String) callable2.call();
                        if (str2 == null) {
                            str2 = A05;
                        }
                        A05 = str2;
                    }
                    Callable callable3 = A0A;
                    if (callable3 != null) {
                        A08 = (File) callable3.call();
                    }
                } catch (Exception e) {
                    C0iy.A00().Bwu("DirectInitSelf", e, null);
                    0fH.A0r("lacrima", "Error lazy initializing DirectReportInternal", e);
                }
                A0C = true;
            }
        }
    }

    public static void A02(C0g0 c0g0, String str, java.util.Map map) {
        synchronized (A0D) {
            if (TextUtils.isEmpty(str)) {
                map.remove(c0g0.A00);
            } else {
                String str2 = c0g0.A00;
                if (TextUtils.isEmpty((CharSequence) map.get(str2))) {
                    map.put(str2, str);
                }
            }
        }
    }

    public static void A03(String str, String str2, String str3, String str4, java.util.Map map) {
        0jV r308;
        String str5;
        A01();
        if (C0iz.A03) {
            A02(C0g6.A0C, Boolean.toString(true), map);
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        C0g9 c0g9 = C0g6.A3E;
        String l = Long.toString(currentTimeMillis);
        A02(c0g9, l, map);
        A02(C0g6.A1X, l, map);
        if (!DirectReports.A00 ? str != null : !TextUtils.isEmpty(str)) {
            0fH.A0n("lacrima", "User Id missing. Direct reports use 0 as user id.");
            A02(C0g6.AA0, ConstantsKt.CAMERA_ID_FRONT, map);
        } else {
            A02(C0g6.AA0, str, map);
        }
        if (str2 != null) {
            r308 = C0g6.A3b;
        } else {
            0fH.A0n("lacrima", "ACTOR_ID missing. Direct reports use 0 as id.");
            r308 = C0g6.A3b;
            str2 = "-6";
        }
        A02(r308, str2, map);
        if (str3 != null) {
            A02(C0g6.A3X, str3, map);
        } else {
            0fH.A0n("lacrima", "ACTING_ACCOUNT_ID missing. Direct reports use 0 as id.");
            A02(C0g6.A3X, ConstantsKt.CAMERA_ID_FRONT, map);
        }
        A02(C0g6.A5Z, "lacrima_direct_report", map);
        A02(C0g6.A4Z, "lacrima_direct_report", map);
        A02(C0g6.A9E, "lacrima_direct_report", map);
        A02(C0g6.A3M, Long.toString(C0gm.A01()), map);
        A02(C0g6.A1k, Long.toString(C0gm.A00()), map);
        A02(C0g6.A4O, "r", map);
        A02(C0g6.A2q, Long.toString(BuildConstants.A01()), map);
        synchronized (A0D) {
            A02(C0g6.A4B, A03, map);
            if (DirectReports.A00 && "".equals(A04)) {
                A04 = ConstantsKt.CAMERA_ID_FRONT;
            }
            A02(C0g6.A5M, A04, map);
            A02(C0g6.A4V, A05, map);
            Application application = A06;
            if (application != null) {
                String packageName = application.getPackageName();
                if (str4 == null) {
                    str4 = "";
                }
                str5 = "";
                A02(C0g6.A4G, 0Pz.A0W(packageName, str5.equals(str4) ? "" : 0Pz.A0W(":", str4)), map);
                0jV r0 = C0g6.A9o;
                ApplicationInfo applicationInfo = A06.getApplicationInfo();
                A02(r0, applicationInfo == null ? "n/a" : Integer.toString(applicationInfo.targetSdkVersion), map);
            }
        }
        A02(C0g6.A0E, Boolean.toString(BuildConstants.A02()), map);
        A02(C0g6.A2Z, Long.toString(Process.myPid()), map);
        A02(C0g6.A0Q, Boolean.toString(BuildConstants.A03()), map);
        A02(C0g6.A5O, Build.MODEL, map);
        A02(C0g6.A5P, Build.DEVICE, map);
        A02(C0g6.A5K, Build.BRAND, map);
        A02(C0g6.A5R, Build.VERSION.RELEASE, map);
        A02(C0g6.A5U, "true", map);
        if (Build.VERSION.SDK_INT >= 30) {
            JSONObject A00 = C0gr.A00();
            if (A00.length() > 0) {
                A02(C0g6.A9M, A00.toString(), map);
            }
        }
        0jV r02 = C0g6.A95;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(Math.random());
        A0k.append("-");
        A02(r02, AnonymousClass001.A0h(A0k, System.currentTimeMillis()), map);
        long A01 = BuildConstants.A01();
        C0g9 c0g92 = C0g6.A1U;
        String l2 = Long.toString(A01);
        A02(c0g92, l2, map);
        A02(C0g6.A2J, l2, map);
        A02(C0g6.A7H, BuildConfig.VERSION_NAME, map);
        A02(C0g6.A09, Boolean.toString(true), map);
    }

    public static void A04(String str, String str2, java.util.Map map) {
        A02(C0g6.A4x, "soft_error", map);
        A02(C0g6.A4Q, "i", map);
        A02(C0g6.A9U, str, map);
        A02(C0g6.A9V, str2, map);
        synchronized (A0D) {
            if (TextUtils.isEmpty((CharSequence) map.get("cause"))) {
                A02(C0g6.A4y, 04A.A01(new RuntimeException(0Pz.A0j(str, " | ", str2), null)), map);
            }
        }
    }

    public static void A05(java.util.Map map) {
        0jV r0 = C0g6.A6r;
        C0u7 c0u7 = new C0u7(0);
        synchronized (A0D) {
            A02(r0, (String) c0u7.get(), map);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b9, code lost:
    
        if ("android_large_soft_error".equals(r302) != false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A06(final java.lang.String r302, final java.util.Map r303) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0h5.A06(java.lang.String, java.util.Map):void");
    }
}
