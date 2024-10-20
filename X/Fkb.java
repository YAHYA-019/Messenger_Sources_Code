package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: Fkb.class */
public final class Fkb implements GFF {
    public final /* synthetic */ FHt A00;

    public Fkb(FHt fHt) {
        this.A00 = fHt;
    }

    public void BeP(List list) {
        FHt fHt = this.A00;
        Set set = FHt.A0L;
        List list2 = fHt.A02;
        if (list2 != null) {
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                GL7 A0m = DKC.A0m(it);
                FyG fyG = fHt.A07;
                A0s.add(FJ3.A00(fyG, "NTTypeaheadSource").A0C(fyG, "NTTypeaheadSource", A0m.Acj()));
            }
            EeX eeX = fHt.A06;
            String str = fHt.A09;
            GJO gjo = (GJO) eeX.A00.get(str);
            if (gjo == null || gjo.BOW()) {
                return;
            }
            if (gjo.BTn()) {
                EeX.A00(eeX, str, A0s, false, true);
            } else {
                EeX.A00(eeX, str, A0s, false, false);
            }
        }
    }
}
