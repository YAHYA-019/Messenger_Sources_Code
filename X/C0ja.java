package X;

import android.content.Intent;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0ja, reason: invalid class name */
/* loaded from: 0ja.class */
public final class C0ja {
    public long A00;
    public 0Gp A01 = 0Go.A00;
    public final long A02;
    public final Intent A03;
    public final 0Gp A04;
    public final 0Gp A05;
    public final 0Gp A06;
    public final 0Gp A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public C0ja(Intent intent, 0Gp r303, 0Gp r304, 0Gp r305, 0Gp r306, String str, String str2, String str3, long j, long j2) {
        this.A03 = intent;
        this.A09 = str;
        this.A05 = r303;
        this.A04 = r304;
        this.A08 = str2;
        this.A0A = str3;
        this.A06 = r305;
        this.A07 = r306;
        this.A02 = j;
        this.A00 = j2;
    }

    public static C0ja A00(Object obj) {
        try {
            String str = (String) obj;
            if (str.length() > 50000) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            Intent parseUri = Intent.parseUri(jSONObject.getString("key_intent"), 0);
            String string = jSONObject.getString("key_notifid");
            long j = jSONObject.getLong("key_timestamp_received");
            long j2 = jSONObject.getLong("key_timestamp_last_retried");
            0wZ A02 = jSONObject.has("key_log_event") ? 0Gp.A02(Boolean.valueOf(jSONObject.getBoolean("key_log_event"))) : 0Go.A00;
            0wZ A01 = jSONObject.has("key_queue_time_ms") ? 0Gp.A01(jSONObject.getLong("key_queue_time_ms")) : 0Go.A00;
            String optString = jSONObject.optString("key_job_id");
            String optString2 = jSONObject.optString("key_source");
            0wZ A012 = jSONObject.has("key_mqtt_process_time_ms") ? 0Gp.A01(jSONObject.getLong("key_mqtt_process_time_ms")) : 0Go.A00;
            0wZ A013 = jSONObject.has("key_ttl_s") ? 0Gp.A01(jSONObject.getLong("key_ttl_s")) : 0Go.A00;
            0wZ A022 = jSONObject.has("key_is_delivered") ? 0Gp.A02(Boolean.valueOf(jSONObject.getBoolean("key_is_delivered"))) : 0Go.A00;
            C0ja c0ja = new C0ja(parseUri, A02, A01, A012, A013, string, optString, optString2, j, j2);
            if (A022.A06() && AnonymousClass001.A1V(A022.A05())) {
                c0ja.A01 = 0Gp.A02(AnonymousClass001.A0K());
            }
            return c0ja;
        } catch (Exception unused) {
            return null;
        }
    }

    public String A01() {
        try {
            JSONObject A12 = AnonymousClass001.A12();
            A12.putOpt("key_intent", this.A03.toUri(0));
            A12.putOpt("key_notifid", this.A09);
            A12.putOpt("key_timestamp_received", Long.valueOf(this.A02));
            A12.putOpt("key_timestamp_last_retried", Long.valueOf(this.A00));
            0Gp r0 = this.A07;
            if (r0.A06()) {
                A12.putOpt("key_ttl_s", r0.A05());
            }
            0Gp r02 = this.A05;
            if (r02.A06()) {
                A12.putOpt("key_log_event", r02.A05());
            }
            A12.putOpt("key_job_id", this.A08);
            A12.putOpt("key_source", this.A0A);
            0Gp r03 = this.A04;
            if (r03.A06()) {
                A12.putOpt("key_queue_time_ms", r03.A05());
            }
            0Gp r04 = this.A06;
            if (r04.A06()) {
                A12.putOpt("key_mqtt_process_time_ms", r04.A05());
            }
            0Gp r05 = this.A01;
            if (r05.A06()) {
                A12.putOpt("key_is_delivered", r05.A05());
            }
            String obj = A12.toString();
            int length = obj.length();
            if (length <= 50000) {
                return obj;
            }
            throw AnonymousClass001.A0N(0Pz.A0T("Payload size limit exceeded with ", length));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }
}
