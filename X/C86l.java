package X;

import java.util.BitSet;
import java.util.List;

/* renamed from: X.86l, reason: invalid class name */
/* loaded from: 86l.class */
public final class C86l implements C6zG {
    public final 74Y A00;

    public C86l(6yT r302, 74X r303, C5nC c5nC, int i) {
        this.A00 = new 74Y(r302, r303, c5nC, i, false);
    }

    @Override // X.C6zG
    public 1LI AMI(1LI r302, C1qb c1qb, C5j5 c5j5, 5vW r305, List list, int i) {
        if (7zM.A16(r305).A04 == C2o9.A04) {
            return r302;
        }
        C86m c86m = new C86m(c1qb, new C86n());
        74Y r0 = this.A00;
        C86n c86n = c86m.A01;
        c86n.A02 = r0;
        BitSet bitSet = c86m.A02;
        bitSet.set(0);
        c86n.A01 = c5j5;
        bitSet.set(5);
        c86n.A00 = 7zQ.A0T(r302);
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(3);
        c86n.A03 = r305;
        bitSet.set(4);
        7zP.A15(c86m, bitSet, c86m.A03);
        return c86n;
    }

    @Override // X.C6zJ
    public /* bridge */ /* synthetic */ Object Am9() {
        return C6z2.A02;
    }
}
