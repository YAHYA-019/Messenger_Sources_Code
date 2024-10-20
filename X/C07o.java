package X;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.07o, reason: invalid class name */
/* loaded from: 07o.class */
public final class C07o {
    public static final 0JI A04 = new 0JH().A01();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C07o(String str, String str2, String str3, String str4) {
        this.A03 = str;
        this.A01 = str2;
        this.A00 = str3;
        this.A02 = str4;
    }

    public static String A00(C07o c07o) {
        StringBuilder sb = new StringBuilder();
        String str = c07o.A03;
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            sb.append(':');
        }
        String str2 = c07o.A01;
        if (!TextUtils.isEmpty(str2)) {
            sb.append("//");
            sb.append(str2);
        }
        String str3 = c07o.A00;
        if (!TextUtils.isEmpty(str3)) {
            sb.append(str3);
        }
        String str4 = c07o.A02;
        if (!TextUtils.isEmpty(str4)) {
            sb.append('?');
            sb.append(str4);
        }
        return sb.toString();
    }

    public JSONObject A01() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.A03;
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("scheme", str);
            }
            String str2 = this.A01;
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("authority", str2);
            }
            String str3 = this.A00;
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("path", str3);
            }
            String str4 = this.A02;
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("query", str4);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
