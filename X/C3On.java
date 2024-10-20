package X;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3On, reason: invalid class name */
/* loaded from: 3On.class */
public abstract class C3On {
    /* JADX WARN: Type inference failed for: r0v5, types: [X.35W, X.2Hq, java.lang.Object] */
    public static 35W A00(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            ?? obj = new Object();
            2Hq.A00((2Hq) obj, jSONObject);
            ((35W) obj).A00 = 2Hs.A00("contexts", jSONObject);
            ((35W) obj).A01 = 2Hs.A00("monitors", jSONObject);
            ((35W) obj).A02 = 2Hs.A03(jSONObject);
            ((35W) obj).A03 = 2Hs.A02("vector", jSONObject);
            ((35W) obj).A04 = 2Hs.A02("vectorDefaults", jSONObject);
            return obj;
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [X.3KC, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.2Hq, java.lang.Object, X.35X] */
    public static 35X A01(String str) {
        List asList;
        try {
            JSONObject jSONObject = new JSONObject(str);
            ?? obj = new Object();
            2Hq.A00((2Hq) obj, jSONObject);
            ((35X) obj).A00 = 2Hs.A00("contexts", jSONObject);
            ((35X) obj).A02 = 2Hs.A00("monitors", jSONObject);
            ((35X) obj).A03 = 2Hs.A03(jSONObject);
            if (jSONObject.isNull("table")) {
                asList = null;
            } else {
                JSONArray jSONArray = jSONObject.getJSONArray("table");
                int length = jSONArray.length();
                3KC[] r0 = new 3KC[length];
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= length) {
                        break;
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    ?? obj2 = new Object();
                    ((3KC) obj2).A00 = jSONObject2.optString("bucket", null);
                    ((3KC) obj2).A01 = 2Hs.A01("values", jSONObject2);
                    r0[i2] = obj2;
                    i = i2 + 1;
                }
                asList = Arrays.asList(r0);
            }
            ((35X) obj).A04 = asList;
            ((35X) obj).A01 = 2Hs.A01("defaults", jSONObject);
            return obj;
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }
}
