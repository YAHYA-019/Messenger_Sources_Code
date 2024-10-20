package X;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Ifi.class */
public final class Ifi implements JGR {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public Ifi(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }

    public final String AVL() {
        try {
            JSONObject A12 = AnonymousClass001.A12();
            A12.put("effect_id", this.A00);
            A12.put("effect_intent", this.A01);
            A12.put("effect_name", this.A02);
            A12.put("effect_type", this.A03);
            return A12.toString();
        } catch (JSONException e) {
            0fH.A0r("CoExperiencesLogger", "Error serializing action params as string: %s", e);
            return "";
        }
    }
}
