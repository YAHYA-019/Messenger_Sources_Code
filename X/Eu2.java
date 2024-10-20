package X;

import android.util.SparseArray;
import java.util.List;

/* loaded from: Eu2.class */
public final class Eu2 {
    public final java.util.Map A02 = AnonymousClass001.A0u();
    public final SparseArray A00 = DKC.A0E();
    public final List A01 = AnonymousClass001.A0s();

    public void A00(GKF gkf) {
        int intValue = gkf.BEX().intValue();
        if (intValue == 0) {
            String BES = gkf.BES();
            java.util.Map map = this.A02;
            List list = (List) map.get(BES);
            if (list == null) {
                list = AnonymousClass001.A0s();
            }
            list.add(gkf);
            map.put(BES, list);
            return;
        }
        if (intValue != 1) {
            this.A01.add(gkf);
            return;
        }
        int BEP = gkf.BEP();
        SparseArray sparseArray = this.A00;
        List list2 = (List) sparseArray.get(BEP);
        if (list2 == null) {
            list2 = AnonymousClass001.A0s();
        }
        list2.add(gkf);
        sparseArray.put(BEP, list2);
    }
}
