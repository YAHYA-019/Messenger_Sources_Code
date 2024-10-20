package com.facebook.messaging.wellbeing.ixt;

import X.0fH;
import X.1Lm;
import X.AnonymousClass001;
import X.DKH;
import X.DKc;
import X.EUZ;
import X.EeN;
import X.EoK;
import X.Etz;
import X.FAv;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: MessengerIXTActivity.class */
public final class MessengerIXTActivity extends FbFragmentActivity {
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        ((Etz) 1Lm.A05(this, DKH.A0H(this), 99803)).A00();
        super.A2l();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        Etz etz = (Etz) 1Lm.A05(this, DKH.A0H(this), 99803);
        EoK eoK = etz.A01;
        if (eoK == null) {
            0fH.A0B(MessengerIXTActivity.class, "Empty parse result from ixt in-memory store");
            finish();
        } else {
            etz.A00 = new EeN(this);
            FAv.A02(this, eoK, EUZ.A00(this), DKc.A01, AnonymousClass001.A0u());
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }
}
