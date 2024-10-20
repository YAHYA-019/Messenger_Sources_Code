package X;

import com.google.common.base.Function;

/* renamed from: X.584, reason: invalid class name */
/* loaded from: 584.class */
public final class AnonymousClass584 implements C1ps, 55H {
    public final AnonymousClass544 A00;
    public final Function A01;
    public final Object A02;

    public AnonymousClass584(AnonymousClass544 anonymousClass544, Function function, Object obj) {
        this.A00 = anonymousClass544;
        this.A02 = obj;
        this.A01 = function;
    }

    @Override // X.C1ps
    public long AsR() {
        return this.A00.getId();
    }

    public boolean BVe(55H r302) {
        if (r302.getClass() != AnonymousClass584.class) {
            return false;
        }
        return this.A00.BVd(((AnonymousClass584) r302).A00);
    }
}
