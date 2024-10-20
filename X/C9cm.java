package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.9cm, reason: invalid class name */
/* loaded from: 9cm.class */
public final class C9cm {
    public final 1De A00;

    public C9cm(1De r302) {
        this.A00 = r302;
    }

    public final void A00(FbUserSession fbUserSession, MailboxCallback mailboxCallback, int i, long j) {
        MailboxFeature mailboxFeature = (MailboxFeature) 4YU.A0o(fbUserSession, this.A00, 82466);
        1Um A0O = 1BK.A0O(mailboxFeature, 0);
        MailboxFutureImpl A0P = 1BK.A0P(A0O);
        MailboxFutureImpl A0Q = 1BK.A0Q(A0O, mailboxCallback);
        1Um.A01(A0O, new IbK(i, 0, j, mailboxFeature, A0Q, A0P), A0P, A0Q);
    }

    public final void A01(FbUserSession fbUserSession, MailboxCallback mailboxCallback, int i, long j) {
        11T.A0F(fbUserSession, 0);
        MailboxFeature mailboxFeature = (MailboxFeature) 4YU.A0o(fbUserSession, this.A00, 82466);
        1Um A0O = 1BK.A0O(mailboxFeature, 0);
        MailboxFutureImpl A0P = 1BK.A0P(A0O);
        MailboxFutureImpl A0S = 1BL.A0S(A0O, mailboxCallback);
        1Um.A01(A0O, new IbK(i, 1, j, mailboxFeature, A0S, A0P), A0P, A0S);
    }

    public final void A02(FbUserSession fbUserSession, MailboxCallback mailboxCallback, int i, long j) {
        MailboxFeature mailboxFeature = (MailboxFeature) 4YU.A0o(fbUserSession, this.A00, 82466);
        1Um A0O = 1BK.A0O(mailboxFeature, 0);
        MailboxFutureImpl A0P = 1BK.A0P(A0O);
        MailboxFutureImpl A0S = 1BL.A0S(A0O, mailboxCallback);
        1Um.A01(A0O, new IbK(i, 2, j, mailboxFeature, A0S, A0P), A0P, A0S);
    }

    public final void A03(FbUserSession fbUserSession, MailboxCallback mailboxCallback, int i, long j) {
        MailboxFeature mailboxFeature = (MailboxFeature) 4YU.A0o(fbUserSession, this.A00, 82466);
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, mailboxCallback);
        1Um.A01(AQV, new IbK(i, 3, j, mailboxFeature, A0Q, A0P), A0P, A0Q);
    }
}
