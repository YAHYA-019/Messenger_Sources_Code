package X;

import org.json.JSONObject;

/* renamed from: X.19s, reason: invalid class name */
/* loaded from: 19s.class */
public final class C19s {
    public String A01 = "";
    public String A02 = "";
    public String A03 = "";
    public Long A00 = 0L;
    public boolean A04 = false;

    public static C19s A00(String str) {
        C19s c19s = new C19s();
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            c19s.A01 = jSONObject.optString("app_id");
            c19s.A02 = jSONObject.optString("pkg_name");
            c19s.A03 = jSONObject.optString("token");
            c19s.A00 = Long.valueOf(jSONObject.optLong("time"));
            c19s.A04 = jSONObject.optBoolean("invalid");
        }
        return c19s;
    }

    public String A01() {
        JSONObject A12 = AnonymousClass001.A12();
        A12.putOpt("app_id", this.A01);
        A12.putOpt("pkg_name", this.A02);
        A12.putOpt("token", this.A03);
        A12.putOpt("time", this.A00);
        A12.putOpt("invalid", Boolean.valueOf(this.A04));
        return A12.toString();
    }
}
