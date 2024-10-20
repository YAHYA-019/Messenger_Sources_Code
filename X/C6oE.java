package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.xapp.messaging.events.common.threadview.OnThreadOpened;

/* renamed from: X.6oE, reason: invalid class name */
/* loaded from: 6oE.class */
public final class C6oE implements 1Vf {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02 = 1Bq.A00(66774);

    public C6oE(Context context, FbUserSession fbUserSession) {
        this.A00 = context;
        this.A01 = fbUserSession;
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0F(r302, 0);
        11T.A0F(str, 1);
        if (!str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadOpened")) {
            throw 4YV.A0f(str);
        }
        OnThreadOpened onThreadOpened = (OnThreadOpened) r302;
        11T.A0F(onThreadOpened, 0);
        ThreadKey threadKey = onThreadOpened.A00;
        if (threadKey.A1A()) {
            MailboxFeature mailboxFeature = (MailboxFeature) 1Lm.A05(this.A00, this.A01, 33183);
            long A0s = threadKey.A0s();
            PrivacyContext A00 = ((AnonymousClass224) this.A02.A00.get()).A00("951388345621219");
            1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
            MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
            if (AQV.Cj2(new Iay(0, A0s, mailboxFutureImpl, mailboxFeature, A00))) {
                return;
            }
            mailboxFutureImpl.cancel(false);
        }
    }
}
