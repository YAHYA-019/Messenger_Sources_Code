package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6uu, reason: invalid class name */
/* loaded from: 6uu.class */
public final class C6uu implements C2om {
    public final List A00;
    public final java.util.Map A01;

    public C6uu(C04r c04r, List list) {
        this.A00 = new ArrayList(list);
        this.A01 = new C04r(c04r);
    }

    @Override // X.C2om
    public List AUm(C2ot c2ot, Object obj) {
        List list = (List) this.A01.get(c2ot.getClass());
        if (list == null) {
            list = this.A00;
        }
        return list;
    }
}
