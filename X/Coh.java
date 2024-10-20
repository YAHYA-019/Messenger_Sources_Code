package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.JSONUtil;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: Coh.class */
public final class Coh implements 7yC {
    public final 1Br A00;
    public final 1Br A01 = AbG.A0Y();
    public final 1De A02;

    public Coh(1De r302) {
        this.A02 = r302;
        this.A00 = 7zM.A0h(r302, 83865);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [com.facebook.messaging.notify.MessengerSupportInboxNotification, com.facebook.messaging.notify.type.MessagingNotification] */
    public void CZO(FbUserSession fbUserSession, PushProperty pushProperty, 24X r304) {
        boolean A1X = 1BL.A1X(r304, pushProperty);
        0fH.A0j("SupportInboxNotificationDataProcessor", "processSupportInboxNotification");
        if (1Br.A0B(this.A01) == C0et.A0P) {
            C00i c00i = this.A00.A00;
            String A19 = AbH.A19(c00i, r304);
            24X A0q = AbJ.A0q(c00i, r304);
            if (A19 == null || A0q == null) {
                return;
            }
            long A03 = JSONUtil.A03(A0q.A0D("si_id"), 0L);
            if (A03 != 0) {
                ?? messagingNotification = new MessagingNotification(C5ap.A0z, pushProperty);
                messagingNotification.A01 = A19;
                messagingNotification.A00 = A03;
                messagingNotification.A02 = false;
                ((AnonymousClass208) 1De.A00(this.A02, 17006)).Bgi(messagingNotification);
                messagingNotification.A02 = A1X;
            }
        }
    }
}
