package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.facebook.messaging.events.notifications.EventReminderNotification;
import com.facebook.messaging.events.plugins.notificationhandler.reminder.EventReminderNotificationHandler;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.MessengerRoomInviteReminderNotification;
import com.facebook.messaging.notify.NotesNotification;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.presence.note.plugins.notify.notesnotif.NotesNotificationHandlerImplementation;

/* loaded from: Cnp.class */
public final class Cnp implements C5pz {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public Cnp(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
    }

    private void A00(Bitmap bitmap) {
        NotesNotification notesNotification = (NotesNotification) this.A03;
        String str = notesNotification.A01;
        ThreadKey threadKey = notesNotification.A00;
        String str2 = notesNotification.A02;
        String str3 = notesNotification.A03;
        int hashCode = str2.hashCode();
        NotesNotificationHandlerImplementation notesNotificationHandlerImplementation = (NotesNotificationHandlerImplementation) this.A01;
        Context context = (Context) this.A02;
        String obj = threadKey.toString();
        Intent A06 = ((4iH) notesNotificationHandlerImplementation.A02.get()).A06(str2);
        A06.setFlags(67108864);
        AbJ.A1F(A06, true);
        A06.putExtra("note_id", str3);
        PendingIntent A08 = ((5qG) 1Bn.A0E(context, (1BY) null, 49844)).A08(A06, notesNotification, obj, 10152);
        5YV A03 = ((5sV) 1Bn.A0E(context, (1BY) null, 82111)).A03(context, threadKey, hashCode);
        C10914uy A00 = ((C10904ux) 1Bn.A0E(context, (1BY) null, 49358)).A00(context, null, notesNotification, 10152);
        AbL.A0m(context, A00);
        A00.A0C(1BL.A08(notesNotificationHandlerImplementation.A00));
        A00.A0g = true;
        A00.A0L(notesNotification.A04);
        A00.A0K(str);
        A00.A0D(A08);
        A00.A09(A03);
        A00.A0M(str);
        A00.A0N(true);
        if (bitmap != null) {
            A00.A0F(bitmap);
        }
        AbL.A0o(A00, notesNotificationHandlerImplementation.A03, threadKey);
        ((4aO) 1Bn.A0E(context, (1BY) null, 68463)).A04("NOTE_UPDATE", hashCode, A00.A07());
        AbI.A1O(notesNotificationHandlerImplementation.A05, notesNotification);
    }

    private void A01(Bitmap bitmap) {
        Context context = (Context) this.A02;
        5qG r0 = (5qG) 1Bn.A0E(context, (1BY) null, 49844);
        MessengerRoomInviteReminderNotification messengerRoomInviteReminderNotification = (MessengerRoomInviteReminderNotification) this.A03;
        ((C5e) 1Bn.A0E(context, (1BY) null, 83576)).A00(r0.A0A(messengerRoomInviteReminderNotification, (String) null, 10043), bitmap, messengerRoomInviteReminderNotification);
    }

    private final void A02(Bitmap bitmap) {
        if (bitmap != null) {
            ((C10924uz) this.A02).A0F(bitmap);
        }
        AbJ.A1H((C10924uz) this.A02, AbJ.A0T(((EventReminderNotificationHandler) this.A03).A04), (String) null, 10034);
        EventReminderNotification eventReminderNotification = (EventReminderNotification) this.A01;
        eventReminderNotification.A00 = true;
        ((MessagingNotification) eventReminderNotification).A00 = true;
    }

    @Override // X.C5pz
    public void Blg() {
        switch (this.A00) {
            case 0:
                A02(null);
                return;
            case 1:
                A01(null);
                return;
            default:
                A00(null);
                return;
        }
    }

    @Override // X.C5pz
    public void BpV(2EU r302) {
        try {
            switch (this.A00) {
                case 0:
                    11T.A0F(r302, 0);
                    Bitmap bitmap = null;
                    2EY r0 = (2Ea) r302.A09();
                    if (r0 instanceof 2EY) {
                        bitmap = r0.A04;
                    }
                    A02(bitmap);
                    break;
                case 1:
                    A01(AbG.A1a(r302) ? AbH.A04(r302) : null);
                    break;
                default:
                    A00(AbG.A1a(r302) ? AbH.A04(r302) : null);
                    break;
            }
        } finally {
            r302.close();
        }
    }
}
