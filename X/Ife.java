package X;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Ife.class */
public final class Ife implements JGR {
    public final int A00;
    public final Object A01;

    public Ife(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v63 */
    public final String AVL() {
        JSONObject A12;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                IRo iRo = (IRo) this.A01;
                if (iRo.A00 != -1) {
                    try {
                        JSONObject A122 = AnonymousClass001.A12();
                        A122.put("screen_sharing_duration", 1Br.A01(iRo.A06) - iRo.A00);
                        return A122.toString();
                    } catch (JSONException e) {
                        0fH.A0H(IRo.class, "Error serializing action params as string: %s", e);
                    }
                }
                return "";
            case 1:
                A12 = AnonymousClass001.A12();
                try {
                    A12.put("event_type", "change_state");
                    java.util.Map map = (java.util.Map) this.A01;
                    if (map != null) {
                        Iterator A0y = AnonymousClass001.A0y(map);
                        while (A0y.hasNext()) {
                            AbL.A19(A0y, A12);
                        }
                    }
                } catch (JSONException e2) {
                    e = e2;
                    str = "RtcInCallActionLogger";
                    str2 = "There was a problem setting the params for logging a state change";
                    A12 = A12;
                    0fH.A0s(str, str2, e);
                    return A12.toString();
                }
                return A12.toString();
            default:
                A12 = AnonymousClass001.A12();
                JSONArray jSONArray = new JSONArray();
                try {
                    String[] strArr = (String[]) this.A01;
                    boolean z = false;
                    while (z < 1) {
                        jSONArray.put(strArr[z ? 1 : 0]);
                        z = true;
                    }
                    A12.put("tags", jSONArray);
                } catch (JSONException e3) {
                    e = e3;
                    str = "RtcInCallActionLogger";
                    str2 = "There was a problem setting the params for logging a tag";
                    A12 = A12;
                    0fH.A0s(str, str2, e);
                    return A12.toString();
                }
                return A12.toString();
        }
    }
}
