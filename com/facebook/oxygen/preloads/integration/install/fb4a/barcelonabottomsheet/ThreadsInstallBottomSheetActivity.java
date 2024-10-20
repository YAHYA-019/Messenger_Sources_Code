package com.facebook.oxygen.preloads.integration.install.fb4a.barcelonabottomsheet;

import X.06Z;
import X.0fH;
import X.7zO;
import X.94X;
import X.AfK;
import X.C90b;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: ThreadsInstallBottomSheetActivity.class */
public final class ThreadsInstallBottomSheetActivity extends FbFragmentActivity {
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        BDe().A1K(new AfK(this, 10), false);
        Bundle A0H = 7zO.A0H(this);
        if (A0H == null) {
            0fH.A0k("ThreadsInstallBottomSheetActivity", "No arguments provided");
            finish();
        } else {
            06Z BDe = BDe();
            94X c90b = new C90b();
            c90b.setArguments(A0H);
            c90b.A0m(BDe, "MainEntryBottomSheetDialogFragment");
        }
    }
}
