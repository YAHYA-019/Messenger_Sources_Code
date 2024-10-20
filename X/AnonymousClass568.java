package X;

import java.util.BitSet;

/* renamed from: X.568, reason: invalid class name */
/* loaded from: 568.class */
public final class AnonymousClass568 implements 55Q {
    public /* bridge */ /* synthetic */ 1LI AJD(1Iw r302, AnonymousClass544 anonymousClass544) {
        C5qn c5qn;
        C1qo c1qo;
        int A02;
        int A022;
        AnonymousClass543 anonymousClass543 = (AnonymousClass543) anonymousClass544;
        C88a c88a = new C88a(r302, new C5qn());
        int i = anonymousClass543.A01;
        if (i == -1) {
            c5qn = c88a.A01;
            c1qo = ((C1rs) c88a).A02;
            A02 = c1qo.A06(2132279321);
        } else {
            c5qn = c88a.A01;
            c1qo = ((C1rs) c88a).A02;
            A02 = c1qo.A02(i);
        }
        c5qn.A00 = A02;
        BitSet bitSet = c88a.A02;
        bitSet.set(0);
        int i2 = anonymousClass543.A02;
        if (i2 == -1) {
            A022 = c1qo.A05(2130969214);
        } else {
            A022 = c1qo.A02(i2);
        }
        c5qn.A01 = A022;
        bitSet.set(1);
        C1rs.A05(bitSet, c88a.A03, 2);
        c88a.A0J();
        return c5qn;
    }

    public Class BDi() {
        return AnonymousClass543.class;
    }
}
