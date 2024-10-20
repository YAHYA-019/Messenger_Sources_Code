package com.facebook.quicksilver.webviewservice;

import X.1BQ;
import X.1iF;
import X.1lN;
import X.7zL;
import X.C00i;
import X.DKF;
import X.DKG;
import X.EzV;
import X.FHM;
import X.FI3;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import com.facebook.base.activity.FbFragmentActivity;
import java.lang.ref.WeakReference;

/* loaded from: QuicksilverOverlayBaseActivity.class */
public abstract class QuicksilverOverlayBaseActivity extends FbFragmentActivity implements 1lN {
    public ViewGroup A00;
    public final C00i A01 = 1BQ.A02(98346);

    public static FI3 A12(QuicksilverOverlayBaseActivity quicksilverOverlayBaseActivity) {
        return (FI3) quicksilverOverlayBaseActivity.A01.get();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKG.A0H();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        ViewGroup viewGroup = this.A00;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        EzV ezV;
        FHM fhm;
        super.A2y(bundle);
        if (this instanceof QuicksilverTournamentDialogOverlayActivity) {
            A12(this).A0B = 7zL.A14(this);
        } else if (this instanceof QuicksilverToSOverlayActivity) {
            C00i c00i = this.A01;
            DKF.A0f(c00i).A0A = 7zL.A14(this);
            if (FI3.A00(c00i) != null && FI3.A00(c00i).A05() != null) {
                FI3.A00(c00i).A05().A01(this);
            }
        } else if (this instanceof QuicksilverStartScreenOverlayActivity) {
            C00i c00i2 = this.A01;
            DKF.A0f(c00i2).A0E = 7zL.A14(this);
            if (FI3.A00(c00i2) != null && FI3.A00(c00i2).A0X != null && (fhm = FI3.A00(c00i2).A0X.A01) != null) {
                fhm.A08(this);
            }
            if (FI3.A00(c00i2) != null && FI3.A00(c00i2).A05() != null && 11 == FI3.A00(c00i2).A00 && FI3.A00(c00i2).A05().A03()) {
                setRequestedOrientation(1);
            }
        } else if (this instanceof QuicksilverShareNTOverlayActivity) {
            FI3 A12 = A12(this);
            A12.A08 = 7zL.A14(this);
            WeakReference weakReference = A12.A0D;
            if (weakReference != null && weakReference.get() != null && (ezV = DKF.A0g(weakReference).A0a) != null) {
                ezV.A00 = this;
            }
        } else if (this instanceof QuicksilverNTDialogOverlayActivity) {
            A12(this).A06 = 7zL.A14(this);
        } else if (this instanceof QuicksilverMatchOverlayActivity) {
            A12(this).A05 = 7zL.A14(this);
        } else if (this instanceof QuicksilverHSShortcutActivity) {
            A12(this).A04 = 7zL.A14(this);
        } else {
            A12(this).A03 = 7zL.A14(this);
        }
        Window window = getWindow();
        window.getClass();
        window.getDecorView().setSystemUiVisibility(5894);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(128);
        }
        setContentView(this instanceof QuicksilverMatchOverlayActivity ? 2132543202 : 2132543206);
        this.A00 = (ViewGroup) findViewById(2131366798);
        View A3B = A3B();
        if (this.A00 == null || A3B == null) {
            finish();
            return;
        }
        if (A3B.getParent() != null) {
            ((ViewGroup) A3B.getParent()).removeView(A3B);
        }
        this.A00.addView(A3B, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0187, code lost:
    
        if (r304 != null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View A3B() {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quicksilver.webviewservice.QuicksilverOverlayBaseActivity.A3B():android.view.View");
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
        super.onWindowFocusChanged(z);
        if (z) {
            Window window = getWindow();
            window.getClass();
            window.getDecorView().setSystemUiVisibility(5894);
        }
    }
}
