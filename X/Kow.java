package X;

import java.util.Iterator;
import java.util.Set;

/* loaded from: Kow.class */
public final class Kow {
    public final Set A00 = AnonymousClass001.A0v();

    public final void A00(Object obj) {
        synchronized (this) {
            Iterator it = this.A00.iterator();
            while (it.hasNext()) {
                ((C2uf) it.next()).CNC(obj);
            }
        }
    }
}
