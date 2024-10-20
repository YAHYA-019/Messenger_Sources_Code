package X;

import com.facebook.acra.constants.ErrorReportingConstants;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.15w, reason: invalid class name */
/* loaded from: 15w.class */
public final class C15w {
    public long A01;
    public C16f A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public UUID A08;
    public List A07 = AnonymousClass001.A0t(50);
    public int A00 = 0;

    public String toString() {
        JSONObject A12 = AnonymousClass001.A12();
        try {
            A12.put("seq", this.A00);
            A12.put("time", C15p.A00(this.A01));
            A12.putOpt("app_id", this.A03);
            A12.putOpt("app_ver", this.A04);
            A12.putOpt("build_num", this.A05);
            A12.putOpt("device_id", this.A02.get());
            A12.putOpt("session_id", this.A08);
            A12.putOpt(ErrorReportingConstants.USER_ID_KEY, this.A06);
            List list = this.A07;
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((C15n) it.next()).A04());
            }
            A12.put("data", jSONArray);
            A12.put("log_type", "client_event");
            return A12.toString();
        } catch (JSONException e) {
            0fH.A0v("AnalyticsSession", "Failed to serialize", e);
            return "";
        }
    }
}
