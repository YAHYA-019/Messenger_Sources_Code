package com.facebook.messaging.encryptedbackups.restoreflow.fragment;

import X.0Q8;
import X.11T;
import X.1Bn;
import X.7zO;
import X.9IY;
import X.9Ip;
import android.os.Bundle;
import com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment;

/* loaded from: EncryptedBackupsResetYourRecoveryCodeFragment.class */
public final class EncryptedBackupsResetYourRecoveryCodeFragment extends EncryptedBackupsBaseFragment {
    public 9IY A00;
    public 9Ip A01;

    @Override // com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A01 = new 9Ip(this);
        9IY r0 = (9IY) 1Bn.A0A(68840);
        this.A00 = r0;
        if (r0 == null) {
            11T.A0L("resetYourRecoveryCodeViewData");
            throw 0Q8.createAndThrow();
        }
        7zO.A0Z(r0.A00).A07("RESTORE_BACKUP_RESET_YOUR_RECOVERY_CODE_SCREEN_IMPRESSION");
    }
}