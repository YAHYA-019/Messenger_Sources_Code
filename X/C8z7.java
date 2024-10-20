package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.8z7, reason: invalid class name */
/* loaded from: 8z7.class */
public final class C8z7 extends 1XK implements 1XM {
    public final /* synthetic */ 8yO A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8z7(1Um r302, 8yO r303) {
        super(r302);
        this.A00 = r303;
    }

    public 1X9 A00() {
        8yO r0 = this.A00;
        MailboxFeature mailboxFeature = MailboxFeature.$redex_init_class;
        1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, A1e.A00(this, r0, A0P, 64), A0P, false);
        return A0P;
    }
}
