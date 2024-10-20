package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification;
import com.facebook.messaging.communitymessaging.notify.analytics.CommunityMessagingNotificationsLoggerModel;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;

/* renamed from: X.5e3, reason: invalid class name */
/* loaded from: 5e3.class */
public final class C5e3 {
    public static final CommunityMessagingNotificationsLoggerModel A00(BOA boa, CommunityMessagingNotification communityMessagingNotification, String str, String str2, java.util.Map map) {
        long parseLong = Long.parseLong(communityMessagingNotification.A06());
        long parseLong2 = Long.parseLong(communityMessagingNotification.A08());
        ThreadKey A04 = communityMessagingNotification.A04();
        long A0r = A04 != null ? A04.A0r() : 0L;
        String A01 = A01(((MessagingNotification) communityMessagingNotification).A01, communityMessagingNotification.A0B());
        String A0C = communityMessagingNotification.A0C();
        Long A0n = A0C != null ? 1BK.A0n(A0C) : null;
        String str3 = communityMessagingNotification.A02;
        String A07 = communityMessagingNotification.A07();
        PushProperty pushProperty = ((MessagingNotification) communityMessagingNotification).A02;
        return new CommunityMessagingNotificationsLoggerModel(BNr.A01, boa, null, Long.valueOf(parseLong), Long.valueOf(A0r), Long.valueOf(parseLong2), A0n, str, str2, A01, A07, pushProperty == null ? null : pushProperty.A0A, str3, map);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0011. Please report as an issue. */
    public static final String A01(C5ap c5ap, String str) {
        11T.A0F(str, 1);
        switch (c5ap.ordinal()) {
            case ActionId.QUEUED /* 48 */:
                return "messenger_community_chat";
            case ActionId.IN_PROGRESS /* 49 */:
                return "messenger_community_chat:mentions_and_replies";
            case 50:
                return "messenger_community_direct_invite_participation_control_approval";
            case ActionId.QUEUEING_BEGIN /* 54 */:
                return "messenger_community_reaction";
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                return "messenger_community_direct_invite_chat";
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                return 7zK.A00(363);
            case ActionId.PHOTO_CAPTURED /* 59 */:
                return str;
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
            case ActionId.COUNTER /* 61 */:
                return "messenger_community_direct_invite_to_member_community";
            case 63:
                return "messenger_community_direct_invite_to_nonmember_community";
            case 64:
                return "messenger_community_direct_invite_membership_request_approval";
            case ActionId.ANIMATION_END /* 93 */:
                return "msgr_cm_and_channel_invite_link_join";
            default:
                str = 1BK.A13(c5ap.stringValue);
                return str;
        }
    }

    public final CommunityMessagingNotificationsLoggerModel A02(CommunityMessagingNotification communityMessagingNotification) {
        long parseLong = Long.parseLong(communityMessagingNotification.A06());
        long parseLong2 = Long.parseLong(communityMessagingNotification.A08());
        ThreadKey A04 = communityMessagingNotification.A04();
        long A0r = A04 != null ? A04.A0r() : 0L;
        String A01 = A01(((MessagingNotification) communityMessagingNotification).A01, communityMessagingNotification.A0B());
        String A0C = communityMessagingNotification.A0C();
        Long A0n = A0C != null ? 1BK.A0n(A0C) : null;
        String str = communityMessagingNotification.A02;
        String A07 = communityMessagingNotification.A07();
        PushProperty pushProperty = ((MessagingNotification) communityMessagingNotification).A02;
        String str2 = pushProperty == null ? null : pushProperty.A0A;
        return new CommunityMessagingNotificationsLoggerModel(BNr.A01, BOA.A01, null, Long.valueOf(parseLong), Long.valueOf(A0r), Long.valueOf(parseLong2), A0n, "chat_preview_open", "notification", A01, A07, str2, str, null);
    }

    public final CommunityMessagingNotificationsLoggerModel A03(CommunityMessagingNotification communityMessagingNotification, java.util.Map map) {
        long parseLong = Long.parseLong(communityMessagingNotification.A06());
        long parseLong2 = Long.parseLong(communityMessagingNotification.A08());
        ThreadKey A04 = communityMessagingNotification.A04();
        long A0r = A04 != null ? A04.A0r() : 0L;
        String A01 = A01(((MessagingNotification) communityMessagingNotification).A01, communityMessagingNotification.A0B());
        String A0C = communityMessagingNotification.A0C();
        Long A0n = A0C != null ? 1BK.A0n(A0C) : null;
        String str = communityMessagingNotification.A02;
        String A07 = communityMessagingNotification.A07();
        PushProperty pushProperty = ((MessagingNotification) communityMessagingNotification).A02;
        String str2 = pushProperty == null ? null : pushProperty.A0A;
        return new CommunityMessagingNotificationsLoggerModel(BNr.A01, BOA.A01, null, Long.valueOf(parseLong), Long.valueOf(A0r), Long.valueOf(parseLong2), A0n, AbE.A00(464), "notification", A01, A07, str2, str, map);
    }

    public final CommunityMessagingNotificationsLoggerModel A04(CommunityMessagingNotification communityMessagingNotification, java.util.Map map) {
        long parseLong = Long.parseLong(communityMessagingNotification.A06());
        long parseLong2 = Long.parseLong(communityMessagingNotification.A08());
        ThreadKey A04 = communityMessagingNotification.A04();
        long A0r = A04 != null ? A04.A0r() : 0L;
        String A01 = A01(((MessagingNotification) communityMessagingNotification).A01, communityMessagingNotification.A0B());
        String A0C = communityMessagingNotification.A0C();
        Long valueOf = A0C != null ? Long.valueOf(Long.parseLong(A0C)) : null;
        String str = communityMessagingNotification.A02;
        String A07 = communityMessagingNotification.A07();
        PushProperty pushProperty = ((MessagingNotification) communityMessagingNotification).A02;
        String str2 = pushProperty == null ? null : pushProperty.A0A;
        return new CommunityMessagingNotificationsLoggerModel(BNr.A01, BOA.A01, communityMessagingNotification.A05(), Long.valueOf(parseLong), Long.valueOf(A0r), Long.valueOf(parseLong2), valueOf, "notification_click", "notification", A01, A07, str2, str, map);
    }

    public final CommunityMessagingNotificationsLoggerModel A05(CommunityMessagingNotification communityMessagingNotification, java.util.Map map) {
        long parseLong = Long.parseLong(communityMessagingNotification.A06());
        long parseLong2 = Long.parseLong(communityMessagingNotification.A08());
        ThreadKey A04 = communityMessagingNotification.A04();
        long A0r = A04 != null ? A04.A0r() : 0L;
        String A01 = A01(((MessagingNotification) communityMessagingNotification).A01, communityMessagingNotification.A0B());
        String A0C = communityMessagingNotification.A0C();
        Long valueOf = A0C != null ? Long.valueOf(Long.parseLong(A0C)) : null;
        String str = communityMessagingNotification.A02;
        String A07 = communityMessagingNotification.A07();
        PushProperty pushProperty = ((MessagingNotification) communityMessagingNotification).A02;
        String str2 = pushProperty == null ? null : pushProperty.A0A;
        return new CommunityMessagingNotificationsLoggerModel(BNr.A01, BOA.A01, null, Long.valueOf(parseLong), Long.valueOf(A0r), Long.valueOf(parseLong2), valueOf, "thread_open", "notification", A01, A07, str2, str, map);
    }
}
