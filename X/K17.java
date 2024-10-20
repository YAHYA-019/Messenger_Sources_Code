package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: K17.class */
public final class K17 extends LbS {
    public KqM ASP(KqM kqM) {
        K1F A00;
        if (kqM == null) {
            return null;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = kqM.A03.iterator();
        while (it.hasNext()) {
            L0w A0e = JQx.A0e(it);
            if (A0e == null || A0e.A01 != 2) {
                A0s.add(A0e);
            } else {
                ArrayList A0s2 = AnonymousClass001.A0s();
                for (K1G k1g : A0e.A07) {
                    long j = ((6Cu) k1g).A02;
                    6Yl r0 = ((6Cu) k1g).A03;
                    6Zr r02 = new 6Zr(r0);
                    6Zs r03 = new 6Zs(r0.A0N);
                    r03.A09 = false;
                    r03.A08 = false;
                    r02.A0L = new 6Zt(r03);
                    6Yl r04 = new 6Yl(r02);
                    List list = ((6Cu) k1g).A05;
                    K1M k1m = k1g instanceof K1G ? k1g.A01 : k1g instanceof K1H ? ((K1H) k1g).A00 : null;
                    List list2 = ((6Cu) k1g).A07;
                    List list3 = ((6Cu) k1g).A06;
                    List list4 = ((6Cu) k1g).A08;
                    String A09 = ((6Cu) k1g).A09();
                    String A08 = ((6Cu) k1g).A08();
                    if (k1m instanceof K1K) {
                        A00 = new K1F(r04, (K1K) k1m, A09, A08, list, list2, list3, list4, j);
                    } else if (k1m instanceof K1L) {
                        A00 = new K1H(r04, (K1L) k1m, list, list2, list3, list4, j);
                        ((K1E) A00).A00 = KxW.A00(r04.A0U, r04.A0T, j);
                        ((K1E) A00).A01 = A09;
                    } else {
                        A00 = 6Cu.A00(r04, k1m, KxW.A00(r04.A0U, r04.A0T, j), list, list2, list3, list4, j);
                    }
                    A0s2.add(A00);
                }
                LbS.A02(A0e, A0s, A0s2);
            }
        }
        return LbS.A00(kqM, A0s);
    }
}
