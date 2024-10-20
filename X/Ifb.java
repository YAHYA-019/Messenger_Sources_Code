package X;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Ifb.class */
public final class Ifb implements JGR {
    public final /* synthetic */ String A00;

    public Ifb(String str) {
        this.A00 = str;
    }

    public final String AVL() {
        JSONObject A12 = AnonymousClass001.A12();
        try {
            A12.put("tag_end_session_surface", this.A00);
        } catch (JSONException e) {
            0fH.A0s("RtcInCallActionLogger", "There was a problem setting the params for logging a state change", e);
        }
        return A12.toString();
    }
}
