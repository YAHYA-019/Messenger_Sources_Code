package com.facebook.checkpoint;

import X.1Bi;
import X.1iF;
import X.7zU;
import X.AbL;
import X.C06c;
import X.C1io;
import X.C5H;
import X.DZ4;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.ui.legacynavbar.LegacyNavigationBar;

/* loaded from: CheckpointActivity.class */
public class CheckpointActivity extends FbFragmentActivity implements C1io {
    public final C5H A00 = (C5H) 1Bi.A03(84964);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbL.A0A();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        C5H c5h = this.A00;
        c5h.A01 = null;
        c5h.A02 = false;
        super.A2l();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        setContentView(2132541699);
        ((LegacyNavigationBar) A2c(2131368069)).CvU(2131954187);
        if (bundle == null) {
            C06c A0D = 7zU.A0D(this);
            A0D.A0L(new DZ4(), 2131362992);
            A0D.A04();
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }
}
