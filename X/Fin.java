package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: Fin.class */
public final class Fin implements C1rx {
    public final List A00 = AnonymousClass001.A0s();
    public volatile boolean A01;

    public final void A00() {
        2JB.A02((String) null);
        this.A01 = true;
        List list = this.A00;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((7G8) it.next()).CGC();
        }
        list.clear();
    }

    @Override // X.C1rx
    public void A6t(7G8 r302) {
        synchronized (this) {
            if (!this.A01) {
                this.A00.add(r302);
            }
        }
    }

    @Override // X.C1rx
    public boolean BVK() {
        return this.A01;
    }
}
