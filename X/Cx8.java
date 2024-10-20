package X;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.communitymessaging.plugins.adminactions.promotetomoderatorinvitationbanner.PromoteToModeratorInvitationBannerImplementation;
import com.facebook.messaging.communitymessaging.plugins.communitymessagingdisabling.communitymessagingdisablingbanner.CommunityMessagingDisablingBannerImplementation;
import com.facebook.messaging.communitymessaging.plugins.communitymessagingdisabling.communitymessagingdisablingbottomsheet.CommunityMessagingDisablingBottomSheetDialogFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: Cx8.class */
public final class Cx8 implements AaA {
    public final int A00;
    public final Object A01;

    public Cx8(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BuC(View view) {
    }

    public void CDo(View view) {
        if (this.A00 == 0) {
            PromoteToModeratorInvitationBannerImplementation promoteToModeratorInvitationBannerImplementation = (PromoteToModeratorInvitationBannerImplementation) this.A01;
            ThreadKey threadKey = promoteToModeratorInvitationBannerImplementation.A09.A01;
            if (threadKey != null) {
                MutableLiveData A02 = ((AdC) 1Br.A0B(promoteToModeratorInvitationBannerImplementation.A07)).A02(2, threadKey.A0r());
                promoteToModeratorInvitationBannerImplementation.A01 = A02;
                CaD.A00(promoteToModeratorInvitationBannerImplementation.A05, A02, view, promoteToModeratorInvitationBannerImplementation, 19);
            }
        }
    }

    public void CJh(View view) {
        int i = this.A00;
        Object obj = this.A01;
        if (i == 0) {
            PromoteToModeratorInvitationBannerImplementation promoteToModeratorInvitationBannerImplementation = (PromoteToModeratorInvitationBannerImplementation) obj;
            ThreadKey threadKey = promoteToModeratorInvitationBannerImplementation.A09.A01;
            if (threadKey != null) {
                ((AdC) 1Br.A0B(promoteToModeratorInvitationBannerImplementation.A07)).A02(3, threadKey.A0r());
            }
            promoteToModeratorInvitationBannerImplementation.A08.Bks("cm_channel_list_moderator_invite_banner");
            return;
        }
        CommunityMessagingDisablingBannerImplementation communityMessagingDisablingBannerImplementation = (CommunityMessagingDisablingBannerImplementation) obj;
        C1296Ad8 A0O = AbJ.A0O(communityMessagingDisablingBannerImplementation.A08);
        String str = communityMessagingDisablingBannerImplementation.A0D;
        A0O.A04(new CommunityMessagingLoggerModel(null, null, str, communityMessagingDisablingBannerImplementation.A02, null, null, "learn_more_button", "cm_offboarding_channel_list_banner", null, "channel_list", null, null));
        BT2 bt2 = CommunityMessagingDisablingBottomSheetDialogFragment.A06;
        String str2 = communityMessagingDisablingBannerImplementation.A02;
        String str3 = communityMessagingDisablingBannerImplementation.A01;
        Bundle A05 = 1BK.A05();
        A05.putString("COMMUNITY_ID", str);
        A05.putString("GROUP_ID", str2);
        A05.putString("DISABLE_DATE", str3);
        2Ov communityMessagingDisablingBottomSheetDialogFragment = new CommunityMessagingDisablingBottomSheetDialogFragment();
        communityMessagingDisablingBottomSheetDialogFragment.setArguments(A05);
        06Z r0 = communityMessagingDisablingBannerImplementation.A04;
        if (C0D1.A01(r0)) {
            communityMessagingDisablingBottomSheetDialogFragment.A0m(r0, "CommunityMessagingDisablingBottomSheetDialogFragment");
        }
    }
}
