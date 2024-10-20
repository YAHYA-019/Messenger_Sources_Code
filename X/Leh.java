package X;

import android.content.Context;

/* loaded from: Leh.class */
public final class Leh implements MGS {
    public final MGS A00;

    public Leh(MGS mgs) {
        this.A00 = mgs;
    }

    @Override // X.MGS
    public final /* bridge */ /* synthetic */ Object DCA() {
        Context context = ((Leg) this.A00).A00.A00;
        if (context != null) {
            return new KzJ(context);
        }
        throw AnonymousClass001.A0Q(1BJ.A00(24));
    }
}
