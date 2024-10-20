package X;

import java.util.BitSet;

/* renamed from: X.57y, reason: invalid class name */
/* loaded from: 57y.class */
public final class C57y implements C57r {
    @Override // X.C57r
    public /* bridge */ /* synthetic */ 1LI AJF(1LI r302, 1Iw r303, 55H r304) {
        55G r0 = (55G) r304;
        11T.A0F(r303, 0);
        11T.A0F(r302, 1);
        11T.A0F(r0, 2);
        8BA r02 = new 8BA(r303, new AnonymousClass589());
        AnonymousClass589 anonymousClass589 = r02.A01;
        anonymousClass589.A00 = r302.A0l();
        BitSet bitSet = r02.A02;
        bitSet.set(1);
        anonymousClass589.A01 = r0;
        bitSet.set(0);
        C1rs.A05(bitSet, r02.A03, 2);
        r02.A0J();
        return anonymousClass589;
    }

    @Override // X.C57r
    public Class BDi() {
        return 55G.class;
    }
}
