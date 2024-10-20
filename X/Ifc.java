package X;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Ifc.class */
public final class Ifc implements JGR {
    public final String A00;
    public final java.util.Map A01;

    public Ifc(String str, java.util.Map map) {
        this.A01 = map;
        this.A00 = str;
    }

    public String AVL() {
        JSONObject A12 = AnonymousClass001.A12();
        try {
            java.util.Map map = this.A01;
            if (map != null) {
                Iterator A0y = AnonymousClass001.A0y(map);
                while (A0y.hasNext()) {
                    AbL.A19(A0y, A12);
                }
            }
        } catch (JSONException e) {
            0fH.A0z("RtcInCallActionLogger", "There was a problem setting the params for %s_ACTION", e, new Object[]{this.A00});
        }
        return 11T.A02(A12);
    }
}
