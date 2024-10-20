package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: Esd.class */
public final class Esd {
    public final C2818Jaa A00;

    public Esd(java.util.Map map) {
        C2818Jaa c2818Jaa = new C2818Jaa(map.size());
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            c2818Jaa.A09(A0z.getKey(), A0z.getValue());
        }
        this.A00 = c2818Jaa;
    }

    public final void A00(Object obj, Object obj2) {
        C2818Jaa c2818Jaa = this.A00;
        synchronized (c2818Jaa) {
            c2818Jaa.A09(obj, obj2);
        }
    }
}
