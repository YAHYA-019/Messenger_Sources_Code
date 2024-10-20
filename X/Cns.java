package X;

import android.graphics.Bitmap;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.messaging.notify.type.NewMessageNotification;

/* loaded from: Cns.class */
public final class Cns implements C5pz {
    public final /* synthetic */ C10924uz A00;
    public final /* synthetic */ ThreadKey A01;
    public final /* synthetic */ CFp A02;
    public final /* synthetic */ NewMessageNotification A03;
    public final /* synthetic */ String A04;

    public Cns(C10924uz c10924uz, ThreadKey threadKey, CFp cFp, NewMessageNotification newMessageNotification, String str) {
        this.A02 = cFp;
        this.A00 = c10924uz;
        this.A04 = str;
        this.A01 = threadKey;
        this.A03 = newMessageNotification;
    }

    private void A00(Bitmap bitmap) {
        if (bitmap != null) {
            this.A00.A0F(bitmap);
        }
        0fH.A0j("NewMessageNotificationSender", "Calling android NotificationManager notify");
        CFp cFp = this.A02;
        C00i c00i = cFp.A0L;
        4aO r0 = (4aO) c00i.get();
        String str = this.A04;
        r0.A03(str, 10041);
        ((4aO) c00i.get()).A04(str, 10041, this.A00.A07());
        I3Z i3z = (I3Z) cFp.A0P.get();
        HxP.A00(I3Z.A00(i3z), 10041, Long.valueOf(this.A01.A0r()), "GROUP", (String) null, (String) null);
        NewMessageNotification newMessageNotification = this.A03;
        ((MessagingNotification) newMessageNotification).A00 = true;
        AbI.A1O(cFp.A0F, newMessageNotification);
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
