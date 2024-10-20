package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.78n, reason: invalid class name */
/* loaded from: 78n.class */
public final class C78n {
    public final 1Br A00;
    public final 1Br A01;
    public final Context A02;
    public final FbUserSession A03;

    public C78n(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A02 = context;
        this.A03 = fbUserSession;
        this.A00 = 1Lm.A00(context, fbUserSession, 65961);
        this.A01 = 1Bq.A00(68077);
    }

    public void A00(ThreadKey threadKey, C5fv c5fv) {
        11T.A0F(threadKey, 0);
        if (C5fv.A00(c5fv) == 0S2.A01) {
            MailboxFeature mailboxFeature = (MailboxFeature) 1Br.A0B(this.A00);
            1Br.A0C(this.A01);
            String A00 = 5QA.A00(threadKey);
            String str = ((C5fu) c5fv).A09;
            1Um A0O = 1BK.A0O(mailboxFeature, 0);
            MailboxFutureImpl A0P = 1BK.A0P(A0O);
            int A002 = 4uZ.A00(A0P, (1X9) null);
            TraceInfo A02 = 4uZ.A02(A0P, (LoggingOption) null, "MailboxSDK", "sendVisualMessageOpened");
            if (!A0O.Cj2(new Czc(4YW.A05(A0P, (LoggingOption) null, A02), A0P, mailboxFeature, A00, str, A002, 3))) {
                A0P.cancel(false);
                4uZ.A03(A002);
                4uZ.A05((LoggingOption) null, A02, "MailboxSDK", "sendVisualMessageOpened");
            }
            PlatformLogger.platformEventLog(5);
        }
    }
}
