package X;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Ho8.class */
public final class Ho8 {
    public final float A00;
    public final HAe A01;

    public Ho8(HAe hAe, float f) {
        11T.A0F(hAe, 2);
        this.A00 = f;
        this.A01 = hAe;
    }

    public String toString() {
        JSONObject A12 = AnonymousClass001.A12();
        try {
            A12.put("level", Float.valueOf(this.A00));
            A12.put("chargeState", this.A01);
        } catch (JSONException unused) {
        }
        return 11T.A02(A12);
    }
}
