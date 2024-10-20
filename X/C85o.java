package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.85o, reason: invalid class name */
/* loaded from: 85o.class */
public final class C85o extends 1XK implements 1XM {
    public final /* synthetic */ 8yW A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85o(8yW r302, 1Um r303) {
        super(r303);
        this.A00 = r302;
    }

    public 1X9 A00() {
        8yW r0 = this.A00;
        MailboxFeature mailboxFeature = MailboxFeature.$redex_init_class;
        1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, A1e.A00(this, r0, A0P, 24), A0P, false);
        return A0P;
    }
}
