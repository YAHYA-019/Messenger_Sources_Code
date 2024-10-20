package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: AGt.class */
public final class AGt implements Runnable {
    public static final String __redex_internal_original_name = "ChatEntityLogger$logThreadViewMessageImpression$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ Message A01;
    public final /* synthetic */ 6KB A02;
    public final /* synthetic */ String A03;

    public AGt(FbUserSession fbUserSession, Message message, 6KB r304, String str) {
        this.A02 = r304;
        this.A00 = fbUserSession;
        this.A01 = message;
        this.A03 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        6KB r0 = this.A02;
        FbUserSession fbUserSession = this.A00;
        Message message = this.A01;
        1FV A0j = 4YU.A0j();
        MailboxFeature mailboxFeature = (MailboxFeature) 1Lm.A06(fbUserSession, 33222);
        String str = message.A1V;
        if (str == null) {
            throw 1BK.A0h();
        }
        A1d A00 = A1d.A00(A0j, 99);
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, A00);
        1Um.A02(AQV, new A1V(mailboxFeature, A0Q, str, 14), A0Q, false);
        1Br.A0D(r0.A00, new ABq(this.A03, r0, 4), A0j);
    }
}
