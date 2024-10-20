package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.memories.notifications.MessengerMemoriesNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: Cok.class */
public final class Cok implements 7yC {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1De A03;

    public Cok(1De r302) {
        this.A03 = r302;
        1BY r0 = r302.A00;
        this.A01 = 1Bu.A03(r0, 83865);
        this.A02 = AbG.A0Y();
        this.A00 = 1Bu.A03(r0, 68214);
    }

    public void CZO(FbUserSession fbUserSession, PushProperty pushProperty, 24X r304) {
        1BK.A1M(r304, pushProperty);
        C00i c00i = this.A01.A00;
        String A19 = AbH.A19(c00i, r304);
        24X A0q = AbJ.A0q(c00i, r304);
        String str = null;
        String A0P = A0q != null ? C3o5.A0P(A0q, "uuri", null) : null;
        if (1Br.A0B(this.A02) != C0et.A0P || A19 == null || A19.length() == 0 || A0P == null || A0P.length() == 0) {
            0fH.A0k("MessengerMemoriesNotificationDataProcessor", "processNotificationData received invalid payload");
            return;
        }
        if (A0q != null) {
            str = C3o5.A0P(A0q, "j_u", null);
        }
        MessengerMemoriesNotification messengerMemoriesNotification = new MessengerMemoriesNotification(pushProperty, A19, A0P, str, false);
        C9mY.A01((C9mY) 1Br.A0B(this.A00), 5, 0L, 3);
        AbK.A1K(this.A03, messengerMemoriesNotification);
    }
}
