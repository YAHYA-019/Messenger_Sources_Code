package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.JSONUtil;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.backgroundaccount.BackgroundAccountNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: Col.class */
public final class Col implements 7yC {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1De A03;

    public Col(1De r302) {
        this.A03 = r302;
        1BY r0 = r302.A00;
        this.A01 = 1Bu.A03(r0, 83865);
        this.A02 = AbG.A0Y();
        this.A00 = 1Bu.A03(r0, 17006);
    }

    public void CZO(FbUserSession fbUserSession, PushProperty pushProperty, 24X r304) {
        String str;
        ThreadKey A0Y;
        7zT.A1S(r304, pushProperty, fbUserSession);
        0fH.A0j("BackgroundAccountNotificationDataProcessor", "BackgroundAccountNotificationDataProcessor:processNotificationData");
        if (1Br.A0B(this.A02) != C0et.A0P) {
            str = "BackgroundAccountNotification only works for Messenger";
        } else {
            String A0H = JSONUtil.A0H(r304.A0D("target_uid"), null);
            C00i A0R = AbF.A0R(this.A01);
            String A0P = C3o5.A0P(r304, "title", null);
            String A19 = AbH.A19(A0R, r304);
            if (A0H == null || A0H.length() == 0 || A0P == null || A0P.length() == 0 || A19 == null || A19.length() == 0) {
                str = "targetUid, title and messageText should be nonnull and non-empty for BackgroundAccountNotification";
            } else {
                24X A0q = AbJ.A0q(A0R, r304);
                if (A0q != null && (A0Y = AbK.A0Y(fbUserSession, A0R, A0q)) != null) {
                    ((AnonymousClass208) 1Br.A0B(this.A00)).Bg4(new BackgroundAccountNotification(A0Y, pushProperty, A0P, A19, A0H));
                    return;
                }
                str = "threadKey should be nonnull for BackgroundAccountNotification";
            }
        }
        0fH.A0j("BackgroundAccountNotificationDataProcessor", str);
    }
}
