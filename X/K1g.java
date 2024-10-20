package X;

import java.util.HashMap;
import java.util.List;

/* loaded from: K1g.class */
public final class K1g extends L7x {
    public final List A01 = AnonymousClass001.A0s();
    public final List A00 = AnonymousClass001.A0s();
    public final java.util.Map A02 = AnonymousClass001.A0u();

    public final String toString() {
        HashMap A0u = AnonymousClass001.A0u();
        List list = this.A01;
        if (!list.isEmpty()) {
            A0u.put("products", list);
        }
        List list2 = this.A00;
        if (!list2.isEmpty()) {
            A0u.put(1BJ.A00(525), list2);
        }
        java.util.Map map = this.A02;
        if (!map.isEmpty()) {
            A0u.put(7zK.A00(96), map);
        }
        return L7x.A01("productAction", null, A0u);
    }
}
