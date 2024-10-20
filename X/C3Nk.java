package X;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3Nk, reason: invalid class name */
/* loaded from: 3Nk.class */
public final class C3Nk {
    public final java.util.Map A00;

    public final HashMap A00(Collection collection) {
        Set unmodifiableSet;
        HashMap A0u = AnonymousClass001.A0u();
        java.util.Map map = this.A00;
        Iterator A1B = 1BK.A1B(map);
        while (A1B.hasNext()) {
            Object next = A1B.next();
            if (map.containsKey(next)) {
                HashSet A0v = AnonymousClass001.A0v();
                Iterator A0y = AnonymousClass001.A0y((java.util.Map) map.get(next));
                while (A0y.hasNext()) {
                    Map.Entry A0z = AnonymousClass001.A0z(A0y);
                    if (collection.contains(A0z.getKey())) {
                        A0v.add(A0z.getValue());
                    }
                }
                unmodifiableSet = Collections.unmodifiableSet(A0v);
            } else {
                unmodifiableSet = Collections.emptySet();
            }
            A0u.put(next, unmodifiableSet);
        }
        return A0u;
    }
}
