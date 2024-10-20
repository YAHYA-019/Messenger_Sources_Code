package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: Ewe.class */
public final class Ewe {
    public final Object A00 = AnonymousClass001.A0R();
    public final List A01 = AnonymousClass001.A0t(1);

    public final G1V A00(GH9 gh9) {
        Ek6 ek6 = new Ek6(gh9, new GBn(this, 21));
        synchronized (this.A00) {
            this.A01.add(ek6);
        }
        return new G1V(ek6);
    }

    public final void A01(Object obj) {
        List A0V;
        synchronized (this.A00) {
            A0V = 0QD.A0V(this.A01);
        }
        Iterator it = A0V.iterator();
        while (it.hasNext()) {
            GH9 gh9 = ((Ek6) it.next()).A01;
            if (gh9 != null) {
                gh9.CLy(obj);
            }
        }
    }
}
