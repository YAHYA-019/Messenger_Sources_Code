package com.facebook.messaging.familycenter.scheduledbreaks.blockingscreen;

import X.0FI;
import X.0LS;
import X.0Q8;
import X.11T;
import X.1pH;
import X.1pK;
import X.7zK;
import X.AnonymousClass000;
import X.DKB;
import X.InterfaceC03743yx;
import X.RnZ;
import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: ScheduledBreaksBlockingScreenActivity.class */
public final class ScheduledBreaksBlockingScreenActivity extends FbFragmentActivity implements InterfaceC03743yx {
    public 1pH A00;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        1pH r0 = this.A00;
        if (r0 != null) {
            r0.A06();
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A00 = 1pH.A01((ViewGroup) findViewById(R.id.content), BDe(), new RnZ(this));
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        1pH r0 = this.A00;
        if (r0 == null) {
            11T.A0L("contentViewManager");
            throw 0Q8.createAndThrow();
        }
        r0.CeH(7zK.A00(73));
        Intent intent = new Intent();
        intent.setAction(AnonymousClass000.A00(44));
        intent.addCategory(DKB.A00(21));
        intent.setFlags(268435456);
        0LS.A0C(this, intent);
        finish();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        int A00 = 0FI.A00(-1877404715);
        super.onStart();
        if (this.A00 != null) {
            1pK r0 = new 1pK();
            1pH r02 = this.A00;
            if (r02 == null) {
                11T.A0L("contentViewManager");
                throw 0Q8.createAndThrow();
            }
            r02.Czy(r0, 7zK.A00(73));
        }
        0FI.A07(-1385450165, A00);
    }
}
