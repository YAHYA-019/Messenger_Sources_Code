package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification;
import com.facebook.messaging.notify.type.MessagingNotification;
import java.util.List;

/* loaded from: C5t.class */
public final class C5t {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Intent A02;
    public final /* synthetic */ Bundle A03;
    public final /* synthetic */ CommunityMessagingNotification A04;
    public final /* synthetic */ C8f A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;

    public C5t(Context context, Intent intent, Bundle bundle, CommunityMessagingNotification communityMessagingNotification, C8f c8f, String str, List list, int i) {
        this.A00 = i;
        this.A04 = communityMessagingNotification;
        this.A05 = c8f;
        this.A01 = context;
        this.A06 = str;
        this.A02 = intent;
        this.A03 = bundle;
        this.A07 = list;
    }

    public void A00(boolean z, String str) {
        11T.A0F(str, 1);
        if (z) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("CM Notification suppressed with notif id = ");
            A0k.append(this.A00);
            A0k.append(" and notif type = ");
            A0k.append(((MessagingNotification) this.A04).A01);
            0fH.A0j("CommunityMessagingNotificationHandlerDelegate", 1BL.A0u(", reason = ", str, A0k));
            return;
        }
        C8f c8f = this.A05;
        Context context = this.A01;
        CommunityMessagingNotification communityMessagingNotification = this.A04;
        int i = this.A00;
        B4X b4x = (B4X) c8f;
        DD8 dd8 = new DD8(context, this.A02, this.A03, communityMessagingNotification, b4x, this.A06, this.A07, i);
        String A09 = communityMessagingNotification.A09();
        if (A09 == null) {
            dd8.invoke(null);
            return;
        }
        C5q0 c5q0 = new C5q0((C45d) 1Br.A0B(((C8f) b4x).A04), communityMessagingNotification, new Cnx(context, b4x, dd8), b4x.A0A);
        ((C5q1) 1Br.A0B(((C8f) b4x).A00)).A00(c5q0);
        ((5bF) 1Br.A0B(b4x.A06)).A0D(c5q0, A09);
    }
}
