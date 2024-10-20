package com.facebook.messaging.business.messengerextensions.permission;

import X.06Z;
import X.11T;
import X.1BK;
import X.2Ov;
import X.REu;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: PlatformAskPermissionActivity.class */
public final class PlatformAskPermissionActivity extends FbFragmentActivity {
    public PlatformAskPermissionDialogFragment A00;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        2Ov r305 = bundle != null ? (PlatformAskPermissionDialogFragment) BDe().A0Z(bundle, "ask_permission_dialog_fragment") : new 2Ov();
        this.A00 = r305;
        if (r305 != null) {
            r305.setArguments(getIntent().getExtras());
        }
        PlatformAskPermissionDialogFragment platformAskPermissionDialogFragment = this.A00;
        if (platformAskPermissionDialogFragment != null) {
            platformAskPermissionDialogFragment.A0j(false);
        }
        PlatformAskPermissionDialogFragment platformAskPermissionDialogFragment2 = this.A00;
        if (platformAskPermissionDialogFragment2 != null) {
            platformAskPermissionDialogFragment2.A0m(BDe(), "ask_permission_dialog_fragment");
        }
        PlatformAskPermissionDialogFragment platformAskPermissionDialogFragment3 = this.A00;
        if (platformAskPermissionDialogFragment3 != null) {
            platformAskPermissionDialogFragment3.A04 = new REu(this);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        06Z BDe = BDe();
        2Ov r0 = this.A00;
        if (r0 == null) {
            throw 1BK.A0h();
        }
        BDe.A11(bundle, r0, "ask_permission_dialog_fragment");
    }
}
