package X;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: Chm.class */
public final class Chm implements DEk {
    public final /* synthetic */ AeH A00;
    public final /* synthetic */ C1320Ady A01;
    public final /* synthetic */ Set A02;

    public Chm(AeH aeH, C1320Ady c1320Ady, Set set) {
        this.A01 = c1320Ady;
        this.A02 = set;
        this.A00 = aeH;
    }

    public void A00(String str, String str2, List list, int i, boolean z) {
        C1320Ady c1320Ady = this.A01;
        c1320Ady.A00 = i;
        c1320Ady.A05 = str2;
        synchronized (c1320Ady) {
            c1320Ady.A06 = list;
        }
        c1320Ady.A0H(str, z);
    }

    @Override // X.DEk
    public void CuT(String str) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            CB4.A00((DIW) it.next(), str);
        }
    }
}
