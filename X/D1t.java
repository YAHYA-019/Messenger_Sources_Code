package X;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: D1t.class */
public final class D1t implements InterfaceC07434jv {
    public final Iterable A00;

    public D1t(Iterable iterable) {
        this.A00 = iterable;
    }

    @Override // X.InterfaceC07434jv
    public /* bridge */ /* synthetic */ Object A4o(Object obj, Object obj2) {
        Iterable iterable = this.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Iterable iterable2 = (Iterable) ((InterfaceC07434jv) it.next()).A4o(obj, obj2);
            if (iterable2 == null) {
                iterable2 = C0ty.A00;
            }
            0QU.A0t(iterable2, A0s);
        }
        return A0s;
    }
}
