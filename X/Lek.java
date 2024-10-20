package X;

import android.content.Context;

/* loaded from: Lek.class */
public final class Lek implements MGS {
    public final MGS A00;
    public final MGS A01;
    public final MGS A02;

    public Lek(MGS mgs, MGS mgs2, MGS mgs3) {
        this.A00 = mgs;
        this.A01 = mgs2;
        this.A02 = mgs3;
    }

    @Override // X.MGS
    public final /* bridge */ /* synthetic */ Object DCA() {
        Object DCA = this.A00.DCA();
        Kji kji = (Kji) this.A01.DCA();
        Context context = ((Leg) this.A02).A00.A00;
        if (context != null) {
            return new Led(context, kji, (L0P) DCA);
        }
        throw AnonymousClass001.A0Q(1BJ.A00(24));
    }
}
