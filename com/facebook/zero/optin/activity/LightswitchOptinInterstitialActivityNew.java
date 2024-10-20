package com.facebook.zero.optin.activity;

import X.0Pz;
import X.0fH;
import X.1BK;
import X.1G3;
import X.1JF;
import X.1iF;
import X.4YU;
import X.AbL;
import X.C2121Dea;
import X.DKC;
import X.DKE;
import X.DKS;
import X.DMV;
import X.ED4;
import X.EY7;
import X.FG8;
import X.FXq;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: LightswitchOptinInterstitialActivityNew.class */
public class LightswitchOptinInterstitialActivityNew extends ZeroOptinInterstitialActivityBase implements CallerContextable {
    public static final CallerContext A0A = CallerContext.A08(LightswitchOptinInterstitialActivityNew.class, "lightswitch_optin_interstitial");
    public View A00;
    public ProgressBar A01;
    public FbUserSession A02;
    public DMV A03;
    public ED4 A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;

    public static void A12(LightswitchOptinInterstitialActivityNew lightswitchOptinInterstitialActivityNew) {
        lightswitchOptinInterstitialActivityNew.A00.setVisibility(8);
        lightswitchOptinInterstitialActivityNew.A03.dismiss();
        lightswitchOptinInterstitialActivityNew.A01.setVisibility(0);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKE.A0Q();
    }

    @Override // com.facebook.zero.optin.activity.ZeroOptinInterstitialActivityBase, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A02 = AbL.A08(this);
        FG8 fg8 = new FG8((FbSharedPreferences) 4YU.A0p(super.A01));
        ((ED4) fg8).A00 = this;
        fg8.A0C("image_url_key");
        ((ED4) fg8).A06 = fg8.A00.AZn(1G3.A01(fg8.A04(), "should_show_confirmation_key"), true);
        ((ED4) fg8).A05 = fg8.A0C("confirmation_title_key");
        ((ED4) fg8).A02 = fg8.A0C("confirmation_description_key");
        ((ED4) fg8).A03 = fg8.A0C("confirmation_primary_button_text_key");
        ((ED4) fg8).A04 = fg8.A0C("confirmation_secondary_button_text_key");
        ((ED4) fg8).A01 = fg8.A0C("confirmation_back_button_behavior_key");
        this.A04 = fg8;
        if (1JF.A0B(fg8.A02)) {
            0fH.A14("LightswitchOptinInterstitialActivityNew", "Tried to show %s, but didn't find a campaign ID", new Object[]{"LightswitchOptinInterstitialActivityNew"});
            finish();
            return;
        }
        setTheme(2132608263);
        setContentView(2132542420);
        this.A00 = A2c(2131365220);
        this.A01 = (ProgressBar) A2c(2131365222);
        TextView A0J = DKC.A0J(this, 2131365225);
        this.A09 = A0J;
        ZeroOptinInterstitialActivityBase.A15(A0J, this.A04.A0B());
        TextView A0J2 = DKC.A0J(this, 2131365219);
        this.A05 = A0J2;
        ZeroOptinInterstitialActivityBase.A15(A0J2, this.A04.A06());
        TextView A0J3 = DKC.A0J(this, 2131365224);
        this.A08 = A0J3;
        ZeroOptinInterstitialActivityBase.A15(A0J3, this.A04.A0A());
        if (this.A08.getVisibility() == 0) {
            FXq.A01(this.A08, this, ActionId.NOTIFY_SUBSCRIBERS);
        }
        TextView A0J4 = DKC.A0J(this, 2131365221);
        this.A06 = A0J4;
        ZeroOptinInterstitialActivityBase.A15(A0J4, this.A04.A08());
        FXq.A01(this.A06, this, ActionId.FAIL_FILE_TOO_LARGE);
        C2121Dea A03 = C2121Dea.A03(this);
        ED4 ed4 = this.A04;
        A03.A0B(ed4.A05);
        A03.A0A(ed4.A02);
        DKS.A01(A03, ed4.A03, this, 93);
        A03.A0G((DialogInterface.OnClickListener) null, this.A04.A04);
        this.A03 = A03.A0I();
        TextView A0J5 = DKC.A0J(this, 2131365223);
        this.A07 = A0J5;
        ZeroOptinInterstitialActivityBase.A15(A0J5, this.A04.A09());
        FXq.A01(this.A07, this, ActionId.OFFLINE);
        A3I();
    }

    @Override // com.facebook.zero.optin.activity.ZeroOptinInterstitialActivityBase, com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!this.A03.isShowing()) {
            super.onBackPressed();
            return;
        }
        A3H();
        String str = this.A04.A01;
        if (1JF.A0B(str)) {
            1BK.A09(super.A03).D0v("LightswitchOptinInterstitialActivityNew", 0Pz.A0v("Encountered ", str == null ? "null" : "empty", " back_button_behavior string in ", "LightswitchOptinInterstitialActivityNew"));
        } else {
            Integer A00 = EY7.A00(str);
            if (A00 != null) {
                int intValue = A00.intValue();
                if (intValue == 0) {
                    finish();
                    return;
                }
                if (intValue == 1) {
                    return;
                }
                if (intValue == 2) {
                    A12(this);
                    ZeroOptinInterstitialActivityBase.A16(this.A02, this);
                    return;
                } else if (intValue == 3) {
                    this.A03.dismiss();
                    return;
                } else if (intValue != 4) {
                    0fH.A0o("LightswitchOptinInterstitialActivityNew", "Encountered a totally unexpected ZeroOptinInterstitialActivityBase.BackButtonBehavior");
                    return;
                }
            }
        }
        super.A3G();
    }
}
