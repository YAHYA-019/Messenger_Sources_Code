package com.facebook.messaging.communitymessaging.channelsummaryaigeneration.fragment;

import X.1Iw;
import X.1LI;
import X.7zN;
import X.8Yv;
import X.9De;
import X.C37s;
import X.REz;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: ChannelSummaryBottomSheetFragment.class */
public final class ChannelSummaryBottomSheetFragment extends MigBottomSheetDialogFragment {
    public String A00 = "";
    public final REz A01 = new REz(this);

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37s(60);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        this.A00 = String.valueOf(requireArguments().getString("gen_ai_channel_summary"));
        return new 8Yv(this.A01, A1F(), 7zN.A0s(this, 2131952648), this.A00);
    }
}
