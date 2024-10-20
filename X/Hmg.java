package X;

import java.util.HashSet;
import java.util.Iterator;

/* loaded from: Hmg.class */
public final class Hmg {
    public final /* synthetic */ GrS A00;

    public Hmg(GrS grS) {
        this.A00 = grS;
    }

    public void A00(HDa hDa) {
        GrS grS = this.A00;
        I4j A0f = GOp.A0f(grS.A0f);
        if (!11T.A0O(A0f.A00, hDa)) {
            A0f.A00 = hDa;
            Iterator it = A0f.A03.iterator();
            while (it.hasNext()) {
                ((HFc) it.next()).A00();
            }
            GOp.A0O(A0f.A02).A04(HAp.A0L);
        }
        Hke A00 = GrS.A00(grS);
        A00.A09 = hDa;
        C1pq.A08("callScreenLayout", hDa);
        if (!A00.A0B.contains("callScreenLayout")) {
            HashSet A1E = AbF.A1E(A00.A0B);
            A00.A0B = A1E;
            A1E.add("callScreenLayout");
        }
        A00.A0N = ((GR1) 1Br.A0B(grS.A08)).A07();
        IYw.A00(A00, grS);
    }
}
