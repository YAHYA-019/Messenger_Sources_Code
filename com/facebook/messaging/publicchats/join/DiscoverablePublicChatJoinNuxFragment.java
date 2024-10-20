package com.facebook.messaging.publicchats.join;

import X.0FI;
import X.1Bi;
import X.1Bq;
import X.1Br;
import X.1Iw;
import X.1LI;
import X.7zR;
import X.8Vq;
import X.9De;
import X.C1306Adj;
import X.C6mh;
import X.C9py;
import com.facebook.acra.constants.ActionId;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: DiscoverablePublicChatJoinNuxFragment.class */
public final class DiscoverablePublicChatJoinNuxFragment extends MigBottomSheetDialogFragment {
    public Long A00;
    public final 1Br A01 = 1Bq.A00(66640);

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return 9De.A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        return new 8Vq(C9py.A03(this, ActionId.ON_ATTACH_FRAGMENT), 7zR.A0b(requireContext()));
    }

    public void onDestroy() {
        int A02 = 0FI.A02(-350562264);
        C1306Adj.A03((C1306Adj) 1Bi.A03(82310), this.A00, 34, 9);
        ((C6mh) 1Br.A0B(this.A01)).A09("showing_join_nux_ended");
        super.onDestroy();
        0FI.A08(-768092376, A02);
    }
}
