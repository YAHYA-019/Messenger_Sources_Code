package com.facebook.zero.optin.activity;

import X.0Pz;
import X.0fH;
import X.1BK;
import X.1G3;
import X.1JF;
import X.1iF;
import X.2Bb;
import X.4YU;
import X.AbL;
import X.C0A2;
import X.C2121Dea;
import X.DKC;
import X.DKE;
import X.DKS;
import X.DMV;
import X.ED5;
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
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.fbui.widget.facepile.FacepileView;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.common.collect.ImmutableList;
import java.io.IOException;

/* loaded from: DialtoneOptinInterstitialActivityNew.class */
public class DialtoneOptinInterstitialActivityNew extends ZeroOptinInterstitialActivityBase implements CallerContextable {
    public static final CallerContext A0D = CallerContext.A08(DialtoneOptinInterstitialActivityNew.class, "dialtone_optin_interstitial");
    public View A00;
    public ProgressBar A01;
    public FbUserSession A02;
    public DMV A03;
    public ED5 A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public FbDraweeView A0B;
    public FacepileView A0C;

    public static void A12(DialtoneOptinInterstitialActivityNew dialtoneOptinInterstitialActivityNew) {
        dialtoneOptinInterstitialActivityNew.A00.setVisibility(8);
        dialtoneOptinInterstitialActivityNew.A03.dismiss();
        dialtoneOptinInterstitialActivityNew.A01.setVisibility(0);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKE.A0Q();
    }

    /* JADX WARN: Type inference failed for: r0v117, types: [com.facebook.drawee.fbpipeline.FbDraweeView, android.view.View] */
    @Override // com.facebook.zero.optin.activity.ZeroOptinInterstitialActivityBase, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A02 = AbL.A08(this);
        FG8 fg8 = new FG8((FbSharedPreferences) 4YU.A0p(super.A01));
        ((ED5) fg8).A00 = this;
        ((ED5) fg8).A08 = fg8.A0C("image_url_key");
        ((ED5) fg8).A07 = fg8.A0C("facepile_text_key");
        ((ED5) fg8).A09 = fg8.A00.AZn(1G3.A01(fg8.A04(), "should_show_confirmation_key"), true);
        ((ED5) fg8).A06 = fg8.A0C("confirmation_title_key");
        ((ED5) fg8).A03 = fg8.A0C("confirmation_description_key");
        ((ED5) fg8).A04 = fg8.A0C("confirmation_primary_button_text_key");
        ((ED5) fg8).A05 = fg8.A0C("confirmation_secondary_button_text_key");
        ((ED5) fg8).A02 = fg8.A0C("confirmation_back_button_behavior_key");
        ((ED5) fg8).A01 = ImmutableList.of();
        try {
            ((ED5) fg8).A01 = 2Bb.A00(fg8.A0C("facepile_profile_picture_urls_key"));
        } catch (IOException e) {
            0fH.A0K(ED5.class, "Failed to read zero optin facepile URLs from shared prefs", e);
        }
        this.A04 = fg8;
        if (1JF.A0B(fg8.A02)) {
            0fH.A14("DialtoneOptinInterstitialActivityNew", "Tried to show %s, but didn't find a campaign ID", new Object[]{"DialtoneOptinInterstitialActivityNew"});
            finish();
            return;
        }
        setTheme(2132608263);
        setContentView(2132541853);
        this.A00 = A2c(2131363639);
        TextView A0J = DKC.A0J(this, 2131363644);
        this.A0A = A0J;
        ZeroOptinInterstitialActivityBase.A15(A0J, this.A04.A0B());
        TextView A0J2 = DKC.A0J(this, 2131363635);
        this.A05 = A0J2;
        ZeroOptinInterstitialActivityBase.A15(A0J2, this.A04.A06());
        this.A0C = (FacepileView) A2c(2131363637);
        boolean isEmpty = this.A04.A01.isEmpty();
        FacepileView facepileView = this.A0C;
        if (isEmpty) {
            facepileView.setVisibility(8);
        } else {
            facepileView.A06(this.A04.A01);
        }
        TextView A0J3 = DKC.A0J(this, 2131363636);
        this.A06 = A0J3;
        ZeroOptinInterstitialActivityBase.A15(A0J3, this.A04.A07);
        TextView A0J4 = DKC.A0J(this, 2131363643);
        this.A09 = A0J4;
        ZeroOptinInterstitialActivityBase.A15(A0J4, this.A04.A0A());
        if (this.A09.getVisibility() == 0 && !1JF.A0B(((FG8) this.A04).A04)) {
            FXq.A01(this.A09, this, ActionId.APPLY_FINISHED_LIST);
        }
        this.A0B = (FbDraweeView) A2c(2131363638);
        boolean A0B = 1JF.A0B(this.A04.A08);
        ?? r0 = this.A0B;
        if (A0B) {
            r0.setVisibility(8);
        } else {
            r0.A0G(C0A2.A03(this.A04.A08), A0D);
        }
        TextView A0J5 = DKC.A0J(this, 2131363640);
        this.A07 = A0J5;
        ZeroOptinInterstitialActivityBase.A15(A0J5, this.A04.A08());
        FXq.A01(this.A07, this, ActionId.APPLY_FINISHED_LIST_AGAIN);
        TextView A0J6 = DKC.A0J(this, 2131363642);
        this.A08 = A0J6;
        ZeroOptinInterstitialActivityBase.A15(A0J6, this.A04.A09());
        FXq.A01(this.A08, this, ActionId.FUTURE_LISTENERS_COMPLETE);
        this.A01 = (ProgressBar) A2c(2131363641);
        C2121Dea A03 = C2121Dea.A03(this);
        ED5 ed5 = this.A04;
        A03.A0B(ed5.A06);
        A03.A0A(ed5.A03);
        DKS.A01(A03, ed5.A04, this, 92);
        A03.A0G((DialogInterface.OnClickListener) null, this.A04.A05);
        this.A03 = A03.A0I();
        A3I();
    }

    @Override // com.facebook.zero.optin.activity.ZeroOptinInterstitialActivityBase, com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!this.A03.isShowing()) {
            super.onBackPressed();
            return;
        }
        A3H();
        String str = this.A04.A02;
        if (1JF.A0B(str)) {
            1BK.A09(super.A03).D0v("DialtoneOptinInterstitialActivityNew", 0Pz.A0v("Encountered ", str == null ? "null" : "empty", " back_button_behavior string in ", "DialtoneOptinInterstitialActivityNew"));
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
                    0fH.A0o("DialtoneOptinInterstitialActivityNew", "Encountered a totally unexpected ZeroOptinInterstitialActivityBase.BackButtonBehavior");
                    return;
                }
            }
        }
        super.A3G();
    }
}
