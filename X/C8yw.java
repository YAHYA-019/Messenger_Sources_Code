package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.8yw, reason: invalid class name */
/* loaded from: 8yw.class */
public final class C8yw extends 1XK implements 1XM {
    public final /* synthetic */ C8y9 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8yw(1Um r302, C8y9 c8y9) {
        super(r302);
        this.A00 = c8y9;
    }

    public 1X9 A00() {
        C8y9 c8y9 = this.A00;
        MailboxFeature mailboxFeature = MailboxFeature.$redex_init_class;
        1Um AQV = c8y9.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, A1e.A00(this, c8y9, A0P, 49), A0P, false);
        return A0P;
    }
}
