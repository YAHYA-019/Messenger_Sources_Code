package X;

/* renamed from: X.2vr, reason: invalid class name */
/* loaded from: 2vr.class */
public final class C2vr {
    public final String A00(java.util.Map map) {
        if (map.isEmpty()) {
            return null;
        }
        Object obj = map.get("marketplace_target_id");
        if (obj == null) {
            obj = map.get("marketplace_product_id");
            if (obj == null) {
                obj = map.get("marketplace_id");
            }
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }
}
