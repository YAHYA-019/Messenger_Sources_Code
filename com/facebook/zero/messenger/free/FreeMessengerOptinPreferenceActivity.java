package com.facebook.zero.messenger.free;

import X.7zU;
import X.C06c;
import X.DZQ;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: FreeMessengerOptinPreferenceActivity.class */
public class FreeMessengerOptinPreferenceActivity extends FbFragmentActivity {
    public boolean A00 = false;

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        super.A2b(fragment);
        if (fragment instanceof DZQ) {
            this.A00 = true;
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132543610);
        if (this.A00) {
            return;
        }
        Fragment dzq = new DZQ();
        C06c A0D = 7zU.A0D(this);
        A0D.A0M(dzq, 2131368493);
        C06c.A00(A0D, false);
        setTitle(2131957014);
    }
}
