package X;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.7lp, reason: invalid class name */
/* loaded from: 7lp.class */
public abstract class C7lp {
    public static JSONObject A00(java.util.Map map) {
        JSONObject A12 = AnonymousClass001.A12();
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            String A0j = AnonymousClass001.A0j(A0z);
            java.util.Map map2 = (java.util.Map) A0z.getValue();
            JSONObject A122 = AnonymousClass001.A12();
            Iterator A0y2 = AnonymousClass001.A0y(map2);
            while (A0y2.hasNext()) {
                Map.Entry A0z2 = AnonymousClass001.A0z(A0y2);
                A122.put(AnonymousClass001.A0j(A0z2), ((InterfaceC09944ry) A0z2.getValue()).D4Q());
            }
            A12.put(A0j, A122);
        }
        return A12;
    }
}
