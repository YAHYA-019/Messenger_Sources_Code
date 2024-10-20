package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.8yg, reason: invalid class name */
/* loaded from: 8yg.class */
public final class C8yg extends 1XK implements 1XM {
    public final /* synthetic */ C8xl A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8yg(C8xl c8xl, 1Um r303) {
        super(r303);
        this.A00 = c8xl;
    }

    public 1X9 A00() {
        C8xl c8xl = this.A00;
        MailboxFeature mailboxFeature = MailboxFeature.$redex_init_class;
        1Um AQV = c8xl.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, A1e.A00(this, c8xl, A0P, 5), A0P, false);
        return A0P;
    }
}
