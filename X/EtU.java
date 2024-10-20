package X;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: EtU.class */
public final class EtU {
    public JGP A00;
    public final Set A01 = new CopyOnWriteArraySet();

    public final void A00(JGP jgp) {
        if (this.A00 == jgp) {
            0fH.A0g(jgp, "InCallFragmentManager", "detachFromFragmentHost, %s");
            this.A00 = null;
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                ((GGQ) it.next()).BtO();
            }
        }
    }
}
