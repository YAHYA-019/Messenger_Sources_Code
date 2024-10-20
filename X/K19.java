package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: K19.class */
public final class K19 extends LbS {
    public KqM ASP(KqM kqM) {
        if (kqM == null) {
            kqM = null;
        } else {
            List list = kqM.A03;
            Iterator it = list.iterator();
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                L0w A0e = JQx.A0e(it);
                if (A0e != null && A0e.A01 == 2) {
                    i2++;
                }
            }
            if (i2 != 1) {
                ArrayList A0s = AnonymousClass001.A0s();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    L0w A0e2 = JQx.A0e(it2);
                    if (A0e2 == null || A0e2.A01 != 2) {
                        A0s.add(A0e2);
                    } else {
                        ArrayList A0s2 = AnonymousClass001.A0s();
                        int i3 = i;
                        for (6Cu r0 : A0e2.A07) {
                            int i4 = r0.A03.A0A;
                            if (i4 > i) {
                                A0s2.add(r0);
                                i3 = Math.max(i3, i4);
                            }
                        }
                        LbS.A02(A0e2, A0s, A0s2);
                        i = i3;
                    }
                }
                return LbS.A00(kqM, A0s);
            }
        }
        return kqM;
    }
}
