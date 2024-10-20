package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.JSONUtil;
import com.facebook.messaging.accountrecovery.notifications.PushToSessionNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: Coe.class */
public final class Coe implements 7yC {
    public final 1Br A00;
    public final 1Br A01 = AbG.A0Y();
    public final 1De A02;

    public Coe(1De r302) {
        this.A02 = r302;
        this.A00 = 7zM.A0h(r302, 83865);
    }

    public void CZO(FbUserSession fbUserSession, PushProperty pushProperty, 24X r304) {
        11T.A0H(r304, pushProperty);
        0fH.A0j("PushToSession", AnonymousClass001.A0Z(r304, "Processing P2S Notif with data: ", AnonymousClass001.A0k()));
        C00i c00i = this.A00.A00;
        String A19 = AbH.A19(c00i, r304);
        if (A19 == null) {
            A19 = "";
        }
        24X A0q = AbJ.A0q(c00i, r304);
        String A0H = JSONUtil.A0H(A0q != null ? A0q.A0D("path") : null, null);
        if (1Br.A0B(this.A01) != C0et.A0P || A19.length() == 0 || A0H == null || A0H.length() == 0) {
            return;
        }
        AbK.A1K(this.A02, new PushToSessionNotification(C5ap.A2Z, pushProperty, A19, A0H));
    }
}
