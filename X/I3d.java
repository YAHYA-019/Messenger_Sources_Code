package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: I3d.class */
public final class I3d {
    public long A00;
    public Long A01;
    public final JIC A02;
    public final JMM A03;
    public final java.util.Map A04;

    public I3d(JIC jic, JMM jmm, java.util.Map map) {
        11T.A0F(jic, 2);
        this.A03 = jmm;
        this.A04 = AnonymousClass001.A0u();
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            Object key = A0z.getKey();
            Object value = A0z.getValue();
            if (value != null) {
                this.A04.put(key, value);
            }
        }
        this.A02 = jic;
    }

    public static final void A00(I3d i3d, Exception exc, String str, java.util.Map map, long j) {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.putAll(i3d.A04);
        if (exc != null) {
            AbstractC2326GOr.A1S(exc, A0u);
        }
        if (j >= 0) {
            String valueOf = String.valueOf(j);
            A0u.put("elapsed_time", valueOf);
            A0u.put("dt", valueOf);
        }
        if (map != null) {
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                Object key = A0z.getKey();
                Object value = A0z.getValue();
                if (value != null) {
                    A0u.put(key, value);
                }
            }
        }
        Object obj = A0u.get("orig_video_codec");
        if (obj != null) {
            A0u.put("source_video_codec", obj);
        }
        i3d.A02.logEvent(str, A0u);
    }

    public final void A01() {
        String str;
        this.A00 = this.A02.now();
        A00(this, null, AbstractC00603o4.A00(219), null, -1);
        JMM jmm = this.A03;
        if (jmm != null) {
            long AU3 = jmm.AU3();
            this.A01 = Long.valueOf(AU3);
            java.util.Map map = this.A04;
            String A0b = AnonymousClass001.A0b("source_type", map);
            str = "";
            if (A0b == null) {
                A0b = str;
            }
            String A0b2 = AnonymousClass001.A0b("waterfall_id", map);
            if (A0b2 == null) {
                A0b2 = str;
            }
            String A0b3 = AnonymousClass001.A0b("asset_id", map);
            str = A0b3 != null ? A0b3 : "";
            jmm.flowStart(AU3, A0b, false);
            jmm.flowAnnotateWithCrucialData(AU3, "waterfall_id", A0b2);
            jmm.flowAnnotate(AU3, "asset_id", str);
        }
    }

    public final void A02(Exception exc) {
        A00(this, exc, AbstractC00603o4.A00(208), null, this.A02.now() - this.A00);
        Long l = this.A01;
        if (l != null) {
            long longValue = l.longValue();
            JMM jmm = this.A03;
            if (jmm != null) {
                String stackTraceString = android.util.Log.getStackTraceString(exc);
                11T.A0D(stackTraceString);
                jmm.flowAnnotate(longValue, TraceFieldType.Error, stackTraceString);
                jmm.flowEndFail(longValue, String.valueOf(exc), null);
            }
        }
    }
}
