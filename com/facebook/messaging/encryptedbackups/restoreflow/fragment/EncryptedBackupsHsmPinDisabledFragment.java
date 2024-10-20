package com.facebook.messaging.encryptedbackups.restoreflow.fragment;

import X.0Q8;
import X.11T;
import X.1Bn;
import X.7zO;
import X.9IZ;
import X.9Il;
import X.FIu;
import android.os.Bundle;
import com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment;

/* loaded from: EncryptedBackupsHsmPinDisabledFragment.class */
public final class EncryptedBackupsHsmPinDisabledFragment extends EncryptedBackupsBaseFragment {
    public FIu A00;
    public 9IZ A01;
    public 9Il A02;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        9IZ r0 = (9IZ) 1Bn.A0A(68836);
        this.A01 = r0;
        if (r0 == null) {
            11T.A0L("hsmPinDisabledViewData");
            throw 0Q8.createAndThrow();
        }
        7zO.A0Z(r0.A00).A07("RESTORE_PIN_BLOCKED_SCREEN_IMPRESSION");
        this.A00 = (FIu) 7zO.A0l(this, 100011);
        this.A02 = new 9Il(this);
    }
}
