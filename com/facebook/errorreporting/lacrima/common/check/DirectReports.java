package com.facebook.errorreporting.lacrima.common.check;

import X.04A;
import X.AnonymousClass001;
import X.C0g6;
import X.C0h5;
import java.util.HashMap;
import java.util.Map;

/* loaded from: DirectReports.class */
public abstract class DirectReports {
    public static boolean A00;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000e. Please report as an issue. */
    public static String A00(String str) {
        if (A00) {
            switch (str.hashCode()) {
                case -650531544:
                    if (str.equals("android_large_anr_app_death")) {
                        return "android_large_anr";
                    }
                    break;
                case 1288731213:
                    if (str.equals("android_large_java_app_death")) {
                        return "android_large_java";
                    }
                    break;
                case 1964439497:
                    if (str.equals("android_critical_java_app_death")) {
                        return "android_critical_java";
                    }
                    break;
                case 2142212140:
                    if (str.equals("android_critical_anr_app_death")) {
                        return "android_critical_anr";
                    }
                    break;
            }
        }
        return str;
    }

    public static void A01(String str, String str2, String str3, String str4, String str5, String str6, Throwable th) {
        HashMap A0u = AnonymousClass001.A0u();
        C0h5.A02(C0g6.A4y, 04A.A01(th), A0u);
        C0h5.A03(str, str2, str3, str4, A0u);
        C0h5.A04(str5, str6, A0u);
        C0h5.A00().A06("android_large_soft_error", A0u);
    }

    public static void A02(String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        HashMap A0u = AnonymousClass001.A0u();
        if (map != null) {
            A0u.putAll(map);
        }
        C0h5.A03(str, str2, str3, str4, A0u);
        C0h5.A04(str5, str6, A0u);
        C0h5.A00().A06("android_large_soft_error", A0u);
    }

    public static void A03(String str, String str2, String str3, String str4, Throwable th, Map map) {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.putAll(map);
        C0h5.A03(str, str2, str3, str4, A0u);
        C0h5.A02(C0g6.A4Q, "j", A0u);
        if (th != null) {
            C0h5.A02(C0g6.A6L, 04A.A01(th), A0u);
        }
        C0h5.A00().A06("android_critical_java", A0u);
        C0h5.A05(A0u);
        C0h5.A00().A06("android_large_java", A0u);
    }
}
