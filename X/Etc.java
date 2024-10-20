package X;

import java.util.List;

/* loaded from: Etc.class */
public abstract class Etc {
    public final Egf A00;
    public final Egg A01;

    public Etc(Egf egf, Egg egg) {
        this.A01 = egg;
        this.A00 = egf;
    }

    public void A00(F63 f63) {
        List list;
        11T.A0F(f63, 0);
        this.A00.A00 = f63;
        Ek3 ek3 = (Ek3) f63.A02;
        if (ek3 == null || (list = ek3.A00.A02) == null || list.isEmpty()) {
            return;
        }
        Egg egg = this.A01;
        synchronized (egg) {
            egg.A00.removeAll(list);
        }
    }
}
