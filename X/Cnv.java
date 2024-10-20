package X;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.notify.type.MessageReactionNotification;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.messaging.reactions.plugins.reactions.notificationhandler.MessageReactionNotificationHandlerImplementation;

/* loaded from: Cnv.class */
public final class Cnv implements C5pz {
    public final Context A00;
    public final ThreadKey A01;
    public final MessagingNotification A02;
    public final Bgj A03;
    public final String A04;
    public final /* synthetic */ MessageReactionNotificationHandlerImplementation A05;

    public Cnv(Context context, ThreadKey threadKey, MessagingNotification messagingNotification, Bgj bgj, MessageReactionNotificationHandlerImplementation messageReactionNotificationHandlerImplementation, String str) {
        this.A05 = messageReactionNotificationHandlerImplementation;
        this.A00 = context;
        this.A01 = threadKey;
        this.A04 = str;
        this.A02 = messagingNotification;
        this.A03 = bgj;
    }

    private void A00(Bitmap bitmap) {
        MessageReactionNotificationHandlerImplementation messageReactionNotificationHandlerImplementation = this.A05;
        C00i c00i = messageReactionNotificationHandlerImplementation.A06;
        5bF A0l = AbF.A0l(c00i);
        ThreadKey threadKey = this.A01;
        ThreadSummary A07 = A0l.A07(threadKey);
        String string = (ThreadKey.A0q(threadKey) || (ThreadKey.A0S(threadKey) && !AbG.A0p(messageReactionNotificationHandlerImplementation.A09).A04())) ? this.A00.getResources().getString(2131967343) : A07 != null ? ((C5py) messageReactionNotificationHandlerImplementation.A01.get()).A00(A07) ? AbK.A12(this.A00) : AbF.A0l(c00i).A09(A07) : "";
        if (string.isEmpty()) {
            0fH.A0n("MessageReactionNotificationHandlerImplementation", "Failed to get notification title from thread key");
            string = AbK.A12(this.A00);
        }
        String obj = threadKey.toString();
        Context context = this.A00;
        5qG r0 = (5qG) 1Bn.A0E(context, (1BY) null, 49844);
        C5a c5a = (C5a) messageReactionNotificationHandlerImplementation.A03.get();
        MessagingNotification messagingNotification = this.A02;
        PendingIntent A00 = c5a.A00(threadKey, messagingNotification, obj, 10042);
        PendingIntent A0A = r0.A0A(messagingNotification, obj, 10042);
        C10914uy A002 = ((C10904ux) 1Bn.A0E(context, (1BY) null, 49358)).A00(context, null, messagingNotification, 10042);
        A002.A0L(string);
        A002.A0K(this.A04);
        AbL.A0m(context, A002);
        boolean A1V = AbK.A1V(A00, A0A, A002);
        if (bitmap != null) {
            A002.A0F(bitmap);
        }
        AbL.A0o(A002, messageReactionNotificationHandlerImplementation.A05, threadKey);
        ((4aO) 1Bn.A0E(context, (1BY) null, 68463)).A04(obj, 10042, A002.A07());
        this.A03.A00.A00 = A1V;
        1BV A003 = 1BV.A00(83854);
        if (!(messagingNotification instanceof MessageReactionNotification) || !((5qK) A003.get()).A00()) {
            messagingNotification.A00 = A1V;
        }
        AbI.A1O(messageReactionNotificationHandlerImplementation.A07, messagingNotification);
    }

    @Override // X.C5pz
    public void Blg() {
        A00(null);
    }

    @Override // X.C5pz
    public void BpV(2EU r302) {
        try {
            A00(AbG.A1a(r302) ? AbH.A04(r302) : null);
        } finally {
            r302.close();
        }
    }
}
