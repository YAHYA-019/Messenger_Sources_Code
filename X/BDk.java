package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: BDk.class */
public final class BDk extends 1XK implements 1XM {
    public final /* synthetic */ BDC A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BDk(1Um r302, BDC bdc) {
        super(r302);
        this.A00 = bdc;
    }

    public 1X9 A00() {
        BDC bdc = this.A00;
        MailboxFeature mailboxFeature = MailboxFeature.$redex_init_class;
        1Um AQV = bdc.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, Czg.A00(bdc, this, A0P, 45), A0P, false);
        return A0P;
    }
}
