package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.11o, reason: invalid class name */
/* loaded from: 11o.class */
public final class C11o extends C0z9 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A00 = AtomicReferenceFieldUpdater.newUpdater(C11o.class, Object.class, "_state$volatile");
    public volatile /* synthetic */ Object _state$volatile;

    @Override // X.C0z9
    public /* bridge */ /* synthetic */ boolean A00(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A00;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, 0Du.A00);
        return true;
    }

    @Override // X.C0z9
    public /* bridge */ /* synthetic */ 0DR[] A01(Object obj) {
        A00.set(this, null);
        return 0KD.A00;
    }

    public final Object A02(0DR r302) {
        String str = C2s7.__redex_internal_original_name;
        C2s7 c2s7 = new C2s7(1, 0DT.A02(r302));
        c2s7.A0F();
        if (!04T.A00(this, 0Du.A00, c2s7, A00)) {
            c2s7.resumeWith(04S.A00);
        }
        Object A0C = c2s7.A0C();
        if (A0C != 0Ds.A02) {
            A0C = 04S.A00;
        }
        return A0C;
    }

    public final void A03() {
        0DJ r0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A00;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null || obj == (r0 = 0Du.A01)) {
                return;
            }
            0DJ r02 = 0Du.A00;
            if (obj == r02) {
                if (04T.A00(this, obj, r0, atomicReferenceFieldUpdater)) {
                    return;
                }
            } else if (04T.A00(this, obj, r02, atomicReferenceFieldUpdater)) {
                ((C2s7) obj).resumeWith(04S.A00);
                return;
            }
        }
    }
}
