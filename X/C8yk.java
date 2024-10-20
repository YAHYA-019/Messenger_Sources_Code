package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.8yk, reason: invalid class name */
/* loaded from: 8yk.class */
public final class C8yk extends 1XK implements 1XM {
    public final /* synthetic */ C8xo A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8yk(C8xo c8xo, 1Um r303) {
        super(r303);
        this.A00 = c8xo;
    }

    public 1X9 A00() {
        C8xo c8xo = this.A00;
        MailboxFeature mailboxFeature = MailboxFeature.$redex_init_class;
        1Um AQV = c8xo.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, A1e.A00(this, c8xo, A0P, 10), A0P, false);
        return A0P;
    }
}
