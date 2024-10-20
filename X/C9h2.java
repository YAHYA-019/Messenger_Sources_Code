package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* renamed from: X.9h2, reason: invalid class name */
/* loaded from: 9h2.class */
public final class C9h2 {
    public final 1Br A00;
    public final 1De A01;

    public C9h2(1De r302) {
        this.A01 = r302;
        this.A00 = 7zM.A0h(r302, 68072);
    }

    public static final void A00(FbUserSession fbUserSession, C9h2 c9h2, AYi aYi, List list) {
        9NB r0 = (9NB) 1Br.A0B(c9h2.A00);
        A4q a4q = new A4q(aYi, list);
        MailboxFeature mailboxFeature = new MailboxFeature((1Uj) 4YU.A0o(fbUserSession, r0.A00, 16686));
        A1f A00 = A1f.A00(a4q, r0, 34);
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, A00);
        1Um.A02(AQV, A1f.A00(mailboxFeature, A0Q, 9), A0Q, false);
    }

    public void A01(FbUserSession fbUserSession, AYh aYh, String str) {
        A00(fbUserSession, this, new A4p(aYh, str), 11T.A03(str));
    }
}
