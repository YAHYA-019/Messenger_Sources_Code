package X;

import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.8yx, reason: invalid class name */
/* loaded from: 8yx.class */
public final class C8yx extends 1XK implements 1XM {
    public final /* synthetic */ GsM A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8yx(1Um r302, GsM gsM) {
        super(r302);
        this.A00 = gsM;
    }

    public 1X9 A00() {
        GsM gsM = this.A00;
        C1qL c1qL = GsM.A00;
        1Um AQV = gsM.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, A1e.A00(this, gsM, A0P, 50), A0P, false);
        return A0P;
    }
}
