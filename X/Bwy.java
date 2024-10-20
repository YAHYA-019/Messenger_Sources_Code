package X;

import com.facebook.proxygen.TraceFieldType;
import org.json.JSONObject;

/* loaded from: Bwy.class */
public final class Bwy {
    public final int A00;
    public final long A01;
    public final KNP A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public Bwy(KNP knp, JSONObject jSONObject) {
        this.A02 = knp;
        this.A06 = jSONObject.optString("user_id");
        this.A04 = jSONObject.optString(TraceFieldType.RequestID);
        this.A00 = jSONObject.optInt(JQw.A00(332));
        this.A01 = jSONObject.optLong("create_time", -1);
        this.A05 = jSONObject.optString("salt");
        this.A03 = jSONObject.optString("hashed_user_id");
    }
}
