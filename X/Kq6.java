package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: Kq6.class */
public final class Kq6 {
    public final List A00;
    public final java.util.Map A01;
    public final java.util.Map A02;
    public final List A03;

    public Kq6(List list) {
        this.A03 = list;
        ArrayList A0s = AnonymousClass001.A0s();
        LinkedHashMap A1C = 1BK.A1C();
        LinkedHashMap A1C2 = 1BK.A1C();
        ArrayList A0z = 1BL.A0z(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            java.util.Map map = (java.util.Map) it.next();
            L3w l3w = new L3w(1BK.A1C());
            A0s.add(l3w);
            ArrayList A0t = AnonymousClass001.A0t(map.size());
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z2 = AnonymousClass001.A0z(A0y);
                A1C.put(A0z2.getKey(), l3w);
                4YV.A1R(A0z2, A1C2);
                A0t.add(04S.A00);
            }
            A0z.add(A0t);
        }
        this.A00 = 0QD.A0V(A0s);
        this.A01 = 04R.A0D(A1C);
        this.A02 = 04R.A0D(A1C2);
    }

    public final Kld A00(KP0 kp0, KP0 kp02) {
        11T.A0F(kp0, 0);
        L3w l3w = (L3w) this.A01.get(kp0);
        Integer num = null;
        if (l3w == null) {
            return null;
        }
        java.util.Map map = l3w.A01;
        KtR ktR = (KtR) map.get(kp02);
        if (ktR != null) {
            num = Integer.valueOf(ktR.A00);
        }
        Object obj = map.get(kp0);
        if (obj == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        int i = ((KtR) obj).A00;
        int i2 = l3w.A00 - 1;
        Object obj2 = map.get(kp0);
        if (obj2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        KNa kNa = ((KtR) obj2).A03;
        List list = this.A00;
        11T.A0F(list, 0);
        return new Kld(kNa, num, i, i2, l3w.equals(DKE.A0q(list)));
    }
}
