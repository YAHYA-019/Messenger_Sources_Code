package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: K18.class */
public final class K18 extends LbS {
    public KqM ASP(KqM kqM) {
        if (kqM == null) {
            kqM = null;
        } else {
            List list = kqM.A03;
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                L0w A0e = JQx.A0e(it);
                if (A0e != null && A0e.A01 == 2) {
                    i++;
                }
            }
            if (i == 2) {
                ArrayList A0s = AnonymousClass001.A0s();
                Iterator it2 = list.iterator();
                boolean z = true;
                while (it2.hasNext()) {
                    L0w A0e2 = JQx.A0e(it2);
                    if (A0e2 == null || A0e2.A01 != 2) {
                        A0s.add(A0e2);
                    } else {
                        List list2 = A0e2.A07;
                        int size = (list2.size() + 1) / 2;
                        ArrayList A17 = 1BK.A17(list2);
                        Collections.sort(A17, new Ls8(11));
                        ArrayList A0s2 = AnonymousClass001.A0s();
                        if (!z) {
                            int size2 = A17.size();
                            int min = size2 - Math.min(size2, size);
                            while (true) {
                                int i2 = min;
                                if (i2 >= A17.size()) {
                                    break;
                                }
                                A0s2.add(A17.get(i2));
                                min = i2 + 1;
                            }
                        } else {
                            for (int i3 = 0; i3 < A17.size() && i3 < size; i3++) {
                                A0s2.add(A17.get(i3));
                            }
                            z = false;
                        }
                        LbS.A02(A0e2, A0s, A0s2);
                    }
                }
                return LbS.A00(kqM, A0s);
            }
        }
        return kqM;
    }
}
