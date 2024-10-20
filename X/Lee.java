package X;

import android.content.Context;

/* loaded from: Lee.class */
public final class Lee implements MGS {
    public final MGS A00;

    public Lee(MGS mgs) {
        this.A00 = mgs;
    }

    @Override // X.MGS
    public final /* bridge */ /* synthetic */ Object DCA() {
        Context context = ((Leg) this.A00).A00.A00;
        if (context != null) {
            return new Kji(context);
        }
        throw AnonymousClass001.A0Q(1BJ.A00(24));
    }
}
