package com.facebook.endtoend;

import X.0Pz;
import X.0WL;
import X.0Xe;
import X.AnonymousClass001;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: EndToEnd.class */
public final class EndToEnd {
    public static boolean A00;
    public static boolean A01;
    public static boolean A02;
    public static boolean A03;
    public static boolean A04;
    public static boolean A05;
    public static volatile JSONObject A06 = AnonymousClass001.A12();
    public static volatile boolean A07;
    public static volatile boolean A08;
    public static volatile Map A09;

    static {
        try {
            0Xe.A00();
        } catch (IllegalStateException unused) {
        }
    }

    public static String A00(String str, boolean z, boolean z2) {
        if (!z2 && !isRunningEndToEndTest()) {
            return null;
        }
        String property = System.getProperty(str);
        if (property == null || property.equals("")) {
            String property2 = System.getProperty(0Pz.A0W("fb.e2e.", str));
            if (property2 != null && !property2.equals("")) {
                return property2;
            }
            if (!z) {
                return null;
            }
            try {
                property = 0WL.A02(str);
                if (property.equals("")) {
                    String A022 = 0WL.A02(0Pz.A0W("fb.e2e.", str));
                    if (A022.equals("")) {
                        return null;
                    }
                    return A022;
                }
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        return property;
    }

    public static Map A01() {
        JSONObject jSONObject;
        if (A09 == null) {
            A09 = AnonymousClass001.A0u();
            try {
                String A002 = A00("sharedprefs", false, false);
                if (A002 == null || A002.length() <= 0) {
                    jSONObject = A06.has("sharedprefs") ? A06.getJSONObject("sharedprefs") : AnonymousClass001.A12();
                } else {
                    new JSONObject(A002);
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String A0i = AnonymousClass001.A0i(keys);
                    A09.put(A0i, jSONObject.getJSONObject(A0i));
                }
                if (!A09.isEmpty()) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("Use E2E shared preferences overrides: ");
                    Log.w("EndToEnd-Test", AnonymousClass001.A0a(A09, A0k));
                }
            } catch (JSONException e) {
                throw new RuntimeException("Malformed json for shared preferences", e);
            }
        }
        return A09;
    }

    public static boolean A02() {
        boolean z;
        synchronized (EndToEnd.class) {
            if (!A02) {
                boolean A062 = A06("fb.running_e2e_locally");
                A03 = A062;
                if (A062) {
                    Log.w("EndToEnd-Test", "Is running E2E test locally");
                }
                A02 = true;
            }
            z = A03;
        }
        return z;
    }

    public static boolean A03() {
        boolean z;
        synchronized (EndToEnd.class) {
            if (!A00) {
                boolean equals = "true".equals(0WL.A02("fb.running_mobilelab"));
                A04 = equals;
                if (equals) {
                    Log.w("Mobilelab", "Is running Mobilelab test");
                }
                A00 = true;
            }
            z = A04;
        }
        return z;
    }

    public static boolean A04() {
        boolean z;
        synchronized (EndToEnd.class) {
            if (!A01) {
                boolean equals = "true".equals(0WL.A02("fb.running_sapienz"));
                A05 = equals;
                if (equals) {
                    Log.w("Sapienz", "Is running Sapienz test");
                }
                A01 = true;
            }
            z = A05;
        }
        return z;
    }

    public static boolean A05(String str) {
        return "true".equals(A00(str, false, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if ("true".equals(java.lang.System.getProperty(r301)) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A06(java.lang.String r301) {
        /*
            r0 = r301
            java.lang.String r0 = X.0WL.A02(r0)
            r302 = r0
            java.lang.String r0 = "true"
            r303 = r0
            r0 = r303
            r1 = r302
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L27
            r0 = r301
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r302 = r0
            r0 = r303
            r1 = r302
            boolean r0 = r0.equals(r1)
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
            r0 = r305
            if (r0 == 0) goto L29
        L27:
            r0 = 1
            r304 = r0
        L29:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.endtoend.EndToEnd.A06(java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (A06("persist.fb.running_e2e") != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isRunningEndToEndTest() {
        /*
            boolean r0 = com.facebook.endtoend.EndToEnd.A07
            r301 = r0
            r0 = r301
            if (r0 != 0) goto L44
            java.lang.String r0 = "fb.running_e2e"
            r302 = r0
            r0 = r302
            boolean r0 = A06(r0)
            r301 = r0
            r0 = 1
            r303 = r0
            r0 = r301
            if (r0 != 0) goto L24
            java.lang.String r0 = "persist.fb.running_e2e"
            boolean r0 = A06(r0)
            r304 = r0
            r0 = 0
            r301 = r0
            r0 = 0
            r302 = r0
            r0 = r304
            if (r0 == 0) goto L26
        L24:
            r0 = 1
            r301 = r0
        L26:
            r0 = r301
            com.facebook.endtoend.EndToEnd.A08 = r0
            boolean r0 = com.facebook.endtoend.EndToEnd.A08
            r301 = r0
            r0 = r301
            if (r0 == 0) goto L40
            java.lang.String r0 = "EndToEnd-Test"
            r305 = r0
            java.lang.String r0 = "Is running E2E test"
            r302 = r0
            r0 = r305
            r1 = r302
            int r0 = android.util.Log.w(r0, r1)
        L40:
            r0 = r303
            com.facebook.endtoend.EndToEnd.A07 = r0
        L44:
            boolean r0 = com.facebook.endtoend.EndToEnd.A08
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.endtoend.EndToEnd.isRunningEndToEndTest():boolean");
    }
}
