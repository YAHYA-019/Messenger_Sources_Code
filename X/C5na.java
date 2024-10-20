package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5na, reason: invalid class name */
/* loaded from: 5na.class */
public final class C5na implements InterfaceC07434jv {
    @Override // X.InterfaceC07434jv
    public /* bridge */ /* synthetic */ Object A4o(Object obj, Object obj2) {
        List list = (List) obj;
        11T.A0F(list, 0);
        ArrayList arrayList = new ArrayList(C1A3.A1D(list, 10));
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return arrayList;
            }
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                C0s8.A18();
                throw 0Q8.createAndThrow();
            }
            C7f6 c7f6 = (C7f6) next;
            long j = c7f6.A00;
            String str = c7f6.A07;
            arrayList.add(new 8KG(c7f6.A01, c7f6.A02, c7f6.A03, str, c7f6.A06, c7f6.A05, c7f6.A04, (String) null, i2, j));
            i = i3;
        }
    }
}
