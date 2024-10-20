package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.MessengerFbPayReferralExpirationNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: Coa.class */
public final class Coa implements 7yC {
    public final 1Br A00;
    public final 1De A01;

    public Coa(1De r302) {
        this.A01 = r302;
        this.A00 = 7zM.A0h(r302, 83865);
    }

    public void CZO(FbUserSession fbUserSession, PushProperty pushProperty, 24X r304) {
        7zT.A1S(r304, pushProperty, fbUserSession);
        C00i c00i = this.A00.A00;
        String A19 = AbH.A19(c00i, r304);
        ThreadKey A0Y = AbK.A0Y(fbUserSession, c00i, r304);
        if (A19 == null || A19.length() == 0 || A0Y == null) {
            return;
        }
        AbK.A1K(this.A01, new MessengerFbPayReferralExpirationNotification(A0Y, pushProperty, A19));
    }
}
