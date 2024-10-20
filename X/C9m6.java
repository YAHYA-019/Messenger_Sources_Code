package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.invitelink.model.CommunityMessagingInviteLinkData;
import com.facebook.messaging.communitymessaging.model.CommunityMessagingFbGroupType;
import com.facebook.messaging.communitymessaging.model.CommunityMessagingJoinFlowEntrypoint;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9m6, reason: invalid class name */
/* loaded from: 9m6.class */
public final class C9m6 {
    public final Context A00;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final FbUserSession A07;
    public final 1Br A06 = 1Bq.A00(66630);
    public final 1Br A01 = 1Bq.A00(16457);
    public final 1Br A02 = 1Bq.A00(68708);

    public C9m6(Context context) {
        this.A00 = context;
        this.A03 = 1Bu.A01(context, 82282);
        this.A05 = 1Bu.A01(context, 68733);
        1Br A0Y = 7zM.A0Y();
        this.A04 = A0Y;
        this.A07 = 7zS.A0E(A0Y);
    }

    public static final String A00(C96j c96j, CommunityMessagingJoinFlowEntrypoint communityMessagingJoinFlowEntrypoint, String str) {
        boolean z = false;
        if (str == null || 0CU.A0O(str)) {
            if (c96j == C96j.A02 || c96j == C96j.A04) {
                z = true;
            }
            str = "messenger_community_messaging:unknown";
            if (z && communityMessagingJoinFlowEntrypoint != null) {
                int ordinal = communityMessagingJoinFlowEntrypoint.ordinal();
                if (ordinal == 0) {
                    return "messenger_community_messaging:link_share";
                }
                if (ordinal == 3) {
                    return "messenger_community_messaging:ia_inbox_community_and_chat_invite";
                }
                if (ordinal == 2) {
                    return "messenger_community_messaging:direct_invite_notification";
                }
                if (ordinal == 17) {
                    str = "messenger_community_messaging:group_join_chaining";
                }
            }
        }
        return str;
    }

    private final void A01(CommunityMessagingInviteLinkData communityMessagingInviteLinkData) {
        int i;
        Integer num = communityMessagingInviteLinkData.A08;
        Integer num2 = communityMessagingInviteLinkData.A07;
        11T.A0A(num2);
        boolean z = num == null || num == 0S2.A00 || num2 == 0S2.A0C || (7zV.A1A(this.A06) && num2 == 0S2.A01 && communityMessagingInviteLinkData.A04 == CommunityMessagingFbGroupType.A03);
        if (7zQ.A0e().A06() && z) {
            int ordinal = communityMessagingInviteLinkData.A03.ordinal();
            if (ordinal == 2) {
                i = 11;
            } else if (ordinal != 3 && ordinal != 4) {
                return;
            } else {
                i = 12;
            }
            A04(communityMessagingInviteLinkData, AQt.A01(communityMessagingInviteLinkData, this, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A02(com.facebook.messaging.communitymessaging.invitelink.model.CommunityMessagingInviteLinkData r301) {
        /*
            r0 = r301
            X.96j r0 = r0.A03
            r302 = r0
            r0 = r302
            X.11T.A0A(r0)
            r0 = r301
            com.facebook.messaging.communitymessaging.model.CommunityMessagingFbGroupType r0 = r0.A04
            r303 = r0
            r0 = r303
            X.11T.A0A(r0)
            X.96j r0 = X.C96j.A04
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = r302
            r1 = r304
            if (r0 != r1) goto L20
            r0 = 0
            return r0
        L20:
            com.facebook.messaging.communitymessaging.model.CommunityMessagingFbGroupType r0 = com.facebook.messaging.communitymessaging.model.CommunityMessagingFbGroupType.A03
            r302 = r0
            r0 = r301
            boolean r0 = r0.A0K
            r306 = r0
            r0 = r303
            r1 = r302
            if (r0 != r1) goto L48
            r0 = r306
            if (r0 == 0) goto L45
            r0 = r301
            java.lang.Integer r0 = r0.A07
            r302 = r0
        L39:
            java.lang.Integer r0 = X.0S2.A01
            r304 = r0
            r0 = r302
            r1 = r304
            if (r0 == r1) goto L45
            r0 = 1
            r305 = r0
        L45:
            r0 = r305
            return r0
        L48:
            r0 = r306
            if (r0 == 0) goto L45
            r0 = r301
            java.lang.Integer r0 = r0.A06
            r302 = r0
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9m6.A02(com.facebook.messaging.communitymessaging.invitelink.model.CommunityMessagingInviteLinkData):boolean");
    }

    public final void A03(EnumC3499Mfu enumC3499Mfu, CommunityMessagingInviteLinkData communityMessagingInviteLinkData, CommunityMessagingJoinFlowEntrypoint communityMessagingJoinFlowEntrypoint, Function1 function1) {
        Context context;
        int i;
        C96j c96j = communityMessagingInviteLinkData.A03;
        11T.A0A(c96j);
        if (7zV.A1A(this.A06) && communityMessagingInviteLinkData.A07 == 0S2.A01 && communityMessagingInviteLinkData.A04 == CommunityMessagingFbGroupType.A03) {
            7zU.A0w(this.A00, function1, 2131957439);
            A01(communityMessagingInviteLinkData);
        } else {
            if (communityMessagingInviteLinkData.A0L || communityMessagingInviteLinkData.A07 == 0S2.A01) {
                context = this.A00;
                i = 2131957439;
            } else if (A02(communityMessagingInviteLinkData)) {
                A01(communityMessagingInviteLinkData);
                if (c96j == C96j.A02) {
                    context = this.A00;
                    i = 2131957429;
                } else {
                    String str = communityMessagingInviteLinkData.A0E;
                    if (str == null || 6EX.A03(str)) {
                        context = this.A00;
                        i = 2131966206;
                    } else {
                        context = this.A00;
                        i = 2131957432;
                    }
                }
            }
            7zU.A0w(context, function1, i);
        }
        ((C9m5) 1Br.A0B(this.A02)).A03(enumC3499Mfu, communityMessagingInviteLinkData, communityMessagingJoinFlowEntrypoint, 0S2.A00, 0L);
    }

    public final void A04(CommunityMessagingInviteLinkData communityMessagingInviteLinkData, C00m c00m) {
        if (A02(communityMessagingInviteLinkData) || 7zV.A1A(this.A06)) {
            c00m.invoke();
            return;
        }
        String str = communityMessagingInviteLinkData.A0E;
        if (str != null) {
            ((C7f) 1Br.A0B(this.A03)).A01(this.A00, str);
        }
    }
}
