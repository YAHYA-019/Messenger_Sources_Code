package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: K1b.class */
public final class K1b extends L7x {
    public java.util.Map A00 = new HashMap(4);

    public final String toString() {
        HashMap A0u = AnonymousClass001.A0u();
        Iterator A0y = AnonymousClass001.A0y(this.A00);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            String valueOf = String.valueOf(A0z.getKey());
            A0u.put(1BL.A0u("dimension", valueOf, AnonymousClass001.A0l(1BK.A02(valueOf) + 9)), A0z.getValue());
        }
        return L7x.A00(A0u, 0);
    }
}
