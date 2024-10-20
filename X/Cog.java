package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.JSONUtil;
import com.facebook.messaging.cowatch.notifications.MessengerCowatchVideoStartedNotification;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.push.constants.PushProperty;

/* loaded from: Cog.class */
public final class Cog implements 7yC {
    public final 1Br A00;
    public final 1Br A01 = AbG.A0Y();
    public final 1De A02;

    public Cog(1De r302) {
        this.A02 = r302;
        this.A00 = 7zM.A0h(r302, 83865);
    }

    public void CZO(FbUserSession fbUserSession, PushProperty pushProperty, 24X r304) {
        11T.A0F(r304, 0);
        1BL.A1F(pushProperty, fbUserSession);
        ThreadKey threadKey = null;
        String A0H = JSONUtil.A0H(r304.A0D("title"), null);
        C00i c00i = this.A00.A00;
        24X A0q = AbJ.A0q(c00i, r304);
        String A0H2 = JSONUtil.A0H(A0q != null ? A0q.A0D("csid") : null, null);
        boolean A0J = JSONUtil.A0J(A0q != null ? A0q.A0D(4YT.A00(67)) : null, false);
        if (A0q != null) {
            threadKey = AbK.A0Y(fbUserSession, c00i, A0q);
        }
        String A19 = AbH.A19(c00i, r304);
        if (1Br.A0B(this.A01) != C0et.A0P || A19 == null || A19.length() == 0 || A0H == null || A0H.length() == 0 || A0H2 == null || A0H2.length() == 0 || threadKey == null || A0q == null) {
            return;
        }
        AbK.A1K(this.A02, new MessengerCowatchVideoStartedNotification(threadKey, pushProperty, A0H, A19, A0H2, A0J));
    }
}
