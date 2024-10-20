package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: X.5xg, reason: invalid class name */
/* loaded from: 5xg.class */
public final class C5xg {
    public C2ot A00;
    public final java.util.Map A01 = new LinkedHashMap();

    public final void A00(C2ot c2ot, Class cls, C2ot... c2otArr) {
        java.util.Map map = this.A01;
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(c2ot);
        0KN.A00(c2otArr, arrayList);
        map.put(cls, C0s8.A14(arrayList.toArray(new C2ot[arrayList.size()])));
    }
}
