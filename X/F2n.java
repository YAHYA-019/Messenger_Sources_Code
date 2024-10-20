package X;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: F2n.class */
public abstract class F2n {
    public static String A00(ExG exG) {
        JSONObject A12 = AnonymousClass001.A12();
        A12.put("user_id", exG.A02);
        A12.put("auth_token", exG.A01);
        A12.put("account_type", exG.A00);
        A12.put("app_source", exG.A04);
        JSONObject A16 = DKD.A16(exG.A05, "credential_source", A12);
        java.util.Map map = exG.A03;
        if (map != null) {
            Iterator A1B = 1BK.A1B(map);
            while (A1B.hasNext()) {
                String A0i = AnonymousClass001.A0i(A1B);
                A16.put(A0i, map.get(A0i));
            }
        }
        A12.put("generic_data", A16);
        return A12.toString();
    }

    public static ExG A01(String str) {
        JSONObject A1F = DKC.A1F(str);
        JSONObject A12 = AnonymousClass001.A12();
        if (A1F.has("generic_data")) {
            A12 = A1F.getJSONObject("generic_data");
        }
        HashMap A0u = AnonymousClass001.A0u();
        Iterator<String> keys = A12.keys();
        while (keys.hasNext()) {
            String A0i = AnonymousClass001.A0i(keys);
            A0u.put(A0i, A12.getString(A0i));
        }
        return new ExG(A1F.getString("user_id"), A1F.getString("auth_token"), A1F.getString("account_type"), A0u, C67Z.valueOf(A1F.getString("app_source")), EMr.valueOf(A1F.getString("credential_source")));
    }
}
