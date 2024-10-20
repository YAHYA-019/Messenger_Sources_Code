package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;

/* renamed from: X.22G, reason: invalid class name */
/* loaded from: 22G.class */
public final class C22G {
    public 22H A00;
    public C1qM A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1De A05;

    public C22G(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A05 = r303;
        1BY r0 = r303.A00;
        this.A03 = 1Lm.A03(fbUserSession, r0, 16686);
        this.A02 = 1Lm.A03(fbUserSession, r0, 33183);
        this.A04 = 1Bq.A00(66774);
        this.A01 = new C3aj(this, 2);
    }

    public final void A00(22H r302) {
        if (this.A00 == null && r302 != null) {
            C21S.A00(this.A01, (1Uj) this.A03.A00.get());
            this.A00 = r302;
        }
        MailboxFeature mailboxFeature = (MailboxFeature) this.A02.A00.get();
        PrivacyContext A00 = ((AnonymousClass224) this.A04.A00.get()).A00("951388345621219");
        C3b7 c3b7 = new C3b7(r302, 11);
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        mailboxFutureImpl.Cu4(c3b7);
        if (AQV.Cj2(new Cxj(1, mailboxFeature, mailboxFutureImpl, A00))) {
            return;
        }
        mailboxFutureImpl.cancel(false);
    }
}
