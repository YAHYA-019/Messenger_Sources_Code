package X;

import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.599, reason: invalid class name */
/* loaded from: 599.class */
public final class AnonymousClass599 {
    public ImmutableMap A00;

    public static void A00(Set set) {
        0WH r0 = new 0WH(0);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            59B r02 = (59B) it.next();
            Class BDi = r02.BDi();
            if (r0.contains(BDi)) {
                throw 1BK.A0f("%s specifies a duplicate item type %s", new Object[]{r02, BDi});
            }
            r0.add(BDi);
        }
    }
}
