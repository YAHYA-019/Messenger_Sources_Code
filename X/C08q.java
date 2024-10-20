package X;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.08q, reason: invalid class name */
/* loaded from: 08q.class */
public final class C08q {
    public int A00;
    public String A01;
    public java.util.Map A02 = new HashMap();
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final int A0M;
    public final int A0N;
    public final int A0O;
    public final int A0P;
    public final int A0Q;
    public final long A0R;
    public final long A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;

    public C08q(JSONObject jSONObject) {
        this.A0U = jSONObject.optString("host_name_v6", "mqtt-mini.facebook.com");
        this.A0V = jSONObject.optString("php_sandbox_host_name", null);
        this.A0T = jSONObject.optString("analytics_endpoint", "https://graph.facebook.com/logging_client_events");
        this.A0O = jSONObject.optInt("default_port", 443);
        this.A0A = jSONObject.optInt("backup_port", 443);
        this.A0E = jSONObject.optInt("dns_timeout_sec", 60);
        this.A0Q = jSONObject.optInt("socket_timeout_sec", 60);
        this.A0L = jSONObject.optInt("mqtt_connect_timeout_sec", 60);
        this.A0M = jSONObject.optInt("response_timeout_sec", 59);
        this.A05 = jSONObject.optInt("back_to_back_retry_attempts", 3);
        this.A08 = jSONObject.optInt("background_back_to_back_retry_attempts", 1);
        this.A06 = jSONObject.optInt("back_to_back_retry_interval_sec", 0);
        this.A03 = jSONObject.optInt("back_off_initial_retry_interval_sec", 2);
        this.A07 = jSONObject.optInt("background_back_off_initial_retry_interval_sec", 10);
        this.A04 = jSONObject.optInt("back_off_max_retry_interval_sec", 900);
        this.A0F = jSONObject.optInt("foreground_keepalive_interval_sec", 60);
        this.A09 = jSONObject.optInt("background_keepalive_interval_persistent_sec", 900);
        this.A00 = jSONObject.optInt("skip_ping_threshold_s", 10);
        this.A0N = jSONObject.optInt("ping_delay_s", 60);
        this.A0W = jSONObject.optBoolean("force_server_ping", false);
        this.A0I = jSONObject.optInt("min_cycle_delay_sec_inexact_scheduling", 900);
        this.A0H = jSONObject.optInt("happy_eyeballs_delay_ms", 25);
        this.A0J = jSONObject.optInt("mqtt_client_thread_priority_ui", 5);
        this.A0K = jSONObject.optInt("mqtt_client_thread_priority_worker", 5);
        this.A0S = jSONObject.optLong("analytics_log_min_interval_for_sent_ms", 0L);
        this.A0R = jSONObject.optLong("analytics_log_min_interval_for_received_ms", 0L);
        this.A0G = jSONObject.optInt("gcm_ping_mqtt_delay_sec", 30);
        this.A0Y = jSONObject.optBoolean("use_ssl", true);
        this.A0X = jSONObject.optBoolean("use_compression", true);
        this.A0B = jSONObject.optInt("ct", 60000);
        this.A0P = jSONObject.optInt("short_mqtt_connection_sec", 5);
        this.A0D = jSONObject.optInt("connect_rate_limiter_limit", 40);
        this.A0C = jSONObject.optInt("connect_rate_limiter_interval_s", 2400);
        this.A0Z = jSONObject.optBoolean("verbose_connection_health_log", false);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C08q c08q = (C08q) obj;
            if (this.A0O != c08q.A0O || this.A0A != c08q.A0A || this.A0E != c08q.A0E || this.A0Q != c08q.A0Q || this.A0L != c08q.A0L || this.A0M != c08q.A0M || this.A05 != c08q.A05 || this.A08 != c08q.A08 || this.A06 != c08q.A06 || this.A03 != c08q.A03 || this.A07 != c08q.A07 || this.A04 != c08q.A04 || this.A0F != c08q.A0F || this.A00 != c08q.A00 || this.A0N != c08q.A0N || this.A0W != c08q.A0W || this.A09 != c08q.A09 || this.A0I != c08q.A0I || this.A0H != c08q.A0H || this.A0J != c08q.A0J || this.A0K != c08q.A0K || this.A0S != c08q.A0S || this.A0R != c08q.A0R || this.A0G != c08q.A0G || this.A0Y != c08q.A0Y || this.A0X != c08q.A0X || this.A0B != c08q.A0B) {
                return false;
            }
            String str = this.A0U;
            String str2 = c08q.A0U;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            String str3 = this.A01;
            String str4 = c08q.A01;
            if (str3 != null) {
                if (!str3.equals(str4)) {
                    return false;
                }
            } else if (str4 != null) {
                return false;
            }
            String str5 = this.A0V;
            String str6 = c08q.A0V;
            if (str5 != null) {
                if (!str5.equals(str6)) {
                    return false;
                }
            } else if (str6 != null) {
                return false;
            }
            if (this.A0P != c08q.A0P || this.A0D != c08q.A0D || this.A0C != c08q.A0C || this.A0Z != c08q.A0Z || this.A02 != c08q.A02) {
                return false;
            }
            String str7 = this.A0T;
            String str8 = c08q.A0T;
            if (str7 != null) {
                return str7.equals(str8);
            }
            if (str8 != null) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        String str = this.A0U;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.A01;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.A0V;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.A0T;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return ((((((((((((((((AnonymousClass002.A02(this.A0R, AnonymousClass002.A02(this.A0S, (((((((((((((((((((((((((((((((((((((((((((hashCode3 + i) * 31) + this.A0O) * 31) + this.A0A) * 31) + this.A0E) * 31) + this.A0Q) * 31) + this.A0L) * 31) + this.A0M) * 31) + this.A05) * 31) + this.A08) * 31) + this.A06) * 31) + this.A03) * 31) + this.A07) * 31) + this.A04) * 31) + this.A0F) * 31) + this.A09) * 31) + this.A00) * 31) + this.A0N) * 31) + (this.A0W ? 1 : 0)) * 31) + this.A0I) * 31) + this.A0H) * 31) + this.A0J) * 31) + this.A0K) * 31)) + this.A0G) * 31) + (this.A0Y ? 1 : 0)) * 31) + (this.A0X ? 1 : 0)) * 31) + this.A0B) * 31) + this.A0P) * 31) + this.A0D) * 31) + this.A0C) * 31) + (this.A0Z ? 1 : 0)) * 31) + this.A02.hashCode();
    }
}
