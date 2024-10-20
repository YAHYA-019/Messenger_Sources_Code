package X;

import java.util.BitSet;

/* renamed from: X.56v, reason: invalid class name */
/* loaded from: 56v.class */
public final class C56v implements 55Q {
    public /* bridge */ /* synthetic */ 1LI AJD(1Iw r302, AnonymousClass544 anonymousClass544) {
        C56w c56w = (C56w) anonymousClass544;
        boolean A1X = 1BL.A1X(r302, c56w);
        8Pn r0 = new 8Pn(r302, new 8mQ());
        8mQ r02 = r0.A01;
        r02.A00 = c56w;
        BitSet bitSet = r0.A02;
        bitSet.set(2);
        r02.A01 = c56w.A01;
        bitSet.set(0);
        r02.A02 = c56w.A02;
        bitSet.set(A1X ? 1 : 0);
        C1rs.A03(bitSet, r0.A03);
        r0.A0J();
        return r02;
    }

    public Class BDi() {
        return C56w.class;
    }
}
