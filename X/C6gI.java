package X;

import java.util.HashMap;

/* renamed from: X.6gI, reason: invalid class name */
/* loaded from: 6gI.class */
public abstract class C6gI {
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
