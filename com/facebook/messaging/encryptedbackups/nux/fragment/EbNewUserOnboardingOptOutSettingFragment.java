package com.facebook.messaging.encryptedbackups.nux.fragment;

import X.0Q8;
import X.11T;
import X.1Bn;
import X.7zL;
import X.7zU;
import X.9Qh;
import X.AQv;
import X.C01i;
import X.C03i;
import X.C9qq;
import X.GF6;
import android.os.Bundle;

/* loaded from: EbNewUserOnboardingOptOutSettingFragment.class */
public final class EbNewUserOnboardingOptOutSettingFragment extends EncryptedBackupsBaseFragment implements GF6 {
    public 9Qh A00;
    public final C01i A01 = AQv.A00(this, C03i.A02, 44);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        9Qh r0 = (9Qh) 1Bn.A0A(68828);
        11T.A0F(r0, 0);
        this.A00 = r0;
        7zU.A0P(r0.A00).A08("NEW_USER_FLOW_SETTING_OPTOUT_IMPRESSION");
        9Qh r02 = this.A00;
        if (r02 != null) {
            C9qq.A00(this, 7zU.A0E(r02.A02), 31);
        } else {
            7zL.A1B();
            throw 0Q8.createAndThrow();
        }
    }

    @Override // X.GF6
    public boolean Bkd() {
        A1d().A08("NEW_USER_FLOW_SETTING_BACK_CLICK");
        return false;
    }
}
