package X;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.3RM, reason: invalid class name */
/* loaded from: 3RM.class */
public final class C3RM {
    public static final void A00(C3RM c3rm, 07S r302, JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String A0i = AnonymousClass001.A0i(keys);
            Object obj = jSONObject.get(A0i);
            if ((obj instanceof String) || (obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Long) || (obj instanceof Boolean)) {
                07S.A00(r302, obj, A0i);
            } else if (obj instanceof JSONObject) {
                A00(c3rm, r302.A0D(A0i), (JSONObject) obj);
            } else if (obj instanceof JSONArray) {
                c3rm.A01(r302.A0C(A0i), (JSONArray) obj);
            }
        }
    }

    private final void A01(0CP r302, JSONArray jSONArray) {
        int length = jSONArray.length();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            Object obj = jSONArray.get(i2);
            if ((obj instanceof String) || (obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Long) || (obj instanceof Boolean)) {
                0CP.A00(r302, obj);
            } else if (obj instanceof JSONObject) {
                A00(this, r302.A0D(), (JSONObject) obj);
            } else if (obj instanceof JSONArray) {
                A01(r302.A0C(), (JSONArray) obj);
            }
            i = i2 + 1;
        }
    }
}
