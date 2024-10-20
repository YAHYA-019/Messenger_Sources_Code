package X;

import com.facebook.messaging.communitymessaging.invitelink.model.CommunityMessagingInviteLinkData;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.4Ff, reason: invalid class name */
/* loaded from: 4Ff.class */
public final class C4Ff {
    public final 1Br A00 = 1Bq.A00(16520);

    public static final QuickPerformanceLogger A00(C4Ff c4Ff) {
        return (QuickPerformanceLogger) c4Ff.A00.A00.get();
    }

    public final void A01(CommunityMessagingInviteLinkData communityMessagingInviteLinkData, String str) {
        A00(this).markerAnnotate(231285116, "end_reason", str);
        A00(this).markerAnnotate(231285116, "invite_group_id", String.valueOf(communityMessagingInviteLinkData.A0E));
        A00(this).markerAnnotate(231285116, "invite_community_id", String.valueOf(communityMessagingInviteLinkData.A0B));
        A00(this).markerEnd(231285116, (short) 4);
    }

    public final void A02(Long l, Long l2, String str) {
        A00(this).markerAnnotate(231285116, "end_reason", str);
        if (l2 != null) {
            A00(this).markerAnnotate(231285116, "invite_group_id", l2.longValue());
        }
        if (l != null) {
            A00(this).markerAnnotate(231285116, "invite_community_id", l.longValue());
        }
        A00(this).markerEnd(231285116, (short) 3);
    }

    public final void A03(String str) {
        A00(this).markerPoint(231285116, str);
    }
}
