package com.facebook.messaging.publicchats.join;

import X.06Z;
import X.0FI;
import X.0Fy;
import X.0G2;
import X.11T;
import X.1BK;
import X.1BM;
import X.1BY;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1HG;
import X.1Iw;
import X.1LI;
import X.7zP;
import X.7zU;
import X.7zV;
import X.8Xg;
import X.8ZU;
import X.8ZV;
import X.8ZW;
import X.9lB;
import X.9tV;
import X.AR2;
import X.AnonymousClass001;
import X.C06w;
import X.C06z;
import X.C1306Adj;
import X.C1zm;
import X.C72;
import X.C96j;
import X.MRk;
import X.QGW;
import X.RJS;
import X.Rr0;
import X.Rr1;
import X.SFi;
import X.SFj;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.enums.GraphQLMessengerGroupThreadSubType;
import com.facebook.messaging.groups.invitelink.join.BaseGroupInviteLinkJoinFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import java.util.List;

/* loaded from: ChannelNotificationGroupInviteFragment.class */
public final class ChannelNotificationGroupInviteFragment extends BaseGroupInviteLinkJoinFragment {
    public static final /* synthetic */ C06z[] A08 = {new 0Fy(ChannelNotificationGroupInviteFragment.class, "channelId", "getChannelId()J", 0), new C06w(ChannelNotificationGroupInviteFragment.class, "groupInviteLinkLogger", "getGroupInviteLinkLogger()Lcom/facebook/messaging/groups/invitelink/logs/GroupInviteLinkLogger;", 0), new C06w(ChannelNotificationGroupInviteFragment.class, "socialChannelLogger", "getSocialChannelLogger()Lcom/facebook/messaging/publicchats/logger/DiscoverablePublicChatLogger;", 0), new C06w(ChannelNotificationGroupInviteFragment.class, "broadcastChannelLogger", "getBroadcastChannelLogger()Lcom/facebook/messaging/publicchats/broadcastchats/logger/DiscoverablePublicBroadcastChatLogger;", 0), new C06w(ChannelNotificationGroupInviteFragment.class, "discoverablePublicChatPerfLogger", "getDiscoverablePublicChatPerfLogger()Lcom/facebook/messaging/publicchats/logger/perf/DiscoverablePublicChatPerfLogger;", 0)};
    public FbUserSession A00;
    public boolean A01;
    public boolean A02;
    public final 0G2 A07 = new Object();
    public final 1Br A05 = 1HG.A01(this, 68176);
    public final 1Br A06 = 1Bq.A00(82310);
    public final 1Br A03 = 1Bq.A00(82689);
    public final 1Br A04 = 1Bq.A00(66640);

    public static final long A05(ChannelNotificationGroupInviteFragment channelNotificationGroupInviteFragment) {
        return AnonymousClass001.A05(channelNotificationGroupInviteFragment.A07.BIk(channelNotificationGroupInviteFragment, A08[0]));
    }

