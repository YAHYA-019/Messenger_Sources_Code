package X;

import android.app.ActivityManager;
import android.os.SystemClock;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.0ft, reason: invalid class name */
/* loaded from: 0ft.class */
public final class C0ft {
    public static volatile C0o7 A04;
    public static volatile String A05;
    public static volatile boolean A06;
    public static final ExecutorService A03 = Executors.newSingleThreadExecutor();
    public static final Set A02 = AnonymousClass001.A0v();
    public static final Set A01 = AnonymousClass001.A0v();
    public static final List A00 = AnonymousClass001.A0s();

    public static long A00() {
        if (A04 == null) {
            return 0L;
        }
        return A04.A00;
    }

    public static String A01() {
        return A04 == null ? "" : A04.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r301 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A02() {
        /*
            X.0o7 r0 = X.C0ft.A04
            r301 = r0
            r0 = r301
            if (r0 == 0) goto L13
            X.0o7 r0 = X.C0ft.A04
            java.lang.String r0 = r0.A05
            r301 = r0
            r0 = r301
            if (r0 != 0) goto L16
        L13:
            java.lang.String r0 = "unknown"
            r301 = r0
        L16:
            r0 = r301
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ft.A02():java.lang.String");
    }

    public static void A03(0J1 r301) {
        synchronized (C0ft.class) {
            A01.add(r301);
        }
    }

    public static void A04(C0fq c0fq, boolean z) {
        synchronized (C0ft.class) {
            A02.add(c0fq);
            if (z && A06) {
                HashSet A0v = AnonymousClass001.A0v();
                A0v.add(c0fq);
                A03.execute(new 0La(A0v));
            }
        }
    }

    public static void A05(C0g0 c0g0) {
        if (A04 != null) {
            C0F8.A00.A01(c0g0, C0gq.CRITICAL_REPORT);
        }
    }

    public static void A06(C0g0 c0g0, String str) {
        if (A04 != null) {
            C0F8.A00.A02(c0g0, C0gq.CRITICAL_REPORT, str);
        }
    }

    public static void A07(String str) {
        synchronized (C0ft.class) {
            if (A04 != null && A04 != null) {
                final C0o7 c0o7 = A04;
                final String replace = str.replace(',', '_');
                StringBuilder sb = c0o7.A08;
                synchronized (sb) {
                    Set set = c0o7.A09;
                    if (!set.contains(replace)) {
                        if (!set.isEmpty()) {
                            sb.append(',');
                        }
                        sb.append(replace);
                        set.add(replace);
                        if (c0o7.A0B != null) {
                            0hE.A01().execute(new Runnable() { // from class: X.0iD
                                public static final String __redex_internal_original_name = "StartupConfig$AppStateImpl$$ExternalSyntheticLambda0";

                                @Override // java.lang.Runnable
                                public final void run() {
                                    C0o7 c0o72 = C0o7.this;
                                    String str2 = replace;
                                    File A0D = AnonymousClass001.A0D(c0o72.A0B, "navmodules.txt");
                                    boolean exists = A0D.exists();
                                    try {
                                        FileWriter fileWriter = new FileWriter(A0D, true);
                                        if (exists) {
                                            try {
                                                fileWriter.write(44);
                                            } finally {
                                            }
                                        }
                                        fileWriter.write(str2);
                                        fileWriter.close();
                                    } catch (IOException e) {
                                        C0iy.A02("lacrima", "Saving granular exposures failed", e).Bwu("StartupConfigGEWriting", e, null);
                                    }
                                }
                            });
                        }
                    }
                }
                c0o7.A01 = SystemClock.uptimeMillis();
            }
        }
    }

    public static boolean A08() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z = false;
        if (runningAppProcessInfo.importance == 100) {
            z = true;
        }
        return z;
    }

    public static boolean A09() {
        if (A04 == null) {
            return false;
        }
        return A04.A06;
    }
}
