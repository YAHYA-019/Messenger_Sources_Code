package X;

import java.util.BitSet;

/* renamed from: X.587, reason: invalid class name */
/* loaded from: 587.class */
public final class AnonymousClass587 implements C57r {
    @Override // X.C57r
    public /* bridge */ /* synthetic */ 1LI AJF(1LI r302, 1Iw r303, 55H r304) {
        AnonymousClass588 anonymousClass588 = (AnonymousClass588) r304;
        8Pq r0 = new 8Pq(r303, new C7g1());
        C7g1 c7g1 = r0.A01;
        c7g1.A00 = r302 == null ? null : r302.A0l();
        BitSet bitSet = r0.A02;
        bitSet.set(1);
        c7g1.A01 = anonymousClass588;
        bitSet.set(0);
        C1rs.A05(bitSet, r0.A03, 2);
        r0.A0J();
        return c7g1;
    }

    @Override // X.C57r
    public Class BDi() {
        return AnonymousClass588.class;
    }
}
