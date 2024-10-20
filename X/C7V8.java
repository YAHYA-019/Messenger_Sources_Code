package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.7V8, reason: invalid class name */
/* loaded from: 7V8.class */
public abstract class C7V8 {
    public final Set A00 = Collections.newSetFromMap(new ConcurrentHashMap());

    public final void A00() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            A01((5fS) it.next());
        }
    }

    public void A01(5fS r302) {
        if (this instanceof 7VA) {
            7VA r0 = (7VA) this;
            r0.A00.BAO((5fT) r302, r0.A00);
        } else {
            7VW r02 = (7VW) this;
            r02.A00.AVY((7VY) r302, r02.A00);
        }
    }

    public void A02(5fS r302) {
        this.A00.remove(r302);
    }

    public final void A03(Throwable th) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((5fS) it.next()).onError(th);
        }
    }
}
