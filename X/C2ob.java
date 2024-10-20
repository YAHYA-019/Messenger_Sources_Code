package X;

import java.util.ArrayList;

/* renamed from: X.2ob, reason: invalid class name */
/* loaded from: 2ob.class */
public final class C2ob {
    public C01i A00;
    public final java.util.Map A01 = new 0QO(0);

    public final void A00(Class cls, C00m c00m) {
        A01(cls, c00m);
    }

    public final void A01(Class cls, C00m... c00mArr) {
        java.util.Map map = this.A01;
        if (map.get(cls) != null) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("renderer for ");
            A0k.append(cls);
            throw AnonymousClass002.A0F(" was already registered previously", A0k);
        }
        ArrayList arrayList = new ArrayList(c00mArr.length);
        for (C00m c00m : c00mArr) {
            arrayList.add(C01g.A00(C03i.A03, new C2xm(c00m, 21)));
        }
        map.put(cls, arrayList);
    }

    public final void A02(C00m c00m) {
        C01i c01i = this.A00;
        if (c01i != null) {
            throw 1BL.A0h(c01i, "fallbackRenderer was already registered with ", AnonymousClass001.A0k());
        }
        this.A00 = C01g.A00(C03i.A03, new C2xm(c00m, 22));
    }
}
