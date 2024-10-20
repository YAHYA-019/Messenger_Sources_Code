package com.facebook.messaging.encryptedbackups.nux.activity;

import X.1Bn;
import X.C05w;
import X.GF6;
import com.facebook.base.fragment.DefaultNavigableFragmentController;

/* loaded from: EncryptedBackupFragmentController.class */
public final class EncryptedBackupFragmentController extends DefaultNavigableFragmentController {
    /* JADX WARN: Multi-variable type inference failed */
    public boolean A1X() {
        if (getContext() != null) {
            1Bn.A0A(68875);
            C05w A0Y = getChildFragmentManager().A0Y(2131365350);
            if (A0Y != null && (A0Y instanceof GF6)) {
                ((GF6) A0Y).Bkd();
            }
        }
        return super.A1X();
    }
}
