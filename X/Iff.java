package X;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Iff.class */
public final class Iff implements JGR {
    public final int A00;
    public final long A01;

    public Iff(long j, int i) {
        this.A00 = i;
        this.A01 = j;
    }

    public final String AVL() {
        if (this.A00 != 0) {
            try {
                JSONObject A12 = AnonymousClass001.A12();
                A12.put("duration_ms", this.A01);
                return A12.toString();
            } catch (JSONException e) {
                0fH.A0H(HbX.class, "Error serializing action params as string: %s", e);
                return "";
            }
        }
        long j = this.A01;
        if (j != -1) {
            try {
                JSONObject A122 = AnonymousClass001.A12();
                A122.put("mode_duration_ms", j);
                return A122.toString();
            } catch (JSONException e2) {
                0fH.A0H(IRo.class, "Error serializing action params as string: %s", e2);
            }
        }
        return "";
    }
}
