package X;

import java.util.Iterator;

/* loaded from: Fxa.class */
public final class Fxa implements GHC {
    public final GHC A00;

    public Fxa(GHC ghc) {
        this.A00 = ghc;
    }

    public boolean D49(DLQ dlq) {
        GJ0 A01 = FGp.A01();
        int i = dlq.A05;
        for (int i2 : A01.B3m(i)) {
            Iterator it = dlq.AcV(i2).iterator();
            while (it.hasNext()) {
                DLQ A0s = DKC.A0s(it);
                if (A0s != null && this.A00.D49(A0s)) {
                    return true;
                }
            }
        }
        for (int i3 : FGp.A01().BDJ(i)) {
            DLQ A06 = dlq.A06(i3);
            if (A06 != null && this.A00.D49(A06)) {
                return true;
            }
        }
        return false;
    }
}
