package X;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Ifa.class */
public final class Ifa implements JGR {
    public final String A00;

    public Ifa(String str) {
        this.A00 = str;
    }

    public String AVL() {
        try {
            JSONObject A12 = AnonymousClass001.A12();
            A12.put("tap_source", this.A00);
            return 11T.A02(A12);
        } catch (JSONException e) {
            0fH.A0H(IRo.class, "Error serializing action params as string: %s", e);
            return "";
        }
    }
}
