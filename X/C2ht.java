package X;

import java.util.List;

/* renamed from: X.2ht, reason: invalid class name */
/* loaded from: 2ht.class */
public abstract class C2ht {
    public Object A01(int i, int i2) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, X.4I1] */
    public boolean A02(int i, int i2) {
        List list;
        C2hs c2hs = (C2hs) this;
        List list2 = c2hs.A02;
        if (list2 == null || (list = c2hs.A01) == null) {
            return false;
        }
        Object obj = list2.get(i);
        Object obj2 = list.get(i2);
        if (obj == obj2) {
            return true;
        }
        1Im r0 = c2hs.A00;
        if (r0 == null) {
            return obj.equals(obj2);
        }
        ?? obj3 = new Object();
        obj3.A01 = obj;
        obj3.A00 = obj2;
        return ((Boolean) r0.A00((Object) obj3)).booleanValue();
    }

    public boolean A03(int i, int i2) {
        List list;
        C2hs c2hs = (C2hs) this;
        List list2 = c2hs.A02;
        if (list2 == null || (list = c2hs.A01) == null) {
            return false;
        }
        return C2hs.A00(c2hs, list2.get(i), list.get(i2));
    }

    public abstract int A04();

    public abstract int A05();
}
