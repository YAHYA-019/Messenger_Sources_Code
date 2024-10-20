package X;

import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1az, reason: invalid class name and case insensitive filesystem */
/* loaded from: 1az.class */
public abstract class AbstractC00401az {
    public final String A00;

    public AbstractC00401az(String str) {
        this.A00 = str;
    }

    public HashMap A00() {
        int i;
        HashMap hashMap;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger;
        int i2;
        JSONObject A12;
        C01s A09;
        StringBuilder A0k;
        String str;
        if (this instanceof C2zy) {
            C2zy c2zy = (C2zy) this;
            boolean z = c2zy.A03;
            i = 58866130;
            if (z) {
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = c2zy.A01;
                int i3 = c2zy.A00;
                lightweightQuickPerformanceLogger2.markerStart(58866130, i3, lightweightQuickPerformanceLogger2.currentMonotonicTimestampNanos(), TimeUnit.NANOSECONDS);
                lightweightQuickPerformanceLogger2.markerPoint(58866130, i3, "start_getall_method");
                lightweightQuickPerformanceLogger2.markerAnnotate(58866130, i3, "store_type", "json_store");
            }
            hashMap = new HashMap();
            for (Map.Entry entry : c2zy.A02.A03().entrySet()) {
                hashMap.put(entry.getKey(), new JSONObject((java.util.Map) entry.getValue()));
            }
            if (z) {
                lightweightQuickPerformanceLogger = c2zy.A01;
                i2 = c2zy.A00;
                lightweightQuickPerformanceLogger.markerPoint(i, i2, "end_getall_method");
                lightweightQuickPerformanceLogger.markerEnd(i, i2, (short) 2, lightweightQuickPerformanceLogger.currentMonotonicTimestampNanos(), TimeUnit.NANOSECONDS);
            }
        } else {
            C00381ax c00381ax = (C00381ax) this;
            boolean z2 = c00381ax.A03;
            i = 58866130;
            if (z2) {
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger3 = c00381ax.A01;
                int i4 = c00381ax.A00;
                lightweightQuickPerformanceLogger3.markerStart(58866130, i4, lightweightQuickPerformanceLogger3.currentMonotonicTimestampNanos(), TimeUnit.NANOSECONDS);
                lightweightQuickPerformanceLogger3.markerPoint(58866130, i4, "start_getall_method");
                lightweightQuickPerformanceLogger3.markerAnnotate(58866130, i4, "store_type", "shared_pref_store");
            }
            C00361av c00361av = c00381ax.A02;
            String str2 = ((AbstractC00401az) c00381ax).A00;
            C00i c00i = c00361av.A01;
            Set Asu = ((FbSharedPreferences) c00i.get()).Asu((1G2) C00361av.A04.A0D(0Pz.A0W(str2, "/")));
            hashMap = new HashMap();
            Iterator it = Asu.iterator();
            while (it.hasNext()) {
                try {
                    new JSONObject(((FbSharedPreferences) c00i.get()).A3a((1G2) it.next(), "{}"));
                } catch (JSONException unused) {
                    A12 = AnonymousClass001.A12();
                }
                if (A12.length() <= 0) {
                    A09 = 1BK.A09(c00361av.A00);
                    A0k = AnonymousClass001.A0k();
                    str = "Found an invalid JSON for plugin=";
                } else {
                    String optString = A12.optString("path", "");
                    if (optString.isEmpty()) {
                        A09 = 1BK.A09(c00361av.A00);
                        A0k = AnonymousClass001.A0k();
                        str = "Found an JSON without path param for plugin=";
                    } else {
                        hashMap.put(optString, A12);
                    }
                }
                A09.D0v("FBCaskMetadataStore", 1BL.A0u(str, str2, A0k));
            }
            if (z2) {
                lightweightQuickPerformanceLogger = c00381ax.A01;
                i2 = c00381ax.A00;
                lightweightQuickPerformanceLogger.markerPoint(i, i2, "end_getall_method");
                lightweightQuickPerformanceLogger.markerEnd(i, i2, (short) 2, lightweightQuickPerformanceLogger.currentMonotonicTimestampNanos(), TimeUnit.NANOSECONDS);
            }
        }
        return hashMap;
    }

