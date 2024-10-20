package X;

import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.57p, reason: invalid class name */
/* loaded from: 57p.class */
public final class C57p {
    public ImmutableMap A00;

    public static void A00(Set set) {
        0WH r0 = new 0WH(0);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C57r c57r = (C57r) it.next();
            Class BDi = c57r.BDi();
            if (r0.contains(BDi)) {
                throw 1BK.A0f("%s specifies a duplicate item type %s", new Object[]{c57r, BDi});
            }
            r0.add(BDi);
        }
    }
}
