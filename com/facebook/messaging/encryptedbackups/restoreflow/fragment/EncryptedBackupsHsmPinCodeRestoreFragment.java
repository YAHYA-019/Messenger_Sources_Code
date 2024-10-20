package com.facebook.messaging.encryptedbackups.restoreflow.fragment;

import X.0Q8;
import X.11T;
import X.1Bn;
import X.1Hv;
import X.7zL;
import X.7zO;
import X.7zR;
import X.C3O6;
import X.FAn;
import X.FIu;
import X.GF6;
import android.content.Context;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import com.facebook.messaging.encryptedbackups.basefragment.BaseFragment;
import com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeRestoreFragment;
import com.facebook.messaging.encryptedbackups.nux.viewdata.EncryptedBackupsNuxViewData;

/* loaded from: EncryptedBackupsHsmPinCodeRestoreFragment.class */
public final class EncryptedBackupsHsmPinCodeRestoreFragment extends HsmPinCodeRestoreFragment implements GF6 {
    public FIu A00;
    public C3O6 A01;
    public EncryptedBackupsNuxViewData A02;
    public FAn A03;
    public InputMethodManager A04;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeRestoreFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        Context requireContext = requireContext();
        EncryptedBackupsNuxViewData encryptedBackupsNuxViewData = new EncryptedBackupsNuxViewData(BaseFragment.A06(this, 68827), requireContext);
        this.A02 = encryptedBackupsNuxViewData;
        encryptedBackupsNuxViewData.A02();
        this.A04 = (InputMethodManager) 1Hv.A02(requireContext, 100189);
        this.A03 = 7zR.A0Y();
        FIu fIu = (FIu) 7zO.A0l(this, 100011);
        11T.A0F(fIu, 0);
        this.A00 = fIu;
        this.A01 = (C3O6) 1Bn.A0A(68812);
    }

    @Override // com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeRestoreFragment
    public void A1o() {
        if (!A1l()) {
            super.A1o();
        } else {
            if (this.A03 == null) {
                7zL.A1D();
                throw 0Q8.createAndThrow();
            }
            7zR.A10(A1a(), this, "hsm_restore_locked_out_error");
        }
    }
}
