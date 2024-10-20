package com.facebook.messaging.communitymessaging.plugins.channellist.genaisuggestedchats.infobottomsheet;

import X.11T;
import X.1Iw;
import X.1LI;
import X.7zR;
import X.8VB;
import X.9NQ;
import X.CIp;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: GenAiSuggestedChatsInfoBottomSheetFragment.class */
public final class GenAiSuggestedChatsInfoBottomSheetFragment extends MigBottomSheetDialogFragment {
    public CIp A00;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A05(GenAiSuggestedChatsInfoBottomSheetFragment genAiSuggestedChatsInfoBottomSheetFragment, boolean z) {
        7zR.A0W().A04(new CommunityMessagingLoggerModel(null, null, String.valueOf(genAiSuggestedChatsInfoBottomSheetFragment.requireArguments().getLong("community_id_arg")), null, null, null, z ? "ok" : "hide_suggestions", "ai_channel_recs_nux", "ai_channel_recs_nux", "channel_list", null, null));
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        11T.A0F(r302, 0);
        return new 8VB(new 9NQ(r302, this), A1F());
    }
}
