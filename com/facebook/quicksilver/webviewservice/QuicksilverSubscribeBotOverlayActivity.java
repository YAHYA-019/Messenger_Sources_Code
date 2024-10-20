package com.facebook.quicksilver.webviewservice;

import X.1BQ;
import X.1iF;
import X.1lN;
import X.7zL;
import X.C00i;
import X.DKD;
import X.DKF;
import X.DKG;
import X.Eq7;
import X.EtP;
import X.F8O;
import X.FI3;
import android.os.Bundle;
import android.view.View;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: QuicksilverSubscribeBotOverlayActivity.class */
public class QuicksilverSubscribeBotOverlayActivity extends FbFragmentActivity implements 1lN {
    public final C00i A00 = 1BQ.A02(98346);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKG.A0H();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        DKF.A0f(this.A00).A09 = DKD.A11();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        View A0C;
        super.A2y(bundle);
        C00i c00i = this.A00;
        DKF.A0f(c00i).A09 = 7zL.A14(this);
        if (getWindow() != null && (A0C = DKD.A0C(this)) != null) {
            A0C.setSystemUiVisibility(5894);
        }
        setContentView(2132543206);
        if (FI3.A00(c00i) != null) {
            QuicksilverWebviewService A00 = FI3.A00(c00i);
            Eq7 eq7 = A00.A0c;
            if (eq7 == null) {
                DKG.A0r(A00).A07();
                return;
            }
            eq7.A00 = this;
            F8O f8o = (F8O) A00.A0R.get();
            ((EtP) f8o.A01.get()).A00(A00.A0c);
            DKF.A0c(f8o.A02).A0C("bot_subscribe_dialog_shown");
        }
    }

    public final String AWg() {
        return "instant_game_player_ig";
    }

    public Long Am7() {
        return 216762292783668L;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        View A0C;
        super.onWindowFocusChanged(z);
        if (!z || getWindow() == null || (A0C = DKD.A0C(this)) == null) {
            return;
        }
        A0C.setSystemUiVisibility(5894);
    }
}
