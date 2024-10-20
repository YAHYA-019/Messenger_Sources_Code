package X;

import com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification;
import com.facebook.messaging.communitymessaging.notify.analytics.CommunityMessagingNotificationsLoggerModel;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.mapbox.mapboxsdk.style.layers.Property;

/* renamed from: X.5e2, reason: invalid class name */
/* loaded from: 5e2.class */
public final class C5e2 {
    public static final C5e3 A01 = new Object();
    public final 1Br A00 = 1Bq.A00(16634);

    public static final void A00(C5e2 c5e2, CommunityMessagingNotificationsLoggerModel communityMessagingNotificationsLoggerModel) {
        String str;
        1UG A00 = 1UD.A00((04J) c5e2.A00.A00.get(), 1ZG.A01, 1BJ.A00(1196));
        if (A00.isSampled()) {
            A00.A5c(communityMessagingNotificationsLoggerModel.A01, "action");
            String str2 = communityMessagingNotificationsLoggerModel.A09;
            str = "";
            if (str2 == null) {
                str2 = str;
            }
            A00.A7R("event", str2);
            String str3 = communityMessagingNotificationsLoggerModel.A0A;
            if (str3 == null) {
                str3 = str;
            }
            A00.A7R("mid", str3);
            String str4 = communityMessagingNotificationsLoggerModel.A08;
            if (str4 == null) {
                str4 = str;
            }
            A00.A7R("community_notification_id", str4);
            String str5 = communityMessagingNotificationsLoggerModel.A0C;
            if (str5 == null) {
                str5 = str;
            }
            A00.A7R("notification_id", str5);
            String str6 = communityMessagingNotificationsLoggerModel.A0B;
            if (str6 == null) {
                str6 = str;
            }
            A00.A7R("notification_type", str6);
            A00.A5c(communityMessagingNotificationsLoggerModel.A02, "surface");
            03W r304 = communityMessagingNotificationsLoggerModel.A00;
            if (r304 == null) {
                r304 = 04R.A0G();
            }
            A00.A6J("extra", r304);
            Long l = communityMessagingNotificationsLoggerModel.A07;
            long j = 0;
            A00.A6H("thread_id", Long.valueOf(l != null ? l.longValue() : 0L));
            Long l2 = communityMessagingNotificationsLoggerModel.A04;
            A00.A6H("community_id", Long.valueOf(l2 != null ? l2.longValue() : 0L));
            Long l3 = communityMessagingNotificationsLoggerModel.A05;
            A00.A6H("group_id", Long.valueOf(l3 != null ? l3.longValue() : 0L));
            Long l4 = communityMessagingNotificationsLoggerModel.A06;
            if (l4 != null) {
                j = l4.longValue();
            }
            A00.A6H("sender_id", Long.valueOf(j));
            String str7 = communityMessagingNotificationsLoggerModel.A0D;
            A00.A7R(Property.SYMBOL_Z_ORDER_SOURCE, str7 != null ? str7 : "");
            A00.BZL();
        }
    }

    public final void A01(MessagingNotification messagingNotification) {
        CommunityMessagingNotificationsLoggerModel A00;
        if (!(messagingNotification instanceof CommunityMessagingNotification) || (A00 = CommunityMessagingNotificationsLoggerModel.A0E.A00(messagingNotification.A03())) == null) {
            return;
        }
        String str = A00.A0D;
        BOA boa = A00.A02;
        Long l = A00.A04;
        Long l2 = A00.A05;
        A00(this, new CommunityMessagingNotificationsLoggerModel(A00.A01, boa, null, l, A00.A07, l2, A00.A06, "notification_rendering_request_success", str, A00.A0B, A00.A08, A00.A0C, A00.A0A, A00.A00));
    }
}
