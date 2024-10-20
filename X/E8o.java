package X;

import android.graphics.Rect;

/* loaded from: E8o.class */
public final class E8o extends C1sS {
    public FHF A00;
    public final FxZ A01;

    public E8o(FxZ fxZ) {
        this.A01 = fxZ;
    }

    @Override // X.C1sS
    public /* bridge */ /* synthetic */ Object A0B() {
        return null;
    }

    @Override // X.C1sS
    public /* bridge */ /* synthetic */ void A0C(Rect rect, 1sX r303, Object obj) {
        ThreadLocal threadLocal = EbC.A01;
        this.A00 = (FHF) threadLocal.get();
        FxZ fxZ = this.A01;
        2JB.A02("Evaluation Context can only be gotten from the UI Thread");
        threadLocal.set(fxZ.A07);
    }

    @Override // X.C1sS
    public void A0D(1sX r302) {
        EbC.A01.set(this.A00);
        this.A00 = null;
    }
}
