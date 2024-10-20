package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import java.util.List;

/* loaded from: BUk.class */
public abstract class BUk {
    public static final void A00(Context context, FbUserSession fbUserSession, DHD dhd, List list, long j) {
        1BL.A11(0, context, dhd, fbUserSession);
        MailboxFeature mailboxFeature = (MailboxFeature) 1Lo.A04(context, fbUserSession, (1BY) null, 83976);
        Object A03 = 1Bi.A03(16432);
        1Bi.A03(66774);
        PrivacyContext A0t = AbH.A0t("FBLegacyBroker", 1BJ.A00(630));
        Czj A00 = Czj.A00(dhd, A03, 64);
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, A00);
        1Um.A02(AQV, new CyB(0, j, mailboxFeature, A0t, list, A0Q), A0Q, false);
    }
}
