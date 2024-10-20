package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: Erz.class */
public final class Erz {
    public final 1De A00;

    public Erz(1De r302) {
        this.A00 = r302;
    }

    public void A00(FbUserSession fbUserSession, GFB gfb) {
        11T.A0F(fbUserSession, 1);
        MailboxFeature mailboxFeature = new MailboxFeature((1Uj) 4YU.A0o(fbUserSession, this.A00, 16686));
        FkL fkL = new FkL(gfb, 8);
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, fkL);
        1Um.A02(AQV, new Iaj(mailboxFeature, A0Q, 26), A0Q, false);
    }
}
