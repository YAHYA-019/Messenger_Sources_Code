package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.JSONUtil;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.messaging.publicchats.notify.MessengerChannelsDirectInviteNotification;
import com.facebook.messaging.publicchats.notify.MessengerChannelsNewChannelNotification;
import com.facebook.notifications.constants.push.NotificationType;
import com.facebook.push.constants.PushProperty;

/* loaded from: Com.class */
public final class Com implements 7yC {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1De A03;

    public Com(1De r302) {
        this.A03 = r302;
        1BY r0 = r302.A00;
        this.A00 = 1Bu.A03(r0, 83865);
        this.A02 = AbG.A0Y();
        this.A01 = 1Bu.A03(r0, 17010);
    }

    public void CZO(FbUserSession fbUserSession, PushProperty pushProperty, 24X r304) {
        ThreadKey threadKey;
        String str;
        String str2;
        String str3;
        MessagingNotification messengerChannelsDirectInviteNotification;
        7zT.A1S(r304, pushProperty, fbUserSession);
        if (AbI.A0a(this.A01).A00().A02()) {
            String str4 = pushProperty.A0B;
            String str5 = null;
            String A0H = JSONUtil.A0H(r304.A0D("title"), null);
            C00i c00i = this.A00.A00;
            String A19 = AbH.A19(c00i, r304);
            24X A0q = AbJ.A0q(c00i, r304);
            if (A0q != null) {
                threadKey = AbK.A0Y(fbUserSession, c00i, A0q);
                str = C3o5.A0P(A0q, "rc_url", null);
                str2 = C3o5.A0P(A0q, "lh", null);
                c00i.get();
                str3 = C3o5.A0P(A0q, "d", null);
            } else {
                threadKey = null;
                str = null;
                str2 = null;
                str3 = null;
            }
            if (1Br.A0B(this.A02) != C0et.A0P || A0H == null || A0H.length() == 0 || A19 == null || A19.length() == 0 || str2 == null || str2.length() == 0 || threadKey == null) {
                return;
            }
            NotificationType notificationType = NotificationType.A4W;
            if (str4 != null) {
                str5 = AbJ.A1A(str4);
            }
            NotificationType A00 = C7le.A00(str5);
            if (A00 != null) {
                7lP r0 = 7lP.$redex_init_class;
                int ordinal = A00.ordinal();
                if (ordinal == 242) {
                    messengerChannelsDirectInviteNotification = new MessengerChannelsDirectInviteNotification(pushProperty, A0H, A19, 1BK.A0w(threadKey), str2, str);
                } else if (ordinal != 293) {
                    return;
                } else {
                    messengerChannelsDirectInviteNotification = new MessengerChannelsNewChannelNotification(pushProperty, A0H, A19, 1BK.A0w(threadKey), str2, str, str3);
                }
                AbK.A1K(this.A03, messengerChannelsDirectInviteNotification);
            }
        }
    }
}
