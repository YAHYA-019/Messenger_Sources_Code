package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.225, reason: invalid class name */
/* loaded from: 225.class */
public final class AnonymousClass225 {
    public final 1Br A00;
    public final 1Br A01;
    public final java.util.Map A02;
    public final 1De A03;

    public AnonymousClass225(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A03 = r303;
        this.A01 = 1Lm.A03(fbUserSession, r303.A00, 33163);
        this.A00 = 1Bq.A00(16457);
        this.A02 = Collections.synchronizedMap(new HashMap());
    }

    public final void A00() {
        MailboxFeature mailboxFeature = (MailboxFeature) this.A01.A00.get();
        C3b7 c3b7 = new C3b7(this, 54);
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        mailboxFutureImpl.Cu4(c3b7);
        if (AQV.Cj2(new C3b5(mailboxFutureImpl, mailboxFeature, 38))) {
            return;
        }
        mailboxFutureImpl.cancel(false);
    }
}
