package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.15n, reason: invalid class name */
/* loaded from: 15n.class */
public class C15n {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final java.util.Map A06 = AnonymousClass001.A0u();

    public C15n(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.A00 = System.currentTimeMillis();
        this.A05 = str;
        this.A04 = str2;
        this.A03 = "Unknown";
        this.A02 = "Unknown";
        this.A01 = "Unknown";
    }

    public C15n(String str, String str2, String str3, String str4, String str5) {
        str2.getClass();
        this.A00 = System.currentTimeMillis();
        this.A05 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A02 = str4;
        this.A01 = str5;
    }

    public static void A00(C15n c15n, C19f c19f, Object obj, java.util.Map map) {
        c15n.A05(map);
        0fH.A0f(obj, c15n.toString(), "FbnsAnalyticsLogger", "Event name: %s, Event parameters: %s");
        c19f.A01.CgC(c15n);
    }

    public static void A01(C15n c15n, JSONObject jSONObject) {
        jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, c15n.A05);
        jSONObject.put("time", C15p.A00(c15n.A00));
    }

    public static void A02(C15n c15n, JSONObject jSONObject, boolean z) {
        jSONObject.put("is_emp", z);
        jSONObject.put("d_model", c15n.A02);
        jSONObject.put("d_manuf", c15n.A01);
        jSONObject.put("locale", c15n.A03);
        JSONObject A00 = C19z.A00(c15n.A06);
        if (A00 != null) {
            jSONObject.put("extra_info", A00);
        }
    }

    public C15n A03(String str) {
        this.A06.put("pk", str);
        return this;
    }

    public JSONObject A04() {
        JSONObject A12 = AnonymousClass001.A12();
        try {
            A01(this, A12);
            A12.put("locale", this.A03);
            A12.put("d_model", this.A02);
            A12.put("d_manuf", this.A01);
            A12.put("net_type", "Unknown");
            A12.putOpt("module", this.A04);
            java.util.Map map = this.A06;
            if (!map.isEmpty()) {
                JSONObject A122 = AnonymousClass001.A12();
                Iterator A0y = AnonymousClass001.A0y(map);
                while (A0y.hasNext()) {
                    Map.Entry A0z = AnonymousClass001.A0z(A0y);
                    A122.put(AnonymousClass001.A0j(A0z), A0z.getValue());
                }
                A12.put("extra", A122);
                return A12;
            }
        } catch (JSONException e) {
            0fH.A0v("AnalyticsEvent", "Failed to serialize", e);
        }
        return A12;
    }

    public void A05(java.util.Map map) {
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            this.A06.put(A0z.getKey().toString(), A0z.getValue() == null ? "" : A0z.getValue().toString());
        }
    }

    public String toString() {
        return A04().toString();
    }
}
