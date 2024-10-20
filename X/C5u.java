package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.facebook.messaging.notify.DirectMessageStorySeenNotification;

/* loaded from: C5u.class */
public final class C5u {
    public 1BY A00;
    public final C00i A02 = AbH.A0a();
    public final C00i A04 = 1BV.A01((1BY) null, 68463);
    public final C10904ux A06 = (C10904ux) 1Bn.A0E((Context) null, (1BY) null, 49358);
    public final 4iH A05 = (4iH) 1Bi.A03(99952);
    public final C00i A03 = 1BQ.A02(83227);
    public final 5qG A07 = (5qG) 1Bn.A0E((Context) null, (1BY) null, 49844);
    public final 1Ew A01 = AbI.A09();

    public C5u(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public void A00(Context context, DirectMessageStorySeenNotification directMessageStorySeenNotification) {
        24X A0D;
        0fH.A0j("DirectMessageStorySeenNotificationHandler", "showNotification: DirectMessageStorySeenNotification");
        String str = directMessageStorySeenNotification.A01;
        0fH.A0j("DirectMessageStorySeenNotificationHandler", "trying to build up the notification for DirectMessageStorySeenNotification");
        C10914uy A00 = this.A06.A00(context, null, directMessageStorySeenNotification, 10059);
        A00.A0M(str);
        boolean A1Z = AbH.A1Z(A00, 1BL.A08(this.A02));
        1Ew r0 = this.A01;
        String valueOf = r0.Auc() == null ? null : String.valueOf(r0.Auc().A0O);
        24X r02 = directMessageStorySeenNotification.A00;
        String str2 = null;
        if (r02 != null && (A0D = r02.A0D("dt")) != null) {
            str2 = A0D.A0I();
        }
        Intent intent = (valueOf == null || str2 == null) ? new Intent("android.intent.action.VIEW", 4YU.A0F("fb-messenger://threads")) : new Intent("android.intent.action.VIEW", 4iH.A01(valueOf, str2, "viewer_sheet", (String) null));
        intent.setFlags(67108864);
        AbJ.A1F(intent, A1Z);
        5qG r03 = this.A07;
        PendingIntent A08 = r03.A08(intent, directMessageStorySeenNotification, (String) null, 10059);
        if (A08 != null) {
            A00.A0D(A08);
            A00.A0E(r03.A0A(directMessageStorySeenNotification, (String) null, 10059));
        }
        ((C10924uz) A00).A01 = ((C45a) this.A03.get()).A00();
        AbO.A0I(context, A00, str, A1Z);
        A00.A0A(2);
        0fH.A0g(str, "DirectMessageStorySeenNotificationHandler", "Show notification for DirectMessageStorySeenNotification: msg %s");
        AbN.A0w(A00, this.A04, 10059);
    }
}
