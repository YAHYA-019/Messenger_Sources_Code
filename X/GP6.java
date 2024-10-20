package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;

/* loaded from: GP6.class */
public final class GP6 {
    public final 1Br A00;
    public final GsE A01;
    public final 1De A02;

    public GP6(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A02 = r303;
        1Br A0S = 7zL.A0S(fbUserSession, r303, 16686);
        this.A00 = A0S;
        MailboxFeature mailboxFeature = MailboxFeature.$redex_init_class;
        this.A01 = new MailboxFeature((1Uj) 1Br.A0B(A0S));
    }
}
