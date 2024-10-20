package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.JSONUtil;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.messaging.sharedalbum.notifications.MessengerSharedAlbumAdditionNotification;
import com.facebook.messaging.sharedalbum.notifications.MessengerSharedAlbumCreationNotification;
import com.facebook.messaging.sharedalbum.notifications.MessengerSharedAlbumDeletionNotification;
import com.facebook.messaging.sharedalbum.notifications.MessengerSharedAlbumReactionNotification;
import com.facebook.messaging.sharedalbum.notifications.MessengerSharedAlbumRemovalNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: Coj.class */
public final class Coj implements 7yC {
    public final 1Br A00;
    public final 1Br A01 = AbG.A0Y();
    public final 1De A02;

    public Coj(1De r302) {
        this.A02 = r302;
        this.A00 = 7zM.A0h(r302, 83865);
    }

    public void CZO(FbUserSession fbUserSession, PushProperty pushProperty, 24X r304) {
        String str;
        MessagingNotification messengerSharedAlbumCreationNotification;
        11T.A0F(r304, 0);
        11T.A0F(pushProperty, 1);
        11T.A0F(fbUserSession, 2);
        0fH.A0j("MessengerSharedAlbumNotificationDataProcessor", "processNotificationData");
        C00i c00i = this.A00.A00;
        24X A0q = AbJ.A0q(c00i, r304);
        c00i.get();
        ThreadKey threadKey = null;
        String A0H = JSONUtil.A0H(r304.A0D("title"), null);
        String A19 = AbH.A19(c00i, r304);
        String str2 = pushProperty.A0B;
        if (A0q != null) {
            threadKey = AbK.A0Y(fbUserSession, c00i, A0q);
        }
        if (1Br.A0B(this.A01) == C0et.A0P && A0H != null && A0H.length() != 0 && A19 != null && A19.length() != 0 && threadKey != null && str2 != null && str2.length() != 0) {
            int ordinal = C5ap.A00(AbK.A19(str2)).ordinal();
            if (ordinal == 171) {
                messengerSharedAlbumCreationNotification = new MessengerSharedAlbumCreationNotification(threadKey, pushProperty, A0H, A19, false);
            } else if (ordinal == 172) {
                messengerSharedAlbumCreationNotification = new MessengerSharedAlbumAdditionNotification(threadKey, pushProperty, A0H, A19, false);
            } else if (ordinal == 173) {
                messengerSharedAlbumCreationNotification = new MessengerSharedAlbumDeletionNotification(threadKey, pushProperty, A0H, A19, false);
            } else if (ordinal == 174) {
                messengerSharedAlbumCreationNotification = new MessengerSharedAlbumRemovalNotification(threadKey, pushProperty, A0H, A19, false);
            } else if (ordinal != 175) {
                str = "processNotificationData received invalid notification type";
            } else {
                messengerSharedAlbumCreationNotification = new MessengerSharedAlbumReactionNotification(threadKey, pushProperty, A0H, A19, false);
            }
            AbK.A1K(this.A02, messengerSharedAlbumCreationNotification);
            return;
        }
        str = "processNotificationData received invalid payload";
        0fH.A0k("MessengerSharedAlbumNotificationDataProcessor", str);
    }
}
