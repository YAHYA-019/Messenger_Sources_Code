package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: C70.class */
public final class C70 {
    public final 1Br A00;
    public final 1De A01;

    public C70(1De r302) {
        this.A01 = r302;
        this.A00 = 7zM.A0h(r302, 82786);
    }

    public final void A00(FbUserSession fbUserSession, long j) {
        CEb cEb = (CEb) 1Br.A0B(this.A00);
        cEb.A00 = j;
        Czj A00 = Czj.A00(fbUserSession, cEb, 38);
        Czj A002 = Czj.A00(fbUserSession, cEb, 39);
        MailboxFeature mailboxFeature = (MailboxFeature) 4YU.A0o(fbUserSession, cEb.A03, 33183);
        1Um A0O = 1BK.A0O(mailboxFeature, 0);
        MailboxFutureImpl A0P = 1BK.A0P(A0O);
        MailboxFutureImpl A0Q = 1BK.A0Q(A0O, A002);
        A0P.Cu4(A00);
        1Um.A01(A0O, new Czh(5, j, A0Q, mailboxFeature, A0P), A0P, A0Q);
    }

    public final void A01(FbUserSession fbUserSession, C00m c00m) {
        MailboxFeature mailboxFeature = (MailboxFeature) 4YU.A0o(fbUserSession, ((CEb) 1Br.A0B(this.A00)).A03, 33183);
        Czk A00 = Czk.A00(c00m, 38);
        1Um A0O = 1BK.A0O(mailboxFeature, 0);
        Czj.A01(A0O, 1BK.A0Q(A0O, A00), mailboxFeature, 9);
    }
}
