package com.facebook.messaging.encryptedbackups.restoreflow.fragment;

import X.0Q8;
import X.11T;
import X.1Bn;
import X.7zO;
import X.9Ia;
import X.9In;
import android.os.Bundle;
import com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment;

/* loaded from: EncryptedBackupsHsmPinTryAgainFragment.class */
public final class EncryptedBackupsHsmPinTryAgainFragment extends EncryptedBackupsBaseFragment {
    public 9Ia A00;
    public 9In A01;

    @Override // com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A01 = new 9In(this);
        9Ia r0 = (9Ia) 1Bn.A0A(68838);
        this.A00 = r0;
        if (r0 == null) {
            11T.A0L("hsmPinTryAgainViewData");
            throw 0Q8.createAndThrow();
        }
        7zO.A0Z(r0.A00).A07("PIN_CODE_RESTORE_LOCKED_SCREEN");
    }
}
