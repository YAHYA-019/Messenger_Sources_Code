package X;

import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;

/* renamed from: X.9gm, reason: invalid class name */
/* loaded from: 9gm.class */
public final class C9gm {
    public static final C9gm A00 = new Object();

    public final void A00(06Z r302, CIp cIp, long j) {
        7zR.A1N(r302, cIp);
        7zR.A0W().A03(new CommunityMessagingLoggerModel(null, null, String.valueOf(j), null, null, null, null, "ai_channel_recs_nux", "ai_channel_recs_nux", "channel_list", null, 7zM.A1F()));
        0D2 baseMigBottomSheetDialogFragment = new BaseMigBottomSheetDialogFragment();
        7zT.A1B(baseMigBottomSheetDialogFragment, "community_id_arg", Long.valueOf(j));
        baseMigBottomSheetDialogFragment.A00 = cIp;
        baseMigBottomSheetDialogFragment.A0m(r302, "GenAiSuggestedChatsInfoBottomSheetFragment");
    }
}
