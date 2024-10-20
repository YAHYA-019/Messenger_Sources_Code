package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.69r, reason: invalid class name */
/* loaded from: 69r.class */
public final class C69r implements 5CK {
    public final Collection A00;

    public C69r(Collection collection) {
        this.A00 = collection;
    }

    public void C1P(5CQ r302, Integer num) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((5CK) it.next()).C1P(r302, num);
        }
    }

    public void C1S(5CQ r302, Integer num) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((5CK) it.next()).C1S(r302, num);
        }
    }
}
