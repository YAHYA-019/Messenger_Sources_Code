package X;

import android.content.Context;

/* loaded from: Let.class */
public final class Let implements MGT {
    public final MGT A00;
    public final MGT A01;

    public Let(MGT mgt, MGT mgt2) {
        this.A00 = mgt;
        this.A01 = mgt2;
    }

    @Override // X.MGT
    public final /* bridge */ /* synthetic */ Object A3b() {
        Object A3b = this.A00.A3b();
        return new Kjj((Context) A3b, (Kox) this.A01.A3b());
    }
}
