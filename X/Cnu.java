package X;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.notify.type.MessageReactionNotification;
import com.facebook.messaging.notify.type.MessagingNotification;

/* loaded from: Cnu.class */
public final class Cnu implements C5pz {
    public final ThreadKey A00;
    public final MessagingNotification A01;
    public final BnZ A02;
    public final String A03;
    public final /* synthetic */ 4a5 A04;

    public Cnu(ThreadKey threadKey, MessagingNotification messagingNotification, BnZ bnZ, 4a5 r305, String str) {
        this.A04 = r305;
        this.A00 = threadKey;
        this.A03 = str;
        this.A01 = messagingNotification;
        this.A02 = bnZ;
    }

    private void A00(Bitmap bitmap) {
        4a5 r0 = this.A04;
        4aB r02 = 4a5.A1P;
        C00i c00i = r0.A0a;
        5bF A0l = AbF.A0l(c00i);
        ThreadKey threadKey = this.A00;
        ThreadSummary A07 = A0l.A07(threadKey);
        String string = (ThreadKey.A0q(threadKey) || (ThreadKey.A0S(threadKey) && !AbG.A0p(r0.A11).A04())) ? 1BL.A0B(r0.A0G).getString(2131967343) : A07 != null ? ((C5py) r0.A0N.get()).A00(A07) ? AbH.A17(1BL.A0B(r0.A0G)) : AbF.A0l(c00i).A09(A07) : "";
        if (string.isEmpty()) {
            0fH.A0n("DefaultMessagingNotificationHandler", "Failed to get notification title from thread key");
            string = AbH.A17(1BL.A0B(r0.A0G));
        }
        String obj = threadKey.toString();
        MessagingNotification messagingNotification = this.A01;
        PendingIntent A0M = r0.A0M(threadKey, messagingNotification, obj, 10042);
        PendingIntent A01 = 5qG.A01(r0.A0X, messagingNotification, obj, 10042);
        C10904ux A0l2 = AbG.A0l(r0.A0T);
        C00i c00i2 = r0.A0G;
        C10914uy A00 = A0l2.A00(1BK.A04(c00i2), null, messagingNotification, 10042);
        A00.A0L(string);
        A00.A0K(this.A03);
        AbL.A0m(1BK.A04(c00i2), A00);
        boolean A1V = AbK.A1V(A0M, A01, A00);
        if (bitmap != null) {
            A00.A0F(bitmap);
        }
        AbL.A0o(A00, r0.A0V, threadKey);
        4aO.A00(A00, r0.A0j, obj, 10042);
        this.A02.A00.A00 = A1V;
        1BV A002 = 1BV.A00(83854);
        if (!(messagingNotification instanceof MessageReactionNotification) || !((5qK) A002.get()).A00()) {
            messagingNotification.A00 = A1V;
        }
        AbstractC04164a6.A0I(messagingNotification, r0);
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
