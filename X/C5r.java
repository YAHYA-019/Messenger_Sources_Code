package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.MessengerSupportInboxNotification;
import com.facebook.messaging.notify.type.MessagingNotification;

/* loaded from: C5r.class */
public final class C5r {
    public 1BY A00;
    public final C00i A01 = 1BQ.A02(49458);
    public final C00i A02 = 1BV.A01((1BY) null, 49358);
    public final C00i A04 = 1BQ.A02(49803);
    public final C00i A05 = 1BV.A01((1BY) null, 68463);
    public final C00i A06 = 1BQ.A02(49839);
    public final C00i A03 = 1BV.A01((1BY) null, 49844);

    public C5r(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public void A00(Context context, FbUserSession fbUserSession, MessengerSupportInboxNotification messengerSupportInboxNotification) {
        if (((5pC) this.A06.get()).A01(fbUserSession, (ThreadKey) null, messengerSupportInboxNotification, 10077)) {
            return;
        }
        51X r0 = (51X) this.A01.get();
        String valueOf = String.valueOf(messengerSupportInboxNotification.A00);
        11T.A0F(r0, 0);
        String A01 = r0.A01("SUPPORT_INBOX_ITEM_DETAIL_ACTION");
        11T.A0A(A01);
        Intent A0A = 4YU.A0A(A01);
        A0A.putExtra("item_id", valueOf);
        A0A.putExtra("screen_title", (String) null);
        C00i c00i = this.A03;
        PendingIntent A04 = ((5qG) c00i.get()).A04(A0A, messengerSupportInboxNotification, (Integer) null, (String) null, 10077);
        PendingIntent A012 = 5qG.A01(c00i, messengerSupportInboxNotification, (String) null, 10077);
        C10914uy A00 = AbG.A0l(this.A02).A00(context, null, messengerSupportInboxNotification, 10077);
        A00.A0L(messengerSupportInboxNotification.A01);
        boolean A1V = AbK.A1V(A04, A012, A00);
        4aO.A00(A00, this.A05, (String) null, 10077);
        messengerSupportInboxNotification.A02 = A1V;
        ((MessagingNotification) messengerSupportInboxNotification).A00 = A1V;
        AbI.A1O(this.A04, messengerSupportInboxNotification);
    }
}
