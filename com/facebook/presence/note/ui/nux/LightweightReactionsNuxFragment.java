package com.facebook.presence.note.ui.nux;

import X.1Iw;
import X.1LI;
import X.8WK;
import X.9De;
import X.AQW;
import X.C37s;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: LightweightReactionsNuxFragment.class */
public final class LightweightReactionsNuxFragment extends MigBottomSheetDialogFragment {
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37s(90);
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        this.A02 = true;
        this.A03 = true;
        BaseMigBottomSheetDialogFragment.A06(this);
        return new 8WK(A1F(), new AQW(this, 8));
    }
}
