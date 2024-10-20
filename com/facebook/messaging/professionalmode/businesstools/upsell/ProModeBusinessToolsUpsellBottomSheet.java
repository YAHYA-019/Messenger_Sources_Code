package com.facebook.messaging.professionalmode.businesstools.upsell;

import X.11T;
import X.1Bn;
import X.1Iw;
import X.1LI;
import X.9De;
import X.C37r;
import X.CFv;
import X.CoM;
import X.DHJ;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: ProModeBusinessToolsUpsellBottomSheet.class */
public final class ProModeBusinessToolsUpsellBottomSheet extends MigBottomSheetDialogFragment {
    public final DHJ A00 = new CoM(this, 0);
    public final DHJ A01 = new CoM(this, 1);

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37r(90);
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        11T.A0F(r302, 0);
        1Bn.A0A(83291);
        return CFv.A00(r302, this.A00, A1F(), "settings");
    }
}
