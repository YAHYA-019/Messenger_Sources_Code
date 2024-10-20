package com.facebook.messaging.encryptedbackups.restoreflow.fragment;

import X.0Q8;
import X.11T;
import X.1Bn;
import X.7zO;
import X.9Id;
import X.9Im;
import android.os.Bundle;
import com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment;

/* loaded from: EncryptedBackupsHsmPinResetYourPinFragment.class */
public final class EncryptedBackupsHsmPinResetYourPinFragment extends EncryptedBackupsBaseFragment {
    public 9Id A00;
    public 9Im A01;

    @Override // com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A01 = new 9Im(this);
        9Id r0 = (9Id) 1Bn.A0A(68837);
        this.A00 = r0;
        if (r0 == null) {
            11T.A0L("pinResetYourPinViewData");
            throw 0Q8.createAndThrow();
        }
        7zO.A0Z(r0.A00).A07("RESTORE_BACKUP_HSM_PIN_CODE_RESET_YOUR_PIN_SCREEN_IMPRESSION");
    }
}
