package com.facebook.messaging.communitymessaging.plugins.communitymessagingdisabling.communitymessagingdisablingbottomsheet;

import X.0FI;
import X.11T;
import X.1Br;
import X.1Iw;
import X.1LI;
import X.AbG;
import X.AbJ;
import X.BT2;
import X.BdC;
import X.Bkq;
import X.C3T9;
import X.QHq;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.communitymessaging.plugins.channellist.clickhandler.joined.JoinedChannelClickImplementation;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: CommunityMessagingDisablingBottomSheetDialogFragment.class */
public final class CommunityMessagingDisablingBottomSheetDialogFragment extends MigBottomSheetDialogFragment {
    public static final BT2 A06 = new Object();
    public Bkq A00;
    public boolean A01;
    public String A02;
    public String A03;
    public String A04;
    public final 1Br A05 = AbG.A0c();

    public static final void A05(CommunityMessagingDisablingBottomSheetDialogFragment communityMessagingDisablingBottomSheetDialogFragment, String str) {
        AbJ.A0O(communityMessagingDisablingBottomSheetDialogFragment.A05).A04(new CommunityMessagingLoggerModel(null, null, communityMessagingDisablingBottomSheetDialogFragment.A02, communityMessagingDisablingBottomSheetDialogFragment.A04, null, null, str, "cm_offboarding_interstitial", null, "channel_list", null, null));
    }

    public void A14(Bundle bundle, LayoutInflater layoutInflater, View view, ViewGroup viewGroup) {
        11T.A0F(layoutInflater, 0);
        super.A14(bundle, layoutInflater, view, viewGroup);
        AbJ.A0O(this.A05).A03(new CommunityMessagingLoggerModel(null, null, this.A02, this.A04, null, null, "surface_impression", "cm_offboarding_interstitial", null, "channel_list", null, null));
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        return new QHq(new BdC(this), A1F(), this.A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(55055382);
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = this.mArguments;
        }
        String str = null;
        this.A02 = bundle != null ? bundle.getString("COMMUNITY_ID") : null;
        this.A04 = bundle != null ? bundle.getString("GROUP_ID") : null;
        if (bundle != null) {
            str = bundle.getString("DISABLE_DATE");
        }
        this.A03 = str;
        0FI.A08(-1677670703, A02);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        11T.A0F(dialogInterface, 0);
        super/*X.0D2*/.onDismiss(dialogInterface);
        if (!this.A01) {
            A05(this, "dismiss");
        }
        Bkq bkq = this.A00;
        if (bkq != null) {
            JoinedChannelClickImplementation joinedChannelClickImplementation = bkq.A01;
            ((C3T9) 1Br.A0B(joinedChannelClickImplementation.A04)).A02(joinedChannelClickImplementation.A06, joinedChannelClickImplementation.A07, null, bkq.A00);
        }
    }
}
