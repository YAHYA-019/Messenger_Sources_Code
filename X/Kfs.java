package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: Kfs.class */
public final class Kfs {
    public java.util.Map A00 = AnonymousClass001.A0u();

    public Kfs(String str) {
        try {
            if (str.isEmpty()) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= jSONArray.length()) {
                    return;
                }
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                1BK.A1O(new KkP(this, jSONObject.getInt("BaseLatency"), jSONObject.getInt("Jitter"), jSONObject.getInt("SamplingRate")), this.A00, jSONObject.getInt("Position"));
                i = i2 + 1;
            }
        } catch (Exception unused) {
        }
    }
}
