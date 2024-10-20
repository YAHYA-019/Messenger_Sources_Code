package com.facebook.messaging.encryptedbackups.nux.fragment;

import X.0Q8;
import X.11T;
import X.1Bi;
import X.7zU;
import X.AQn;
import X.C01i;
import X.C1wk;
import X.C97j;
import X.C9hO;
import X.C9uq;
import X.GF6;
import android.os.Bundle;

/* loaded from: GDriveIntroFragment.class */
public final class GDriveIntroFragment extends EncryptedBackupsBaseFragment implements GF6 {
    public C1wk A00;
    public C9hO A01;
    public final C01i A02 = AQn.A00(this, 17);

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
        C9uq A1d = A1d();
        C1wk c1wk = this.A00;
        if (c1wk == null) {
            str = "nuxFlagManager";
        } else {
            Integer valueOf = Integer.valueOf(c1wk.A09());
            C9hO c9hO = this.A01;
            if (c9hO != null) {
                A1d.A05(c9hO.A01(), valueOf);
                A1d().A08("SETUP_EDUCATIONAL_SCREEN_IMPRESSION");
                A1d().A09("GDriveIntroFragment");
                return;
            }
            str = "touchPointProvider";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // X.GF6
    public boolean Bkd() {
        A1d().A06("SETUP_EDUCATIONAL_SCREEN_BACK_BUTTON_TAP");
        7zU.A1N(C97j.A0O, this);
        return true;
    }
}
