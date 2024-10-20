package com.facebook.zero.messenger.semi.activity;

import X.11T;
import X.7zU;
import X.C06c;
import X.EC8;
import X.EgL;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: SemiFreeMessengerOptinPreferenceActivity.class */
public final class SemiFreeMessengerOptinPreferenceActivity extends FbFragmentActivity {
    public boolean A00;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        11T.A0F(fragment, 0);
        super.A2b(fragment);
        if (fragment instanceof EC8) {
            this.A00 = true;
            ((EC8) fragment).A01 = new EgL(this);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132543618);
        if (this.A00) {
            return;
        }
        C06c A0D = 7zU.A0D(this);
        A0D.A0M(new EC8(), 2131368502);
        A0D.A04();
        setTitle(2131965672);
    }
}
