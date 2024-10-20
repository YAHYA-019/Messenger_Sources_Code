package X;

import java.util.BitSet;

/* renamed from: X.57z, reason: invalid class name */
/* loaded from: 57z.class */
public final class C57z implements C57r {
    @Override // X.C57r
    public /* bridge */ /* synthetic */ 1LI AJF(1LI r302, 1Iw r303, 55H r304) {
        AnonymousClass580 anonymousClass580 = (AnonymousClass580) r304;
        11T.A0F(r303, 0);
        11T.A0F(r302, 1);
        11T.A0F(anonymousClass580, 2);
        8QZ r0 = new 8QZ(r303, new C7fv());
        C7fv c7fv = r0.A01;
        c7fv.A00 = r302.A0l();
        BitSet bitSet = r0.A02;
        bitSet.set(1);
        c7fv.A01 = anonymousClass580;
        bitSet.set(0);
        C1rs.A05(bitSet, r0.A03, 2);
        r0.A0J();
        return c7fv;
    }

    @Override // X.C57r
    public Class BDi() {
        return AnonymousClass580.class;
    }
}
