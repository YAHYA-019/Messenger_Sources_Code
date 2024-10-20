package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.communitymessaging.model.CommunityExtraData;
import com.facebook.messaging.communitymessaging.plugins.memberlistitem.blockedmemberslistitem.BlockedMembersListItemImplementation;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.payments.p2m.nux.P2mNuxFragment;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: Cx0.class */
public final class Cx0 implements AnonymousClass553 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    public Cx0(Fragment fragment, 1Br r303, CommunityExtraData communityExtraData, BlockedMembersListItemImplementation blockedMembersListItemImplementation, String str, String str2) {
        this.A00 = 0;
        this.A04 = blockedMembersListItemImplementation;
        this.A02 = communityExtraData;
        this.A06 = str;
        this.A05 = str2;
        this.A03 = fragment;
        this.A01 = r303;
    }

    public Cx0(ThreadKey threadKey, ThreadSummary threadSummary, C6gj c6gj, P2mNuxFragment p2mNuxFragment) {
        String A00 = DKB.A00(63);
        this.A00 = 1;
        String A002 = 4YT.A00(1233);
        this.A01 = p2mNuxFragment;
        this.A04 = c6gj;
        this.A02 = threadKey;
        this.A03 = threadSummary;
        this.A05 = A002;
        this.A06 = A00;
    }

    @Override // X.AnonymousClass553
    public final void onClick(View view) {
        if (this.A00 != 0) {
            7zL.A1Q(this.A01);
            ((F8C) 1Br.A0B(((C6gj) this.A04).A02)).A01((ThreadKey) this.A02, (ThreadSummary) this.A03, this.A05, this.A06, "QUICK_PROMOTION");
            return;
        }
        BlockedMembersListItemImplementation blockedMembersListItemImplementation = (BlockedMembersListItemImplementation) this.A04;
        AdC adC = (AdC) 7zO.A0p(this.A01);
        CommunityExtraData communityExtraData = (CommunityExtraData) this.A02;
        String str = this.A06;
        String str2 = this.A05;
        11T.A0D(str2);
        LifecycleOwner viewLifecycleOwner = ((Fragment) this.A03).getViewLifecycleOwner();
        String str3 = communityExtraData.A06;
        long parseLong = Long.parseLong(str3);
        long parseLong2 = Long.parseLong(str);
        long parseLong3 = Long.parseLong(str2);
        long j = communityExtraData.A00;
        adC.A08((ParcelableSecondaryData) null, (Long) null, 1, parseLong, parseLong2, parseLong3, j, false, false).observe(viewLifecycleOwner, new FZ3(str, blockedMembersListItemImplementation, 0));
        ((C1296Ad8) blockedMembersListItemImplementation.A02.get()).A04(new CommunityMessagingLoggerModel(null, null, String.valueOf(j), str3, null, null, "unblock_button", "blocked_list", "community_admin_unblock_members", "community_member_list", null, null));
    }
}
