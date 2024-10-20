package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Ae3, reason: case insensitive filesystem */
/* loaded from: Ae3.class */
public final class C1325Ae3 implements DFe {
    public final Set A00 = Collections.synchronizedSet(AbI.A07());

    public final void A00(DFe dFe) {
        11T.A0F(dFe, 0);
        this.A00.add(dFe);
    }

    @Override // X.DFe
    public void BsT(C1323Ae1 c1323Ae1, DIW diw, ByH byH, Object obj) {
        4YV.A1N(diw, c1323Ae1);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((DFe) it.next()).BsT(c1323Ae1, diw, byH, obj);
        }
    }
}
