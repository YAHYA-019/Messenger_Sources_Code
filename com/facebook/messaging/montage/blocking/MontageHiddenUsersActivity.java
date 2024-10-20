package com.facebook.messaging.montage.blocking;

import X.Kf9;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: MontageHiddenUsersActivity.class */
public class MontageHiddenUsersActivity extends FbFragmentActivity {
    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        super.A2b(fragment);
        if (fragment instanceof MontageHiddenUsersFragment) {
            ((MontageHiddenUsersFragment) fragment).A02 = new Kf9(this);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132542610);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public boolean A36() {
        return true;
    }
}