    public JSONObject A01(String str) {
        int i;
        JSONObject A12;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger;
        int i2;
        if (!(this instanceof C2zy)) {
            C00381ax c00381ax = (C00381ax) this;
            boolean z = c00381ax.A03;
            i = 58859170;
            if (z) {
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = c00381ax.A01;
                int i3 = c00381ax.A00;
                lightweightQuickPerformanceLogger2.markerStart(58859170, i3, lightweightQuickPerformanceLogger2.currentMonotonicTimestampNanos(), TimeUnit.NANOSECONDS);
                lightweightQuickPerformanceLogger2.markerPoint(58859170, i3, "start_get_method");
                lightweightQuickPerformanceLogger2.markerAnnotate(58859170, i3, "store_type", "shared_pref_store");
            }
            try {
                new JSONObject(((FbSharedPreferences) c00381ax.A02.A01.get()).A3a(C00361av.A04.A0D(0Pz.A0W(((AbstractC00401az) c00381ax).A00, "/")).A0D(String.valueOf(str.hashCode())), "{}"));
            } catch (JSONException unused) {
                A12 = AnonymousClass001.A12();
            }
            if (z) {
                lightweightQuickPerformanceLogger = c00381ax.A01;
                i2 = c00381ax.A00;
                lightweightQuickPerformanceLogger.markerPoint(i, i2, "end_get_method");
                lightweightQuickPerformanceLogger.markerEnd(i, i2, (short) 2, lightweightQuickPerformanceLogger.currentMonotonicTimestampNanos(), TimeUnit.NANOSECONDS);
            }
            return A12;
        }
        C2zy c2zy = (C2zy) this;
        boolean z2 = c2zy.A03;
        i = 58859170;
        if (z2) {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger3 = c2zy.A01;
            int i4 = c2zy.A00;
            lightweightQuickPerformanceLogger3.markerStart(58859170, i4, lightweightQuickPerformanceLogger3.currentMonotonicTimestampNanos(), TimeUnit.NANOSECONDS);
            lightweightQuickPerformanceLogger3.markerPoint(58859170, i4, "start_get_method");
            lightweightQuickPerformanceLogger3.markerAnnotate(58859170, i4, "store_type", "json_store");
        }
        1tQ r0 = c2zy.A02;
        1tQ.A00(r0);
        HashMap hashMap = new HashMap();
        java.util.Map map = r0.A02;
        synchronized (map) {
            java.util.Map map2 = (java.util.Map) map.get(str);
            if (map2 != null) {
                hashMap.putAll(map2);
            }
        }
        A12 = new JSONObject(hashMap);
        if (z2) {
            lightweightQuickPerformanceLogger = c2zy.A01;
            i2 = c2zy.A00;
            lightweightQuickPerformanceLogger.markerPoint(i, i2, "end_get_method");
            lightweightQuickPerformanceLogger.markerEnd(i, i2, (short) 2, lightweightQuickPerformanceLogger.currentMonotonicTimestampNanos(), TimeUnit.NANOSECONDS);
        }
        return A12;
    }

    public void A02(String str) {
        int i;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger;
        int i2;
        if (this instanceof C2zy) {
            C2zy c2zy = (C2zy) this;
            boolean z = c2zy.A03;
            i = 58856195;
            if (z) {
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = c2zy.A01;
                int i3 = c2zy.A00;
                lightweightQuickPerformanceLogger2.markerStart(58856195, i3, lightweightQuickPerformanceLogger2.currentMonotonicTimestampNanos(), TimeUnit.NANOSECONDS);
                lightweightQuickPerformanceLogger2.markerPoint(58856195, i3, "start_remove_method");
                lightweightQuickPerformanceLogger2.markerAnnotate(58856195, i3, "store_type", "json_store");
            }
            c2zy.A02.A05(str);
            if (!z) {
                return;
            }
            lightweightQuickPerformanceLogger = c2zy.A01;
            i2 = c2zy.A00;
        } else {
            C00381ax c00381ax = (C00381ax) this;
            boolean z2 = c00381ax.A03;
            i = 58856195;
            if (z2) {
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger3 = c00381ax.A01;
                int i4 = c00381ax.A00;
                lightweightQuickPerformanceLogger3.markerStart(58856195, i4, lightweightQuickPerformanceLogger3.currentMonotonicTimestampNanos(), TimeUnit.NANOSECONDS);
                lightweightQuickPerformanceLogger3.markerPoint(58856195, i4, "start_remove_method");
                lightweightQuickPerformanceLogger3.markerAnnotate(58856195, i4, "store_type", "shared_pref_store");
            }
            C00361av c00361av = c00381ax.A02;
            1G2 A0D = C00361av.A04.A0D(0Pz.A0W(((AbstractC00401az) c00381ax).A00, "/")).A0D(String.valueOf(str.hashCode()));
            1Ql edit = ((FbSharedPreferences) c00361av.A01.get()).edit();
            edit.CfI(A0D);
            edit.commit();
            if (!z2) {
                return;
            }
            lightweightQuickPerformanceLogger = c00381ax.A01;
            i2 = c00381ax.A00;
        }
        lightweightQuickPerformanceLogger.markerPoint(i, i2, "end_remove_method");
        lightweightQuickPerformanceLogger.markerEnd(i, i2, (short) 2, lightweightQuickPerformanceLogger.currentMonotonicTimestampNanos(), TimeUnit.NANOSECONDS);
    }

    public void A03(String str, JSONObject jSONObject) {
        C00381ax c00381ax = (C00381ax) this;
        boolean z = c00381ax.A03;
        if (z) {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = c00381ax.A01;
            int i = c00381ax.A00;
            lightweightQuickPerformanceLogger.markerStart(58858759, i, lightweightQuickPerformanceLogger.currentMonotonicTimestampNanos(), TimeUnit.NANOSECONDS);
            lightweightQuickPerformanceLogger.markerPoint(58858759, i, "start_put_method");
            lightweightQuickPerformanceLogger.markerAnnotate(58858759, i, "store_type", "shared_pref_store");
        }
        C00361av c00361av = c00381ax.A02;
        String str2 = ((AbstractC00401az) c00381ax).A00;
        try {
            jSONObject.put("path", str);
        } catch (JSONException unused) {
            1BK.A09(c00361av.A00).D0v("FBCaskMetadataStore", 0Pz.A0v("Failed to add path for plugin=", str2, "; path=", str));
        }
        1G2 A0D = C00361av.A04.A0D(0Pz.A0W(str2, "/")).A0D(String.valueOf(str.hashCode()));
        1Ql edit = ((FbSharedPreferences) c00361av.A01.get()).edit();
        edit.CaL(A0D, jSONObject.toString());
        edit.commit();
        if (z) {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = c00381ax.A01;
            int i2 = c00381ax.A00;
            lightweightQuickPerformanceLogger2.markerPoint(58858759, i2, "end_put_method");
            lightweightQuickPerformanceLogger2.markerEnd(58858759, i2, (short) 2, lightweightQuickPerformanceLogger2.currentMonotonicTimestampNanos(), TimeUnit.NANOSECONDS);
        }
    }
}
