package X;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Ifh.class */
public final class Ifh implements JGR {
    public final int A00;
    public final int A01;
    public final String A02;

    public Ifh(String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = str;
        this.A01 = i;
    }

    public final String AVL() {
        String str;
        String str2;
        int i = this.A00;
        JSONObject A12 = AnonymousClass001.A12();
        if (i != 0) {
            try {
                A12.put("topic", this.A02);
                A12.put("length_in_bytes", this.A01);
            } catch (JSONException e) {
                e = e;
                str = "RtcInCallActionLogger";
                str2 = "There was a problem setting the params for logging a transacted data message send";
                0fH.A0s(str, str2, e);
                return A12.toString();
            }
        } else {
            try {
                A12.put("topic", this.A02);
                A12.put("length_in_bytes", this.A01);
            } catch (JSONException e2) {
                e = e2;
                str = "RtcInCallActionLogger";
                str2 = "There was a problem setting the params for logging a data message send";
                0fH.A0s(str, str2, e);
                return A12.toString();
            }
        }
        return A12.toString();
    }
}
