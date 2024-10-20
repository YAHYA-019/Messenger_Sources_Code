package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.base.activity.parcel.OpaqueParcelable;
import com.facebook.messaging.communitymessaging.invitelink.CommunityMessagingInviteLinkJoinBottomSheetFragment;
import com.facebook.messaging.communitymessaging.invitelink.joinv2.graphqlfetcher.JoinSheetCommunityDataGraphQlFetcher$JoinSheetGraphQlCommunityData;
import com.google.common.util.concurrent.SettableFuture;
import java.io.Serializable;

/* loaded from: AFp.class */
public final class AFp implements Runnable {
    public static final String __redex_internal_original_name = "CommunityMessagingJoinFlowHandler$initiateJoinFlow$1$1";
    public final /* synthetic */ C9mb A00;
    public final /* synthetic */ C8zq A01;
    public final /* synthetic */ SettableFuture A02;

    public AFp(C9mb c9mb, C8zq c8zq, SettableFuture settableFuture) {
        this.A02 = settableFuture;
        this.A00 = c9mb;
        this.A01 = c8zq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JoinSheetCommunityDataGraphQlFetcher$JoinSheetGraphQlCommunityData joinSheetCommunityDataGraphQlFetcher$JoinSheetGraphQlCommunityData = (JoinSheetCommunityDataGraphQlFetcher$JoinSheetGraphQlCommunityData) this.A02.get();
        if (joinSheetCommunityDataGraphQlFetcher$JoinSheetGraphQlCommunityData != null) {
            C9mb c9mb = this.A00;
            Parcelable A00 = C9gl.A00.A00(this.A01);
            AZE aze = c9mb.A0E;
            Parcelable parcelable = c9mb.A0H;
            String str = c9mb.A0I;
            Serializable serializable = c9mb.A02;
            0D2 communityMessagingInviteLinkJoinBottomSheetFragment = new CommunityMessagingInviteLinkJoinBottomSheetFragment();
            Bundle A05 = 1BK.A05();
            A05.putParcelable("arg_invite_link_data", A00);
            A05.putParcelable("arg_join_sheet_graph_ql_data", new OpaqueParcelable(joinSheetCommunityDataGraphQlFetcher$JoinSheetGraphQlCommunityData));
            A05.putParcelable("arg_entrypoint", parcelable);
            A05.putString("arg_entrypoint_logging", str);
            A05.putSerializable("arg_invite_send_source", serializable);
            communityMessagingInviteLinkJoinBottomSheetFragment.A02 = aze;
            communityMessagingInviteLinkJoinBottomSheetFragment.setArguments(A05);
            06Z r0 = c9mb.A01;
            if (C0D1.A01(r0)) {
                7zU.A14(communityMessagingInviteLinkJoinBottomSheetFragment, r0, "CommunityMessagingInviteLinkJoinBottomSheetFragment");
            }
        }
    }
}
