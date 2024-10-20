package X;

import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.MessengerRoomInviteReminderNotification;
import com.facebook.messaging.notify.NotesNotification;

/* loaded from: Cno.class */
public final class Cno implements C5pz {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Cno(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    private void A00(Bitmap bitmap) {
        NotesNotification notesNotification = (NotesNotification) this.A02;
        String str = notesNotification.A01;
        ThreadKey threadKey = notesNotification.A00;
        String str2 = notesNotification.A02;
        String str3 = notesNotification.A03;
        int hashCode = str2.hashCode();
        4a5 r0 = (4a5) this.A01;
        String obj = threadKey.toString();
        Intent A06 = ((4iH) r0.A0R.get()).A06(str2);
        A06.setFlags(67108864);
        AbJ.A1F(A06, true);
        A06.putExtra("note_id", str3);
        PendingIntent A04 = AbJ.A04(A06, r0.A0X, notesNotification, obj, 10152);
        5sV r02 = (5sV) r0.A0S.get();
        C00i c00i = r0.A0G;
        5YV A03 = r02.A03(1BK.A04(c00i), threadKey, hashCode);
        C10914uy A00 = AbG.A0l(r0.A0T).A00(1BK.A04(c00i), null, notesNotification, 10152);
        AbL.A0m(1BK.A04(c00i), A00);
        A00.A0C(1BL.A08(r0.A0F));
        A00.A0g = true;
        A00.A0L(notesNotification.A04);
        A00.A0K(str);
        A00.A0D(A04);
        A00.A09(A03);
        A00.A0M(str);
        A00.A0N(true);
        if (bitmap != null) {
            A00.A0F(bitmap);
        }
        AbL.A0o(A00, r0.A0V, threadKey);
        ((4aO) r0.A0j.get()).A04("NOTE_UPDATE", hashCode, A00.A07());
        AbstractC04164a6.A0I(notesNotification, r0);
    }

    private void A01(Bitmap bitmap) {
        4a5 r0 = (4a5) this.A01;
        4aB r02 = 4a5.A1P;
        5qG r03 = (5qG) r0.A0X.get();
        MessengerRoomInviteReminderNotification messengerRoomInviteReminderNotification = (MessengerRoomInviteReminderNotification) this.A02;
        ((C5e) r0.A0t.get()).A00(r03.A0A(messengerRoomInviteReminderNotification, (String) null, 10043), bitmap, messengerRoomInviteReminderNotification);
    }

    @Override // X.C5pz
    public void Blg() {
        if (this.A00 != 0) {
            A01(null);
        } else {
            A00(null);
        }
    }

    @Override // X.C5pz
    public void BpV(2EU r302) {
        try {
            if (this.A00 != 0) {
                A01(AbG.A1a(r302) ? AbH.A04(r302) : null);
            } else {
                A00(AbG.A1a(r302) ? AbH.A04(r302) : null);
            }
        } finally {
            r302.close();
        }
    }
}
