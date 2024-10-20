package X;

import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.channels.pause.model.PauseDuration;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: C2d.class */
public final class C2d {
    public final 1De A00;
    public final 1Br A01 = 7zM.A0Z();

    public C2d(1De r302) {
        this.A00 = r302;
    }

    public final void A00(FbUserSession fbUserSession, PauseDuration pauseDuration, ThreadKey threadKey, String str) {
        11T.A0F(threadKey, 1);
        MutableLiveData A0H = 7zL.A0H();
        MailboxFeature mailboxFeature = (MailboxFeature) 4YU.A0o(fbUserSession, this.A00, 33183);
        long A0r = threadKey.A0r();
        int i = pauseDuration.pauseOrdinal;
        Czj A00 = Czj.A00(A0H, this, 14);
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, A00);
        1Um.A01(AQV, new CyZ(mailboxFeature, A0Q, A0P, str, i, 0, A0r), A0P, A0Q);
    }
}
