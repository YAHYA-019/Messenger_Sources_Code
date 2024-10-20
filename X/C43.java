package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import com.facebook.messaging.notify.PageAdminIncomingCallNotification;

/* loaded from: C43.class */
public final class C43 {
    public final 1De A00;
    public final 1Br A01;
    public final 1Br A02;

    public C43(1De r302) {
        this.A00 = r302;
        1BY r0 = r302.A00;
        this.A01 = 1Bu.A03(r0, 49358);
        this.A02 = 1Bu.A03(r0, 68463);
    }

    public final void A00(PendingIntent pendingIntent, PendingIntent pendingIntent2, Context context, PageAdminIncomingCallNotification pageAdminIncomingCallNotification) {
        boolean A1W = 1BL.A1W(pageAdminIncomingCallNotification, context);
        C10914uy A00 = ((C10904ux) 1Br.A0B(this.A01)).A00(context, null, null, 10068);
        A00.A0L(pageAdminIncomingCallNotification.A02);
        String str = pageAdminIncomingCallNotification.A01;
        if (str == null || str.length() <= 0) {
            str = 1BK.A0v(context, "Messenger", 2131964985);
        }
        A00.A0K(str);
        A00.A0D(pendingIntent);
        A00.A0E(pendingIntent2);
        A00.A0B(2132347260);
        ((C10924uz) A00).A03 = A1W ? 1 : 0;
        ((C10924uz) A00).A01 = AbG.A00(context);
        A00.A0N(A1W);
        Notification A07 = A00.A07();
        11T.A0A(A07);
        AbJ.A0T(this.A02).A02(10068, A07);
    }
}
