package com.facebook.messaging.encryptedbackups.nux.fragment;

import X.0Q8;
import X.11T;
import X.1Bi;
import X.7zU;
import X.AQv;
import X.C00i;
import X.C01i;
import X.C03i;
import X.C1wk;
import X.C96m;
import X.C97j;
import X.C9hO;
import X.GF6;
import android.os.Bundle;
import com.facebook.messaging.encryptedbackups.nux.viewdata.EncryptedBackupsNuxViewData;

/* loaded from: EbIntroFragment.class */
public final class EbIntroFragment extends EncryptedBackupsBaseFragment implements GF6 {
    public C1wk A00;
    public C9hO A01;
    public final C01i A02 = AQv.A00(this, C03i.A02, 40);

    public void A1B(Bundle bundle) {
        super.A1B(bundle);
        A1o().A03();
    }

    @Override // com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        String str;
        super.A1S(bundle);
        this.A00 = 7zU.A0Q();
        this.A01 = (C9hO) 1Bi.A03(68813);
        C1wk c1wk = this.A00;
        if (c1wk == null) {
            str = "nuxFlagManager";
        } else {
            int A09 = c1wk.A09();
            C9hO c9hO = this.A01;
            if (c9hO != null) {
                C96m A01 = c9hO.A01();
                EncryptedBackupsNuxViewData A1o = A1o();
                Integer valueOf = Integer.valueOf(A09);
                C00i c00i = A1o.A0A.A00;
                7zU.A0O(c00i).A05(A01, valueOf);
                7zU.A0O(c00i).A08("SETUP_EDUCATIONAL_SCREEN_IMPRESSION");
                7zU.A0O(c00i).A09("EbIntroFragment");
                return;
            }
            str = "touchPointProvider";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // X.GF6
    public boolean Bkd() {
        7zU.A0P(A1o().A0A).A06("SETUP_EDUCATIONAL_SCREEN_BACK_BUTTON_TAP");
        7zU.A1N(C97j.A0O, this);
        return true;
    }
}
