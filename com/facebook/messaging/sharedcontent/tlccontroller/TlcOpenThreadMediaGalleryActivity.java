package com.facebook.messaging.sharedcontent.tlccontroller;

import X.0Q8;
import X.11T;
import X.1pH;
import X.2M3;
import X.7zK;
import X.7zR;
import X.AbL;
import X.C01i;
import X.CfA;
import X.CfB;
import X.DCz;
import X.Q4c;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: TlcOpenThreadMediaGalleryActivity.class */
public final class TlcOpenThreadMediaGalleryActivity extends FbFragmentActivity {
    public 1pH A00;
    public final 2M3 A02 = new CfB(this, 5);
    public final C01i A01 = DCz.A00(this, 2);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        1pH r0 = this.A00;
        if (r0 == null) {
            11T.A0L("contentViewManager");
            throw 0Q8.createAndThrow();
        }
        r0.A06();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        AbL.A0l(this);
        View AUH = this.A02.AUH();
        11T.A0I(AUH, 7zK.A00(0));
        1pH A02 = 1pH.A02((ViewGroup) AUH, BDe(), new CfA(this, 8), false);
        this.A00 = A02;
        if (bundle == null) {
            int i = Q4c.A03;
            ThreadKey threadKey = (ThreadKey) this.A01.getValue();
            11T.A0F(threadKey, 1);
            Q4c q4c = new Q4c();
            q4c.setArguments(7zR.A0E(threadKey));
            A02.Czy(q4c, "tlc_media");
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        1pH r0 = this.A00;
        if (r0 == null) {
            11T.A0L("contentViewManager");
            throw 0Q8.createAndThrow();
        }
        r0.A07();
    }
}
