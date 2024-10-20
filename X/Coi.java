package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.marketingmessages.MarketingMessagesUnreadOptinReminderNotification;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.push.constants.PushProperty;

/* loaded from: Coi.class */
public final class Coi implements 7yC {
    public final 1Br A00;
    public final 1Br A01 = AbG.A0Y();
    public final 1De A02;

    public Coi(1De r302) {
        this.A02 = r302;
        this.A00 = 7zM.A0h(r302, 83865);
    }

    public void CZO(FbUserSession fbUserSession, PushProperty pushProperty, 24X r304) {
        ThreadKey A0Y;
        7zT.A1S(r304, pushProperty, fbUserSession);
        String A18 = AbK.A18(r304, "title");
        C00i c00i = this.A00.A00;
        String A19 = AbH.A19(c00i, r304);
        24X A0q = AbJ.A0q(c00i, r304);
        if (A0q == null || (A0Y = AbK.A0Y(fbUserSession, c00i, A0q)) == null || 1Br.A0B(this.A01) != C0et.A0P || A18 == null || A18.length() == 0 || A19 == null || A19.length() == 0) {
            return;
        }
        AbK.A1K(this.A02, new MarketingMessagesUnreadOptinReminderNotification(A0Y, pushProperty, A18, A19));
    }
}
