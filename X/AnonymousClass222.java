package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.222, reason: invalid class name */
/* loaded from: 222.class */
public final class AnonymousClass222 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final java.util.Map A03;
    public final 1De A04;

    public AnonymousClass222(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A04 = r303;
        this.A02 = 1Bq.A00(66774);
        this.A01 = 1Lm.A03(fbUserSession, r303.A00, 33162);
        this.A00 = 1Bq.A00(16457);
        this.A03 = Collections.synchronizedMap(new HashMap());
    }

    public final void A00() {
        MailboxFeature mailboxFeature = (MailboxFeature) this.A01.A00.get();
        PrivacyContext A00 = ((AnonymousClass224) this.A02.A00.get()).A00("3172025686357200");
        C3b7 c3b7 = new C3b7(this, 55);
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        mailboxFutureImpl.Cu4(c3b7);
        if (AQV.Cj2(new A0I(mailboxFeature, mailboxFutureImpl, A00, (String) null, 5))) {
            return;
        }
        mailboxFutureImpl.cancel(false);
    }
}
