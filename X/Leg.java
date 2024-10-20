package X;

import android.content.Context;

/* loaded from: Leg.class */
public final class Leg implements MGS {
    public final Kg2 A00;

    public Leg(Kg2 kg2) {
        this.A00 = kg2;
    }

    @Override // X.MGS
    public final /* synthetic */ Object DCA() {
        Context context = this.A00.A00;
        if (context != null) {
            return context;
        }
        throw AnonymousClass001.A0Q(1BJ.A00(24));
    }
}