    public static final String A08(ChannelNotificationGroupInviteFragment channelNotificationGroupInviteFragment) {
        int i;
        if (channelNotificationGroupInviteFragment.A02) {
            i = 6;
        } else {
            if (channelNotificationGroupInviteFragment.A01) {
                return "public_chats:direct_invite_accept_notification";
            }
            i = 7;
        }
        return MRk.A00(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A0C(Context context, ChannelNotificationGroupInviteFragment channelNotificationGroupInviteFragment) {
        ThreadKey threadKey = channelNotificationGroupInviteFragment.A1M().A05;
        if (threadKey != null) {
            GraphQLMessengerGroupThreadSubType graphQLMessengerGroupThreadSubType = 7zU.A0K(channelNotificationGroupInviteFragment) == C96j.A05 ? GraphQLMessengerGroupThreadSubType.A07 : GraphQLMessengerGroupThreadSubType.A08;
            C1zm c1zm = new C1zm();
            ThreadKey threadKey2 = channelNotificationGroupInviteFragment.A1M().A05;
            if (threadKey2 == null) {
                throw 1BK.A0h();
            }
            ThreadSummary A0K = 7zV.A0K(graphQLMessengerGroupThreadSubType, channelNotificationGroupInviteFragment, threadKey2, c1zm);
            C72 c72 = (C72) 1Bn.A0E(context, (1BY) null, 82502);
            06Z parentFragmentManager = channelNotificationGroupInviteFragment.getParentFragmentManager();
            List A0x = 7zP.A0x(parentFragmentManager);
            int size = A0x.size();
            if (size > 0) {
                parentFragmentManager = ((Fragment) A0x.get(size - 1)).getChildFragmentManager();
                11T.A0D(parentFragmentManager);
            }
            c72.A01(parentFragmentManager, threadKey, A0K);
        }
    }

    public static final void A0E(ChannelNotificationGroupInviteFragment channelNotificationGroupInviteFragment) {
        ((9lB) 1Br.A0B(channelNotificationGroupInviteFragment.A05)).A02();
        ((C1306Adj) 1Br.A0B(channelNotificationGroupInviteFragment.A06)).A0E();
        channelNotificationGroupInviteFragment.A0p();
    }

    public static final void A0F(ChannelNotificationGroupInviteFragment channelNotificationGroupInviteFragment, String str) {
        channelNotificationGroupInviteFragment.A1N();
        channelNotificationGroupInviteFragment.A1Q(str, A08(channelNotificationGroupInviteFragment), new AR2(channelNotificationGroupInviteFragment, 12), new AR2(channelNotificationGroupInviteFragment, 13));
    }

    public static final void A0G(ChannelNotificationGroupInviteFragment channelNotificationGroupInviteFragment, boolean z) {
        if (7zU.A0K(channelNotificationGroupInviteFragment) == C96j.A06) {
            ((C1306Adj) 1Br.A0B(channelNotificationGroupInviteFragment.A06)).A0K(Long.valueOf(A05(channelNotificationGroupInviteFragment)), A08(channelNotificationGroupInviteFragment), channelNotificationGroupInviteFragment.A1M().A0L, z);
        }
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        8ZW r310;
        if (7zV.A1B(this)) {
            if (7zU.A0K(this) == C96j.A06) {
                r310 = new 8ZW(new SFj(this), new 9tV(this, 4), A1M(), A1F());
            } else {
                if (7zU.A0K(this) != C96j.A05) {
                    throw AnonymousClass001.A0N("Invalid paused channel type when showing bottom sheet");
                }
                r310 = new 8ZU(new SFi(this), new 9tV(this, 3), A1M(), A1F());
            }
        } else if (this.A01) {
            r310 = new QGW(A1M(), new RJS(this), A1F());
        } else {
            if (!this.A02) {
                throw AnonymousClass001.A0N("Invalid channel invite type");
            }
            if (7zU.A0K(this) == C96j.A06) {
                r310 = new 8ZV(A1M(), new Rr1(this), A1F());
            } else {
                if (7zU.A0K(this) != C96j.A05) {
                    throw AnonymousClass001.A0N("Invite is not a broadcast or social channel");
                }
                r310 = new 8Xg(A1M(), new Rr0(this), A1F());
            }
        }
        return (1LI) r310;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.groups.invitelink.join.BaseGroupInviteLinkJoinFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        String string;
        int A02 = 0FI.A02(1234975249);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        boolean z = false;
        this.A01 = bundle2 != null ? bundle2.getBoolean("arg_is_channel_direct_invite") : false;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            z = bundle3.getBoolean("arg_is_new_channel_notif");
        }
        this.A02 = z;
        Bundle bundle4 = this.mArguments;
        if (bundle4 == null || (string = bundle4.getString("arg_channel_id")) == null) {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A08(-1579295785, A02);
            throw A0h;
        }
        this.A07.Cvy(this, Long.valueOf(Long.parseLong(string)), A08[0]);
        this.A00 = 1BM.A01(this);
        0FI.A08(-2085922692, A02);
    }
}
