package X;

import android.util.SparseArray;
import java.util.Iterator;

/* loaded from: F7l.class */
public final class F7l {
    public final java.util.Map A02 = new 0QO(0);
    public final SparseArray A01 = DKC.A0E();
    public boolean A00 = false;

    public static void A00(F7l f7l, FyG fyG) {
        0fH.A0j("ModelIDMap", "Initializing model ID map");
        FJ5.A08(AnonymousClass001.A1W(FJ3.A03(fyG).A01, f7l));
        Iterator it = FJ3.A03(fyG).A03().iterator();
        while (it.hasNext()) {
            FGI.A03(new Fkc(f7l), DKC.A0m(it));
        }
    }

    public void A01(GL7 gl7) {
        String A04 = GL7.A04(gl7);
        if (A04 != null) {
            this.A02.put(A04, gl7);
        }
        int Acj = gl7.Acj();
        if (Acj != 0) {
            this.A01.put(Acj, gl7);
        }
    }
}
