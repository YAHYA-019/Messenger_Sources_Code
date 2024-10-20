package com.facebook.messaging.publicchats.broadcastchats.join;

import X.0FI;
import X.1Bq;
import X.1Br;
import X.1Iw;
import X.1LI;
import X.7zR;
import X.8Vp;
import X.9De;
import X.9dP;
import X.BOn;
import X.C6mh;
import X.C9py;
import X.CQo;
import com.facebook.acra.constants.ActionId;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: DiscoverablePublicBroadcastChatJoinNuxFragment.class */
public final class DiscoverablePublicBroadcastChatJoinNuxFragment extends MigBottomSheetDialogFragment {
    public static final 9dP A02 = new Object();
    public boolean A00 = true;
    public final 1Br A01 = 1Bq.A00(66640);

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return 9De.A00();
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void A1H() {
        if (this.A00) {
            CQo.A09(BOn.A0D, 7zR.A0a(), 205, ActionId.TIMEOUT);
            this.A00 = false;
        }
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void A1I() {
        if (this.A00) {
            CQo.A09(BOn.A0D, 7zR.A0a(), 205, ActionId.TIMEOUT);
            this.A00 = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        return new 8Vp(C9py.A03(this, ActionId.ASNYC_FAILED), 7zR.A0b(requireContext()));
    }

    public void onDestroy() {
        int A022 = 0FI.A02(-457537671);
        ((C6mh) 1Br.A0B(this.A01)).A09("showing_join_nux_ended");
        super.onDestroy();
        0FI.A08(-262800412, A022);
    }
}
