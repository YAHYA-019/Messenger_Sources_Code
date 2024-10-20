package com.facebook.messaging.communitymessaging.invitelink;

import X.0FI;
import X.0Q8;
import X.0S2;
import X.11T;
import X.1BM;
import X.1Bq;
import X.1Br;
import X.7zQ;
import X.7zS;
import X.9De;
import X.AZE;
import X.AnonymousClass001;
import X.C9m5;
import X.EnumC3499Mfu;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.invitelink.joinv2.graphqlfetcher.JoinSheetCommunityDataGraphQlFetcher$JoinSheetGraphQlCommunityData;
import com.facebook.messaging.communitymessaging.invitelink.model.CommunityMessagingInviteLinkData;
import com.facebook.messaging.communitymessaging.model.CommunityMessagingJoinFlowEntrypoint;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import java.io.Serializable;

/* loaded from: CommunityMessagingInviteLinkJoinBottomSheetFragment.class */
public final class CommunityMessagingInviteLinkJoinBottomSheetFragment extends MigBottomSheetDialogFragment {
    public EnumC3499Mfu A00;
    public FbUserSession A01;
    public AZE A02;
    public CommunityMessagingInviteLinkData A03;
    public CommunityMessagingJoinFlowEntrypoint A04;
    public ThreadSummary A05;
    public JoinSheetCommunityDataGraphQlFetcher$JoinSheetGraphQlCommunityData A06;
    public String A07;
    public final 1Br A08 = 1Bq.A00(68708);
    public final 1Br A09 = 1Bq.A00(68709);

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return 9De.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x00ad, code lost:
    
        if (X.6EX.A00.A04(java.lang.Long.parseLong(r0)) != false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A1K(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.communitymessaging.invitelink.CommunityMessagingInviteLinkJoinBottomSheetFragment.A1K(X.1Iw):X.1LI");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        Throwable A0N;
        int i;
        Parcelable.Creator creator;
        int A02 = 0FI.A02(1635382813);
        super.onCreate(bundle);
        this.A01 = 1BM.A01(this);
        Parcelable parcelable = requireArguments().getParcelable("arg_invite_link_data");
        if (parcelable != null) {
            this.A03 = (CommunityMessagingInviteLinkData) parcelable;
            Bundle requireArguments = requireArguments();
            EnumC3499Mfu enumC3499Mfu = null;
            Object obj = JoinSheetCommunityDataGraphQlFetcher$JoinSheetGraphQlCommunityData.class.getDeclaredField("CREATOR").get(null);
            if (!(obj instanceof Parcelable.Creator) || (creator = (Parcelable.Creator) obj) == null) {
                A0N = 7zS.A0v(JoinSheetCommunityDataGraphQlFetcher$JoinSheetGraphQlCommunityData.class);
                i = -1390080655;
            } else {
                Parcelable A0K = 7zQ.A0K(requireArguments, creator, JoinSheetCommunityDataGraphQlFetcher$JoinSheetGraphQlCommunityData.class, "arg_join_sheet_graph_ql_data");
                if (A0K != null) {
                    this.A06 = (JoinSheetCommunityDataGraphQlFetcher$JoinSheetGraphQlCommunityData) A0K;
                    this.A04 = (CommunityMessagingJoinFlowEntrypoint) requireArguments().getParcelable("arg_entrypoint");
                    this.A07 = requireArguments().getString("arg_entrypoint_logging");
                    Serializable serializable = requireArguments().getSerializable("arg_invite_send_source");
                    if (serializable instanceof EnumC3499Mfu) {
                        enumC3499Mfu = (EnumC3499Mfu) serializable;
                    }
                    this.A00 = enumC3499Mfu;
                    super.A03 = true;
                    BaseMigBottomSheetDialogFragment.A06(this);
                    0FI.A08(1901455154, A02);
                    return;
                }
                A0N = AnonymousClass001.A0N("Required value was null.");
                i = 176077751;
            }
        } else {
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = 319850083;
        }
        0FI.A08(i, A02);
        throw A0N;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(2062435940);
        super.onDestroy();
        if (isAdded() && !isStateSaved()) {
            C9m5 c9m5 = (C9m5) 1Br.A0B(this.A08);
            CommunityMessagingInviteLinkData communityMessagingInviteLinkData = this.A03;
            if (communityMessagingInviteLinkData == null) {
                11T.A0L("inviteLinkData");
                throw 0Q8.createAndThrow();
            }
            Integer num = 0S2.A00;
            c9m5.A03(this.A00, communityMessagingInviteLinkData, this.A04, num, 1L);
        }
        0FI.A08(-864967397, A02);
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        CommunityMessagingInviteLinkData communityMessagingInviteLinkData = this.A03;
        if (communityMessagingInviteLinkData == null) {
            11T.A0L("inviteLinkData");
            throw 0Q8.createAndThrow();
        }
        bundle.putParcelable("arg_invite_link_data", communityMessagingInviteLinkData);
    }
}
