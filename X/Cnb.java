package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.accountswitch.model.MessengerAccountType;
import com.facebook.messaging.nativepagereply.accountswitch.model.MessengerAccountSwitchUiInfo;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.messaging.notify.type.NewMessageNotification;
import com.facebook.messaging.rtc.callstatus.notification.MissedCallNotification;
import com.facebook.messaging.tincan.tincanoverwamsys.backgroundsync.generic.notify.MessengerGenericTincanMessage;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Random;

/* loaded from: Cnb.class */
public final class Cnb implements 4vE {
    public final Random A01 = new SecureRandom();
    public final 1Br A00 = 1Bq.A00(99950);

    public PendingIntent DAq(PendingIntent pendingIntent, Context context, MessagingNotification messagingNotification, int i) {
        String str;
        MessengerAccountType messengerAccountType;
        11T.A0F(context, 0);
        if (messagingNotification != null) {
            if (messagingNotification instanceof NewMessageNotification) {
                NewMessageNotification newMessageNotification = (NewMessageNotification) messagingNotification;
                str = newMessageNotification.A09;
                messengerAccountType = newMessageNotification.A01;
            } else if (messagingNotification instanceof MissedCallNotification) {
                MissedCallNotification missedCallNotification = (MissedCallNotification) messagingNotification;
                str = missedCallNotification.A0B;
                messengerAccountType = missedCallNotification.A01;
            } else if (messagingNotification instanceof MessengerGenericTincanMessage) {
                str = ((MessengerGenericTincanMessage) messagingNotification).A01;
                messengerAccountType = MessengerAccountType.A03;
            }
            if (str != null && !0CU.A0O(str)) {
                Intent A08 = 4YV.A08(AbstractC00603o4.A00(181));
                A08.putExtra(AbstractC00603o4.A00(ActionId.ABORTED), pendingIntent);
                A08.putExtra(AbstractC00603o4.A00(ActionId.ACTION_BAR_COMPLETE), str);
                HashSet A0v = AnonymousClass001.A0v();
                A08.putExtra(AbstractC00603o4.A00(ActionId.LEGACY_MARKER), new MessengerAccountSwitchUiInfo((messengerAccountType == null || messengerAccountType.ordinal() != 4) ? BLO.A05 : BLO.A04, "", null, str, 4YV.A0z("targetAccountType", A0v, A0v)));
                05X A06 = 4YW.A06(context, A08);
                A06.A09();
                A06.A08();
                return AbK.A09(context, A06, this.A01);
            }
        }
        return pendingIntent;
    }
}
