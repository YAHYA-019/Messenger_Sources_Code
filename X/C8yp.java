package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.8yp, reason: invalid class name */
/* loaded from: 8yp.class */
public final class C8yp extends 1XK implements 1XM {
    public final /* synthetic */ 2UF A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8yp(2UF r302, 1Um r303) {
        super(r303);
        this.A00 = r302;
    }

    public 1X9 A00() {
        2UF r0 = this.A00;
        MailboxFeature mailboxFeature = MailboxFeature.$redex_init_class;
        1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, A1e.A00(this, r0, A0P, 26), A0P, false);
        return A0P;
    }
}
