package com.facebook.messaging.encryptedbackups.nux.fragment;

import X.0Q8;
import X.11T;
import X.7zR;
import X.8VQ;
import X.AQn;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C96q;
import X.C9uq;
import X.GF6;
import X.RFQ;
import android.os.Bundle;

/* loaded from: MeNuxCreatePinSoftBlockFragment.class */
public final class MeNuxCreatePinSoftBlockFragment extends EncryptedBackupsBaseFragment implements GF6 {
    public C9uq A00;
    public final C01i A01 = C01g.A00(C03i.A02, AQn.A01(this, 18));

    @Override // com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        C9uq A0X = 7zR.A0X();
        this.A00 = A0X;
        if (A0X != null) {
            C9uq.A01(A0X, C96q.A0F, null, null);
            C9uq c9uq = this.A00;
            if (c9uq != null) {
                c9uq.A09("EncryptedBackupsSetupFragmentFromEBUpsellQP");
                C9uq c9uq2 = this.A00;
                if (c9uq2 != null) {
                    c9uq2.A08("SETUP_PIN_UPSELL_QP_SCREEN_IMPRESSION");
                    return;
                }
            }
        }
        11T.A0L("userFlowLogger");
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1g() {
        A1c().A0y(new 8VQ((RFQ) this.A01.getValue(), A1f()));
    }

    @Override // X.GF6
    public boolean Bkd() {
        C9uq c9uq = this.A00;
        if (c9uq == null) {
            11T.A0L("userFlowLogger");
            throw 0Q8.createAndThrow();
        }
        c9uq.A06("SETUP_INTRO_SCREEN_CANCEL_TAP");
        return false;
    }
}
