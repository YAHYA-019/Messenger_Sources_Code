package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.8yl, reason: invalid class name */
/* loaded from: 8yl.class */
public final class C8yl extends 1XK implements 1XM {
    public final /* synthetic */ C8xr A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8yl(C8xr c8xr, 1Um r303) {
        super(r303);
        this.A00 = c8xr;
    }

    public 1X9 A00() {
        C8xr c8xr = this.A00;
        MailboxFeature mailboxFeature = MailboxFeature.$redex_init_class;
        1Um AQV = c8xr.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, A1e.A00(this, c8xr, A0P, 11), A0P, false);
        return A0P;
    }
}
