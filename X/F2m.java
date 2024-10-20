package X;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: F2m.class */
public abstract class F2m {
    public static boolean A00(Integer num, String str, String str2, String str3) {
        String str4;
        try {
            JSONObject jSONObject = F7C.A01.A00(num, str, str3, str2, (F2l) null).getJSONObject(String.valueOf(0));
            EPS eps = (Enum) EPS.A00.A00.get(str3);
            if (eps == null) {
                eps = EPS.A3o;
            }
            return jSONObject.has(String.valueOf(eps.enumValue));
        } catch (NullPointerException e) {
            e = e;
            str4 = "NullPointerException";
            0fH.A0r("AccessControlRuleV2", str4, e);
            return false;
        } catch (JSONException e2) {
            e = e2;
            str4 = "JSONException";
            0fH.A0r("AccessControlRuleV2", str4, e);
            return false;
        } catch (Exception e3) {
            e = e3;
            str4 = "Exception";
            0fH.A0r("AccessControlRuleV2", str4, e);
            return false;
        }
    }

    public static boolean A01(Integer num, String str, String str2, String str3) {
        String str4;
        boolean z = false;
        try {
            JSONObject jSONObject = F7C.A01.A00(num, str, str3, str2, (F2l) null).getJSONObject(String.valueOf(1));
            EPS eps = (Enum) EPS.A00.A00.get(str3);
            if (eps == null) {
                eps = EPS.A3o;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(String.valueOf(eps.enumValue));
            String valueOf = String.valueOf(3);
            if (jSONObject2.has(valueOf)) {
                if (jSONObject2.getJSONArray(valueOf).getInt(0) == 0) {
                    z = true;
                }
            }
            return z;
        } catch (NullPointerException e) {
            e = e;
            str4 = "NullPointerException";
            0fH.A0r("AccessControlRuleV2", str4, e);
            return false;
        } catch (JSONException e2) {
            0fH.A0r("AccessControlRuleV2", "JSONException", e2);
            return false;
        } catch (Exception e3) {
            e = e3;
            str4 = "Exception";
            0fH.A0r("AccessControlRuleV2", str4, e);
            return false;
        }
    }
}
