package com.facebook.offlineexperiment.internalsettings;

import X.06Z;
import X.1iF;
import X.1pK;
import X.7zL;
import X.C06c;
import X.DKE;
import X.GCv;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: OfflineExperimentPreferenceActivity.class */
public class OfflineExperimentPreferenceActivity extends FbFragmentActivity implements GCv {
    public 06Z A00;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKE.A0P();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A00 = BDe();
        Fragment fragment = new 1pK();
        C06c A0G = 7zL.A0G(this.A00);
        A0G.A0L(fragment, 2131366071);
        A0G.A04();
        setContentView(2132542835);
    }
}
