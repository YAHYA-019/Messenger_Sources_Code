package com.facebook.messaging.encryptedbackups.onetimecode.generateflow;

import X.1Br;
import X.1Bu;
import X.7zM;
import X.95H;
import X.9Ie;
import X.9Zw;
import X.AQn;
import X.C01i;
import X.DKy;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: EbOneTimeCodeGenerateFlowActivity.class */
public final class EbOneTimeCodeGenerateFlowActivity extends FbFragmentActivity {
    public final 1Br A00 = 7zM.A0Y();
    public final C01i A02 = AQn.A00(this, 20);
    public final C01i A03 = AQn.A00(this, 21);
    public final 1Br A01 = 1Bu.A00(147870);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        overridePendingTransition(0, 0);
        ((DKy) this.A03.getValue()).A01(this);
        1Br.A0C(this.A01);
        new 9Zw(this, 7zM.A0I(this.A02)).A00(this, new 9Ie(this), 95H.A03);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public boolean A36() {
        return true;
    }
}
