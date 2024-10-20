package X;

import com.facebook.acra.constants.ActionId;

/* loaded from: Hof.class */
public final class Hof {
    public final GPl A02 = GPl.A00(this, ActionId.QUERY_READY);
    public final GPl A01 = GPl.A00(this, ActionId.ABORTED);
    public final 1Br A00 = 1Bq.A00(115848);

    public final boolean A00() {
        boolean z;
        HjB hjB = (HjB) 1Br.A0B(this.A00);
        if (hjB.A01) {
            z = hjB.A00;
        } else {
            z = 2yD.A04(hjB.A06, 36315486092665846L);
            hjB.A00 = z;
            hjB.A01 = true;
        }
        return AnonymousClass001.A1N(z ? 1 : 0);
    }
}
