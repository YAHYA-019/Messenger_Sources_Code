package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.2a0, reason: invalid class name */
/* loaded from: 2a0.class */
public class C2a0 extends C2a1 implements C2a3 {
    public final boolean A00;

    public C2a0(C2a2 c2a2) {
        this._state$volatile = C2a4.A00;
        A0K(c2a2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2a1.A00;
        2aC r0 = (C2a9) atomicReferenceFieldUpdater.get(this);
        2aC r305 = r0 instanceof 2aA ? r0 : null;
        boolean z = false;
        while (r305 != null) {
            C2a1 A06 = r305.A06();
            if ((A06 instanceof C2a0) && !((C2a0) A06).A00) {
                C2a9 c2a9 = (C2a9) atomicReferenceFieldUpdater.get(A06);
                if (!(c2a9 instanceof 2aA)) {
                    break;
                } else {
                    r305 = (2aC) c2a9;
                }
            } else {
                z = true;
                break;
            }
        }
        this.A00 = z;
    }
}
