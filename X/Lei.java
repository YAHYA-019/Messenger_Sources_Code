package X;

import android.content.Context;

/* loaded from: Lei.class */
public final class Lei implements MGS {
    public final MGS A00;
    public final MGS A01;

    public Lei(MGS mgs, MGS mgs2) {
        this.A00 = mgs;
        this.A01 = mgs2;
    }

    @Override // X.MGS
    public final /* bridge */ /* synthetic */ Object DCA() {
        Context context = ((Leg) this.A00).A00.A00;
        if (context != null) {
            return new L0P(context, (KzJ) this.A01.DCA());
        }
        throw AnonymousClass001.A0Q(1BJ.A00(24));
    }
}
