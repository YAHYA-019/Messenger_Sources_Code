package X;

import android.graphics.Bitmap;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.messaging.notify.type.NewMessageNotification;

/* loaded from: Cnt.class */
public final class Cnt implements C5pz {
    public final /* synthetic */ C10924uz A00;
    public final /* synthetic */ ThreadKey A01;
    public final /* synthetic */ NewMessageNotification A02;
    public final /* synthetic */ 4a5 A03;
    public final /* synthetic */ String A04;

    public Cnt(C10924uz c10924uz, ThreadKey threadKey, NewMessageNotification newMessageNotification, 4a5 r305, String str) {
        this.A03 = r305;
        this.A00 = c10924uz;
        this.A04 = str;
        this.A01 = threadKey;
        this.A02 = newMessageNotification;
    }

    private void A00(Bitmap bitmap) {
        if (bitmap != null) {
            this.A00.A0F(bitmap);
        }
        0fH.A0j("DefaultMessagingNotificationHandler", "Calling android NotificationManager notify");
        4a5 r0 = this.A03;
        4aB r02 = 4a5.A1P;
        C00i c00i = r0.A0j;
        4aO r03 = (4aO) c00i.get();
        String str = this.A04;
        r03.A03(str, 10041);
        ((4aO) c00i.get()).A04(str, 10041, this.A00.A07());
        I3Z i3z = (I3Z) r0.A0v.get();
        HxP.A00(I3Z.A00(i3z), 10041, Long.valueOf(this.A01.A0r()), "GROUP", (String) null, (String) null);
        NewMessageNotification newMessageNotification = this.A02;
        ((MessagingNotification) newMessageNotification).A00 = true;
        AbstractC04164a6.A0I(newMessageNotification, r0);
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
