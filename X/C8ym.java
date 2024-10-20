package X;

import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.8ym, reason: invalid class name */
/* loaded from: 8ym.class */
public final class C8ym extends 1XK implements 1XM {
    public final /* synthetic */ 22I A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8ym(22I r302, 1Um r303) {
        super(r303);
        this.A00 = r302;
    }

    public 1X9 A00() {
        22I r0 = this.A00;
        C1qL c1qL = 22I.A00;
        1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, A1e.A00(this, r0, A0P, 15), A0P, false);
        return A0P;
    }
}
