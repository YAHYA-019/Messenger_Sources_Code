package X;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.19z, reason: invalid class name */
/* loaded from: 19z.class */
public abstract class C19z {
    public static JSONObject A00(java.util.Map map) {
        JSONObject jSONObject;
        if (map.isEmpty()) {
            jSONObject = null;
        } else {
            jSONObject = AnonymousClass001.A12();
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                jSONObject.put(AnonymousClass001.A0j(A0z), A0z.getValue());
            }
        }
        return jSONObject;
    }
}
