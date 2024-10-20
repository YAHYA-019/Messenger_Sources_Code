package com.facebook.messaging.encryptedbackups.restoreflow.fragment;

import X.0Q8;
import X.11T;
import X.1Bn;
import X.7zO;
import X.9Ic;
import X.9Io;
import android.os.Bundle;
import com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment;

/* loaded from: EncryptedBackupsOtherStepsToRestoreFragment.class */
public final class EncryptedBackupsOtherStepsToRestoreFragment extends EncryptedBackupsBaseFragment {
    public 9Ic A00;
    public 9Io A01;

    @Override // com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A01 = new 9Io(this);
        9Ic r0 = (9Ic) 1Bn.A0A(68839);
        this.A00 = r0;
        if (r0 == null) {
            11T.A0L("otherStepsToRestoreViewData");
            throw 0Q8.createAndThrow();
        }
        7zO.A0Z(r0.A00).A07("RESTORE_END_OF_ROAD_SCREEN_IMPRESSION");
    }
}
