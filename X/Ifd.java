package X;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Ifd.class */
public final class Ifd implements JGR {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;

    public Ifd(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public final String AVL() {
        JSONObject A12 = AnonymousClass001.A12();
        try {
            A12.put("topic", this.A01);
            A12.put("data", this.A00);
        } catch (JSONException e) {
            0fH.A0s("RtcInCallActionLogger", "There was a problem setting the params for logging state sync message received", e);
        }
        return A12.toString();
    }
}
