package com.facebook.messaging.encryptedbackups.nux.fragment;

import X.0Q8;
import X.11T;
import X.1Bn;
import X.7zP;
import X.7zR;
import X.9UX;
import X.C95f;
import X.C9qq;
import X.FAn;
import android.os.Bundle;
import com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeSetupFragment;

/* loaded from: EbNuxPinSetupFragment.class */
public class EbNuxPinSetupFragment extends HsmPinCodeSetupFragment {
    public 9UX A00;
    public FAn A01;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeSetupBaseFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        FAn A0Y = 7zR.A0Y();
        11T.A0F(A0Y, 0);
        this.A01 = A0Y;
        9UX r0 = (9UX) 1Bn.A0A(68829);
        this.A00 = r0;
        if (r0 != null) {
            C9qq.A00(this, r0.A02, 32);
            9UX r02 = this.A00;
            if (r02 != null) {
                C9qq.A00(this, r02.A01, 33);
                return;
            }
        }
        11T.A0L("nuxPinSetupViewData");
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeSetupBaseFragment
    public void A1o() {
        9UX r0 = this.A00;
        if (r0 == null) {
            11T.A0L("nuxPinSetupViewData");
            throw 0Q8.createAndThrow();
        }
        7zP.A0O(r0.A03).A01(r0.A02, C95f.A04);
    }
}
