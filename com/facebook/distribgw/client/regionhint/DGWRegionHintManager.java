package com.facebook.distribgw.client.regionhint;

import X.0Pz;
import X.0fH;
import X.11T;
import X.1G3;
import X.1Ql;
import X.3GG;
import X.C0dp;
import X.C0il;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: DGWRegionHintManager.class */
public final class DGWRegionHintManager {
    public static final String CACHE_TIME_PREFIX = "dgw_region_hint_cache_time_";
    public static final 3GG Companion = new Object();
    public static final String REGION_HINT_PREFIX = "dgw_region_hint_";
    public static final String SERVICE_KEY_CHATD = "chatd";
    public static final String SERVICE_KEY_MSYS = "msys";
    public static final String TAG = "DGWRegionHintManager";
    public static C0dp clock;
    public static FbSharedPreferences fbSharedPreferences;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3GG, java.lang.Object] */
    static {
        C0il.A0B("regionhint-android-jni");
    }

    public static final long getCacheTime(String str) {
        11T.A0F(str, 0);
        FbSharedPreferences fbSharedPreferences2 = fbSharedPreferences;
        long j = 0;
        if (fbSharedPreferences2 != null) {
            j = fbSharedPreferences2.Av1(new 1G3(0Pz.A0W(CACHE_TIME_PREFIX, str)), 0L);
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (r302 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String getRegionHint(java.lang.String r301) {
        /*
            r0 = 0
            r302 = r0
            r0 = r301
            r1 = 0
            X.11T.A0F(r0, r1)
            com.facebook.prefs.shared.FbSharedPreferences r0 = com.facebook.distribgw.client.regionhint.DGWRegionHintManager.fbSharedPreferences
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L2b
            java.lang.String r0 = "dgw_region_hint_"
            r1 = r301
            java.lang.String r0 = X.0Pz.A0W(r0, r1)
            r304 = r0
            X.1G2 r0 = new X.1G2
            r302 = r0
            r0 = r302
            r1 = r304
            r0.<init>(r1)
            r0 = r303
            r1 = r302
            java.lang.String r0 = r0.BD0(r1)
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L2e
        L2b:
            java.lang.String r0 = ""
            r302 = r0
        L2e:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.distribgw.client.regionhint.DGWRegionHintManager.getRegionHint(java.lang.String):java.lang.String");
    }

    public static final boolean hasCacheExpired(String str, long j) {
        11T.A0F(str, 0);
        C0dp c0dp = clock;
        boolean z = true;
        if (c0dp != null) {
            long now = c0dp.now();
            FbSharedPreferences fbSharedPreferences2 = fbSharedPreferences;
            long j2 = 0;
            if (fbSharedPreferences2 != null) {
                j2 = fbSharedPreferences2.Av1(new 1G3(0Pz.A0W(CACHE_TIME_PREFIX, str)), 0L);
            }
            0fH.A0a(Long.valueOf(j), Long.valueOf(j2), Long.valueOf(now), TAG, "hasCacheExpired: Cache TTL is %d hours, Cache time was %d, current time is %d");
            if ((now - j2) / 3600000 < j) {
                z = false;
            }
        }
        return z;
    }

    public static final void register(C0dp c0dp, FbSharedPreferences fbSharedPreferences2) {
        11T.A0H(c0dp, fbSharedPreferences2);
        clock = c0dp;
        fbSharedPreferences = fbSharedPreferences2;
    }

    public static final void setRegionHint(String str, String str2) {
        1Ql edit;
        1Ql edit2;
        11T.A0H(str, str2);
        FbSharedPreferences fbSharedPreferences2 = fbSharedPreferences;
        if (fbSharedPreferences2 != null && (edit2 = fbSharedPreferences2.edit()) != null) {
            edit2.CaL(new 1G3(0Pz.A0W(REGION_HINT_PREFIX, str2)), str);
            edit2.commit();
        }
        C0dp c0dp = clock;
        if (c0dp != null) {
            long now = c0dp.now();
            FbSharedPreferences fbSharedPreferences3 = fbSharedPreferences;
            if (fbSharedPreferences3 == null || (edit = fbSharedPreferences3.edit()) == null) {
                return;
            }
            edit.CaH(new 1G3(0Pz.A0W(CACHE_TIME_PREFIX, str2)), now);
            edit.commit();
        }
    }
}
