package com.facebook.messaging.groups.invitelink.join;

import X.06Z;
import X.11T;
import X.1BK;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1HG;
import X.1Iw;
import X.1LH;
import X.1LI;
import X.1PG;
import X.4YV;
import X.7zL;
import X.7zP;
import X.7zU;
import X.7zV;
import X.8Xg;
import X.8ZU;
import X.8ZV;
import X.8ZW;
import X.9dP;
import X.9tU;
import X.9tV;
import X.9xB;
import X.9xC;
import X.C1306Adj;
import X.C1zm;
import X.C2ga;
import X.C5yl;
import X.C6mh;
import X.C72;
import X.C96j;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.enums.GraphQLMessengerGroupThreadSubType;
import com.facebook.messaging.groups.invitelink.join.model.GroupInviteLinkData;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.publicchats.broadcastchats.join.DiscoverablePublicBroadcastChatJoinNuxFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* loaded from: GroupInviteLinkJoinFragment.class */
public final class GroupInviteLinkJoinFragment extends BaseGroupInviteLinkJoinFragment {
    public final String A04;
    public final 1Br A03 = 1HG.A01(this, 68176);
    public final 1Br A01 = 1Bq.A00(82310);
    public final 1Br A00 = 1Bq.A00(82689);
    public final 1Br A02 = 1Bq.A00(66640);

    public GroupInviteLinkJoinFragment(String str) {
        this.A04 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A05(Context context, GroupInviteLinkJoinFragment groupInviteLinkJoinFragment) {
        ThreadKey threadKey = groupInviteLinkJoinFragment.A1M().A05;
        if (threadKey != null) {
            GraphQLMessengerGroupThreadSubType graphQLMessengerGroupThreadSubType = 7zU.A0K(groupInviteLinkJoinFragment) == C96j.A06 ? GraphQLMessengerGroupThreadSubType.A08 : GraphQLMessengerGroupThreadSubType.A07;
            C1zm c1zm = new C1zm();
            ThreadKey threadKey2 = groupInviteLinkJoinFragment.A1M().A05;
            if (threadKey2 == null) {
                throw 1BK.A0h();
            }
            ThreadSummary A0K = 7zV.A0K(graphQLMessengerGroupThreadSubType, groupInviteLinkJoinFragment, threadKey2, c1zm);
            1PG r0 = (1PG) 1Bi.A03(66265);
            C72 c72 = (C72) 1Bn.A0E(context, (1BY) null, 82502);
            if (!r0.A05()) {
                int ordinal = A0K.BIz().ordinal();
                if (ordinal == 0) {
                    ThreadKey threadKey3 = A0K.A0n;
                    11T.A0A(threadKey3);
                    threadKey = C2ga.A00(threadKey3);
                } else {
                    if (ordinal != 1) {
                        throw 1BK.A1F();
                    }
                    ThreadKey threadKey4 = A0K.A0n;
                    11T.A0A(threadKey4);
                    threadKey = C2ga.A01(threadKey4);
                }
            }
            11T.A0D(threadKey);
            FbUserSession A0E = 4YV.A0E(context);
            06Z parentFragmentManager = groupInviteLinkJoinFragment.getParentFragmentManager();
            List A0x = 7zP.A0x(parentFragmentManager);
            int size = A0x.size();
            if (size > 0) {
                parentFragmentManager = ((Fragment) A0x.get(size - 1)).getChildFragmentManager();
                11T.A0D(parentFragmentManager);
            }
            c72.A00(parentFragmentManager, A0E, threadKey, A0K, C5yl.A0M);
        }
    }

    public static final void A08(GroupInviteLinkJoinFragment groupInviteLinkJoinFragment, String str) {
        groupInviteLinkJoinFragment.A1N();
        groupInviteLinkJoinFragment.A1Q(str, groupInviteLinkJoinFragment.A04, 7zL.A19(groupInviteLinkJoinFragment, 6), 7zL.A19(groupInviteLinkJoinFragment, 7));
    }

    public static final void A0C(GroupInviteLinkJoinFragment groupInviteLinkJoinFragment, boolean z) {
        if (7zU.A0K(groupInviteLinkJoinFragment) == C96j.A06) {
            ((C1306Adj) 1Br.A0B(groupInviteLinkJoinFragment.A01)).A0K(7zU.A0h(groupInviteLinkJoinFragment.A1M().A05), groupInviteLinkJoinFragment.A04, groupInviteLinkJoinFragment.A1M().A0L, z);
        }
        C6mh c6mh = (C6mh) 1Br.A0B(groupInviteLinkJoinFragment.A02);
        if (C6mh.A00(c6mh).isMarkerOn(946996509)) {
            C6mh.A00(c6mh).markerPoint(946996509, "channel_join_mutation_end");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.groups.invitelink.join.BaseGroupInviteLinkJoinFragment
    public void A14(Bundle bundle, LayoutInflater layoutInflater, View view, ViewGroup viewGroup) {
        super.A14(bundle, layoutInflater, view, viewGroup);
        9dP r0 = DiscoverablePublicBroadcastChatJoinNuxFragment.A02;
        requireContext();
        GroupInviteLinkData A1M = A1M();
        06Z parentFragmentManager = getParentFragmentManager();
        if (A1M.A0J || A1M.A04 != C96j.A05) {
            return;
        }
        9dP.A00(parentFragmentManager);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.9J8] */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        if (7zU.A0K(this) == C96j.A06) {
            if (7zV.A1B(this)) {
                return new 8ZW(new 9tU(this, 2), new 9tV(this, 1), A1M(), A1F());
            }
            return new 8ZV(A1M(), new 9xC(this), A1F());
        }
        if (7zU.A0K(this) != C96j.A05) {
            final GroupInviteLinkData A1M = A1M();
            final MigColorScheme A1F = A1F();
            final ?? r0 = new Object() { // from class: X.9J8
            };
            return new 1LH(r0, A1M, A1F) { // from class: X.8X1
                public final C9J8 A00;
                public final GroupInviteLinkData A01;
                public final MigColorScheme A02;

                {
                    11T.A0F(A1F, 2);
                    this.A01 = A1M;
                    this.A02 = A1F;
                    this.A00 = r0;
                }

                /* JADX WARN: Code restructure failed: missing block: B:28:0x03ff, code lost:
                
                    if (r0 == false) goto L30;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public X.1LI A0s(X.C2k5 r302) {
                    /*
                        Method dump skipped, instructions count: 1513
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C8X1.A0s(X.2k5):X.1LI");
                }
            };
        }
        if (7zV.A1B(this)) {
            return new 8ZU(new 9tU(this, 1), new 9tV(this, 0), A1M(), A1F());
        }
        return new 8Xg(A1M(), new 9xB(this), A1F());
    }
}
