package X;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.1rn, reason: invalid class name */
/* loaded from: 1rn.class */
public class C1rn {
    public Object A00;
    public final Set A01 = new CopyOnWriteArraySet();

    public C1rn(Object obj) {
        this.A00 = obj;
    }

    public final void A00(Object obj) {
        Object obj2 = this.A00;
        if (obj2 == obj || 11T.A0O(obj2, obj)) {
            return;
        }
        this.A00 = obj;
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((C1sg) it.next()).CTW(this);
        }
    }
}
