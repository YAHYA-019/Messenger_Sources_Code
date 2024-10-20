package X;

import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.4ck, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ck.class */
public final class C05004ck extends HashMap {
    public static java.util.Map A00(Object obj, Object obj2) {
        HashMap hashMap = new HashMap(1);
        hashMap.put(obj, obj2);
        return Collections.unmodifiableMap(hashMap);
    }

    public static java.util.Map A01(Object obj, Object obj2, Object obj3, Object obj4) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(obj, obj2);
        hashMap.put(obj3, obj4);
        return Collections.unmodifiableMap(hashMap);
    }
}
