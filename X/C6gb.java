package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.6gb, reason: invalid class name */
/* loaded from: 6gb.class */
public abstract class C6gb {
    public final Set A00 = new LinkedHashSet();

    public void A00() {
        ArrayList A17;
        Set set = this.A00;
        synchronized (set) {
            A17 = 1BK.A17(set);
        }
        Iterator it = A17.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass001.A0Q("onCacheUpdated");
        }
    }
}
