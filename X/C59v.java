package X;

import java.util.BitSet;

/* renamed from: X.59v, reason: invalid class name */
/* loaded from: 59v.class */
public final class C59v implements 59X {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.8ju] */
    public /* bridge */ /* synthetic */ 1LI AK1(1Iw r302, AnonymousClass556 anonymousClass556) {
        8Qq r0 = new 8Qq(r302, (C8ju) new C1rj() { // from class: X.8ju
            public final Object[] A0k() {
                return new Object[]{null};
            }

            @Override // X.C1rj
            public 1LI A0y(1Iw r3022) {
                DyX.A00(r3022);
                throw AnonymousClass001.A0Q("isToggled");
            }

            @Override // X.C1rj
            public Object A15(1Im r3022, Object obj) {
                int i = r3022.A01;
                if (i == -1048037474) {
                    1LI.A0J(r3022, obj);
                    return null;
                }
                if (i == -436306655) {
                    throw AnonymousClass001.A0Q("listener");
                }
                return null;
            }
        });
        BitSet bitSet = r0.A02;
        bitSet.set(0);
        C1rs.A01(bitSet, r0.A03);
        r0.A0J();
        return r0.A01;
    }

    public Class BDi() {
        return C59w.class;
    }
}
