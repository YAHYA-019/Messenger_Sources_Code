package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.18n, reason: invalid class name */
/* loaded from: 18n.class */
public final class C18n {
    public int A00;
    public String A01 = "";
    public String A02 = "";
    public String A03 = "";
    public String A04 = "";
    public String A05 = "";

    public static C18n A00(String str) {
        C18n c18n = new C18n();
        if (str == null || str.isEmpty()) {
            return c18n;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            c18n.A01 = jSONObject.optString("ck");
            c18n.A02 = jSONObject.optString("cs");
            c18n.A00 = jSONObject.optInt("sr", 0);
            c18n.A03 = jSONObject.optString("di");
            c18n.A04 = jSONObject.optString("ds");
            c18n.A05 = jSONObject.optString("rc");
            return c18n;
        } catch (JSONException e) {
            0fH.A0q("ConnAckPayload", "Failed to serialize ConnAckPayload", e);
            return new C18n();
        }
    }

    public String toString() {
        try {
            JSONObject A12 = AnonymousClass001.A12();
            A12.putOpt("ck", this.A01);
            A12.putOpt("cs", this.A02);
            A12.putOpt("di", this.A03);
            A12.putOpt("ds", this.A04);
            A12.put("sr", this.A00);
            A12.putOpt("rc", this.A05);
            return A12.toString();
        } catch (JSONException e) {
            0fH.A0v("ConnAckPayload", "failed to serialize", e);
            return "";
        }
    }
}
