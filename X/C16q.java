package X;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.proxygen.TraceFieldType;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.16q, reason: invalid class name */
/* loaded from: 16q.class */
public final class C16q {
    public static final AtomicLong A0D = new AtomicLong(0);
    public final Context A00;
    public final C03L A01;
    public final C16p A02;
    public final 17G A03;
    public final 17I A04;
    public final 04J A08;
    public final C15o A09;
    public final AnonymousClass097 A0A;
    public final String A0B;
    public final String A0C;
    public final long A07 = SystemClock.elapsedRealtime();
    public final long A06 = Process.myPid();
    public final long A05 = A0D.incrementAndGet();

    public C16q(Context context, 04J r303, C15o c15o, C03L c03l, AnonymousClass097 anonymousClass097, C16p c16p, 17G r308, 17I r309, String str) {
        this.A00 = context;
        this.A0C = str;
        this.A04 = r309;
        this.A03 = r308;
        this.A0B = context.getPackageName();
        this.A09 = c15o;
        this.A08 = r303;
        this.A0A = anonymousClass097;
        this.A01 = c03l;
        this.A02 = c16p;
    }

    public static 2R2 A00(04J r301) {
        return new 2R2(1UD.A00((1UD) r301, 1ZG.A01, "mqtt_client_network_trace"), 235);
    }

    public static 2R2 A01(04J r301) {
        return new 2R2(1UD.A00((1UD) r301, 1ZG.A01, "mqtt_unified_client_disconnect"), 237);
    }

