package X;

import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.business.bizrtc.model.PageMessageNotification;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.notifications.constants.push.NotificationType;
import com.facebook.push.constants.PushProperty;
import java.util.concurrent.TimeUnit;

/* loaded from: B9z.class */
public final class B9z extends D0d {
    public 1BY A00;
    public C00i A01;
    public C00i A02;
    public C00i A03;
    public C00i A04;
    public C00i A05;

    @Override // X.DHp
    public void BLv(Bundle bundle, C7a c7a) {
        S2A s2a = (S2A) BI7.A00((BI7) c7a.A02, ActionId.RTMP_PACKET_RECEIVED);
        long Av1 = 1BK.A0R(this.A03).Av1(1G3.A01(C2bv.A0K, s2a.pageId.toString()), -1);
        Long l = s2a.pushTimestamp;
        if (l == null || Av1 <= TimeUnit.SECONDS.toMillis(l.longValue())) {
            Blv blv = (Blv) this.A04.get();
            if (blv.A00.A0A() || !blv.A01.AZk(36316761691400678L)) {
                return;
            }
            PushProperty pushProperty = new PushProperty(4rH.A0L, null, s2a.messageId, NotificationType.A4W.toString(), s2a.senderId.toString(), System.currentTimeMillis(), AbK.A06(s2a.pushTimestamp));
            C5ap c5ap = C5ap.A2W;
            String str = s2a.senderProfPicUrl;
            String str2 = s2a.title;
            PageMessageNotification pageMessageNotification = new PageMessageNotification(c5ap, pushProperty, s2a.messageId, null, s2a.pageId.toString(), s2a.pageName, s2a.pageProfPicUrl, s2a.senderId.toString(), s2a.senderName, str, s2a.body, str2, null);
            ((C04274ai) this.A05.get()).A06(1BK.A04(this.A02), 1Fw.A05(this.A00), pageMessageNotification);
            ((C5e0) this.A01.get()).A07(((MessagingNotification) pageMessageNotification).A02);
        }
    }
}
