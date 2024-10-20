package com.facebook.messaging.encryptedbackups.passkey.ui.activity;

import X.1Br;
import X.1iF;
import X.1pK;
import X.7zM;
import X.7zO;
import X.7zQ;
import X.7zR;
import X.7zU;
import X.C06c;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.base.fragment.AbstractNavigableFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: EbPasskeySetupActivity.class */
public final class EbPasskeySetupActivity extends FbFragmentActivity {
    public final 1Br A00 = 7zM.A0f(this);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return 7zR.A0F();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132541927);
        MigColorScheme.A00(A2c(2131363888), 7zQ.A0m(this.A00));
        if (bundle == null) {
            1pK abstractNavigableFragment = new AbstractNavigableFragment();
            abstractNavigableFragment.setArguments(7zO.A0H(this));
            C06c A0D = 7zU.A0D(this);
            A0D.A0P(abstractNavigableFragment, "Setup", 2131363889);
            A0D.A04();
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public boolean A36() {
        return true;
    }
}
