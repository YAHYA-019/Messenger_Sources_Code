package X;

import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.8yj, reason: invalid class name */
/* loaded from: 8yj.class */
public final class C8yj extends 1XK implements 1XM {
    public final /* synthetic */ C6ku A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8yj(C6ku c6ku, 1Um r303) {
        super(r303);
        this.A00 = c6ku;
    }

    public 1X9 A00() {
        C6ku c6ku = this.A00;
        C1qL c1qL = C6ku.A00;
        1Um AQV = c6ku.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, A1e.A00(this, c6ku, A0P, 8), A0P, false);
        return A0P;
    }
}