    public static void A02(NetworkInfo networkInfo, C16q c16q, java.util.Map map) {
        if (networkInfo != null) {
            String obj = networkInfo.getState().toString();
            String typeName = networkInfo.getTypeName();
            if (typeName == null) {
                typeName = "";
            }
            String subtypeName = networkInfo.getSubtypeName();
            if (subtypeName == null) {
                subtypeName = "";
            }
            String extraInfo = networkInfo.getExtraInfo();
            if (extraInfo == null) {
                extraInfo = "";
            }
            map.put("network_state", obj);
            map.put(TraceFieldType.NetworkType, typeName);
            map.put("network_subtype", subtypeName);
            map.put("network_extra_info", extraInfo);
        } else {
            map.put("network_info", "null");
        }
        map.put("is_in_idle_mode", Boolean.toString(c16q.A04.A04()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r0.isConnected() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A03(X.0D7 r301, X.C16q r302) {
        /*
            r0 = r302
            X.17I r0 = r0.A04
            android.net.NetworkInfo r0 = r0.A01()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L18
            r0 = r303
            boolean r0 = r0.isConnected()
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L1d
        L18:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L1d:
            r0 = r305
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r306 = r0
            r0 = r301
            java.lang.String r1 = "os_connectivity"
            r2 = r306
            r0.A0B(r1, r2)
            r0 = r301
            r0.BZL()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16q.A03(X.0D7, X.16q):void");
    }

    public static void A04(0D7 r301, String str, long j) {
        r301.A0D("session_id", Long.valueOf(j));
        r301.A0E("connection_state", str);
        r301.A0E("client_type", "whistle_android");
    }

    public static void A05(java.util.Map map, long j) {
        map.put("network_session_id", Long.toString(j));
    }

    public void A06(NetworkInfo networkInfo, 0Gp r303, 0Gp r304, String str, String str2, String str3, long j, boolean z) {
        HashMap A01 = C15p.A01("act", str, "running", String.valueOf(z));
        A01.put("process_id", Long.toString(this.A06));
        A01.put("thread_id", Long.toString(Thread.currentThread().getId()));
        if (str2 != null) {
            A01.put("mqtt_persistence_string", str2);
        }
        A05(A01, j);
        A02(networkInfo, this, A01);
        if (!TextUtils.isEmpty(str3)) {
            A01.put("calr", str3);
        }
        if (r303.A06()) {
            A01.put("flg", String.valueOf(r303.A05()));
        }
        if (r304.A06()) {
            A01.put("sta_id", String.valueOf(r304.A05()));
        }
        A0H("mqtt_service_state", A01);
    }

    public void A07(NetworkInfo networkInfo, 0Gp r303, String str, int i, long j, long j2, long j3) {
        HashMap A01 = C15p.A01("timespan_ms", String.valueOf(j), TraceFieldType.Port, String.valueOf(i), "he_state", str);
        if (r303.A06()) {
            String obj = r303.A05().toString();
            if (((Throwable) r303.A05()).getCause() != null) {
                obj = 0Pz.A0j(obj, " Caused by: ", ((Throwable) r303.A05()).getCause().toString());
            }
            A01.put("error_message", obj);
        }
        A01.put("mqtt_session_id", Long.toString(j2));
        A05(A01, j3);
        A02(networkInfo, this, A01);
        A0H("mqtt_socket_connect", A01);
    }

    public void A08(Long l, Long l2, String str, String str2, long j) {
        04J r0 = this.A08;
        if (r0 != null) {
            2R2 A00 = 9Aw.A00(r0);
            if (((0D7) A00).A00.isSampled()) {
                A00.A0E("event_type", "incoming_publish");
                A04(A00, str, j);
                A00.A0E("topic", str2);
                A00.A0D(TraceFieldType.QoS, l);
                A00.A0D("payload_size", l2);
                A03(A00, this);
            }
        }
    }

    public void A09(Long l, String str, String str2, long j, long j2) {
        04J r0 = this.A08;
        if (r0 != null) {
            2R2 A00 = 9Av.A00(r0);
            if (((0D7) A00).A00.isSampled()) {
                A00.A0E("event_type", "connect");
                A04(A00, str, j);
                A00.A0D("duration", l);
                A00.A0E("error", str2);
                A00.A0D(OptSvcAnalyticsStore.LOGGING_KEY_ATTEMPT_NUMBER, Long.valueOf(j2));
                A03(A00, this);
            }
        }
        C16p c16p = this.A02;
        if (c16p != null) {
            c16p.CjP(l.longValue());
        }
    }

    public void A0A(String str, int i, int i2, int i3, int i4, long j, long j2) {
        A0H("mqtt_publish_debug", C15p.A01("result", OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS, "operation", str, TraceFieldType.QoS, Integer.toString(i), TraceFieldType.MsgId, Integer.toString(i2), "original_ops_id", Integer.toString(i3), "timespan_ms", Long.toString(j), "retry_cnt", Integer.toString(i4), "mqtt_session_id", Long.toString(j2)));
    }

    public void A0B(String str, long j) {
        HashMap A01 = C15p.A01("operation", str, "timespan_ms", Long.toString(j));
        A02(this.A04.A02(), this, A01);
        A0H("mqtt_publish_arrive_processing_latency", A01);
    }

    public void A0C(String str, String str2, long j, long j2, boolean z) {
        04J r0 = this.A08;
        if (r0 != null) {
            2R2 A01 = A01(r0);
            if (((0D7) A01).A00.isSampled()) {
                A01.A0E("event_type", z ? "client_disconnect" : "server_disconnect");
                A04(A01, str, j);
                A01.A0D("duration", Long.valueOf(j2));
                A01.A0E("error", str2);
                A03(A01, this);
            }
        }
    }

    public void A0D(String str, String str2, String str3) {
        04J r0 = this.A08;
        if (r0 != null) {
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
                return;
            }
            2R2 A00 = A00(r0);
            if (((0D7) A00).A00.isSampled()) {
                A00.A0C("start_service", 2);
                A00.A0C("end_service", 1);
                A00.A0D("raw_client_ts_ms", AnonymousClass002.A0G());
                if (TextUtils.isEmpty(str)) {
                    str = null;
                }
                A00.A0E("trace_id", str);
                if (TextUtils.isEmpty(str2)) {
                    str2 = null;
                }
                A00.A0E(TraceFieldType.RequestID, str2);
                if (TextUtils.isEmpty(str3)) {
                    str3 = null;
                }
                A00.A0E("edge_id", str3);
                A00.BZL();
            }
        }
    }

    public void A0E(String str, String str2, String str3) {
        04J r0 = this.A08;
        if (r0 != null) {
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
                return;
            }
            2R2 A00 = A00(r0);
            if (((0D7) A00).A00.isSampled()) {
                A00.A0C("start_service", 1);
                A00.A0C("end_service", 2);
                A00.A0D("raw_client_ts_ms", AnonymousClass002.A0G());
                if (TextUtils.isEmpty(str)) {
                    str = null;
                }
                A00.A0E("trace_id", str);
                if (TextUtils.isEmpty(str2)) {
                    str2 = null;
                }
                A00.A0E(TraceFieldType.RequestID, str2);
                if (TextUtils.isEmpty(str3)) {
                    str3 = null;
                }
                A00.A0E("edge_id", str3);
                A00.BZL();
            }
        }
    }

    public void A0F(String str, String str2, String str3, long j, long j2, long j3, long j4, boolean z) {
        04J r0 = this.A08;
        if (r0 != null) {
            2R2 A00 = 9Ax.A00(r0);
            if (((0D7) A00).A00.isSampled()) {
                A00.A0E("event_type", "outgoing_publish");
                A04(A00, str, j);
                A00.A0E("topic", str2);
                A00.A0D(TraceFieldType.QoS, Long.valueOf(j2));
                A00.A0D("payload_size", Long.valueOf(j3));
                A00.A0D("duration", Long.valueOf(j4));
                A00.A0B("acked", Boolean.valueOf(z));
                A00.A0E("error", str3);
                A03(A00, this);
            }
        }
        C16p c16p = this.A02;
        if (c16p != null) {
            c16p.CjZ(j4);
        }
    }

    public void A0G(String str, String str2, Throwable th, int i, int i2, int i3, int i4, long j) {
        HashMap A01 = C15p.A01("result", str, "operation", str2, TraceFieldType.QoS, Integer.toString(i), TraceFieldType.MsgId, Integer.toString(i2), "original_ops_id", Integer.toString(i3), "retry_cnt", Integer.toString(i4), "mqtt_session_id", Long.toString(j));
        if (th != null) {
            A01.put("error_message", th.toString());
        }
        A0H("mqtt_publish_debug", A01);
    }

    public void A0H(String str, java.util.Map map) {
        map.put("service_name", this.A0C);
        map.put("service_session_id", Long.toString(this.A07));
        map.put("process_id", Long.toString(this.A06));
        map.put("logger_object_id", Long.toString(this.A05));
        if (!map.containsKey("network_session_id")) {
            map.put("network_session_id", Long.toString(this.A04.A05.get()));
        }
        C15n c15n = new C15n(str, this.A0B);
        c15n.A05(map);
        0fH.A0i(c15n, "MqttAnalyticsLogger", "reportMqttEvent %s");
        this.A09.CgC(c15n);
    }
}
