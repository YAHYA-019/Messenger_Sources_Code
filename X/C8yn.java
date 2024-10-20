package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.8yn, reason: invalid class name */
/* loaded from: 8yn.class */
public final class C8yn extends 1XK implements 1XM {
    public final /* synthetic */ BD9 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8yn(BD9 bd9, 1Um r303) {
        super(r303);
        this.A00 = bd9;
    }

    public 1X9 A00() {
        BD9 bd9 = this.A00;
        MailboxFeature mailboxFeature = MailboxFeature.$redex_init_class;
        1Um AQV = bd9.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, A1e.A00(this, bd9, A0P, 22), A0P, false);
        return A0P;
    }
}
