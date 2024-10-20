package X;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.08p, reason: invalid class name */
/* loaded from: 08p.class */
public abstract class C08p {
    public final List A00 = new LinkedList();

    public void A01(09A r302) {
        synchronized (this) {
            this.A00.add(r302);
        }
    }

    public final void A02(JSONObject jSONObject) {
        synchronized (this) {
            for (09A r0 : this.A00) {
                try {
                    String AyP = r0.AyP();
                    if (!TextUtils.isEmpty(AyP)) {
                        jSONObject.put("host_name_v6", AyP);
                    }
                    String AWd = r0.AWd();
                    if (!TextUtils.isEmpty(AWd)) {
                        jSONObject.put("analytics_endpoint", AWd);
                    }
                    Object AvE = r0.AvE();
                    if (AvE != null) {
                        jSONObject.put("background_keepalive_interval_persistent_sec", AvE);
                    }
                    Object AvH = r0.AvH();
                    if (AvH != null) {
                        jSONObject.put("mqtt_connect_timeout_sec", AvH);
                    }
                    Object AvG = r0.AvG();
                    if (AvG != null) {
                        jSONObject.put("response_timeout_sec", AvG);
                    }
                    Object B2z = r0.B2z();
                    if (B2z != null) {
                        jSONObject.put("ping_delay_s", B2z);
                    }
                    Object AvF = r0.AvF();
                    if (AvF != null) {
                        jSONObject.put("foreground_keepalive_interval_sec", AvF);
                    }
                    Object BAX = r0.BAX();
                    if (BAX != null) {
                        jSONObject.put("short_mqtt_connection_sec", BAX);
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }

    public abstract C08q A03();

    public abstract void A04();

    public abstract void A05();
}
