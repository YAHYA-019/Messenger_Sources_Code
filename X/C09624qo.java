package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4qo, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4qo.class */
public final class C09624qo implements 1aR {
    public java.util.Map A00;
    public final C00i A01;
    public final 1N0 A02;
    public final AbstractC00401az A03;
    public final C1Zg A04;
    public final C00i A05;
    public final C00i A06;

    public C09624qo() {
        C1Zg c1Zg = (C1Zg) 1Bn.A0A(33057);
        this.A04 = c1Zg;
        this.A02 = new 1N0((Context) c1Zg.A00.get());
        this.A03 = c1Zg.A00("remote_wipe");
        this.A05 = new 1BQ(16385);
        this.A06 = new 1BQ(16386);
        this.A01 = new 1BQ(68406);
    }

    public static void A00(java.util.Map map, JSONObject jSONObject, int i) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            map.put(AbstractC10164sl.A00(i, next.trim()), AbstractC10164sl.A01(jSONObject.getString(next)));
        }
    }

    public java.util.Map A01() {
        java.util.Map map;
        synchronized (this) {
            if (this.A00 == null) {
                1CO r0 = (1CO) this.A05.get();
                1CO r02 = (1CO) this.A06.get();
                HashMap hashMap = new HashMap();
                this.A00 = hashMap;
                hashMap.putAll(AbstractC10164sl.A03(r0.BCy(36876490419733206L), 4));
                this.A00.putAll(AbstractC10164sl.A03(r0.BCy(36876490419667669L), 5));
                this.A00.putAll(AbstractC10164sl.A03(r0.BCy(36876490419602132L), 3));
                this.A00.putAll(AbstractC10164sl.A03(r0.BCy(36876490419798743L), -1));
                this.A00.putAll(AbstractC10164sl.A03(r02.BCy(18862096204956379L), 4));
                this.A00.putAll(AbstractC10164sl.A03(r02.BCy(18862096204890842L), 5));
                this.A00.putAll(AbstractC10164sl.A03(r02.BCy(18862096204825305L), 3));
                this.A00.putAll(AbstractC10164sl.A03(r02.BCy(18862096205021916L), -1));
                String BCy = r0.BCy(36876490420650712L);
                if (TextUtils.isEmpty(BCy)) {
                    map = this.A00;
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(BCy);
                        A00(this.A00, jSONObject.getJSONObject("root"), 4);
                        A00(this.A00, jSONObject.getJSONObject("caches"), 3);
                        A00(this.A00, jSONObject.getJSONObject("files"), 5);
                        A00(this.A00, jSONObject.getJSONObject("unsafe"), -1);
                    } catch (JSONException unused) {
                    }
                }
            }
            map = this.A00;
        }
        return map;
    }

    public boolean A02(String str, String str2) {
        String absolutePath;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = (LightweightQuickPerformanceLogger) this.A01.get();
        try {
            lightweightQuickPerformanceLogger.markerStart(38477987);
            boolean z = false;
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                File A01 = this.A02.A01(str);
                if ("always".equalsIgnoreCase(str2)) {
                    z = this.A04.A02(A01);
                } else {
                    try {
                        absolutePath = A01.getCanonicalPath();
                    } catch (IOException unused) {
                        absolutePath = A01.getAbsolutePath();
                    }
                    AbstractC00401az abstractC00401az = this.A03;
                    JSONObject A012 = abstractC00401az.A01(absolutePath);
                    if (!A012.optString("last_cleaned_hash", "").equalsIgnoreCase(str2)) {
                        z = this.A04.A02(A01);
                        try {
                            A012.put("last_cleaned_hash", str2);
                            abstractC00401az.A03(absolutePath, A012);
                        } catch (JSONException unused2) {
                        }
                    }
                }
            }
            if (lightweightQuickPerformanceLogger.isMarkerOn(38477987, true)) {
                lightweightQuickPerformanceLogger.markerAnnotate(38477987, "path", str);
                lightweightQuickPerformanceLogger.markerAnnotate(38477987, "hash", str2);
                lightweightQuickPerformanceLogger.markerAnnotate(38477987, "cleaned", z);
            }
            lightweightQuickPerformanceLogger.markerEnd(38477987, (short) 2);
            return z;
        } catch (Throwable th) {
            if (lightweightQuickPerformanceLogger.isMarkerOn(38477987, true)) {
                lightweightQuickPerformanceLogger.markerAnnotate(38477987, "path", str);
                lightweightQuickPerformanceLogger.markerAnnotate(38477987, "hash", str2);
                lightweightQuickPerformanceLogger.markerAnnotate(38477987, "cleaned", false);
            }
            lightweightQuickPerformanceLogger.markerEnd(38477987, (short) 2);
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ void CAv(1Z6 r302, 1Yu r303, File file) {
        String A00 = 1N0.A00(r302.A03, r302.A02, r302.A00);
        String A0b = AnonymousClass001.A0b(A00, A01());
        if (A0b == null || !A02(A00.trim(), A0b.trim())) {
            return;
        }
        file.mkdirs();
    }
}
