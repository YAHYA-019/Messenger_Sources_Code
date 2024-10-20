package com.facebook.messaging.encryptedbackups.hsm.ui.activity;

import X.1BK;
import X.1Br;
import X.1pK;
import X.7zM;
import X.7zQ;
import X.7zU;
import X.AQv;
import X.C01g;
import X.C01i;
import X.C06c;
import X.DKy;
import X.R0d;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeSetupBaseFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: HsmPinSetupOrResetActivity.class */
public final class HsmPinSetupOrResetActivity extends FbFragmentActivity {
    public final 1Br A00 = 7zM.A0f(this);
    public final 1Br A01 = 7zM.A0Y();
    public final C01i A02 = C01g.A01(AQv.A01(this, 14));

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132542119);
        MigColorScheme.A00(A2c(2131364228), 7zQ.A0m(this.A00));
        ((DKy) this.A02.getValue()).A01(this);
        if (bundle == null) {
            Bundle A05 = 1BK.A05();
            A05.putBoolean("reset_pin", getIntent().getBooleanExtra("reset_pin", false));
            A05.putBoolean("from_setting", getIntent().getBooleanExtra("from_setting", false));
            1pK hsmPinCodeSetupBaseFragment = new HsmPinCodeSetupBaseFragment();
            hsmPinCodeSetupBaseFragment.setArguments(A05);
            C06c A0D = 7zU.A0D(this);
            A0D.A0L(hsmPinCodeSetupBaseFragment, 2131364228);
            A0D.A04();
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public boolean A36() {
        return true;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (R0d.A00(this)) {
            return;
        }
        super.onBackPressed();
    }
}
