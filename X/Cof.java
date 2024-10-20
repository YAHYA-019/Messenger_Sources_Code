package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.aibot.notify.MessengerAiAgentsUserOffWaitlistNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: Cof.class */
public final class Cof implements 7yC {
    public final 1Br A00;
    public final 1Br A01 = AbG.A0Y();
    public final 1De A02;

    public Cof(1De r302) {
        this.A02 = r302;
        this.A00 = 7zM.A0h(r302, 83865);
    }

    public void CZO(FbUserSession fbUserSession, PushProperty pushProperty, 24X r304) {
        1BK.A1M(r304, pushProperty);
        0fH.A0j("MessengerAiAgentsNotificationDataProcessor", "processNotificationData");
        C00i A0R = AbF.A0R(this.A00);
        String A18 = AbK.A18(r304, "title");
        String A19 = AbH.A19(A0R, r304);
        if (1Br.A0B(this.A01) != C0et.A0P || A18 == null || A18.length() == 0 || A19 == null) {
            0fH.A0k("MessengerAiAgentsNotificationDataProcessor", "processNotificationData received invalid payload");
            return;
        }
        MessengerAiAgentsUserOffWaitlistNotification messengerAiAgentsUserOffWaitlistNotification = new MessengerAiAgentsUserOffWaitlistNotification(pushProperty, A18, A19, false);
        AnonymousClass208 anonymousClass208 = (AnonymousClass208) 1De.A00(this.A02, 17006);
        0fH.A0j("MessengerAiAgentsNotificationDataProcessor", "notifyMessagingNotification");
        anonymousClass208.Bg4(messengerAiAgentsUserOffWaitlistNotification);
    }
}
