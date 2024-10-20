package com.facebook.messaging.communitymessaging.communitycreation.communitycreationeducationtipsbottomsheet;

import X.0FI;
import X.1Iw;
import X.1LI;
import X.8fV;
import X.9Hi;
import android.os.Bundle;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: CommunityCreationEducationTipsBottomSheetFragment.class */
public final class CommunityCreationEducationTipsBottomSheetFragment extends MigBottomSheetDialogFragment {
    public boolean A00;

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        return new 8fV(new 9Hi(this), A1F(), this.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-61393779);
        super.onCreate(bundle);
        this.A00 = requireArguments().getBoolean("agr_is_gcu");
        0FI.A08(-1284467844, A02);
    }
}
