package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: Ff6.class */
public final class Ff6 implements 5CK {
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();

    public void C1P(5CQ r302, Integer num) {
        11T.A0H(r302, num);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((5CK) it.next()).C1P(r302, num);
        }
    }

    public void C1S(5CQ r302, Integer num) {
        11T.A0H(r302, num);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((5CK) it.next()).C1S(r302, num);
        }
    }
}
