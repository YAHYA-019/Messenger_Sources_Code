package com.facebook.messaging.encryptedbackups.nux.fragment;

import X.0Q8;
import X.11T;
import X.1Bi;
import X.1Br;
import X.9IR;
import X.C9cq;
import android.os.Bundle;

/* loaded from: EbInvalidPinResetFragment.class */
public final class EbInvalidPinResetFragment extends EbNuxPinSetupFragment {
    public 9IR A00;

    @Override // com.facebook.messaging.encryptedbackups.nux.fragment.EbNuxPinSetupFragment, com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeSetupBaseFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A00 = (9IR) 1Bi.A03(68897);
    }

    @Override // com.facebook.messaging.encryptedbackups.nux.fragment.EbNuxPinSetupFragment, com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeSetupBaseFragment
    public void A1o() {
        super.A1o();
        9IR r0 = this.A00;
        if (r0 == null) {
            11T.A0L("invalidPinResetPinViewData");
            throw 0Q8.createAndThrow();
        }
        ((C9cq) 1Br.A0B(r0.A00)).A00();
    }
}
