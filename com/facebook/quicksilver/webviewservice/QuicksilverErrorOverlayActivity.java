package com.facebook.quicksilver.webviewservice;

import X.1Iw;
import X.7zL;
import X.7zQ;
import X.AbF;
import X.C00i;
import X.DKD;
import X.DKF;
import X.FGt;
import X.FI3;
import X.FXq;
import X.FXs;
import android.view.View;
import com.facebook.acra.constants.ActionId;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;

/* loaded from: QuicksilverErrorOverlayActivity.class */
public class QuicksilverErrorOverlayActivity extends QuicksilverOverlayBaseActivity {
    @Override // com.facebook.quicksilver.webviewservice.QuicksilverOverlayBaseActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        C00i c00i = this.A01;
        DKF.A0f(c00i).A03 = DKD.A11();
        FI3.A03(DKF.A0f(c00i).A02);
        super.A2l();
    }

    @Override // com.facebook.quicksilver.webviewservice.QuicksilverOverlayBaseActivity
    public View A3B() {
        C00i c00i = this.A01;
        if (FI3.A00(c00i) == null) {
            return null;
        }
        QuicksilverWebviewService A00 = FI3.A00(c00i);
        if (A00.A0d == null) {
            return null;
        }
        1Iw A0W = 7zL.A0W(this);
        LithoView lithoView = new LithoView(A0W);
        FXs A002 = FXs.A00(this, A00, 67);
        FXq A003 = FXq.A00(A00, ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES);
        A00.A0O.get();
        7zQ.A1I(ComponentTree.A01(FGt.A01(A003, A002, A0W, AbF.A0o(A00, 16979), A00.A0d), A0W, null), lithoView);
        return lithoView;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C00i c00i = this.A01;
        if (FI3.A00(c00i) != null) {
            FI3.A00(c00i).stopSelf();
        }
        super.onBackPressed();
    }
}
