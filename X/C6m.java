package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: C6m.class */
public final class C6m {
    public final FbUserSession A00;

    public C6m(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A00 = fbUserSession;
    }

    public void A00(Context context) {
        MailboxFeature mailboxFeature = new MailboxFeature((1Uj) 1Lm.A05(context, this.A00, 16686));
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, Czj.A00(mailboxFeature, A0P, 0), A0P, false);
    }

    public void A01(Context context) {
        if (2dQ.A00() && 1Br.A07(2dQ.A01).AZk(36326635822667517L)) {
            A00(context);
        }
    }
}
