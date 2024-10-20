package X;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Ifg.class */
public final class Ifg implements JGR {
    public final int A00;
    public final int A01;

    public Ifg(int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
    }

    public final String AVL() {
        if (this.A00 != 0) {
            JSONObject A12 = AnonymousClass001.A12();
            try {
                A12.put("incorrect_user_key_count", this.A01);
            } catch (JSONException e) {
                0fH.A0s("RtcInCallActionLogger", "There was a problem setting the params for logging SAFETY_WARNING_ELIGIBLE_PARTICIPANT_ADDED_INCORRECT_USERKEY_COUNT", e);
            }
            return A12.toString();
        }
        try {
            JSONObject A122 = AnonymousClass001.A12();
            A122.put("retries", this.A01);
            return A122.toString();
        } catch (JSONException e2) {
            0fH.A0H(IRo.class, "Error serializing action params as string: %s", e2);
            return "";
        }
    }
}
