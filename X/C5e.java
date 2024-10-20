package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.facebook.messaging.notify.MessengerRoomInviteReminderNotification;
import com.facebook.messaging.notify.type.MessagingNotification;

/* loaded from: C5e.class */
public final class C5e {
    public 1BY A00;
    public final Context A01;
    public final C00i A02;
    public final C00i A03;
    public final C5dx A04;
    public final C45a A05 = (C45a) 1Bi.A03(83227);
    public final 6HS A06;

    public C5e(1BO r302) {
        Context A04 = AbF.A04((1BY) null);
        this.A01 = A04;
        this.A04 = (C5dx) 1Bi.A03(49803);
        this.A02 = 1BV.A01((1BY) null, 49358);
        this.A03 = 1BV.A01((1BY) null, 68463);
        this.A00 = 7zL.A0Q(r302);
        this.A06 = (6HS) 1Hv.A02(A04, 50024);
    }

    public void A00(PendingIntent pendingIntent, Bitmap bitmap, MessengerRoomInviteReminderNotification messengerRoomInviteReminderNotification) {
        Intent A03 = this.A06.A03(messengerRoomInviteReminderNotification.A01, 5SW.A1X, "room_invite_notification");
        05X r0 = new 05X();
        r0.A09();
        r0.A08();
        Context context = this.A01;
        r0.A0D(A03, context.getClassLoader());
        PendingIntent A01 = r0.A01(context, 0, 268435456);
        C10914uy A00 = AbG.A0l(this.A02).A00(context, null, messengerRoomInviteReminderNotification, 10043);
        A00.A0K(messengerRoomInviteReminderNotification.A02);
        A00.A0B(this.A05.A01());
        A00.A0L(AbK.A12(context));
        A00.A0D(A01);
        A00.A0E(pendingIntent);
        ((C10924uz) A00).A03 = 1;
        A00.A0N(true);
        if (bitmap != null) {
            A00.A0F(bitmap);
        }
        4aO.A00(A00, this.A03, (String) null, 10043);
        this.A04.A01(messengerRoomInviteReminderNotification);
        messengerRoomInviteReminderNotification.A00 = true;
        ((MessagingNotification) messengerRoomInviteReminderNotification).A00 = true;
    }
}
