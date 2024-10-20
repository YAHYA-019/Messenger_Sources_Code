package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.notify.VideoChatLinkJoinAttemptNotification;

/* loaded from: C5j.class */
public final class C5j {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1De A06;

    public C5j(1De r302) {
        this.A06 = r302;
        1BY r0 = r302.A00;
        this.A05 = 1Bu.A03(r0, 68463);
        this.A02 = 1Bu.A03(r0, 49358);
        this.A04 = 7zM.A0c();
        this.A03 = AbH.A0e(r0);
        this.A01 = 1Bq.A00(49458);
        this.A00 = 7zM.A0d();
    }

    public final void A00(Context context, FbUserSession fbUserSession, VideoChatLinkJoinAttemptNotification videoChatLinkJoinAttemptNotification) {
        boolean A1W = 1BL.A1W(fbUserSession, context);
        11T.A0F(videoChatLinkJoinAttemptNotification, 2);
        C10914uy A00 = ((C10904ux) 1Br.A0B(this.A02)).A00(context, null, videoChatLinkJoinAttemptNotification, 10065);
        String str = videoChatLinkJoinAttemptNotification.A02;
        A00.A0M(str);
        A00.A0C(1Br.A00(this.A00));
        A00.A0g = A1W;
        C00i c00i = this.A01.A00;
        String A01 = ((51X) c00i.get()).A01("RTC_MEETUPS_NOTIFICATION_JOIN_ACTION");
        11T.A0A(A01);
        Intent A0B = AbK.A0B(context, A01);
        A0B.putExtra("VIDEO_CHAT_LINK", videoChatLinkJoinAttemptNotification.A01);
        C00i c00i2 = this.A03.A00;
        PendingIntent A04 = ((5qG) c00i2.get()).A04(A0B, videoChatLinkJoinAttemptNotification, 0S2.A01, "ROOM_JOIN_ATTEMPT_NOTIF", 10065);
        String A012 = ((51X) c00i.get()).A01("RTC_MEETUPS_NOTIFICATION_DISMISS_ACTION");
        11T.A0A(A012);
        Intent A0B2 = AbK.A0B(context, A012);
        String str2 = videoChatLinkJoinAttemptNotification.A00;
        A0B2.putExtra("CONFERENCE_NAME", str2);
        String str3 = videoChatLinkJoinAttemptNotification.A01;
        A0B2.putExtra("VIDEO_CHAT_LINK", str3);
        PendingIntent A07 = ((5qG) c00i2.get()).A07(A0B2, videoChatLinkJoinAttemptNotification, "ROOM_JOIN_ATTEMPT_NOTIF", 10065);
        AbL.A0p(A00, this.A04);
        AbO.A0I(context, A00, str, A1W);
        A00.A0A(2);
        A00.A0D(A04);
        A00.A0E(A07);
        4aO A0T = AbJ.A0T(this.A05);
        Notification A072 = A00.A07();
        11T.A0A(A072);
        A0T.A02(10065, A072);
        2R2 A013 = IFc.A01((IFc) 1Lo.A04(context, fbUserSession, (1BY) null, 67965), "meetup_notification_shown");
        if (A013 != null) {
            A013.A0E("links_surface", "vcl_meetups_notification");
            A013.A0E("links_link_url", str3);
            A013.A0E("conference_name", str2);
            A013.BZL();
        }
        4zI.A03.A05("VideoChatLinksAnalyticsLogger", "Event: %s. surface: %s. link: %s", new Object[]{"meetup_notification_shown", "vcl_meetups_notification", str3});
        videoChatLinkJoinAttemptNotification.A03 = A1W;
    }
}
