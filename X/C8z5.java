package X;

import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.8z5, reason: invalid class name */
/* loaded from: 8z5.class */
public final class C8z5 extends 1XK implements 1XM {
    public final /* synthetic */ C8yb A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8z5(1Um r302, C8yb c8yb) {
        super(r302);
        this.A00 = c8yb;
    }

    public 1X9 A00() {
        C8yb c8yb = this.A00;
        C1qL c1qL = C8yb.A00;
        1Um AQV = c8yb.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, A1e.A00(this, c8yb, A0P, 61), A0P, false);
        return A0P;
    }
}
