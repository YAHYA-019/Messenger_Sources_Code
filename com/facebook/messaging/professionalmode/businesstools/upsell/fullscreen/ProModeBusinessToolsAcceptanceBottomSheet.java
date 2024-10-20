package com.facebook.messaging.professionalmode.businesstools.upsell.fullscreen;

import X.0Q8;
import X.11T;
import X.1Bn;
import X.1Iw;
import X.1LI;
import X.7zS;
import X.9De;
import X.C37r;
import X.CFv;
import X.DHJ;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: ProModeBusinessToolsAcceptanceBottomSheet.class */
public final class ProModeBusinessToolsAcceptanceBottomSheet extends MigBottomSheetDialogFragment {
    public DHJ A00;

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37r(90);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        11T.A0F(r302, 0);
        CFv cFv = (CFv) 1Bn.A0A(83291);
        MigColorScheme A0j = 7zS.A0j(this);
        DHJ dhj = this.A00;
        if (dhj != null) {
            return cFv.A01(this, r302, dhj, A0j, "full_screen_nux");
        }
        11T.A0L("clickHandler");
        throw 0Q8.createAndThrow();
    }
}
