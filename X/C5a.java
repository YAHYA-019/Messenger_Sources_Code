package X;

import android.app.PendingIntent;
import android.content.Intent;
import com.facebook.acra.constants.ActionId;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.type.MessagingNotification;

/* loaded from: C5a.class */
public final class C5a {
    public final C00i A00 = FbInjector.A00;
    public final C00i A04 = AbG.A0G(81984);
    public final C00i A05 = AbG.A0G(49844);
    public final C00i A02 = AbH.A0b();
    public final C00i A01 = 1BQ.A02(83837);
    public final C15h A03 = DBe.A00(this, ActionId.NOTIFY_SUBSCRIBERS);

    public PendingIntent A00(ThreadKey threadKey, MessagingNotification messagingNotification, String str, int i) {
        Intent A04;
        if (((5pD) this.A04.get()).A00(messagingNotification)) {
            A04 = AbF.A0s(this.A01).A02();
            if (A04 == null) {
                return null;
            }
        } else {
            A04 = ((4iH) this.A02.get()).A04(threadKey, 5SW.A1J);
            A04.setFlags(67108864);
        }
        AbJ.A1F(A04, true);
        if (1BL.A1a(this.A03) && !AbF.A0s(this.A01).A09(threadKey)) {
            A04.putExtra("prefer_chat_if_possible", true);
        }
        return AbJ.A04(A04, this.A05, messagingNotification, str, i);
    }
}
