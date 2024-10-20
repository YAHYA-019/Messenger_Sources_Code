package X;

import java.util.HashMap;

/* renamed from: X.6h9, reason: invalid class name */
/* loaded from: 6h9.class */
public abstract class C6h9 {
    public static final boolean A00(C6fs c6fs, String str, HashMap hashMap) {
        Boolean bool = (Boolean) hashMap.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean BVH = c6fs.A00.A00.BVH(str);
        hashMap.put(str, Boolean.valueOf(BVH));
        return BVH;
    }
}
