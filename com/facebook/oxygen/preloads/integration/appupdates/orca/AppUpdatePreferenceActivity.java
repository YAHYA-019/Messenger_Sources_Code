package com.facebook.oxygen.preloads.integration.appupdates.orca;

import X.HXE;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: AppUpdatePreferenceActivity.class */
public class AppUpdatePreferenceActivity extends FbFragmentActivity {
    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        super.A2b(fragment);
        ((AppUpdatePreferenceFragment) fragment).A02 = new HXE(this);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132541510);
        setTitle(2131951620);
    }
}
