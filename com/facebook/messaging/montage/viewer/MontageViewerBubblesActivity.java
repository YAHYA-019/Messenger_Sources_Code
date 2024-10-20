package com.facebook.messaging.montage.viewer;

import X.0fH;
import X.1BV;
import X.C00i;
import X.C2j5;
import X.DER;
import android.os.Bundle;

/* loaded from: MontageViewerBubblesActivity.class */
public class MontageViewerBubblesActivity extends MontageViewerActivity implements DER {
    public final C00i A00 = new 1BV(this, 33230);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A31(Bundle bundle) {
        super.A31(bundle);
        if (((C2j5) this.A00.get()).A01()) {
            return;
        }
        0fH.A0j("MontageViewerBubblesActivity", "uri called but bubbles not supported, finishing");
        finish();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        if (((C2j5) this.A00.get()).A01()) {
            return;
        }
        0fH.A0j("MontageViewerBubblesActivity", "bubble activity resumed but bubbles not supported, finishing");
        finish();
    }
}
