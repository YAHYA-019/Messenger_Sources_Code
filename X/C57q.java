package X;

import java.util.BitSet;

/* renamed from: X.57q, reason: invalid class name */
/* loaded from: 57q.class */
public final class C57q implements C57r {
    public static C5wz A00(1LI r301, 1Iw r302, 55J r303) {
        11T.A0F(r301, 1);
        11T.A0F(r303, 2);
        8Ap r0 = new 8Ap(r302, new C5wz());
        C5wz c5wz = r0.A01;
        c5wz.A00 = r301.A0l();
        BitSet bitSet = r0.A02;
        bitSet.set(1);
        c5wz.A01 = r303;
        bitSet.set(0);
        C1rs.A05(bitSet, r0.A03, 2);
        r0.A0J();
        return c5wz;
    }

    @Override // X.C57r
    public /* bridge */ /* synthetic */ 1LI AJF(1LI r302, 1Iw r303, 55H r304) {
        return A00(r302, r303, (55J) r304);
    }

    @Override // X.C57r
    public Class BDi() {
        return 55J.class;
    }
}
