package X;

import java.util.List;

/* renamed from: X.706, reason: invalid class name */
/* loaded from: 706.class */
public final class AnonymousClass706 {
    public List A00;
    public final java.util.Map A01 = new 0QO(0);

    public final void A00(C6zf c6zf, List list) {
        11T.A0F(c6zf, 0);
        java.util.Map map = this.A01;
        if (list == null) {
            list = C0ty.A00;
        }
        map.put(c6zf, list);
    }

    public final void A01(C6zf c6zf, List list) {
        11T.A0F(list, 1);
        if (this.A01.containsKey(c6zf)) {
            return;
        }
        A00(c6zf, list);
    }
}
