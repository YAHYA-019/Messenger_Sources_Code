package com.facebook.messaging.users.displayname;

import X.1Bn;
import X.1Hv;
import X.7zR;
import X.HWO;
import X.I3G;
import X.IKB;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: ChangeDisplayNameSettingsActivity.class */
public class ChangeDisplayNameSettingsActivity extends FbFragmentActivity {
    public InputMethodManager A00;
    public Toolbar A01;
    public I3G A02;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        super.A2b(fragment);
        if (fragment instanceof ChangeDisplayNameSettingsFragment) {
            ((ChangeDisplayNameSettingsFragment) fragment).A04 = new HWO(this);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A02 = (I3G) 1Bn.A0A(116222);
        this.A00 = (InputMethodManager) 1Hv.A02(this, 100189);
        setContentView(2132541684);
        Toolbar toolbar = (Toolbar) A2c(2131363680);
        this.A01 = toolbar;
        toolbar.A0M(2131962637);
        this.A01.A0Q(new IKB(this, 33));
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        I3G i3g = this.A02;
        i3g.getClass();
        i3g.A01("edit_name_flow_cancelled");
        InputMethodManager inputMethodManager = this.A00;
        inputMethodManager.getClass();
        7zR.A12(this.A01, inputMethodManager);
    }
}
