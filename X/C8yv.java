package X;

import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.8yv, reason: invalid class name */
/* loaded from: 8yv.class */
public final class C8yv extends 1XK implements 1XM {
    public final /* synthetic */ 8yY A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8yv(1Um r302, 8yY r303) {
        super(r302);
        this.A00 = r303;
    }

    public 1X9 A00() {
        8yY r0 = this.A00;
        C1qL c1qL = 8yY.A00;
        1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, A1e.A00(this, r0, A0P, 48), A0P, false);
        return A0P;
    }
}
