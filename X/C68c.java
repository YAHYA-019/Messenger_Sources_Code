package X;

import java.util.Collection;
import java.util.Set;

/* renamed from: X.68c, reason: invalid class name */
/* loaded from: 68c.class */
public final class C68c {
    public static LiO A00(Set set, Set set2) {
        if (set2 == null && (set == null || set.isEmpty())) {
            return null;
        }
        return new LiO(set, set2);
    }

    public static boolean A01(Object obj, Collection collection, Collection collection2) {
        boolean z = false;
        if (collection == null) {
            if (collection2 != null) {
                z = !collection2.contains(obj);
            }
        } else {
            if (collection2 == null) {
                return collection.contains(obj);
            }
            if (!collection2.contains(obj) || collection.contains(obj)) {
                return true;
            }
        }
        return z;
    }
}
