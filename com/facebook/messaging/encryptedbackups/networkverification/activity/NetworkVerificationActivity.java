package com.facebook.messaging.encryptedbackups.networkverification.activity;

import X.1BK;
import X.1Br;
import X.7zM;
import X.7zQ;
import X.7zU;
import X.AbI;
import X.AlK;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: NetworkVerificationActivity.class */
public final class NetworkVerificationActivity extends FbFragmentActivity {
    public final 1Br A00 = 7zM.A0f(this);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132541927);
        MigColorScheme.A00(A2c(2131363888), 7zQ.A0m(this.A00));
        if (bundle == null) {
            Bundle A05 = 1BK.A05();
            AlK alK = new AlK();
            alK.setArguments(A05);
            AbI.A1I(7zU.A0D(this), alK, 2131363889);
        }
    }
}
