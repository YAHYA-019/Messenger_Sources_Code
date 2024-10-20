package com.facebook.messaging.encryptedbackups.nux.fragment;

import X.7zR;
import X.FAn;
import android.os.Bundle;

/* loaded from: EbSetupNuxRecoveryCodeFragment.class */
public final class EbSetupNuxRecoveryCodeFragment extends EbSetupRecoveryCodeFragment {
    public FAn A00;

    @Override // com.facebook.messaging.encryptedbackups.nux.fragment.EbSetupRecoveryCodeFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A00 = 7zR.A0Y();
        A1d().A09("EncryptedBackupsTlcRecoveryCodeGenerationFragment");
    }
}
