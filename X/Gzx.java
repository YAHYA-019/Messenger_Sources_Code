package X;

import android.view.View;
import java.util.Iterator;

/* loaded from: Gzx.class */
public final class Gzx extends C66m {
    public final /* synthetic */ IDa A00;

    public Gzx(IDa iDa) {
        this.A00 = iDa;
    }

    @Override // X.C66m, X.C66n
    public void CMV(C66i c66i) {
        float f = (float) c66i.A09.A00;
        IDa iDa = this.A00;
        Iterator it = iDa.A07.iterator();
        while (it.hasNext()) {
            IFM A0m = GOn.A0m(it);
            if ((A0m instanceof C2771Gno) || (A0m instanceof C2770Gnn) || (A0m instanceof C2767Gnk)) {
                View A09 = A0m.A09();
                if (A09 != null) {
                    IDa.A00(A09, iDa, f);
                }
            }
        }
    }
}
