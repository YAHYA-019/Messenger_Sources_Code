package com.facebook.storage.cask.fbapps;

import X.0Pz;
import X.11T;
import X.1BQ;
import X.1BV;
import X.1MH;
import X.1Mf;
import X.1Mi;
import X.1Mm;
import X.1Mw;
import X.1Mx;
import X.1N0;
import X.1Yr;
import X.1Yu;
import X.1Z6;
import X.1aO;
import X.1aR;
import X.2Jm;
import X.2Jw;
import X.C00541bd;
import X.C00i;
import X.C09554qg;
import X.C09584qj;
import X.C09624qo;
import X.C0d7;
import X.C1Zg;
import X.C3ip;
import android.content.Context;
import android.text.TextUtils;
import com.facebook.inject.FbInjector;
import com.facebook.privacy.e2ee.genericimpl.store.DevicePkeKeypairStoreImplKt;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.storage.monitor.fbapps.FBAppsStorageResourceMonitor;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: FBCask.class */
public final class FBCask extends 1Mf implements 1Mi {
    public 1Mx A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;
    public final C00i A06;
    public final C00i A07;
    public final C00i A08;
    public final C00i A09;
    public final C00i A0A;

    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, X.1Mx] */
    public FBCask() {
        this.A0A = new 1BV(33057);
        this.A01 = new 1BQ(68406);
        this.A08 = new 1BQ(16711);
        this.A04 = new 1BQ(16729);
        this.A06 = new 1BQ(49289);
        this.A09 = new 1BQ(100276);
        this.A03 = new 1BQ(16969);
        this.A05 = new 1BQ(49292);
        this.A07 = new 1BQ(49291);
        this.A02 = new 1BV(67127);
        Context A00 = FbInjector.A00();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = (LightweightQuickPerformanceLogger) this.A01.get();
        try {
            lightweightQuickPerformanceLogger.markerStart(38469638);
            1Mw r0 = (1Mw) this.A02.get();
            11T.A0F(A00, 0);
            11T.A0F(r0, 2);
            ((1Mf) this).A00 = 1MH.A00(A00);
            ((1Mf) this).A01 = this;
            ((1Mf) this).A02 = r0;
            ?? obj = new Object();
            ((1Mx) obj).A01 = this;
            ((1Mx) obj).A00 = new 1N0(A00);
            ((1Mx) obj).A02 = new C3ip((Object) obj, 4);
            this.A00 = obj;
        } finally {
            lightweightQuickPerformanceLogger.markerEnd(38469638, (short) 2);
        }
    }

    public FBCask(int i) {
    }

    public void A02() {
        ((2Jw) this.A03.get()).A01();
        final C00541bd c00541bd = (C00541bd) this.A04.get();
        ((Executor) c00541bd.A03.A01.get()).execute(new Runnable() { // from class: X.4qf
            public static final String __redex_internal_original_name = "FBMaxSizePluginController$1";

            @Override // java.lang.Runnable
            public void run() {
                String absolutePath;
                C00541bd c00541bd2 = C00541bd.this;
                C00i c00i = c00541bd2.A01;
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = (LightweightQuickPerformanceLogger) c00i.get();
                try {
                    lightweightQuickPerformanceLogger.markerStart(38469641);
                    HashMap hashMap = new HashMap();
                    AbstractC00401az abstractC00401az = c00541bd2.A02;
                    for (Map.Entry entry : abstractC00401az.A00().entrySet()) {
                        String str = (String) entry.getKey();
                        JSONObject jSONObject = (JSONObject) entry.getValue();
                        if (!TextUtils.isEmpty(str)) {
                            C1Z7 A00 = C1Z7.A00(jSONObject);
                            if (A00 == null) {
                                abstractC00401az.A02(str);
                            } else {
                                String optString = jSONObject.optString(1BJ.A00(45));
                                if (TextUtils.isEmpty(optString)) {
                                    optString = "n/a";
                                }
                                hashMap.put(str, new C1c0(A00, optString));
                            }
                        }
                    }
                    int[] A05 = 1Yr.A05();
                    int i = 0;
                    do {
                        int i2 = A05[i];
                        String A04 = 1Yr.A04(i2);
                        C1Z7 A002 = 1Yr.A00(i2);
                        if (A002 != null && A04 != null && !A002.A04) {
                            for (File file : 1MH.A00((Context) c00541bd2.A03.A00.get()).A04((String) null, i2).keySet()) {
                                try {
                                    absolutePath = file.getCanonicalPath();
                                } catch (IOException unused) {
                                    absolutePath = file.getAbsolutePath();
                                }
                                if (!hashMap.containsKey(absolutePath)) {
                                    hashMap.put(absolutePath, new C1c0(A002, A04));
                                }
                            }
                        }
                        i++;
                    } while (i < 204);
                    long j = 0;
                    for (Map.Entry entry2 : hashMap.entrySet()) {
                        String str2 = (String) entry2.getKey();
                        C1c0 c1c0 = (C1c0) entry2.getValue();
                        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = (LightweightQuickPerformanceLogger) c00i.get();
                        String str3 = c1c0.A01;
                        C1Z7 c1z7 = (C1Z7) c1c0.A00;
                        try {
                            lightweightQuickPerformanceLogger2.markerStart(38469643);
                            C1Zg c1Zg = c00541bd2.A03;
                            C00i c00i2 = c1Zg.A05;
                            long j2 = ((FBAppsStorageResourceMonitor) c00i2.get()).A03() ? c1z7.A01 : c1z7.A00;
                            long j3 = 0;
                            if (j2 > 0) {
                                File file2 = new File(str2);
                                long j4 = 4sJ.A01(file2).A02;
                                if (c1z7.A03) {
                                    c00541bd2.A00(c1c0, file2, j4);
                                    if (j4 > j2) {
                                        j3 = -j4;
                                    }
                                } else if (j4 > j2) {
                                    c1Zg.A02(file2);
                                    abstractC00401az.A02(str2);
                                    file2.mkdirs();
                                    j3 = j4;
                                }
                            }
                            if (lightweightQuickPerformanceLogger2.isMarkerOn(38469643, true)) {
                                lightweightQuickPerformanceLogger2.markerAnnotate(38469643, "feature", String.valueOf(str3));
                                lightweightQuickPerformanceLogger2.markerAnnotate(38469643, "maxSizeBytes", c1z7.A00);
                                lightweightQuickPerformanceLogger2.markerAnnotate(38469643, "maxSizeOnLowSpaceBytes", c1z7.A01);
                                lightweightQuickPerformanceLogger2.markerAnnotate(38469643, "isLowSpaceCondition", ((FBAppsStorageResourceMonitor) c00i2.get()).A03());
                                lightweightQuickPerformanceLogger2.markerAnnotate(38469643, "evictedPathSize", Math.abs(j3));
                                lightweightQuickPerformanceLogger2.markerAnnotate(38469643, "resultCode", (int) Math.signum((float) j3));
                            }
                            lightweightQuickPerformanceLogger2.markerEnd(38469643, (short) 2);
                            if (j3 > 0) {
                                j++;
                            }
                        } finally {
                        }
                    }
                    lightweightQuickPerformanceLogger.markerAnnotate(38469641, "removalCount", j);
                    lightweightQuickPerformanceLogger.markerEnd(38469641, (short) 2);
                } catch (Throwable th) {
                    lightweightQuickPerformanceLogger.markerAnnotate(38469641, "removalCount", -1);
                    lightweightQuickPerformanceLogger.markerEnd(38469641, (short) 2);
                    throw th;
                }
            }
        });
        final C09554qg c09554qg = (C09554qg) this.A06.get();
        ((Executor) c09554qg.A03.A01.get()).execute(new Runnable() { // from class: X.4qi
            public static final String __redex_internal_original_name = "FBStaleRemovalPluginController$1";

            @Override // java.lang.Runnable
            public void run() {
                long j;
                String absolutePath;
                C09554qg c09554qg2 = C09554qg.this;
                C00i c00i = c09554qg2.A01;
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = (LightweightQuickPerformanceLogger) c00i.get();
                try {
                    lightweightQuickPerformanceLogger.markerStart(38469642);
                    HashMap hashMap = new HashMap();
                    AbstractC00401az abstractC00401az = c09554qg2.A02;
                    Iterator it = abstractC00401az.A00().entrySet().iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        j = -1;
                        if (!hasNext) {
                            break;
                        }
                        Map.Entry A0z = AnonymousClass001.A0z(it);
                        String A0j = AnonymousClass001.A0j(A0z);
                        JSONObject jSONObject = (JSONObject) A0z.getValue();
                        if (!TextUtils.isEmpty(A0j)) {
                            11T.A0F(jSONObject, 0);
                            long optLong = jSONObject.optLong("stale_age_s", j);
                            if (optLong < 0) {
                                abstractC00401az.A02(A0j);
                            } else {
                                1ZA r0 = new 1ZA(optLong, jSONObject.optBoolean("is_itemized", false));
                                String optString = jSONObject.optString(1BJ.A00(45));
                                if (TextUtils.isEmpty(optString)) {
                                    optString = "n/a";
                                }
                                hashMap.put(A0j, new C10134si(r0, optString, jSONObject.optLong("usage_timestamp_s", j)));
                            }
                        }
                    }
                    int[] A05 = 1Yr.A05();
                    int i = 0;
                    do {
                        int i2 = A05[i];
                        String A04 = 1Yr.A04(i2);
                        1ZA A01 = 1Yr.A01(i2);
                        if (A01 != null && A04 != null && !A01.A01) {
                            for (File file : 1MH.A00((Context) c09554qg2.A03.A00.get()).A04((String) null, i2).keySet()) {
                                try {
                                    absolutePath = file.getCanonicalPath();
                                } catch (IOException unused) {
                                    absolutePath = file.getAbsolutePath();
                                }
                                if (!hashMap.containsKey(absolutePath)) {
                                    hashMap.put(absolutePath, new C10134si(A01, A04, j));
                                }
                            }
                        }
                        i++;
                    } while (i < 204);
                    long j2 = 0;
                    for (Map.Entry entry : hashMap.entrySet()) {
                        String str = (String) entry.getKey();
                        C10134si c10134si = (C10134si) entry.getValue();
                        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = (LightweightQuickPerformanceLogger) c00i.get();
                        try {
                            lightweightQuickPerformanceLogger2.markerStart(38469644);
                            File file2 = new File(str);
                            long currentTimeMillis = System.currentTimeMillis() / 1000;
                            long j3 = c10134si.A00;
                            long j4 = 0;
                            if (j3 <= 0) {
                                j3 = file2.lastModified() / 1000;
                            }
                            if (j3 > 0 && currentTimeMillis < j3) {
                                j4 = -1;
                            } else if (j3 > 0) {
                                long j5 = ((C1c0) c10134si).A00.A00;
                                long j6 = j3 + j5;
                                if (j6 > 0 && j6 < currentTimeMillis) {
                                    c09554qg2.A03.A02(file2);
                                    abstractC00401az.A02(str);
                                    file2.mkdirs();
                                    j4 = currentTimeMillis - (j6 - j5);
                                }
                            }
                            if (lightweightQuickPerformanceLogger2.isMarkerOn(38469644, true)) {
                                lightweightQuickPerformanceLogger2.markerAnnotate(38469644, "feature", String.valueOf(c10134si.A01));
                                lightweightQuickPerformanceLogger2.markerAnnotate(38469644, "staleAgeS", ((C1c0) c10134si).A00.A00);
                                lightweightQuickPerformanceLogger2.markerAnnotate(38469644, "pathStaleness", j4);
                                lightweightQuickPerformanceLogger2.markerAnnotate(38469644, "resultCode", (int) Math.signum((float) j4));
                            }
                            lightweightQuickPerformanceLogger2.markerEnd(38469644, (short) 2);
                            if (j4 > 0) {
                                j2++;
                            }
                        } finally {
                        }
                    }
                    lightweightQuickPerformanceLogger.markerAnnotate(38469642, "removalCount", j2);
                    lightweightQuickPerformanceLogger.markerEnd(38469642, (short) 2);
                } catch (Throwable th) {
                    lightweightQuickPerformanceLogger.markerAnnotate(38469642, "removalCount", -1);
                    lightweightQuickPerformanceLogger.markerEnd(38469642, (short) 2);
                    throw th;
                }
            }
        });
        final C09584qj c09584qj = (C09584qj) this.A07.get();
        ((Executor) c09584qj.A01.A01.get()).execute(new Runnable() { // from class: X.4ql
            public static final String __redex_internal_original_name = "FBTempFilePluginController$1";

            @Override // java.lang.Runnable
            public void run() {
                int optInt;
                int length;
                C09584qj c09584qj2 = C09584qj.this;
                AbstractC00401az abstractC00401az = c09584qj2.A00;
                for (Map.Entry entry : abstractC00401az.A00().entrySet()) {
                    String str = (String) entry.getKey();
                    if (!TextUtils.isEmpty(str) && (optInt = ((JSONObject) entry.getValue()).optInt("retention_d", -1)) >= 0) {
                        long currentTimeMillis = System.currentTimeMillis() - (optInt * 86400000);
                        File file = new File(str);
                        File[] listFiles = file.listFiles();
                        int i = 0;
                        if (listFiles == null || (length = listFiles.length) == 0) {
                            c09584qj2.A01.A02(file);
                            abstractC00401az.A02(str);
                        } else {
                            do {
                                File file2 = listFiles[i];
                                if (optInt == 0 || file2.lastModified() < currentTimeMillis) {
                                    c09584qj2.A01.A02(file2);
                                }
                                i++;
                            } while (i < length);
                        }
                    }
                }
            }
        });
        final 1aO r0 = (1aO) this.A08.get();
        ((Executor) r0.A02.A01.get()).execute(new Runnable() { // from class: X.4qn
            public static final String __redex_internal_original_name = "FBUserScopePluginController$1";

            @Override // java.lang.Runnable
            public void run() {
                1aO r02 = r0;
                r02.A02(r02.A02.A01(), (String) null);
            }
        });
        final C09624qo c09624qo = (C09624qo) this.A05.get();
        ((Executor) c09624qo.A04.A01.get()).execute(new Runnable() { // from class: X.4qp
            public static final String __redex_internal_original_name = "FBRemoteWipeController$1";

            @Override // java.lang.Runnable
            public void run() {
                C09624qo c09624qo2 = C09624qo.this;
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = (LightweightQuickPerformanceLogger) c09624qo2.A01.get();
                try {
                    lightweightQuickPerformanceLogger.markerStart(38484667);
                    Iterator it = new HashMap(c09624qo2.A01()).entrySet().iterator();
                    int i = 0;
                    while (true) {
                        int i2 = i;
                        if (!it.hasNext()) {
                            lightweightQuickPerformanceLogger.markerAnnotate(38484667, "removalCount", i2);
                            lightweightQuickPerformanceLogger.markerEnd(38484667, (short) 2);
                            return;
                        } else {
                            Map.Entry entry = (Map.Entry) it.next();
                            i = i2 + (c09624qo2.A02(((String) entry.getKey()).trim(), ((String) entry.getValue()).trim()) ? 1 : 0);
                        }
                    }
                } catch (Throwable th) {
                    lightweightQuickPerformanceLogger.markerAnnotate(38484667, "removalCount", -1);
                    lightweightQuickPerformanceLogger.markerEnd(38484667, (short) 2);
                    throw th;
                }
            }
        });
    }

    public 1aR AHy(1Yu r302) {
        C00i c00i;
        String A01 = r302.A01();
        switch (A01.hashCode()) {
            case -2068468576:
                if (!A01.equals("remote_wipe")) {
                    return null;
                }
                c00i = this.A05;
                break;
            case 101264299:
                if (!A01.equals("eviction.v2")) {
                    return null;
                }
                c00i = this.A03;
                break;
            case 351608024:
                if (!A01.equals(DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY)) {
                    return null;
                }
                c00i = this.A09;
                break;
            case 408072700:
                if (!A01.equals("max_size")) {
                    return null;
                }
                c00i = this.A04;
                break;
            case 1738660166:
                if (!A01.equals("stale_removal")) {
                    return null;
                }
                c00i = this.A06;
                break;
            case 1934313696:
                if (!A01.equals("user_scope")) {
                    return null;
                }
                c00i = this.A08;
                break;
            case 1976417059:
                if (!A01.equals("tempfiles")) {
                    return null;
                }
                c00i = this.A07;
                break;
            default:
                return null;
        }
        return (1aR) c00i.get();
    }

    public File AUq(2Jm r302, int i) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = (LightweightQuickPerformanceLogger) this.A01.get();
        String A04 = 1Yr.A04(i);
        if (A04 == null) {
            throw 0Pz.A04("Invalid storage config id: ", i);
        }
        int hashCode = A04.hashCode();
        lightweightQuickPerformanceLogger.markerStart(38469633, hashCode);
        lightweightQuickPerformanceLogger.markerAnnotate(38469633, hashCode, "feature", A04);
        File AUq = super.AUq(r302, i);
        if (lightweightQuickPerformanceLogger.isMarkerOn(38469633, true)) {
            lightweightQuickPerformanceLogger.markerAnnotate(38469633, "exists", AUq.exists());
        }
        lightweightQuickPerformanceLogger.markerEnd(38469633, hashCode, (short) 2);
        return AUq;
    }

    public 1Mm Atf() {
        return this.A00;
    }

    public String B93() {
        return ((C1Zg) this.A0A.get()).A01().A01;
    }

    public File BKs(2Jm r302, int i) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = (LightweightQuickPerformanceLogger) this.A01.get();
        String A04 = 1Yr.A04(i);
        if (A04 == null) {
            throw 0Pz.A04("Invalid storage config id: ", i);
        }
        int hashCode = A04.hashCode();
        lightweightQuickPerformanceLogger.markerStart(38469635, hashCode);
        lightweightQuickPerformanceLogger.markerAnnotate(38469635, hashCode, "feature", A04);
        File BKs = super/*X.1MB*/.BKs(r302, i);
        lightweightQuickPerformanceLogger.markerEnd(38469635, hashCode, (short) 2);
        return BKs;
    }

    public void CSH(1Z6 r302, 1Yu r303) {
        C0d7.A09("Cask", 0Pz.A0v("PathConfig of '", r302.A03, "' tried to use unhandled plugin : ", r303.A01()));
    }
}
