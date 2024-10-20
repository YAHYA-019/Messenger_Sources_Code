package com.facebook.messaging.encryptedbackups.nux.fragment;

import X.0Q8;
import X.11T;
import X.7zR;
import X.C96q;
import X.C9uq;
import android.os.Bundle;

/* loaded from: GDriveMESoftNuxSetupFragment.class */
public final class GDriveMESoftNuxSetupFragment extends EncryptedBackupsGDriveSetupFragment {
    public C9uq A00;

    @Override // com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsGDriveSetupFragment, com.facebook.messaging.encryptedbackups.gdrive.fragment.GDriveSetupRestoreFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        C9uq A0X = 7zR.A0X();
        this.A00 = A0X;
        if (A0X != null) {
            C9uq.A01(A0X, C96q.A0F, null, null);
            C9uq c9uq = this.A00;
            if (c9uq != null) {
                c9uq.A08("SETUP_GDRIVE_UPSELL_QP_SCREEN_IMPRESSION");
                C9uq c9uq2 = this.A00;
                if (c9uq2 != null) {
                    c9uq2.A09("GDriveIntroFragmentFromQP");
                    return;
                }
            }
        }
        11T.A0L("userFlowLogger");
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsGDriveSetupFragment, com.facebook.messaging.encryptedbackups.gdrive.fragment.GDriveSetupRestoreFragment
    public void A1b() {
        C9uq c9uq = this.A00;
        if (c9uq == null) {
            11T.A0L("userFlowLogger");
            throw 0Q8.createAndThrow();
        }
        c9uq.A08("SETUP_WITH_GDRIVE_CREATE_PIN_BUTTON_TAP");
        super.A1b();
    }
}
